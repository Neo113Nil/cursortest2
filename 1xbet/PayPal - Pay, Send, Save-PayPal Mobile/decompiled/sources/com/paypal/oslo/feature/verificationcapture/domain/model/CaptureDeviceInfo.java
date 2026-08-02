package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b#\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDeviceInfo;", "", "", "deviceId", "", "width", "height", "", "aspectRatio", "frameRate", "<init>", "(Ljava/lang/String;IIFI)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()F", "component5", "copy", "(Ljava/lang/String;IIFI)Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDeviceInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getDeviceId", com.visa.cbp.getEncExpo.warmup, "getWidth", "getHeight", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAspectRatio", "getFrameRate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CaptureDeviceInfo {
    public static final int $stable = 0;
    private final float aspectRatio;
    private final java.lang.String deviceId;
    private final int frameRate;
    private final int height;
    private final int width;

    public CaptureDeviceInfo(java.lang.String str, int i, int i2, float f, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.deviceId = str;
        this.width = i;
        this.height = i2;
        this.aspectRatio = f;
        this.frameRate = i3;
    }

    public /* synthetic */ CaptureDeviceInfo(java.lang.String str, int i, int i2, float f, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, f, (i4 & 16) != 0 ? 30 : i3);
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceId;
        int i = this.width;
        int i2 = this.height;
        float f = this.aspectRatio;
        int i3 = this.frameRate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CaptureDeviceInfo(deviceId=");
        sb.append(str);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", aspectRatio=");
        sb.append(f);
        sb.append(", frameRate=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.deviceId.hashCode() * 31) + java.lang.Integer.hashCode(this.width)) * 31) + java.lang.Integer.hashCode(this.height)) * 31) + java.lang.Float.hashCode(this.aspectRatio)) * 31) + java.lang.Integer.hashCode(this.frameRate);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo captureDeviceInfo = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, captureDeviceInfo.deviceId) && this.width == captureDeviceInfo.width && this.height == captureDeviceInfo.height && java.lang.Float.compare(this.aspectRatio, captureDeviceInfo.aspectRatio) == 0 && this.frameRate == captureDeviceInfo.frameRate;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo copy(java.lang.String deviceId, int width, int height, float aspectRatio, int frameRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo(deviceId, width, height, aspectRatio, frameRate);
    }

    /* renamed from: component5, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* renamed from: component4, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo captureDeviceInfo, java.lang.String str, int i, int i2, float f, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            str = captureDeviceInfo.deviceId;
        }
        if ((i4 & 2) != 0) {
            i = captureDeviceInfo.width;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = captureDeviceInfo.height;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            f = captureDeviceInfo.aspectRatio;
        }
        float f2 = f;
        if ((i4 & 16) != 0) {
            i3 = captureDeviceInfo.frameRate;
        }
        return captureDeviceInfo.copy(str, i5, i6, f2, i3);
    }
}
