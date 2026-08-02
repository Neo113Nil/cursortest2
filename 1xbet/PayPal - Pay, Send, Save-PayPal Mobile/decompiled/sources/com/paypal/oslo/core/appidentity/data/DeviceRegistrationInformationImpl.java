package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u000fJ\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/DeviceRegistrationInformationImpl;", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationWriter;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;", "deviceRegistrationSignal", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;)V", "", "paypalDeviceId", "", "persistPayPalDeviceId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayPalDeviceId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isDeviceRegisteredWithPayPal", "confirmed", "persistDeviceConfirmationStatus", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeviceConfirmed", "isPaymentAppInstanceIdRegistered", "registered", "persistPaymentAppInstanceIdRegistered", "clearDeviceRegistrationState", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Keys"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceRegistrationInformationImpl implements com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public DeviceRegistrationInformationImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal deviceRegistrationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRegistrationSignal, "");
        this.Camera2StreamConfigurationMap = appStorage;
        this.getHighSpeedVideoFpsRanges = deviceRegistrationSignal;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/DeviceRegistrationInformationImpl$Keys;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "PAYPAL_DEVICE_ID", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "getPAYPAL_DEVICE_ID", "()Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "DEVICE_CONFIRMED", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getDEVICE_CONFIRMED", "()Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "PAID_REGISTERED", "getPAID_REGISTERED"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Keys {
        public static final com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys INSTANCE = new com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys();
        private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted PAYPAL_DEVICE_ID = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("device_id");
        private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted DEVICE_CONFIRMED = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("device_confirmed");
        private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted PAID_REGISTERED = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("paid_registered");

        private Keys() {
        }

        public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted getPAYPAL_DEVICE_ID() {
            return PAYPAL_DEVICE_ID;
        }

        public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getDEVICE_CONFIRMED() {
            return DEVICE_CONFIRMED;
        }

        public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getPAID_REGISTERED() {
            return PAID_REGISTERED;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object persistPayPalDeviceId(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$persistPayPalDeviceId$1 deviceRegistrationInformationImpl$persistPayPalDeviceId$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$persistPayPalDeviceId$1) {
            deviceRegistrationInformationImpl$persistPayPalDeviceId$1 = (com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$persistPayPalDeviceId$1) continuation;
            if ((deviceRegistrationInformationImpl$persistPayPalDeviceId$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                deviceRegistrationInformationImpl$persistPayPalDeviceId$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = deviceRegistrationInformationImpl$persistPayPalDeviceId$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceRegistrationInformationImpl$persistPayPalDeviceId$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.text.StringsKt.isBlank(str)) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "Received blank PayPal device ID from server", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistration")), null, null, 12, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted paypal_device_id = com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys.INSTANCE.getPAYPAL_DEVICE_ID();
                    deviceRegistrationInformationImpl$persistPayPalDeviceId$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    deviceRegistrationInformationImpl$persistPayPalDeviceId$1.getHighSpeedVideoSizes = 1;
                    if (appStorage.setString(paypal_device_id, str, deviceRegistrationInformationImpl$persistPayPalDeviceId$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) deviceRegistrationInformationImpl$persistPayPalDeviceId$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighResolutionOutputSizeshNQ4ISI = str;
                return kotlin.Unit.INSTANCE;
            }
        }
        deviceRegistrationInformationImpl$persistPayPalDeviceId$1 = new com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$persistPayPalDeviceId$1(this, continuation);
        java.lang.Object obj2 = deviceRegistrationInformationImpl$persistPayPalDeviceId$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceRegistrationInformationImpl$persistPayPalDeviceId$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPayPalDeviceId(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$getPayPalDeviceId$1 deviceRegistrationInformationImpl$getPayPalDeviceId$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$getPayPalDeviceId$1) {
            deviceRegistrationInformationImpl$getPayPalDeviceId$1 = (com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$getPayPalDeviceId$1) continuation;
            if ((deviceRegistrationInformationImpl$getPayPalDeviceId$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                deviceRegistrationInformationImpl$getPayPalDeviceId$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = deviceRegistrationInformationImpl$getPayPalDeviceId$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceRegistrationInformationImpl$getPayPalDeviceId$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (str2 != null) {
                        return str2;
                    }
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted paypal_device_id = com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys.INSTANCE.getPAYPAL_DEVICE_ID();
                    deviceRegistrationInformationImpl$getPayPalDeviceId$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = appStorage.getString(paypal_device_id, deviceRegistrationInformationImpl$getPayPalDeviceId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    if (kotlin.text.StringsKt.isBlank(str)) {
                        str = null;
                    }
                    if (str != null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = str;
                        return str;
                    }
                }
                return null;
            }
        }
        deviceRegistrationInformationImpl$getPayPalDeviceId$1 = new com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$getPayPalDeviceId$1(this, continuation);
        java.lang.Object obj2 = deviceRegistrationInformationImpl$getPayPalDeviceId$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceRegistrationInformationImpl$getPayPalDeviceId$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isDeviceRegisteredWithPayPal(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1 deviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1) {
            deviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1 = (com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1) continuation;
            if ((deviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                deviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = deviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    deviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getPayPalDeviceId(deviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!(charSequence != null || kotlin.text.StringsKt.isBlank(charSequence)));
            }
        }
        deviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1 = new com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1(this, continuation);
        java.lang.Object obj2 = deviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) obj2;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!(charSequence2 != null || kotlin.text.StringsKt.isBlank(charSequence2)));
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter
    public final java.lang.Object persistDeviceConfirmationStatus(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj = this.Camera2StreamConfigurationMap.setBoolean(com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys.INSTANCE.getDEVICE_CONFIRMED(), z, continuation);
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isDeviceConfirmed(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isDeviceConfirmed$1 deviceRegistrationInformationImpl$isDeviceConfirmed$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isDeviceConfirmed$1) {
            deviceRegistrationInformationImpl$isDeviceConfirmed$1 = (com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isDeviceConfirmed$1) continuation;
            if ((deviceRegistrationInformationImpl$isDeviceConfirmed$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                deviceRegistrationInformationImpl$isDeviceConfirmed$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = deviceRegistrationInformationImpl$isDeviceConfirmed$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceRegistrationInformationImpl$isDeviceConfirmed$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted device_confirmed = com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys.INSTANCE.getDEVICE_CONFIRMED();
                    deviceRegistrationInformationImpl$isDeviceConfirmed$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = appStorage.getBoolean(device_confirmed, deviceRegistrationInformationImpl$isDeviceConfirmed$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool == null ? bool.booleanValue() : false);
            }
        }
        deviceRegistrationInformationImpl$isDeviceConfirmed$1 = new com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isDeviceConfirmed$1(this, continuation);
        java.lang.Object obj2 = deviceRegistrationInformationImpl$isDeviceConfirmed$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceRegistrationInformationImpl$isDeviceConfirmed$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isPaymentAppInstanceIdRegistered(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1 deviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1) {
            deviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1 = (com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1) continuation;
            if ((deviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                deviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = deviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted paid_registered = com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys.INSTANCE.getPAID_REGISTERED();
                    deviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1.getHighSpeedVideoSizes = 1;
                    obj = appStorage.getBoolean(paid_registered, deviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool == null ? bool.booleanValue() : false);
            }
        }
        deviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1 = new com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1(this, continuation);
        java.lang.Object obj2 = deviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool2 == null ? bool2.booleanValue() : false);
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter
    public final java.lang.Object persistPaymentAppInstanceIdRegistered(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj = this.Camera2StreamConfigurationMap.setBoolean(com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys.INSTANCE.getPAID_REGISTERED(), z, continuation);
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        if (r7.remove(r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r7.remove(r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r7.remove(r2, r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object clearDeviceRegistrationState(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$clearDeviceRegistrationState$1 deviceRegistrationInformationImpl$clearDeviceRegistrationState$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$clearDeviceRegistrationState$1) {
            deviceRegistrationInformationImpl$clearDeviceRegistrationState$1 = (com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$clearDeviceRegistrationState$1) continuation;
            if ((deviceRegistrationInformationImpl$clearDeviceRegistrationState$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                deviceRegistrationInformationImpl$clearDeviceRegistrationState$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = deviceRegistrationInformationImpl$clearDeviceRegistrationState$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceRegistrationInformationImpl$clearDeviceRegistrationState$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoFpsRanges.reset();
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted paypal_device_id = com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys.INSTANCE.getPAYPAL_DEVICE_ID();
                    deviceRegistrationInformationImpl$clearDeviceRegistrationState$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                } else if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted paid_registered = com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys.INSTANCE.getPAID_REGISTERED();
                    deviceRegistrationInformationImpl$clearDeviceRegistrationState$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                }
                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage3 = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted device_confirmed = com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys.INSTANCE.getDEVICE_CONFIRMED();
                deviceRegistrationInformationImpl$clearDeviceRegistrationState$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        deviceRegistrationInformationImpl$clearDeviceRegistrationState$1 = new com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$clearDeviceRegistrationState$1(this, continuation);
        java.lang.Object obj2 = deviceRegistrationInformationImpl$clearDeviceRegistrationState$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceRegistrationInformationImpl$clearDeviceRegistrationState$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage32 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted device_confirmed2 = com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl.Keys.INSTANCE.getDEVICE_CONFIRMED();
        deviceRegistrationInformationImpl$clearDeviceRegistrationState$1.getHighResolutionOutputSizeshNQ4ISI = 2;
    }
}
