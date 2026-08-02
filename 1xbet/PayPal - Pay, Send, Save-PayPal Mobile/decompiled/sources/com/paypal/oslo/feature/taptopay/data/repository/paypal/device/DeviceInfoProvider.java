package com.paypal.oslo.feature.taptopay.data.repository.paypal.device;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/DeviceInfoProvider;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/device/DeviceIdResolver;", "deviceIdResolver", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "cardRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/device/DeviceIdResolver;Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;)V", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/DeviceInfo;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/repository/device/DeviceIdResolver;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceInfoProvider {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider.Companion Companion = new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String OS_NAME_ANDROID = "ANDROID";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DeviceInfoProvider(com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver deviceIdResolver, com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceIdResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.getHighSpeedVideoSizes = deviceIdResolver;
        this.getHighSpeedVideoFpsRangesFor = cardRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider$invoke$1 deviceInfoProvider$invoke$1;
        int i;
        java.lang.String id;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider$invoke$1) {
            deviceInfoProvider$invoke$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider$invoke$1) continuation;
            if ((deviceInfoProvider$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                deviceInfoProvider$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = deviceInfoProvider$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceInfoProvider$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver deviceIdResolver = this.getHighSpeedVideoSizes;
                    deviceInfoProvider$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = deviceIdResolver.resolve(deviceInfoProvider$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdentifier deviceIdentifier = (com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdentifier) obj;
                id = deviceIdentifier.getId();
                if (id == null) {
                    id = "";
                }
                java.lang.String str = id;
                java.lang.String type = deviceIdentifier.getType();
                java.lang.String str2 = android.os.Build.MANUFACTURER;
                java.lang.String str3 = android.os.Build.MODEL;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(" ");
                sb.append(str3);
                return new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo(str, type, sb.toString(), null, null, "ANDROID", android.os.Build.VERSION.RELEASE, this.getHighSpeedVideoFpsRangesFor.getWalletID(), null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, null);
            }
        }
        deviceInfoProvider$invoke$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider$invoke$1(this, continuation);
        java.lang.Object obj2 = deviceInfoProvider$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceInfoProvider$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdentifier deviceIdentifier2 = (com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdentifier) obj2;
        id = deviceIdentifier2.getId();
        if (id == null) {
        }
        java.lang.String str4 = id;
        java.lang.String type2 = deviceIdentifier2.getType();
        java.lang.String str22 = android.os.Build.MANUFACTURER;
        java.lang.String str32 = android.os.Build.MODEL;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str22);
        sb2.append(" ");
        sb2.append(str32);
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfo(str4, type2, sb2.toString(), null, null, "ANDROID", android.os.Build.VERSION.RELEASE, this.getHighSpeedVideoFpsRangesFor.getWalletID(), null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/DeviceInfoProvider$Companion;", "", "<init>", "()V", "", "OS_NAME_ANDROID", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
