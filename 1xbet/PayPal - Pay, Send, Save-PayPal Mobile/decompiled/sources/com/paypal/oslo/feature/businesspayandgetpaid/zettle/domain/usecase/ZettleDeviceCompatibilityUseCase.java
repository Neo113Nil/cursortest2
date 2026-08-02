package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/ZettleDeviceCompatibilityUseCase;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/sdk/TapToPaySDKManager;", "sdkManager", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/sdk/TapToPaySDKManager;)V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;", "invoke", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/sdk/TapToPaySDKManager;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ZettleDeviceCompatibilityUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ZettleDeviceCompatibilityUseCase(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager tapToPaySDKManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPaySDKManager, "");
        this.getHighSpeedVideoFpsRangesFor = tapToPaySDKManager;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult invoke(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager tapToPaySDKManager = this.getHighSpeedVideoFpsRangesFor;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return tapToPaySDKManager.isRunningOnRemoteProcess(applicationContext).ifCompatibleThen(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult checkDeviceSupport;
                checkDeviceSupport = com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase.this.getHighSpeedVideoFpsRangesFor.checkDeviceSupport(context);
                return checkDeviceSupport;
            }
        }).ifCompatibleThen(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult checkDeviceCapability;
                checkDeviceCapability = com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase.this.getHighSpeedVideoFpsRangesFor.checkDeviceCapability(context);
                return checkDeviceCapability;
            }
        });
    }
}
