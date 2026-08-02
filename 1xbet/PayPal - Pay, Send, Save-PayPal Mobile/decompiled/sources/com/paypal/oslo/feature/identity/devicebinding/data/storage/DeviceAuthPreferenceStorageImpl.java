package com.paypal.oslo.feature.identity.devicebinding.data.storage;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/data/storage/DeviceAuthPreferenceStorageImpl;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "method", "", "disabled", "", "setDisabledByUser", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDisabledByUser", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;)Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceAuthPreferenceStorageImpl implements com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DeviceAuthPreferenceStorageImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighSpeedVideoFpsRangesFor = appStorage;
    }

    @Override // com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage
    public final java.lang.Object setDisabledByUser(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor.setBoolean(Camera2StreamConfigurationMap(deviceAuthMethod), z, continuation);
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isDisabledByUser(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl$isDisabledByUser$1 deviceAuthPreferenceStorageImpl$isDisabledByUser$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl$isDisabledByUser$1) {
            deviceAuthPreferenceStorageImpl$isDisabledByUser$1 = (com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl$isDisabledByUser$1) continuation;
            if ((deviceAuthPreferenceStorageImpl$isDisabledByUser$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                deviceAuthPreferenceStorageImpl$isDisabledByUser$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = deviceAuthPreferenceStorageImpl$isDisabledByUser$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceAuthPreferenceStorageImpl$isDisabledByUser$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(deviceAuthMethod);
                    deviceAuthPreferenceStorageImpl$isDisabledByUser$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceAuthMethod);
                    deviceAuthPreferenceStorageImpl$isDisabledByUser$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = appStorage.getBoolean(Camera2StreamConfigurationMap, deviceAuthPreferenceStorageImpl$isDisabledByUser$1);
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
        deviceAuthPreferenceStorageImpl$isDisabledByUser$1 = new com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl$isDisabledByUser$1(this, continuation);
        java.lang.Object obj2 = deviceAuthPreferenceStorageImpl$isDisabledByUser$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceAuthPreferenceStorageImpl$isDisabledByUser$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceAuthPreferenceStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object reset(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl$reset$1 deviceAuthPreferenceStorageImpl$reset$1;
        int i;
        java.lang.Iterable entries;
        java.util.Iterator it;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl$reset$1) {
            deviceAuthPreferenceStorageImpl$reset$1 = (com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl$reset$1) continuation;
            if ((deviceAuthPreferenceStorageImpl$reset$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                deviceAuthPreferenceStorageImpl$reset$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = deviceAuthPreferenceStorageImpl$reset$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceAuthPreferenceStorageImpl$reset$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    entries = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.getEntries();
                    it = entries.iterator();
                    i2 = 0;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = deviceAuthPreferenceStorageImpl$reset$1.getHighSpeedVideoFpsRanges;
                    i2 = deviceAuthPreferenceStorageImpl$reset$1.getHighSpeedVideoSizes;
                    java.lang.Object obj2 = deviceAuthPreferenceStorageImpl$reset$1.getHighSpeedVideoFpsRangesFor;
                    it = (java.util.Iterator) deviceAuthPreferenceStorageImpl$reset$1.getHighResolutionOutputSizeshNQ4ISI;
                    entries = (java.lang.Iterable) deviceAuthPreferenceStorageImpl$reset$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = (com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) next;
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(deviceAuthMethod);
                    deviceAuthPreferenceStorageImpl$reset$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(entries);
                    deviceAuthPreferenceStorageImpl$reset$1.getHighResolutionOutputSizeshNQ4ISI = it;
                    deviceAuthPreferenceStorageImpl$reset$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                    deviceAuthPreferenceStorageImpl$reset$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceAuthMethod);
                    deviceAuthPreferenceStorageImpl$reset$1.getHighSpeedVideoSizes = i2;
                    deviceAuthPreferenceStorageImpl$reset$1.getHighSpeedVideoFpsRanges = 0;
                    deviceAuthPreferenceStorageImpl$reset$1.getOutputFormats = 1;
                    if (appStorage.setBoolean(Camera2StreamConfigurationMap, false, deviceAuthPreferenceStorageImpl$reset$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        deviceAuthPreferenceStorageImpl$reset$1 = new com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl$reset$1(this, continuation);
        java.lang.Object obj3 = deviceAuthPreferenceStorageImpl$reset$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceAuthPreferenceStorageImpl$reset$1.getOutputFormats;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private static com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod p0) {
        java.lang.String str;
        int i = com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1) {
            str = "isBiometricDisabledByUser";
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = "isUserPreviewDisabledByUser";
        }
        return new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted(str);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
