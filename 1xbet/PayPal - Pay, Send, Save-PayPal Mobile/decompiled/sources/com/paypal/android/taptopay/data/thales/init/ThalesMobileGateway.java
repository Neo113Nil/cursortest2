package com.paypal.android.taptopay.data.thales.init;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/init/ThalesMobileGateway;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/data/thales/init/InitError;", "init$tap_to_pay_data_thales_release", "()Lcom/paypal/android/taptopay/domain/Result;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThalesMobileGateway {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    public ThalesMobileGateway(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context.getApplicationContext();
    }

    public final com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError> init$tap_to_pay_data_thales_release() {
        try {
            com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager mobileGatewayManager = com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE;
            if (mobileGatewayManager.getConfigurationState() == com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.NOT_CONFIGURED) {
                mobileGatewayManager.configure(this.Camera2StreamConfigurationMap);
            }
            return new com.paypal.android.taptopay.domain.Result.Success(kotlin.Unit.INSTANCE);
        } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException e) {
            return new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.data.thales.init.InitError("Error initializing Thales Mobile Gateway.", e));
        }
    }
}
