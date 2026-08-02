package com.paypal.oslo.feature.taptopay.domain.usecase.device;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsXiaomiDeviceUseCase;", "", "<init>", "()V", "", "invoke", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IsXiaomiDeviceUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public IsXiaomiDeviceUseCase() {
    }

    public final boolean invoke() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String str2 = android.os.Build.BRAND;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        java.lang.String lowerCase2 = str2.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, com.adjust.sdk.Constants.REFERRER_API_XIAOMI) || kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "redmi") || kotlin.jvm.internal.Intrinsics.areEqual(lowerCase2, com.adjust.sdk.Constants.REFERRER_API_XIAOMI) || kotlin.jvm.internal.Intrinsics.areEqual(lowerCase2, "redmi");
    }
}
