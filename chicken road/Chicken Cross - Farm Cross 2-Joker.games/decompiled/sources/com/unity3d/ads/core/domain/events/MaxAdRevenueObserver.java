package com.unity3d.ads.core.domain.events;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.reflection.AppLovinCommunicatorBridge;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaxAdRevenueObserver.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0011\u001a\u00020\u0012H\u0086\u0002J\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;", "", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "communicatorBridge", "Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;", "revenueListener", "Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;", "communicatorProxyFactory", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;)V", "communicatorSubscriber", "isStarted", "", "invoke", "", "stop", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MaxAdRevenueObserver {
    private static final String COMMUNICATOR_ID = "ilrd_observer";
    private static final String MAX_REVENUE_EVENTS_TOPIC = "max_revenue_events";
    private final AppLovinCommunicatorBridge communicatorBridge;
    private final MaxAdRevenueCommunicatorProxyFactory communicatorProxyFactory;
    private Object communicatorSubscriber;
    private boolean isStarted;
    private final Logger logger;
    private final MaxAdRevenueListener revenueListener;
    private final SessionRepository sessionRepository;

    public MaxAdRevenueObserver(SessionRepository sessionRepository, Logger logger, AppLovinCommunicatorBridge communicatorBridge, MaxAdRevenueListener revenueListener, MaxAdRevenueCommunicatorProxyFactory communicatorProxyFactory) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(communicatorBridge, "communicatorBridge");
        Intrinsics.checkNotNullParameter(revenueListener, "revenueListener");
        Intrinsics.checkNotNullParameter(communicatorProxyFactory, "communicatorProxyFactory");
        this.sessionRepository = sessionRepository;
        this.logger = logger;
        this.communicatorBridge = communicatorBridge;
        this.revenueListener = revenueListener;
        this.communicatorProxyFactory = communicatorProxyFactory;
    }

    public final void invoke() {
        synchronized (this) {
            boolean collectIlrData = this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectIlrData();
            if (this.isStarted) {
                if (!collectIlrData) {
                    Logger.DefaultImpls.trace$default(this.logger, "ILRD collection feature flag changed to disabled, stopping", null, 2, null);
                    stop();
                } else {
                    Logger.DefaultImpls.trace$default(this.logger, "ILRD observer already started", null, 2, null);
                }
                return;
            }
            if (!collectIlrData) {
                Logger.DefaultImpls.trace$default(this.logger, "ILRD collection feature flag is disabled", null, 2, null);
                return;
            }
            try {
                try {
                    Object subscribe = this.communicatorBridge.subscribe(this.communicatorProxyFactory.create(COMMUNICATOR_ID, "max_revenue_events", new MaxAdRevenueObserver$invoke$1$proxy$1(this.revenueListener)), "max_revenue_events");
                    if (subscribe != null) {
                        this.communicatorSubscriber = subscribe;
                        this.isStarted = true;
                        Logger.DefaultImpls.trace$default(this.logger, "Successfully started ad revenue automatic collection", null, 2, null);
                    } else {
                        Logger.DefaultImpls.trace$default(this.logger, "Mediation SDK not available, automatic collection not started", null, 2, null);
                    }
                } catch (NoSuchMethodException e) {
                    this.logger.trace("Communicator method not found, SDK version may be incompatible", e);
                }
            } catch (ClassNotFoundException unused) {
                Logger.DefaultImpls.trace$default(this.logger, "Mediation SDK not found, skipping automatic collection", null, 2, null);
            } catch (Exception e2) {
                this.logger.trace("Failed to start ad revenue collection", e2);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void stop() {
        synchronized (this) {
            if (this.isStarted) {
                Object obj = this.communicatorSubscriber;
                if (obj != null) {
                    try {
                        this.communicatorBridge.unsubscribe(obj, "max_revenue_events");
                        Logger.DefaultImpls.trace$default(this.logger, "Unsubscribed from revenue events", null, 2, null);
                    } catch (Exception e) {
                        this.logger.trace("Failed to unsubscribe from revenue events", e);
                    }
                    this.communicatorSubscriber = null;
                }
                this.isStarted = false;
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
