package com.onesignal.core.internal.config.impl;

import C1.b;
import D4.X;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.backend.IFeatureFlagsBackendService;
import com.onesignal.core.internal.backend.RemoteFeatureFlagsFetchOutcome;
import com.onesignal.core.internal.backend.RemoteFeatureFlagsResult;
import com.onesignal.core.internal.backend.impl.FeatureFlagsJsonParser;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelChangeTags;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.startup.IStartableService;
import e5.g;
import f4.v;
import g4.AbstractC0465j;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class FeatureFlagsRefreshService implements IStartableService, IApplicationLifecycleHandler, ISingletonModelStoreChangeHandler<ConfigModel> {
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_REFRESH_INTERVAL_MS = 480000;
    private final IApplicationService applicationService;
    private final ConfigModelStore configModelStore;
    private final IFeatureFlagsBackendService featureFlagsBackend;
    private X pollJob;
    private String pollingAppId;
    private long refreshIntervalMs;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public FeatureFlagsRefreshService(IApplicationService applicationService, ConfigModelStore configModelStore, IFeatureFlagsBackendService featureFlagsBackend) {
        i.e(applicationService, "applicationService");
        i.e(configModelStore, "configModelStore");
        i.e(featureFlagsBackend, "featureFlagsBackend");
        this.applicationService = applicationService;
        this.configModelStore = configModelStore;
        this.featureFlagsBackend = featureFlagsBackend;
        this.refreshIntervalMs = DEFAULT_REFRESH_INTERVAL_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndApply(String str, InterfaceC1218d interfaceC1218d) {
        FeatureFlagsRefreshService$fetchAndApply$1 featureFlagsRefreshService$fetchAndApply$1;
        int i2;
        FeatureFlagsRefreshService featureFlagsRefreshService;
        boolean a6;
        if (interfaceC1218d instanceof FeatureFlagsRefreshService$fetchAndApply$1) {
            featureFlagsRefreshService$fetchAndApply$1 = (FeatureFlagsRefreshService$fetchAndApply$1) interfaceC1218d;
            int i3 = featureFlagsRefreshService$fetchAndApply$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                featureFlagsRefreshService$fetchAndApply$1.label = i3 - Integer.MIN_VALUE;
                Object obj = featureFlagsRefreshService$fetchAndApply$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = featureFlagsRefreshService$fetchAndApply$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    IFeatureFlagsBackendService iFeatureFlagsBackendService = this.featureFlagsBackend;
                    featureFlagsRefreshService$fetchAndApply$1.L$0 = this;
                    featureFlagsRefreshService$fetchAndApply$1.label = 1;
                    obj = iFeatureFlagsBackendService.fetchRemoteFeatureFlags(str, featureFlagsRefreshService$fetchAndApply$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    featureFlagsRefreshService = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    featureFlagsRefreshService = (FeatureFlagsRefreshService) featureFlagsRefreshService$fetchAndApply$1.L$0;
                    g.y(obj);
                }
                RemoteFeatureFlagsFetchOutcome remoteFeatureFlagsFetchOutcome = (RemoteFeatureFlagsFetchOutcome) obj;
                a6 = i.a(remoteFeatureFlagsFetchOutcome, RemoteFeatureFlagsFetchOutcome.Unavailable.INSTANCE);
                v vVar = v.f5689a;
                if (!a6) {
                    return vVar;
                }
                if (!(remoteFeatureFlagsFetchOutcome instanceof RemoteFeatureFlagsFetchOutcome.Success)) {
                    throw new b();
                }
                RemoteFeatureFlagsResult result = ((RemoteFeatureFlagsFetchOutcome.Success) remoteFeatureFlagsFetchOutcome).getResult();
                ConfigModel model = featureFlagsRefreshService.configModelStore.getModel();
                String encodeMetadata = FeatureFlagsJsonParser.INSTANCE.encodeMetadata(result.getMetadata());
                if (AbstractC0465j.X0(result.getEnabledKeys()).equals(AbstractC0465j.X0(model.getSdkRemoteFeatureFlags())) && i.a(encodeMetadata, model.getSdkRemoteFeatureFlagMetadata())) {
                    return vVar;
                }
                Model.setListProperty$default(model, "sdkRemoteFeatureFlags", result.getEnabledKeys(), ConfigModelChangeTags.REMOTE_FEATURE_FLAGS, false, 8, null);
                Model.setOptStringProperty$default(model, "sdkRemoteFeatureFlagMetadata", encodeMetadata, ConfigModelChangeTags.REMOTE_FEATURE_FLAGS, false, 8, null);
                return vVar;
            }
        }
        featureFlagsRefreshService$fetchAndApply$1 = new FeatureFlagsRefreshService$fetchAndApply$1(this, interfaceC1218d);
        Object obj2 = featureFlagsRefreshService$fetchAndApply$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = featureFlagsRefreshService$fetchAndApply$1.label;
        if (i2 != 0) {
        }
        RemoteFeatureFlagsFetchOutcome remoteFeatureFlagsFetchOutcome2 = (RemoteFeatureFlagsFetchOutcome) obj2;
        a6 = i.a(remoteFeatureFlagsFetchOutcome2, RemoteFeatureFlagsFetchOutcome.Unavailable.INSTANCE);
        v vVar2 = v.f5689a;
        if (!a6) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartForegroundPolling() {
        synchronized (this) {
            String appId = this.configModelStore.getModel().getAppId();
            if (appId.length() == 0) {
                X x5 = this.pollJob;
                if (x5 != null) {
                    x5.b(null);
                }
                this.pollJob = null;
                this.pollingAppId = null;
                return;
            }
            if (i.a(this.pollingAppId, appId)) {
                return;
            }
            X x6 = this.pollJob;
            if (x6 != null) {
                x6.b(null);
            }
            this.pollingAppId = appId;
            this.pollJob = OneSignalDispatchers.INSTANCE.launchOnIO(new FeatureFlagsRefreshService$restartForegroundPolling$1$1(this, null));
        }
    }

    public final long getRefreshIntervalMs$com_onesignal_core() {
        return this.refreshIntervalMs;
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean z) {
        ThreadUtilsKt.runOnSerialIOIfBackgroundThreading(new FeatureFlagsRefreshService$onFocus$1(this));
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        if (i.a(args.getProperty(), "appId") && this.applicationService.isInForeground()) {
            restartForegroundPolling();
        }
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
        ThreadUtilsKt.runOnSerialIOIfBackgroundThreading(new FeatureFlagsRefreshService$onUnfocused$1(this));
    }

    public final void setRefreshIntervalMs$com_onesignal_core(long j2) {
        this.refreshIntervalMs = j2;
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this.applicationService.addApplicationLifecycleHandler(this);
        this.configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        if ((tag.equals(ModelChangeTags.HYDRATE) || tag.equals(ModelChangeTags.NORMAL)) && model.getAppId().length() > 0 && this.applicationService.isInForeground()) {
            restartForegroundPolling();
        }
    }
}
