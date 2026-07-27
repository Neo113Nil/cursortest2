package com.onesignal.user.internal.service;

import com.onesignal.common.IDManager;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class UserRefreshService implements IStartableService, ISessionLifecycleHandler {
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final IOperationRepo _operationRepo;
    private final ISessionService _sessionService;

    public UserRefreshService(IApplicationService _applicationService, ISessionService _sessionService, IOperationRepo _operationRepo, ConfigModelStore _configModelStore, IdentityModelStore _identityModelStore) {
        i.e(_applicationService, "_applicationService");
        i.e(_sessionService, "_sessionService");
        i.e(_operationRepo, "_operationRepo");
        i.e(_configModelStore, "_configModelStore");
        i.e(_identityModelStore, "_identityModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._operationRepo = _operationRepo;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
    }

    private final void refreshUser() {
        if (IDManager.INSTANCE.isLocalId(this._identityModelStore.getModel().getOnesignalId()) || !this._applicationService.isInForeground()) {
            return;
        }
        IOperationRepo.DefaultImpls.enqueue$default(this._operationRepo, new RefreshUserOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), this._identityModelStore.getModel().getExternalId()), false, 2, null);
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long j2) {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        refreshUser();
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._sessionService.subscribe(this);
    }
}
