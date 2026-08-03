package com.facebook.appevents.ondeviceprocessing;

/* compiled from: RemoteServiceWrapper.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007J&\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper;", "", "()V", "RECEIVER_SERVICE_ACTION", "", "RECEIVER_SERVICE_PACKAGE", "RECEIVER_SERVICE_PACKAGE_WAKIZASHI", "TAG", "kotlin.jvm.PlatformType", "isServiceAvailable", "", "Ljava/lang/Boolean;", "getVerifiedServiceIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "sendCustomEvents", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "applicationId", "appEvents", "", "Lcom/facebook/appevents/AppEvent;", "sendEvents", "eventType", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "sendInstallEvent", "EventType", "RemoteServiceConnection", "ServiceResult", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RemoteServiceWrapper {
    public static final java.lang.String RECEIVER_SERVICE_ACTION = "ReceiverService";
    public static final java.lang.String RECEIVER_SERVICE_PACKAGE = "com.facebook.katana";
    public static final java.lang.String RECEIVER_SERVICE_PACKAGE_WAKIZASHI = "com.facebook.wakizashi";
    private static java.lang.Boolean isServiceAvailable;
    public static final com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper INSTANCE = new com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper();
    private static final java.lang.String TAG = "RemoteServiceWrapper";

    private RemoteServiceWrapper() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isServiceAvailable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.class)) {
            return false;
        }
        try {
            if (isServiceAvailable == null) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                isServiceAvailable = java.lang.Boolean.valueOf(INSTANCE.getVerifiedServiceIntent(com.facebook.FacebookSdk.getApplicationContext()) != null);
            }
            java.lang.Boolean bool = isServiceAvailable;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult sendInstallEvent(java.lang.String applicationId) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            return INSTANCE.sendEvents(com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType.MOBILE_APP_INSTALL, applicationId, kotlin.collections.CollectionsKt.emptyList());
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult sendCustomEvents(java.lang.String applicationId, java.util.List<com.facebook.appevents.AppEvent> appEvents) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            return INSTANCE.sendEvents(com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.class);
            return null;
        }
    }

    private final com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult sendEvents(com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType eventType, java.lang.String applicationId, java.util.List<com.facebook.appevents.AppEvent> appEvents) {
        com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult serviceResult;
        java.lang.String str;
        com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult serviceResult2;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult serviceResult3 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_NOT_AVAILABLE;
            com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
            com.facebook.appevents.internal.AppEventUtility.assertIsNotMainThread();
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            android.content.Intent verifiedServiceIntent = getVerifiedServiceIntent(applicationContext);
            if (verifiedServiceIntent == null) {
                return serviceResult3;
            }
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.RemoteServiceConnection remoteServiceConnection = new com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.RemoteServiceConnection();
            try {
                if (!applicationContext.bindService(verifiedServiceIntent, remoteServiceConnection, 1)) {
                    return com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_ERROR;
                }
                try {
                    try {
                        android.os.IBinder binder = remoteServiceConnection.getBinder();
                        if (binder != null) {
                            com.facebook.ppml.receiver.IReceiverService asInterface = com.facebook.ppml.receiver.IReceiverService.Stub.asInterface(binder);
                            com.facebook.appevents.ondeviceprocessing.RemoteServiceParametersHelper remoteServiceParametersHelper = com.facebook.appevents.ondeviceprocessing.RemoteServiceParametersHelper.INSTANCE;
                            android.os.Bundle buildEventsBundle = com.facebook.appevents.ondeviceprocessing.RemoteServiceParametersHelper.buildEventsBundle(eventType, applicationId, appEvents);
                            if (buildEventsBundle != null) {
                                asInterface.sendEvents(buildEventsBundle);
                                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                                com.facebook.internal.Utility.logd(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Successfully sent events to the remote service: ", buildEventsBundle));
                            }
                            serviceResult2 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.OPERATION_SUCCESS;
                        } else {
                            serviceResult2 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_NOT_AVAILABLE;
                        }
                        return serviceResult2;
                    } catch (android.os.RemoteException e) {
                        serviceResult = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_ERROR;
                        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                        str = TAG;
                        com.facebook.internal.Utility.logd(str, e);
                        applicationContext.unbindService(remoteServiceConnection);
                        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.logd(str, "Unbound from the remote service");
                        return serviceResult;
                    }
                } catch (java.lang.InterruptedException e2) {
                    serviceResult = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_ERROR;
                    com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
                    str = TAG;
                    com.facebook.internal.Utility.logd(str, e2);
                    applicationContext.unbindService(remoteServiceConnection);
                    com.facebook.internal.Utility utility5 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.logd(str, "Unbound from the remote service");
                    return serviceResult;
                }
            } finally {
                applicationContext.unbindService(remoteServiceConnection);
                com.facebook.internal.Utility utility6 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(TAG, "Unbound from the remote service");
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final android.content.Intent getVerifiedServiceIntent(android.content.Context context) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                android.content.Intent intent = new android.content.Intent(RECEIVER_SERVICE_ACTION);
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null) {
                    com.facebook.internal.FacebookSignatureValidator facebookSignatureValidator = com.facebook.internal.FacebookSignatureValidator.INSTANCE;
                    if (com.facebook.internal.FacebookSignatureValidator.validateSignature(context, "com.facebook.katana")) {
                        return intent;
                    }
                }
                android.content.Intent intent2 = new android.content.Intent(RECEIVER_SERVICE_ACTION);
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    com.facebook.internal.FacebookSignatureValidator facebookSignatureValidator2 = com.facebook.internal.FacebookSignatureValidator.INSTANCE;
                    if (com.facebook.internal.FacebookSignatureValidator.validateSignature(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: RemoteServiceWrapper.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "", "(Ljava/lang/String;I)V", "OPERATION_SUCCESS", "SERVICE_NOT_AVAILABLE", "SERVICE_ERROR", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum ServiceResult {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult[] valuesCustom() {
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult[] valuesCustom = values();
            return (com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: RemoteServiceWrapper.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "", "eventType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "MOBILE_APP_INSTALL", "CUSTOM_APP_EVENTS", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

        private final java.lang.String eventType;

        EventType(java.lang.String str) {
            this.eventType = str;
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return this.eventType;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType[] valuesCustom() {
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType[] valuesCustom = values();
            return (com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: RemoteServiceWrapper.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$RemoteServiceConnection;", "Landroid/content/ServiceConnection;", "()V", "binder", "Landroid/os/IBinder;", "latch", "Ljava/util/concurrent/CountDownLatch;", "getBinder", "onNullBinding", "", "name", "Landroid/content/ComponentName;", "onServiceConnected", "serviceBinder", "onServiceDisconnected", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class RemoteServiceConnection implements android.content.ServiceConnection {
        private android.os.IBinder binder;
        private final java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(1);

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName name, android.os.IBinder serviceBinder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
            this.binder = serviceBinder;
            this.latch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(android.content.ComponentName name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            this.latch.countDown();
        }

        public final android.os.IBinder getBinder() throws java.lang.InterruptedException {
            this.latch.await(5L, java.util.concurrent.TimeUnit.SECONDS);
            return this.binder;
        }
    }
}
