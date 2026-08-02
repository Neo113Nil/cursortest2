package com.paypal.oslo.feature.identity.devicebinding.data.storage;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/data/storage/DeviceBindingTokenStorageImpl;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "method", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "saveBindingToken", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBindingToken", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearBindingToken", "clearAllBindingTokens", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;)Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceBindingTokenStorageImpl implements com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl.Companion Companion = new com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public DeviceBindingTokenStorageImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighSpeedVideoFpsRanges = appStorage;
    }

    @Override // com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage
    public final java.lang.Object saveBindingToken(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object string = this.getHighSpeedVideoFpsRanges.setString(Camera2StreamConfigurationMap(deviceAuthMethod), str, continuation);
        return string == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? string : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage
    public final java.lang.Object getBindingToken(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return this.getHighSpeedVideoFpsRanges.getString(Camera2StreamConfigurationMap(deviceAuthMethod), continuation);
    }

    @Override // com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage
    public final java.lang.Object clearBindingToken(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object remove = this.getHighSpeedVideoFpsRanges.remove(Camera2StreamConfigurationMap(deviceAuthMethod), continuation);
        return remove == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? remove : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object clearAllBindingTokens(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl$clearAllBindingTokens$1 deviceBindingTokenStorageImpl$clearAllBindingTokens$1;
        int i;
        java.lang.Iterable entries;
        java.util.Iterator it;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl$clearAllBindingTokens$1) {
            deviceBindingTokenStorageImpl$clearAllBindingTokens$1 = (com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl$clearAllBindingTokens$1) continuation;
            if ((deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getInputFormats -= 2147483648;
                java.lang.Object obj = deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    entries = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.getEntries();
                    it = entries.iterator();
                    i2 = 0;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = deviceBindingTokenStorageImpl$clearAllBindingTokens$1.Camera2StreamConfigurationMap;
                    i2 = deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getHighSpeedVideoSizes;
                    java.lang.Object obj2 = deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getHighSpeedVideoFpsRanges;
                    it = (java.util.Iterator) deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getHighSpeedVideoFpsRangesFor;
                    entries = (java.lang.Iterable) deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = (com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) next;
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(deviceAuthMethod);
                    deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(entries);
                    deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getHighSpeedVideoFpsRangesFor = it;
                    deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                    deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceAuthMethod);
                    deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getHighSpeedVideoSizes = i2;
                    deviceBindingTokenStorageImpl$clearAllBindingTokens$1.Camera2StreamConfigurationMap = 0;
                    deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getInputFormats = 1;
                    if (appStorage.remove(Camera2StreamConfigurationMap, deviceBindingTokenStorageImpl$clearAllBindingTokens$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        deviceBindingTokenStorageImpl$clearAllBindingTokens$1 = new com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl$clearAllBindingTokens$1(this, continuation);
        java.lang.Object obj3 = deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceBindingTokenStorageImpl$clearAllBindingTokens$1.getInputFormats;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private static com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod p0) {
        java.lang.String str;
        int i = com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1) {
            str = "userBiometricUserBindToken";
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = "userPreviewUserBindToken";
        }
        return new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted(str);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/data/storage/DeviceBindingTokenStorageImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
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
