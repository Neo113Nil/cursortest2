package com.zettle.sdk.core.payment;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/payment/MagnesModuleImpl;", "Lcom/zettle/sdk/core/payment/MagnesModule;", "Llib/android/paypal/com/magnessdk/MagnesSDK;", "magnesSDK", "Landroid/content/Context;", "context", "<init>", "(Llib/android/paypal/com/magnessdk/MagnesSDK;Landroid/content/Context;)V", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Llib/android/paypal/com/magnessdk/MagnesSDK;", "getHighSpeedVideoSizes", "", "getPaypalClientMetaDataId", "()Ljava/lang/String;", "paypalClientMetaDataId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MagnesModuleImpl implements com.zettle.sdk.core.payment.MagnesModule {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final lib.android.paypal.com.magnessdk.MagnesSDK getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    public MagnesModuleImpl(lib.android.paypal.com.magnessdk.MagnesSDK magnesSDK, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(magnesSDK, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = magnesSDK;
        this.Camera2StreamConfigurationMap = context;
    }

    @Override // com.zettle.sdk.core.Module
    public final void start() {
        com.zettle.sdk.core.payment.MagnesModule.DefaultImpls.start(this);
    }

    @Override // com.zettle.sdk.core.Module
    public final void stop() {
        com.zettle.sdk.core.payment.MagnesModule.DefaultImpls.stop(this);
    }

    @Override // com.zettle.sdk.core.payment.MagnesModule
    public final java.lang.String getPaypalClientMetaDataId() {
        return this.getHighSpeedVideoSizes.collectAndSubmit(this.Camera2StreamConfigurationMap).getPaypalClientMetaDataId();
    }
}
