package com.paypal.android.threeds.transaction.devicedata;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/android/threeds/transaction/devicedata/DisplayMetricsData;", "Lcom/paypal/android/threeds/interfaces/DeviceDataFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "", "deviceData", "deviceParamNotAvailable", "", "updateDeviceData", "(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DisplayMetricsData implements com.paypal.android.threeds.interfaces.DeviceDataFactory {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.transaction.devicedata.DisplayMetricsData INSTANCE = new com.paypal.android.threeds.transaction.devicedata.DisplayMetricsData();

    private DisplayMetricsData() {
    }

    @Override // com.paypal.android.threeds.interfaces.DeviceDataFactory
    public final void updateDeviceData(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.DISPLAY_DENSITY.getCode(), java.text.NumberFormat.getInstance().format(java.lang.Float.valueOf(displayMetrics.density)).toString());
        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.DISPLAY_DENSITY_DPI.getCode(), java.lang.String.valueOf(displayMetrics.densityDpi));
        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.DISPLAY_SCALED_DENSITY.getCode(), java.text.NumberFormat.getInstance().format(java.lang.Float.valueOf(displayMetrics.scaledDensity)).toString());
        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.DISPLAY_XDPI.getCode(), java.text.NumberFormat.getInstance().format(java.lang.Float.valueOf(displayMetrics.xdpi)).toString());
        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.DISPLAY_YDPI.getCode(), java.text.NumberFormat.getInstance().format(java.lang.Float.valueOf(displayMetrics.ydpi)).toString());
        java.lang.String code = com.paypal.android.threeds.data.model.DeviceDataParam.SCREEN_RESOLUTION.getCode();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        deviceData.put(code, sb.toString());
    }
}
