package io.appmetrica.analytics.flutter.impl;

/* loaded from: classes.dex */
public class AppMetricaImpl implements io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon {
    private final android.content.Context context;
    private final android.os.Handler mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    public android.app.Activity activity = null;

    /* renamed from: io.appmetrica.analytics.flutter.impl.AppMetricaImpl$1, reason: invalid class name */
    public class AnonymousClass1 implements io.appmetrica.analytics.DeferredDeeplinkListener {
        final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.Result val$result;

        public AnonymousClass1(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result result) {
            this.val$result = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onDeeplinkLoaded$0(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result result, java.lang.String str) {
            result.success(io.appmetrica.analytics.flutter.utils.Converter.toPigeon(str, (io.appmetrica.analytics.DeferredDeeplinkListener.Error) null, (java.lang.String) null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onError$1(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result result, io.appmetrica.analytics.DeferredDeeplinkListener.Error error, java.lang.String str) {
            result.success(io.appmetrica.analytics.flutter.utils.Converter.toPigeon((java.lang.String) null, error, str));
        }

        @Override // io.appmetrica.analytics.DeferredDeeplinkListener
        public void onDeeplinkLoaded(java.lang.String str) {
            io.appmetrica.analytics.flutter.impl.AppMetricaImpl.this.mainHandler.post(new io.appmetrica.analytics.flutter.impl.a(this.val$result, str, 0));
        }

        @Override // io.appmetrica.analytics.DeferredDeeplinkListener
        public void onError(io.appmetrica.analytics.DeferredDeeplinkListener.Error error, java.lang.String str) {
            io.appmetrica.analytics.flutter.impl.AppMetricaImpl.this.mainHandler.post(new io.appmetrica.analytics.flutter.impl.b(this.val$result, error, str, 0));
        }
    }

    /* renamed from: io.appmetrica.analytics.flutter.impl.AppMetricaImpl$2, reason: invalid class name */
    public class AnonymousClass2 implements io.appmetrica.analytics.DeferredDeeplinkParametersListener {
        final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.Result val$result;

        public AnonymousClass2(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result result) {
            this.val$result = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onError$1(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result result, io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error error, java.lang.String str) {
            result.success(io.appmetrica.analytics.flutter.utils.Converter.toPigeon((java.util.Map<java.lang.String, java.lang.String>) null, error, str));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onParametersLoaded$0(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result result, java.util.Map map) {
            result.success(io.appmetrica.analytics.flutter.utils.Converter.toPigeon((java.util.Map<java.lang.String, java.lang.String>) map, (io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error) null, (java.lang.String) null));
        }

        @Override // io.appmetrica.analytics.DeferredDeeplinkParametersListener
        public void onError(io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error error, java.lang.String str) {
            io.appmetrica.analytics.flutter.impl.AppMetricaImpl.this.mainHandler.post(new io.appmetrica.analytics.flutter.impl.b(this.val$result, error, str, 1));
        }

        @Override // io.appmetrica.analytics.DeferredDeeplinkParametersListener
        public void onParametersLoaded(java.util.Map<java.lang.String, java.lang.String> map) {
            io.appmetrica.analytics.flutter.impl.AppMetricaImpl.this.mainHandler.post(new io.appmetrica.analytics.flutter.impl.a(this.val$result, map, 1));
        }
    }

    /* renamed from: io.appmetrica.analytics.flutter.impl.AppMetricaImpl$3, reason: invalid class name */
    public class AnonymousClass3 implements io.appmetrica.analytics.StartupParamsCallback {
        final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.Result val$pigeonResult;

        public AnonymousClass3(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result result) {
            this.val$pigeonResult = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceive$0(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result result, io.appmetrica.analytics.StartupParamsCallback.Result result2) {
            result.success(io.appmetrica.analytics.flutter.utils.Converter.toPigeon(result2, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onRequestError$1(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result result, io.appmetrica.analytics.StartupParamsCallback.Result result2, io.appmetrica.analytics.StartupParamsCallback.Reason reason) {
            result.success(io.appmetrica.analytics.flutter.utils.Converter.toPigeon(result2, reason));
        }

        @Override // io.appmetrica.analytics.StartupParamsCallback
        public void onReceive(io.appmetrica.analytics.StartupParamsCallback.Result result) {
            io.appmetrica.analytics.flutter.impl.AppMetricaImpl.this.mainHandler.post(new io.appmetrica.analytics.flutter.impl.a(this.val$pigeonResult, result, 2));
        }

        @Override // io.appmetrica.analytics.StartupParamsCallback
        public void onRequestError(io.appmetrica.analytics.StartupParamsCallback.Reason reason, io.appmetrica.analytics.StartupParamsCallback.Result result) {
            io.appmetrica.analytics.flutter.impl.AppMetricaImpl.this.mainHandler.post(new io.appmetrica.analytics.flutter.impl.b(this.val$pigeonResult, result, reason, 2));
        }
    }

    public AppMetricaImpl(android.content.Context context) {
        this.context = context;
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void activate(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon) {
        io.appmetrica.analytics.AppMetrica.activate(this.context, io.appmetrica.analytics.flutter.utils.Converter.toNative(appMetricaConfigPigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void activateReporter(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon reporterConfigPigeon) {
        io.appmetrica.analytics.AppMetrica.activateReporter(this.context, io.appmetrica.analytics.flutter.utils.Converter.toNative(reporterConfigPigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void clearAppEnvironment() {
        io.appmetrica.analytics.AppMetrica.clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void enableActivityAutoTracking() {
        android.app.Activity activity = this.activity;
        if (activity != null) {
            io.appmetrica.analytics.AppMetrica.enableActivityAutoTracking(activity.getApplication());
        }
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public java.lang.String getDeviceId() {
        return io.appmetrica.analytics.AppMetrica.getDeviceId(this.context);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public java.lang.Long getLibraryApiLevel() {
        return java.lang.Long.valueOf(io.appmetrica.analytics.AppMetrica.getLibraryApiLevel());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public java.lang.String getLibraryVersion() {
        return io.appmetrica.analytics.AppMetrica.getLibraryVersion();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public java.lang.String getUuid() {
        return io.appmetrica.analytics.AppMetrica.getUuid(this.context);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void handlePluginInitFinished() {
        io.appmetrica.analytics.AppMetrica.resumeSession(this.activity);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void pauseSession() {
        io.appmetrica.analytics.AppMetrica.pauseSession(this.activity);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void putAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.AppMetrica.putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void putErrorEnvironmentValue(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.AppMetrica.putErrorEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportAdRevenue(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon adRevenuePigeon) {
        io.appmetrica.analytics.AppMetrica.reportAdRevenue(io.appmetrica.analytics.flutter.utils.Converter.toNative(adRevenuePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportAppOpen(java.lang.String str) {
        io.appmetrica.analytics.AppMetrica.reportAppOpen(str);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportECommerce(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon eCommerceEventPigeon) {
        io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent = io.appmetrica.analytics.flutter.utils.ECommerceConverter.toNative(eCommerceEventPigeon);
        if (eCommerceEvent != null) {
            io.appmetrica.analytics.AppMetrica.reportECommerce(eCommerceEvent);
        }
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportError(io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon, java.lang.String str) {
        io.appmetrica.analytics.AppMetrica.getPluginExtension().reportError(io.appmetrica.analytics.flutter.utils.Converter.toNative(errorDetailsPigeon), str);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportErrorWithGroup(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon, java.lang.String str2) {
        io.appmetrica.analytics.AppMetrica.getPluginExtension().reportError(str, str2, errorDetailsPigeon != null ? io.appmetrica.analytics.flutter.utils.Converter.toNative(errorDetailsPigeon) : null);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportEvent(java.lang.String str) {
        io.appmetrica.analytics.AppMetrica.reportEvent(str);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportEventWithJson(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.AppMetrica.reportEvent(str, str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportExternalAttribution(io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon externalAttributionPigeon) {
        io.appmetrica.analytics.flutter.utils.FlutterExternalAttribution flutterExternalAttribution = io.appmetrica.analytics.flutter.utils.Converter.toNative(externalAttributionPigeon);
        io.appmetrica.analytics.ModulesFacade.reportExternalAttribution(flutterExternalAttribution.source, flutterExternalAttribution.data);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportRevenue(io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon revenuePigeon) {
        io.appmetrica.analytics.AppMetrica.reportRevenue(io.appmetrica.analytics.flutter.utils.Converter.toNative(revenuePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportUnhandledException(io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon) {
        io.appmetrica.analytics.AppMetrica.getPluginExtension().reportUnhandledException(io.appmetrica.analytics.flutter.utils.Converter.toNative(errorDetailsPigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportUserProfile(io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon userProfilePigeon) {
        io.appmetrica.analytics.AppMetrica.reportUserProfile(io.appmetrica.analytics.flutter.utils.Converter.toNative(userProfilePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void requestDeferredDeeplink(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result<io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon> result) {
        io.appmetrica.analytics.AppMetrica.requestDeferredDeeplink(new io.appmetrica.analytics.flutter.impl.AppMetricaImpl.AnonymousClass1(result));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void requestDeferredDeeplinkParameters(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result<io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon> result) {
        io.appmetrica.analytics.AppMetrica.requestDeferredDeeplinkParameters(new io.appmetrica.analytics.flutter.impl.AppMetricaImpl.AnonymousClass2(result));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void requestStartupParams(java.util.List<java.lang.String> list, io.appmetrica.analytics.flutter.pigeon.Pigeon.Result<io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon> result) {
        io.appmetrica.analytics.AppMetrica.requestStartupParams(this.context, new io.appmetrica.analytics.flutter.impl.AppMetricaImpl.AnonymousClass3(result), list);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void resumeSession() {
        io.appmetrica.analytics.AppMetrica.resumeSession(this.activity);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void sendEventsBuffer() {
        io.appmetrica.analytics.AppMetrica.sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void setAdvIdentifiersTracking(java.lang.Boolean bool) {
        io.appmetrica.analytics.AppMetrica.setAdvIdentifiersTracking(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void setDataSendingEnabled(java.lang.Boolean bool) {
        io.appmetrica.analytics.AppMetrica.setDataSendingEnabled(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void setLocation(io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon locationPigeon) {
        io.appmetrica.analytics.AppMetrica.setLocation(locationPigeon != null ? io.appmetrica.analytics.flutter.utils.Converter.toNative(locationPigeon) : null);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void setLocationTracking(java.lang.Boolean bool) {
        io.appmetrica.analytics.AppMetrica.setLocationTracking(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void setUserProfileID(java.lang.String str) {
        io.appmetrica.analytics.AppMetrica.setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void touchReporter(java.lang.String str) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str);
    }
}
