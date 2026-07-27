package com.onesignal.session.internal.session.impl;

import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.background.IBackgroundService;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.startup.IBootstrapService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.session.internal.session.SessionModel;
import com.onesignal.session.internal.session.SessionModelStore;
import f4.v;
import java.util.UUID;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SessionService implements ISessionService, IBootstrapService, IStartableService, IBackgroundService, IApplicationLifecycleHandler {
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final SessionModelStore _sessionModelStore;
    private final ITime _time;
    private ConfigModel config;
    private boolean hasFocused;
    private SessionModel session;
    private final EventProducer<ISessionLifecycleHandler> sessionLifeCycleNotifier;
    private boolean shouldFireOnSubscribe;

    public SessionService(IApplicationService _applicationService, ConfigModelStore _configModelStore, SessionModelStore _sessionModelStore, ITime _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_configModelStore, "_configModelStore");
        i.e(_sessionModelStore, "_sessionModelStore");
        i.e(_time, "_time");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._sessionModelStore = _sessionModelStore;
        this._time = _time;
        this.sessionLifeCycleNotifier = new EventProducer<>();
    }

    private final void endSession() {
        SessionModel sessionModel = this.session;
        if (sessionModel != null && sessionModel.isValid()) {
            long activeDuration = sessionModel.getActiveDuration();
            Logging.debug$default("SessionService.backgroundRun: Session ended. activeDuration: " + activeDuration, null, 2, null);
            sessionModel.setValid(false);
            this.sessionLifeCycleNotifier.fire(new SessionService$endSession$1(activeDuration));
            sessionModel.setActiveDuration(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnFocus(boolean z, long j2) {
        Logging.log(LogLevel.DEBUG, "SessionService.onFocus() - fired from start: " + z);
        SessionModel sessionModel = this.session;
        if (sessionModel == null) {
            Logging.warn$default("SessionService.onFocus called before bootstrap; ignoring.", null, 2, null);
            return;
        }
        if (!this.hasFocused) {
            this.hasFocused = true;
            endSession();
        }
        if (sessionModel.isValid()) {
            sessionModel.setFocusTime(j2);
            this.sessionLifeCycleNotifier.fire(SessionService$handleOnFocus$2.INSTANCE);
            return;
        }
        this.shouldFireOnSubscribe = z;
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, "toString(...)");
        sessionModel.setSessionId(uuid);
        sessionModel.setStartTime(j2);
        sessionModel.setFocusTime(sessionModel.getStartTime());
        sessionModel.setValid(true);
        Logging.debug$default("SessionService: New session started at " + sessionModel.getStartTime(), null, 2, null);
        this.sessionLifeCycleNotifier.fire(SessionService$handleOnFocus$1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnUnfocused(long j2) {
        SessionModel sessionModel = this.session;
        if (sessionModel == null) {
            Logging.warn$default("SessionService.onUnfocused called before bootstrap; ignoring.", null, 2, null);
            return;
        }
        long focusTime = j2 - sessionModel.getFocusTime();
        sessionModel.setActiveDuration(sessionModel.getActiveDuration() + focusTime);
        Logging.log(LogLevel.DEBUG, "SessionService.onUnfocused adding time " + focusTime + " for total: " + sessionModel.getActiveDuration());
    }

    @Override // com.onesignal.core.internal.background.IBackgroundService
    public Object backgroundRun(InterfaceC1218d interfaceC1218d) {
        endSession();
        return v.f5689a;
    }

    @Override // com.onesignal.core.internal.startup.IBootstrapService
    public void bootstrap() {
        this.session = this._sessionModelStore.getModel();
        this.config = this._configModelStore.getModel();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    @Override // com.onesignal.core.internal.background.IBackgroundService
    public Long getScheduleBackgroundRunIn() {
        ConfigModel configModel;
        SessionModel sessionModel = this.session;
        if (sessionModel == null || (configModel = this.config) == null || !sessionModel.isValid()) {
            return null;
        }
        return Long.valueOf(configModel.getSessionFocusTimeout());
    }

    @Override // com.onesignal.session.internal.session.ISessionService
    public long getStartTime() {
        SessionModel sessionModel = this.session;
        return sessionModel != null ? sessionModel.getStartTime() : this._time.getCurrentTimeMillis();
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean z) {
        ThreadUtilsKt.runOnSerialIOIfBackgroundThreading(new SessionService$onFocus$1(this, z, this._time.getCurrentTimeMillis()));
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
        ThreadUtilsKt.runOnSerialIOIfBackgroundThreading(new SessionService$onUnfocused$1(this, this._time.getCurrentTimeMillis()));
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ISessionLifecycleHandler handler) {
        i.e(handler, "handler");
        this.sessionLifeCycleNotifier.subscribe(handler);
        if (this.shouldFireOnSubscribe) {
            handler.onSessionStarted();
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ISessionLifecycleHandler handler) {
        i.e(handler, "handler");
        this.sessionLifeCycleNotifier.unsubscribe(handler);
    }
}
