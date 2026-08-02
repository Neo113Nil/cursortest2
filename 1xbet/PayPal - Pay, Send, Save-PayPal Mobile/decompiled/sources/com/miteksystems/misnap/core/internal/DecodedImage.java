package com.miteksystems.misnap.core.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/miteksystems/misnap/core/internal/DecodedImage;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "width", "height", "bytesPerPixel", "<init>", "([BIII)V", "component1", "()[B", "component2", "()I", "component3", "component4", "copy", "([BIII)Lcom/miteksystems/misnap/core/internal/DecodedImage;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[B", "getData", util.h.xy.cb.b.f1091, com.visa.cbp.getEncExpo.warmup, "getWidth", "c", "getHeight", "d", "getBytesPerPixel"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final /* data */ class DecodedImage {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] data;

    /* renamed from: b, reason: from kotlin metadata */
    private final int width;

    /* renamed from: c, reason: from kotlin metadata */
    private final int height;

    /* renamed from: d, reason: from kotlin metadata */
    private final int bytesPerPixel;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DecodedImage(data=");
        sb.append(java.util.Arrays.toString(this.data));
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", bytesPerPixel=");
        sb.append(this.bytesPerPixel);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.util.Arrays.hashCode(this.data) * 31) + java.lang.Integer.hashCode(this.width)) * 31) + java.lang.Integer.hashCode(this.height)) * 31) + java.lang.Integer.hashCode(this.bytesPerPixel);
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final int getBytesPerPixel() {
        return this.bytesPerPixel;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.miteksystems.misnap.core.internal.DecodedImage)) {
            return false;
        }
        com.miteksystems.misnap.core.internal.DecodedImage decodedImage = (com.miteksystems.misnap.core.internal.DecodedImage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.data, decodedImage.data) && this.width == decodedImage.width && this.height == decodedImage.height && this.bytesPerPixel == decodedImage.bytesPerPixel;
    }

    public final com.miteksystems.misnap.core.internal.DecodedImage copy(byte[] data, int width, int height, int bytesPerPixel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.miteksystems.misnap.core.internal.DecodedImage(data, width, height, bytesPerPixel);
    }

    /* renamed from: component4, reason: from getter */
    public final int getBytesPerPixel() {
        return this.bytesPerPixel;
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
    public final byte[] getData() {
        return this.data;
    }

    public static /* synthetic */ com.miteksystems.misnap.core.internal.DecodedImage copy$default(com.miteksystems.misnap.core.internal.DecodedImage decodedImage, byte[] bArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            bArr = decodedImage.data;
        }
        if ((i4 & 2) != 0) {
            i = decodedImage.width;
        }
        if ((i4 & 4) != 0) {
            i2 = decodedImage.height;
        }
        if ((i4 & 8) != 0) {
            i3 = decodedImage.bytesPerPixel;
        }
        return decodedImage.copy(bArr, i, i2, i3);
    }

    public DecodedImage(byte[] bArr, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.bytesPerPixel = i3;
    }
}
