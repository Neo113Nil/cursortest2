package com.paypal.oslo.feature.taptopay.data.repository.paypal.device;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B)\b\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/WalletPartnerDeviceIdResolver;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/device/DeviceIdResolver;", "Lkotlin/Lazy;", "", "appGUID", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;", "deviceRegistrationInformation", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "cardRepository", "<init>", "(Lkotlin/Lazy;Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;)V", "Lcom/paypal/oslo/feature/taptopay/domain/repository/device/DeviceIdentifier;", "resolve", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletPartnerDeviceIdResolver implements com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver {

    @java.lang.Deprecated
    public static final java.lang.String DEVICE_ID_TYPE_DMS = "DMS";

    @java.lang.Deprecated
    public static final java.lang.String DEVICE_ID_TYPE_GUID = "GUID";

    @java.lang.Deprecated
    public static final java.lang.String PAYPAL_PARTNER = "PAYPAL";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy<java.lang.String> getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver.Companion Companion = new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public WalletPartnerDeviceIdResolver(kotlin.Lazy<java.lang.String> lazy, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation deviceRegistrationInformation, com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRegistrationInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.getHighSpeedVideoFpsRanges = lazy;
        this.getHighSpeedVideoSizes = deviceRegistrationInformation;
        this.Camera2StreamConfigurationMap = cardRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object resolve(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdentifier> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver$resolve$1 walletPartnerDeviceIdResolver$resolve$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver$resolve$1) {
            walletPartnerDeviceIdResolver$resolve$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver$resolve$1) continuation;
            if ((walletPartnerDeviceIdResolver$resolve$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                walletPartnerDeviceIdResolver$resolve$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = walletPartnerDeviceIdResolver$resolve$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = walletPartnerDeviceIdResolver$resolve$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    boolean equals = kotlin.text.StringsKt.equals(this.Camera2StreamConfigurationMap.getWalletPartner(), "PAYPAL", true);
                    if (equals) {
                        com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation deviceRegistrationInformation = this.getHighSpeedVideoSizes;
                        walletPartnerDeviceIdResolver$resolve$1.getHighResolutionOutputSizeshNQ4ISI = equals;
                        walletPartnerDeviceIdResolver$resolve$1.Camera2StreamConfigurationMap = 1;
                        obj = deviceRegistrationInformation.getPayPalDeviceId(walletPartnerDeviceIdResolver$resolve$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return new com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdentifier(this.getHighSpeedVideoFpsRanges.getValue(), DEVICE_ID_TYPE_GUID);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z = walletPartnerDeviceIdResolver$resolve$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdentifier((java.lang.String) obj, DEVICE_ID_TYPE_DMS);
            }
        }
        walletPartnerDeviceIdResolver$resolve$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver$resolve$1(this, continuation);
        java.lang.Object obj2 = walletPartnerDeviceIdResolver$resolve$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = walletPartnerDeviceIdResolver$resolve$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdentifier((java.lang.String) obj2, DEVICE_ID_TYPE_DMS);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/WalletPartnerDeviceIdResolver$Companion;", "", "<init>", "()V", "", "PAYPAL_PARTNER", "Ljava/lang/String;", "DEVICE_ID_TYPE_DMS", "DEVICE_ID_TYPE_GUID"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
