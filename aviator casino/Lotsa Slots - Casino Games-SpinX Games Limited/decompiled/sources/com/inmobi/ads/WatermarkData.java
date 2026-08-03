package com.inmobi.ads;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/inmobi/ads/WatermarkData;", "", "watermarkBase64EncodedString", "", "alpha", "", "<init>", "(Ljava/lang/String;F)V", "getWatermarkBase64EncodedString", "()Ljava/lang/String;", "getAlpha", "()F", "setAlpha", "(F)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WatermarkData {
    private float alpha;
    private final java.lang.String watermarkBase64EncodedString;

    public WatermarkData(java.lang.String watermarkBase64EncodedString, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkBase64EncodedString, "watermarkBase64EncodedString");
        this.watermarkBase64EncodedString = watermarkBase64EncodedString;
        this.alpha = f;
    }

    public static /* synthetic */ com.inmobi.ads.WatermarkData copy$default(com.inmobi.ads.WatermarkData watermarkData, java.lang.String str, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = watermarkData.watermarkBase64EncodedString;
        }
        if ((i & 2) != 0) {
            f = watermarkData.alpha;
        }
        return watermarkData.copy(str, f);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getWatermarkBase64EncodedString() {
        return this.watermarkBase64EncodedString;
    }

    /* renamed from: component2, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    public final com.inmobi.ads.WatermarkData copy(java.lang.String watermarkBase64EncodedString, float alpha) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkBase64EncodedString, "watermarkBase64EncodedString");
        return new com.inmobi.ads.WatermarkData(watermarkBase64EncodedString, alpha);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.inmobi.ads.WatermarkData)) {
            return false;
        }
        com.inmobi.ads.WatermarkData watermarkData = (com.inmobi.ads.WatermarkData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.watermarkBase64EncodedString, watermarkData.watermarkBase64EncodedString) && java.lang.Float.compare(this.alpha, watermarkData.alpha) == 0;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final java.lang.String getWatermarkBase64EncodedString() {
        return this.watermarkBase64EncodedString;
    }

    public int hashCode() {
        return java.lang.Float.floatToIntBits(this.alpha) + (this.watermarkBase64EncodedString.hashCode() * 31);
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public java.lang.String toString() {
        return "WatermarkData(watermarkBase64EncodedString=" + this.watermarkBase64EncodedString + ", alpha=" + this.alpha + ")";
    }

    public /* synthetic */ WatermarkData(java.lang.String str, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 1.0f : f);
    }
}
