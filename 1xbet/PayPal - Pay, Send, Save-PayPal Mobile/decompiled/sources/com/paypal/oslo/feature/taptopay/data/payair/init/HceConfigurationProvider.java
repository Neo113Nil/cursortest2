package com.paypal.oslo.feature.taptopay.data.payair.init;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t¢\u0006\u0004\b\u0007\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/init/HceConfigurationProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getWakeUpIntent", "()Ljava/lang/String;", "Ljava/lang/Class;", "Landroid/app/Activity;", "activity", "(Ljava/lang/Class;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "paymentAppProviderId", "Ljava/lang/String;", "getPaymentAppProviderId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HceConfigurationProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    @dagger.hilt.android.qualifiers.ApplicationContext
    private final android.content.Context Camera2StreamConfigurationMap;
    private final java.lang.String paymentAppProviderId;

    @javax.inject.Inject
    public HceConfigurationProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
        this.paymentAppProviderId = "400";
    }

    public final java.lang.String getPaymentAppProviderId() {
        return this.paymentAppProviderId;
    }

    public final java.lang.String getWakeUpIntent() {
        java.lang.String uri;
        android.content.Intent launchIntentForPackage = this.Camera2StreamConfigurationMap.getPackageManager().getLaunchIntentForPackage(this.Camera2StreamConfigurationMap.getPackageName());
        return (launchIntentForPackage == null || (uri = launchIntentForPackage.toUri(1)) == null) ? "android-app://".concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap.getPackageName())) : uri;
    }

    public final java.lang.String getWakeUpIntent(java.lang.Class<? extends android.app.Activity> activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String uri = new android.content.Intent(this.Camera2StreamConfigurationMap, activity).toUri(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "");
        return uri;
    }
}
