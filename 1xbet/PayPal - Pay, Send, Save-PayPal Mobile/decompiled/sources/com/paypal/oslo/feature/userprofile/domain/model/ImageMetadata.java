package com.paypal.oslo.feature.userprofile.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0011\u0010\"\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b!\u0010\u0011R\u0011\u0010$\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/ImageMetadata;", "", "", "width", "height", "", "fileSizeBytes", "", "format", "<init>", "(IIJLjava/lang/String;)V", "component1", "()I", "component2", "component3", "()J", "component4", "()Ljava/lang/String;", "copy", "(IIJLjava/lang/String;)Lcom/paypal/oslo/feature/userprofile/domain/model/ImageMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getWidth", "getHeight", "J", "getFileSizeBytes", "Ljava/lang/String;", "getFormat", "getFileSizeKB", "fileSizeKB", "getDimensions", "dimensions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ImageMetadata {
    public static final int $stable = 0;
    private final long fileSizeBytes;
    private final java.lang.String format;
    private final int height;
    private final int width;

    public ImageMetadata(int i, int i2, long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.width = i;
        this.height = i2;
        this.fileSizeBytes = j;
        this.format = str;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

    public final java.lang.String getFormat() {
        return this.format;
    }

    public final java.lang.String getFileSizeKB() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "%.1f KB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(this.fileSizeBytes / 1024.0d)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public final java.lang.String getDimensions() {
        int i = this.width;
        int i2 = this.height;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }

    public final java.lang.String toString() {
        int i = this.width;
        int i2 = this.height;
        long j = this.fileSizeBytes;
        java.lang.String str = this.format;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageMetadata(width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", fileSizeBytes=");
        sb.append(j);
        sb.append(", format=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.width) * 31) + java.lang.Integer.hashCode(this.height)) * 31) + java.lang.Long.hashCode(this.fileSizeBytes)) * 31) + this.format.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata)) {
            return false;
        }
        com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata imageMetadata = (com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata) other;
        return this.width == imageMetadata.width && this.height == imageMetadata.height && this.fileSizeBytes == imageMetadata.fileSizeBytes && kotlin.jvm.internal.Intrinsics.areEqual(this.format, imageMetadata.format);
    }

    public final com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata copy(int width, int height, long fileSizeBytes, java.lang.String format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        return new com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata(width, height, fileSizeBytes, format);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFormat() {
        return this.format;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata copy$default(com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata imageMetadata, int i, int i2, long j, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = imageMetadata.width;
        }
        if ((i3 & 2) != 0) {
            i2 = imageMetadata.height;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            j = imageMetadata.fileSizeBytes;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            str = imageMetadata.format;
        }
        return imageMetadata.copy(i, i4, j2, str);
    }
}
