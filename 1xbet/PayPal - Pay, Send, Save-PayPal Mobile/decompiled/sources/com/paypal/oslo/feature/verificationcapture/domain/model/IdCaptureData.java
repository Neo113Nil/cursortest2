package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b8\b\u0086\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001cJ\u0012\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b,\u0010&J\u0012\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b-\u0010&J\u0012\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010&J\u0010\u0010/\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u0010\u001eJÈ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00162\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b7\u0010\u001eJ\u0010\u00108\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b8\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b=\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b>\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bA\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bB\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010&R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bE\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bF\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010*R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\bI\u0010\u001cR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bJ\u0010&R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bK\u0010&R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bL\u0010&R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\b\u0017\u00100R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\bN\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/IdCaptureData;", "", "", "frameRate", "", "accelerometerChanged", "gyroscopeChanged", "motionChanged", "", "accelerometerEvent", "gyroscopeEvent", "motionEvent", "", "deviceId", "aspectRatio", "effort", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureMode;", "captureMode", "documentDetectionScore", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "extractedData", "metaData", "", "isManualCapture", "retryCount", "<init>", "(FIII[F[F[FLjava/lang/String;FILcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureMode;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "component1", "()F", "component2", "()I", "component3", "component4", "component5", "()[F", "component6", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureMode;", "component12", "component13", "component14", "component15", "component16", "()Z", "component17", "copy", "(FIII[F[F[FLjava/lang/String;FILcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureMode;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lcom/paypal/oslo/feature/verificationcapture/domain/model/IdCaptureData;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFrameRate", com.visa.cbp.getEncExpo.warmup, "getAccelerometerChanged", "getGyroscopeChanged", "getMotionChanged", "[F", "getAccelerometerEvent", "getGyroscopeEvent", "getMotionEvent", "Ljava/lang/String;", "getDeviceId", "getAspectRatio", "getEffort", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureMode;", "getCaptureMode", "getDocumentDetectionScore", "getBarcode", "getExtractedData", "getMetaData", "Z", "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class IdCaptureData {
    public static final int $stable = 8;
    private final int accelerometerChanged;
    private final float[] accelerometerEvent;
    private final float aspectRatio;
    private final java.lang.String barcode;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureMode captureMode;
    private final java.lang.String deviceId;
    private final float documentDetectionScore;
    private final int effort;
    private final java.lang.String extractedData;
    private final float frameRate;
    private final int gyroscopeChanged;
    private final float[] gyroscopeEvent;
    private final boolean isManualCapture;
    private final java.lang.String metaData;
    private final int motionChanged;
    private final float[] motionEvent;
    private final int retryCount;

    public IdCaptureData(float f, int i, int i2, int i3, float[] fArr, float[] fArr2, float[] fArr3, java.lang.String str, float f2, int i4, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureMode captureMode, float f3, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
        this.frameRate = f;
        this.accelerometerChanged = i;
        this.gyroscopeChanged = i2;
        this.motionChanged = i3;
        this.accelerometerEvent = fArr;
        this.gyroscopeEvent = fArr2;
        this.motionEvent = fArr3;
        this.deviceId = str;
        this.aspectRatio = f2;
        this.effort = i4;
        this.captureMode = captureMode;
        this.documentDetectionScore = f3;
        this.barcode = str2;
        this.extractedData = str3;
        this.metaData = str4;
        this.isManualCapture = z;
        this.retryCount = i5;
    }

    public final float getFrameRate() {
        return this.frameRate;
    }

    public final int getAccelerometerChanged() {
        return this.accelerometerChanged;
    }

    public final int getGyroscopeChanged() {
        return this.gyroscopeChanged;
    }

    public final int getMotionChanged() {
        return this.motionChanged;
    }

    public final float[] getAccelerometerEvent() {
        return this.accelerometerEvent;
    }

    public final float[] getGyroscopeEvent() {
        return this.gyroscopeEvent;
    }

    public final float[] getMotionEvent() {
        return this.motionEvent;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final int getEffort() {
        return this.effort;
    }

    public /* synthetic */ IdCaptureData(float f, int i, int i2, int i3, float[] fArr, float[] fArr2, float[] fArr3, java.lang.String str, float f2, int i4, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureMode captureMode, float f3, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i5, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0.0f : f, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? null : fArr, (i6 & 32) != 0 ? null : fArr2, (i6 & 64) != 0 ? null : fArr3, (i6 & 128) != 0 ? null : str, (i6 & 256) != 0 ? 0.0f : f2, (i6 & 512) != 0 ? 0 : i4, (i6 & 1024) != 0 ? com.paypal.oslo.feature.verificationcapture.domain.model.CaptureMode.AUTO : captureMode, (i6 & 2048) == 0 ? f3 : 0.0f, (i6 & 4096) != 0 ? null : str2, (i6 & 8192) != 0 ? null : str3, (i6 & 16384) != 0 ? null : str4, (i6 & 32768) != 0 ? false : z, (i6 & 65536) != 0 ? 0 : i5);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    public final float getDocumentDetectionScore() {
        return this.documentDetectionScore;
    }

    public final java.lang.String getBarcode() {
        return this.barcode;
    }

    public final java.lang.String getExtractedData() {
        return this.extractedData;
    }

    public final java.lang.String getMetaData() {
        return this.metaData;
    }

    public final boolean isManualCapture() {
        return this.isManualCapture;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final java.lang.String toString() {
        float f = this.frameRate;
        int i = this.accelerometerChanged;
        int i2 = this.gyroscopeChanged;
        int i3 = this.motionChanged;
        java.lang.String arrays = java.util.Arrays.toString(this.accelerometerEvent);
        java.lang.String arrays2 = java.util.Arrays.toString(this.gyroscopeEvent);
        java.lang.String arrays3 = java.util.Arrays.toString(this.motionEvent);
        java.lang.String str = this.deviceId;
        float f2 = this.aspectRatio;
        int i4 = this.effort;
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureMode captureMode = this.captureMode;
        float f3 = this.documentDetectionScore;
        java.lang.String str2 = this.barcode;
        java.lang.String str3 = this.extractedData;
        java.lang.String str4 = this.metaData;
        boolean z = this.isManualCapture;
        int i5 = this.retryCount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IdCaptureData(frameRate=");
        sb.append(f);
        sb.append(", accelerometerChanged=");
        sb.append(i);
        sb.append(", gyroscopeChanged=");
        sb.append(i2);
        sb.append(", motionChanged=");
        sb.append(i3);
        sb.append(", accelerometerEvent=");
        sb.append(arrays);
        sb.append(", gyroscopeEvent=");
        sb.append(arrays2);
        sb.append(", motionEvent=");
        sb.append(arrays3);
        sb.append(", deviceId=");
        sb.append(str);
        sb.append(", aspectRatio=");
        sb.append(f2);
        sb.append(", effort=");
        sb.append(i4);
        sb.append(", captureMode=");
        sb.append(captureMode);
        sb.append(", documentDetectionScore=");
        sb.append(f3);
        sb.append(", barcode=");
        sb.append(str2);
        sb.append(", extractedData=");
        sb.append(str3);
        sb.append(", metaData=");
        sb.append(str4);
        sb.append(", isManualCapture=");
        sb.append(z);
        sb.append(", retryCount=");
        sb.append(i5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.frameRate);
        int hashCode2 = java.lang.Integer.hashCode(this.accelerometerChanged);
        int hashCode3 = java.lang.Integer.hashCode(this.gyroscopeChanged);
        int hashCode4 = java.lang.Integer.hashCode(this.motionChanged);
        float[] fArr = this.accelerometerEvent;
        int hashCode5 = fArr == null ? 0 : java.util.Arrays.hashCode(fArr);
        float[] fArr2 = this.gyroscopeEvent;
        int hashCode6 = fArr2 == null ? 0 : java.util.Arrays.hashCode(fArr2);
        float[] fArr3 = this.motionEvent;
        int hashCode7 = fArr3 == null ? 0 : java.util.Arrays.hashCode(fArr3);
        java.lang.String str = this.deviceId;
        int hashCode8 = str == null ? 0 : str.hashCode();
        int hashCode9 = java.lang.Float.hashCode(this.aspectRatio);
        int hashCode10 = java.lang.Integer.hashCode(this.effort);
        int hashCode11 = this.captureMode.hashCode();
        int hashCode12 = java.lang.Float.hashCode(this.documentDetectionScore);
        java.lang.String str2 = this.barcode;
        int hashCode13 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.extractedData;
        int hashCode14 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.metaData;
        return (((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isManualCapture)) * 31) + java.lang.Integer.hashCode(this.retryCount);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData idCaptureData = (com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData) other;
        return java.lang.Float.compare(this.frameRate, idCaptureData.frameRate) == 0 && this.accelerometerChanged == idCaptureData.accelerometerChanged && this.gyroscopeChanged == idCaptureData.gyroscopeChanged && this.motionChanged == idCaptureData.motionChanged && kotlin.jvm.internal.Intrinsics.areEqual(this.accelerometerEvent, idCaptureData.accelerometerEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.gyroscopeEvent, idCaptureData.gyroscopeEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.motionEvent, idCaptureData.motionEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, idCaptureData.deviceId) && java.lang.Float.compare(this.aspectRatio, idCaptureData.aspectRatio) == 0 && this.effort == idCaptureData.effort && this.captureMode == idCaptureData.captureMode && java.lang.Float.compare(this.documentDetectionScore, idCaptureData.documentDetectionScore) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.barcode, idCaptureData.barcode) && kotlin.jvm.internal.Intrinsics.areEqual(this.extractedData, idCaptureData.extractedData) && kotlin.jvm.internal.Intrinsics.areEqual(this.metaData, idCaptureData.metaData) && this.isManualCapture == idCaptureData.isManualCapture && this.retryCount == idCaptureData.retryCount;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData copy(float frameRate, int accelerometerChanged, int gyroscopeChanged, int motionChanged, float[] accelerometerEvent, float[] gyroscopeEvent, float[] motionEvent, java.lang.String deviceId, float aspectRatio, int effort, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureMode captureMode, float documentDetectionScore, java.lang.String barcode, java.lang.String extractedData, java.lang.String metaData, boolean isManualCapture, int retryCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData(frameRate, accelerometerChanged, gyroscopeChanged, motionChanged, accelerometerEvent, gyroscopeEvent, motionEvent, deviceId, aspectRatio, effort, captureMode, documentDetectionScore, barcode, extractedData, metaData, isManualCapture, retryCount);
    }

    /* renamed from: component9, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component7, reason: from getter */
    public final float[] getMotionEvent() {
        return this.motionEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final float[] getGyroscopeEvent() {
        return this.gyroscopeEvent;
    }

    /* renamed from: component5, reason: from getter */
    public final float[] getAccelerometerEvent() {
        return this.accelerometerEvent;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMotionChanged() {
        return this.motionChanged;
    }

    /* renamed from: component3, reason: from getter */
    public final int getGyroscopeChanged() {
        return this.gyroscopeChanged;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAccelerometerChanged() {
        return this.accelerometerChanged;
    }

    /* renamed from: component17, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsManualCapture() {
        return this.isManualCapture;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.String getMetaData() {
        return this.metaData;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.String getExtractedData() {
        return this.extractedData;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getBarcode() {
        return this.barcode;
    }

    /* renamed from: component12, reason: from getter */
    public final float getDocumentDetectionScore() {
        return this.documentDetectionScore;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    /* renamed from: component10, reason: from getter */
    public final int getEffort() {
        return this.effort;
    }

    /* renamed from: component1, reason: from getter */
    public final float getFrameRate() {
        return this.frameRate;
    }

    public IdCaptureData() {
        this(0.0f, 0, 0, 0, null, null, null, null, 0.0f, 0, null, 0.0f, null, null, null, false, 0, 131071, null);
    }
}
