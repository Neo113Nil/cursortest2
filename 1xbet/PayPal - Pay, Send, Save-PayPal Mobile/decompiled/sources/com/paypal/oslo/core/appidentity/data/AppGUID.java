package com.paypal.oslo.core.appidentity.data;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/AppGUID;", "", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "()Ljava/lang/String;", "getValue", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getIsFirstLaunch", "", "initialize", "isCached$app_identity_release", "()Z", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/sync/Mutex;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/Boolean;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppGUID {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.appidentity.data.AppGUID.Companion INSTANCE = new com.paypal.oslo.core.appidentity.data.AppGUID.Companion(null);
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted KEY_APP_GUID = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAttributes.APP_GUID);
    public static final java.lang.String LEGACY_KEY_APP_GUID = "app_installation_guid";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile java.lang.Boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile java.lang.String Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AppGUID(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighSpeedVideoSizes = appStorage;
        this.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    public final java.lang.String value() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        if (str != null) {
            return str;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "AppGUID not initialized", null, null, 6, null);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6 A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #3 {all -> 0x0156, blocks: (B:50:0x00c2, B:52:0x00c6, B:69:0x00a3), top: B:68:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getValue(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.core.appidentity.data.AppGUID$getValue$1 appGUID$getValue$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        int i2;
        java.lang.String str;
        com.paypal.oslo.core.appidentity.data.AppGUID appGUID;
        int i3;
        int i4;
        int i5;
        java.lang.Object obj;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.String str2;
        boolean z;
        java.lang.String str3;
        java.lang.String str4;
        kotlinx.coroutines.sync.Mutex mutex3;
        com.paypal.oslo.core.appidentity.data.AppGUID appGUID2;
        java.lang.Object obj2;
        try {
            if (continuation instanceof com.paypal.oslo.core.appidentity.data.AppGUID$getValue$1) {
                appGUID$getValue$1 = (com.paypal.oslo.core.appidentity.data.AppGUID$getValue$1) continuation;
                if ((appGUID$getValue$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                    appGUID$getValue$1.getHighSpeedVideoSizesFor -= 2147483648;
                    java.lang.Object obj3 = appGUID$getValue$1.getOutputSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = appGUID$getValue$1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj3);
                        java.lang.String str5 = this.Camera2StreamConfigurationMap;
                        if (str5 != null) {
                            return str5;
                        }
                        kotlinx.coroutines.sync.Mutex mutex4 = this.getHighSpeedVideoFpsRangesFor;
                        appGUID$getValue$1.Camera2StreamConfigurationMap = mutex4;
                        appGUID$getValue$1.getHighSpeedVideoSizes = 0;
                        appGUID$getValue$1.getHighSpeedVideoSizesFor = 1;
                        if (mutex4.lock(null, appGUID$getValue$1) != coroutine_suspended) {
                            mutex = mutex4;
                            i2 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i6 = appGUID$getValue$1.getHighSpeedVideoFpsRanges;
                            int i7 = appGUID$getValue$1.getHighSpeedVideoFpsRangesFor;
                            int i8 = appGUID$getValue$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i9 = appGUID$getValue$1.getHighSpeedVideoSizes;
                            str3 = (java.lang.String) appGUID$getValue$1.getInputFormats;
                            str4 = (java.lang.String) appGUID$getValue$1.getInputSizeshNQ4ISI;
                            appGUID2 = (com.paypal.oslo.core.appidentity.data.AppGUID) appGUID$getValue$1.getOutputFormats;
                            mutex3 = (kotlinx.coroutines.sync.Mutex) appGUID$getValue$1.Camera2StreamConfigurationMap;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                try {
                                    z = true;
                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "AppGUID generated", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("new", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))), null, 4, null);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                                    mutex = mutex3;
                                    str2 = str4;
                                    appGUID = appGUID2;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    mutex2 = mutex3;
                                    obj2 = null;
                                    mutex2.unlock(obj2);
                                    throw th;
                                }
                                try {
                                    appGUID.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(str2 == null ? z : false);
                                    appGUID.Camera2StreamConfigurationMap = str3;
                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "AppGUID initialized", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("new", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(str2 == null ? z : false))), null, 4, null);
                                    str = str3;
                                    obj = null;
                                    mutex.unlock(obj);
                                    return str;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    mutex3 = mutex;
                                    mutex2 = mutex3;
                                    obj2 = null;
                                    mutex2.unlock(obj2);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                mutex = mutex3;
                                obj2 = null;
                                mutex2 = mutex;
                                mutex2.unlock(obj2);
                                throw th;
                            }
                        }
                        i4 = appGUID$getValue$1.getHighSpeedVideoFpsRangesFor;
                        i5 = appGUID$getValue$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i10 = appGUID$getValue$1.getHighSpeedVideoSizes;
                        appGUID = (com.paypal.oslo.core.appidentity.data.AppGUID) appGUID$getValue$1.getOutputFormats;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) appGUID$getValue$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                            i3 = i10;
                            mutex = mutex2;
                            str2 = (java.lang.String) obj3;
                            if (str2 != null) {
                                java.lang.String obj4 = java.util.UUID.randomUUID().toString();
                                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = appGUID.getHighSpeedVideoSizes;
                                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = KEY_APP_GUID;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj4);
                                appGUID$getValue$1.Camera2StreamConfigurationMap = mutex;
                                appGUID$getValue$1.getOutputFormats = appGUID;
                                appGUID$getValue$1.getInputSizeshNQ4ISI = str2;
                                appGUID$getValue$1.getInputFormats = obj4;
                                appGUID$getValue$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj4);
                                appGUID$getValue$1.getHighSpeedVideoSizes = i3;
                                appGUID$getValue$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                                appGUID$getValue$1.getHighSpeedVideoFpsRangesFor = i4;
                                appGUID$getValue$1.getHighSpeedVideoFpsRanges = 0;
                                appGUID$getValue$1.getHighSpeedVideoSizesFor = 3;
                                if (appStorage.setString(unencrypted, obj4, appGUID$getValue$1) != coroutine_suspended) {
                                    str4 = str2;
                                    mutex3 = mutex;
                                    appGUID2 = appGUID;
                                    str3 = obj4;
                                    z = true;
                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "AppGUID generated", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("new", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))), null, 4, null);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                                    mutex = mutex3;
                                    str2 = str4;
                                    appGUID = appGUID2;
                                    appGUID.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(str2 == null ? z : false);
                                    appGUID.Camera2StreamConfigurationMap = str3;
                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "AppGUID initialized", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("new", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(str2 == null ? z : false))), null, 4, null);
                                    str = str3;
                                    obj = null;
                                    mutex.unlock(obj);
                                    return str;
                                }
                                return coroutine_suspended;
                            }
                            z = true;
                            str3 = str2;
                            appGUID.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(str2 == null ? z : false);
                            appGUID.Camera2StreamConfigurationMap = str3;
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "AppGUID initialized", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("new", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(str2 == null ? z : false))), null, 4, null);
                            str = str3;
                            obj = null;
                            mutex.unlock(obj);
                            return str;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            obj2 = null;
                            mutex2.unlock(obj2);
                            throw th;
                        }
                    }
                    i2 = appGUID$getValue$1.getHighSpeedVideoSizes;
                    mutex = (kotlinx.coroutines.sync.Mutex) appGUID$getValue$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    str = this.Camera2StreamConfigurationMap;
                    if (str != null) {
                        try {
                            com.paypal.oslo.core.appidentity.data.AppGUID appGUID3 = this;
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.getHighSpeedVideoSizes;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted2 = KEY_APP_GUID;
                            appGUID$getValue$1.Camera2StreamConfigurationMap = mutex;
                            appGUID$getValue$1.getOutputFormats = this;
                            appGUID$getValue$1.getHighSpeedVideoSizes = i2;
                            appGUID$getValue$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            appGUID$getValue$1.getHighSpeedVideoFpsRangesFor = 0;
                            appGUID$getValue$1.getHighSpeedVideoSizesFor = 2;
                            obj3 = appStorage2.getString(unencrypted2, appGUID$getValue$1);
                            if (obj3 != coroutine_suspended) {
                                appGUID = this;
                                i3 = i2;
                                i4 = 0;
                                i5 = 0;
                                str2 = (java.lang.String) obj3;
                                if (str2 != null) {
                                }
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            mutex2 = mutex;
                            obj2 = null;
                            mutex2.unlock(obj2);
                            throw th;
                        }
                    }
                    obj = null;
                    mutex.unlock(obj);
                    return str;
                }
            }
            str = this.Camera2StreamConfigurationMap;
            if (str != null) {
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            obj2 = null;
            mutex2 = mutex;
            mutex2.unlock(obj2);
            throw th;
        }
        appGUID$getValue$1 = new com.paypal.oslo.core.appidentity.data.AppGUID$getValue$1(this, continuation);
        java.lang.Object obj32 = appGUID$getValue$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appGUID$getValue$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getIsFirstLaunch(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.core.appidentity.data.AppGUID$getIsFirstLaunch$1 appGUID$getIsFirstLaunch$1;
        int i;
        java.lang.Boolean bool;
        if (continuation instanceof com.paypal.oslo.core.appidentity.data.AppGUID$getIsFirstLaunch$1) {
            appGUID$getIsFirstLaunch$1 = (com.paypal.oslo.core.appidentity.data.AppGUID$getIsFirstLaunch$1) continuation;
            if ((appGUID$getIsFirstLaunch$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                appGUID$getIsFirstLaunch$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = appGUID$getIsFirstLaunch$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appGUID$getIsFirstLaunch$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    appGUID$getIsFirstLaunch$1.Camera2StreamConfigurationMap = 1;
                    if (getValue(appGUID$getIsFirstLaunch$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                bool = this.getHighSpeedVideoFpsRanges;
                if (bool == null) {
                    return bool;
                }
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
        }
        appGUID$getIsFirstLaunch$1 = new com.paypal.oslo.core.appidentity.data.AppGUID$getIsFirstLaunch$1(this, continuation);
        java.lang.Object obj2 = appGUID$getIsFirstLaunch$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appGUID$getIsFirstLaunch$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        bool = this.getHighSpeedVideoFpsRanges;
        if (bool == null) {
        }
    }

    public final java.lang.Object initialize(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object value = getValue(continuation);
        return value == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? value : kotlin.Unit.INSTANCE;
    }

    public final boolean isCached$app_identity_release() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        return str != null && str.length() > 0;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/AppGUID$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "KEY_APP_GUID", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getKEY_APP_GUID$app_identity_release", "()Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "", "LEGACY_KEY_APP_GUID", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getKEY_APP_GUID$app_identity_release() {
            return com.paypal.oslo.core.appidentity.data.AppGUID.KEY_APP_GUID;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
