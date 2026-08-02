package com.paypal.android.threeds.init;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/android/threeds/init/ConfigurationParams;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setRequestTimeout", "(I)V", "Lorg/json/JSONArray;", "setRenderType", "(Lorg/json/JSONArray;)V", "", "setUiType", "(Ljava/lang/String;)V", "Lcom/paypal/android/threeds/init/ThreeEnvironment;", "setEnvironment", "(Lcom/paypal/android/threeds/init/ThreeEnvironment;)V", "getRequestTimeout", "()I", "getRenderType", "()Lorg/json/JSONArray;", "getUiType", "()Ljava/lang/String;", "getEnvironment", "()Lcom/paypal/android/threeds/init/ThreeEnvironment;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Lorg/json/JSONArray;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/threeds/init/ThreeEnvironment;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ConfigurationParams {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.android.threeds.init.ThreeEnvironment Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor = 5;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private org.json.JSONArray getHighSpeedVideoFpsRanges = new org.json.JSONArray();

    public final void setRequestTimeout(int value) {
        this.getHighSpeedVideoFpsRangesFor = value;
    }

    public final void setRenderType(org.json.JSONArray value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoFpsRanges = value;
    }

    public final void setUiType(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighResolutionOutputSizeshNQ4ISI = value;
    }

    public final void setEnvironment(com.paypal.android.threeds.init.ThreeEnvironment value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.Camera2StreamConfigurationMap = value;
    }

    /* renamed from: getRequestTimeout, reason: from getter */
    public final int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getRenderType, reason: from getter */
    public final org.json.JSONArray getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getUiType, reason: from getter */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getEnvironment, reason: from getter */
    public final com.paypal.android.threeds.init.ThreeEnvironment getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }
}
