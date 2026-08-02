package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J~\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0014J\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b1\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b2\u0010\u0017R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b5\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b\u000f\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b6\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;", "", "", "overallTimeoutSeconds", "barcodeTimeoutSeconds", "", "enableBarcode", "lightCheckTimeoutSeconds", "", "lightCheckThreshold", "fallbackEdgeDetectionDuration", "switchCaptureContent", "", "captureMode", "retryLimit", "isHandleManualCapture", "immediateTimeout", "<init>", "(IIZIFIZLjava/lang/String;IZZ)V", "component1", "()I", "component2", "component3", "()Z", "component4", "component5", "()F", "component6", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "component11", "copy", "(IIZIFIZLjava/lang/String;IZZ)Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getOverallTimeoutSeconds", "getBarcodeTimeoutSeconds", "Z", "getEnableBarcode", "getLightCheckTimeoutSeconds", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getLightCheckThreshold", "getFallbackEdgeDetectionDuration", "getSwitchCaptureContent", "Ljava/lang/String;", "getCaptureMode", "getRetryLimit", "getImmediateTimeout", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CaptureConfig {
    public static final int $stable = 0;
    public static final int DEFAULT_TIMEOUT_SECONDS = 30;
    private final int barcodeTimeoutSeconds;
    private final java.lang.String captureMode;
    private final boolean enableBarcode;
    private final int fallbackEdgeDetectionDuration;
    private final boolean immediateTimeout;
    private final boolean isHandleManualCapture;
    private final float lightCheckThreshold;
    private final int lightCheckTimeoutSeconds;
    private final int overallTimeoutSeconds;
    private final int retryLimit;
    private final boolean switchCaptureContent;

    public CaptureConfig(int i, int i2, boolean z, int i3, float f, int i4, boolean z2, java.lang.String str, int i5, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.overallTimeoutSeconds = i;
        this.barcodeTimeoutSeconds = i2;
        this.enableBarcode = z;
        this.lightCheckTimeoutSeconds = i3;
        this.lightCheckThreshold = f;
        this.fallbackEdgeDetectionDuration = i4;
        this.switchCaptureContent = z2;
        this.captureMode = str;
        this.retryLimit = i5;
        this.isHandleManualCapture = z3;
        this.immediateTimeout = z4;
    }

    public final int getOverallTimeoutSeconds() {
        return this.overallTimeoutSeconds;
    }

    public final int getBarcodeTimeoutSeconds() {
        return this.barcodeTimeoutSeconds;
    }

    public final boolean getEnableBarcode() {
        return this.enableBarcode;
    }

    public final int getLightCheckTimeoutSeconds() {
        return this.lightCheckTimeoutSeconds;
    }

    public final float getLightCheckThreshold() {
        return this.lightCheckThreshold;
    }

    public final int getFallbackEdgeDetectionDuration() {
        return this.fallbackEdgeDetectionDuration;
    }

    public final boolean getSwitchCaptureContent() {
        return this.switchCaptureContent;
    }

    public /* synthetic */ CaptureConfig(int i, int i2, boolean z, int i3, float f, int i4, boolean z2, java.lang.String str, int i5, boolean z3, boolean z4, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 30 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? false : z, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0.0f : f, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) != 0 ? false : z2, (i6 & 128) != 0 ? "AUTO" : str, (i6 & 256) != 0 ? 0 : i5, (i6 & 512) != 0 ? false : z3, (i6 & 1024) == 0 ? z4 : false);
    }

    public final java.lang.String getCaptureMode() {
        return this.captureMode;
    }

    public final int getRetryLimit() {
        return this.retryLimit;
    }

    public final boolean isHandleManualCapture() {
        return this.isHandleManualCapture;
    }

    public final boolean getImmediateTimeout() {
        return this.immediateTimeout;
    }

    public final java.lang.String toString() {
        int i = this.overallTimeoutSeconds;
        int i2 = this.barcodeTimeoutSeconds;
        boolean z = this.enableBarcode;
        int i3 = this.lightCheckTimeoutSeconds;
        float f = this.lightCheckThreshold;
        int i4 = this.fallbackEdgeDetectionDuration;
        boolean z2 = this.switchCaptureContent;
        java.lang.String str = this.captureMode;
        int i5 = this.retryLimit;
        boolean z3 = this.isHandleManualCapture;
        boolean z4 = this.immediateTimeout;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CaptureConfig(overallTimeoutSeconds=");
        sb.append(i);
        sb.append(", barcodeTimeoutSeconds=");
        sb.append(i2);
        sb.append(", enableBarcode=");
        sb.append(z);
        sb.append(", lightCheckTimeoutSeconds=");
        sb.append(i3);
        sb.append(", lightCheckThreshold=");
        sb.append(f);
        sb.append(", fallbackEdgeDetectionDuration=");
        sb.append(i4);
        sb.append(", switchCaptureContent=");
        sb.append(z2);
        sb.append(", captureMode=");
        sb.append(str);
        sb.append(", retryLimit=");
        sb.append(i5);
        sb.append(", isHandleManualCapture=");
        sb.append(z3);
        sb.append(", immediateTimeout=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((((java.lang.Integer.hashCode(this.overallTimeoutSeconds) * 31) + java.lang.Integer.hashCode(this.barcodeTimeoutSeconds)) * 31) + java.lang.Boolean.hashCode(this.enableBarcode)) * 31) + java.lang.Integer.hashCode(this.lightCheckTimeoutSeconds)) * 31) + java.lang.Float.hashCode(this.lightCheckThreshold)) * 31) + java.lang.Integer.hashCode(this.fallbackEdgeDetectionDuration)) * 31) + java.lang.Boolean.hashCode(this.switchCaptureContent)) * 31) + this.captureMode.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryLimit)) * 31) + java.lang.Boolean.hashCode(this.isHandleManualCapture)) * 31) + java.lang.Boolean.hashCode(this.immediateTimeout);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig captureConfig = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig) other;
        return this.overallTimeoutSeconds == captureConfig.overallTimeoutSeconds && this.barcodeTimeoutSeconds == captureConfig.barcodeTimeoutSeconds && this.enableBarcode == captureConfig.enableBarcode && this.lightCheckTimeoutSeconds == captureConfig.lightCheckTimeoutSeconds && java.lang.Float.compare(this.lightCheckThreshold, captureConfig.lightCheckThreshold) == 0 && this.fallbackEdgeDetectionDuration == captureConfig.fallbackEdgeDetectionDuration && this.switchCaptureContent == captureConfig.switchCaptureContent && kotlin.jvm.internal.Intrinsics.areEqual(this.captureMode, captureConfig.captureMode) && this.retryLimit == captureConfig.retryLimit && this.isHandleManualCapture == captureConfig.isHandleManualCapture && this.immediateTimeout == captureConfig.immediateTimeout;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig copy(int overallTimeoutSeconds, int barcodeTimeoutSeconds, boolean enableBarcode, int lightCheckTimeoutSeconds, float lightCheckThreshold, int fallbackEdgeDetectionDuration, boolean switchCaptureContent, java.lang.String captureMode, int retryLimit, boolean isHandleManualCapture, boolean immediateTimeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig(overallTimeoutSeconds, barcodeTimeoutSeconds, enableBarcode, lightCheckTimeoutSeconds, lightCheckThreshold, fallbackEdgeDetectionDuration, switchCaptureContent, captureMode, retryLimit, isHandleManualCapture, immediateTimeout);
    }

    /* renamed from: component9, reason: from getter */
    public final int getRetryLimit() {
        return this.retryLimit;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getCaptureMode() {
        return this.captureMode;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSwitchCaptureContent() {
        return this.switchCaptureContent;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFallbackEdgeDetectionDuration() {
        return this.fallbackEdgeDetectionDuration;
    }

    /* renamed from: component5, reason: from getter */
    public final float getLightCheckThreshold() {
        return this.lightCheckThreshold;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLightCheckTimeoutSeconds() {
        return this.lightCheckTimeoutSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableBarcode() {
        return this.enableBarcode;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBarcodeTimeoutSeconds() {
        return this.barcodeTimeoutSeconds;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getImmediateTimeout() {
        return this.immediateTimeout;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsHandleManualCapture() {
        return this.isHandleManualCapture;
    }

    /* renamed from: component1, reason: from getter */
    public final int getOverallTimeoutSeconds() {
        return this.overallTimeoutSeconds;
    }

    public CaptureConfig() {
        this(0, 0, false, 0, 0.0f, 0, false, null, 0, false, false, 2047, null);
    }
}
