package com.paypal.oslo.feature.helpcenter.domain.models;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/domain/models/ImageAttribute;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/EcmAttribute;", "", "src", "width", "height", "alt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/domain/models/ImageAttribute;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSrc", "getWidth", "getHeight", "getAlt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImageAttribute implements com.paypal.oslo.feature.helpcenter.domain.models.EcmAttribute {
    public static final int $stable = 0;
    private final java.lang.String alt;
    private final java.lang.String height;
    private final java.lang.String src;
    private final java.lang.String width;

    public ImageAttribute(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.src = str;
        this.width = str2;
        this.height = str3;
        this.alt = str4;
    }

    public final java.lang.String getSrc() {
        return this.src;
    }

    public final java.lang.String getWidth() {
        return this.width;
    }

    public final java.lang.String getHeight() {
        return this.height;
    }

    public final java.lang.String getAlt() {
        return this.alt;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.src;
        java.lang.String str2 = this.width;
        java.lang.String str3 = this.height;
        java.lang.String str4 = this.alt;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageAttribute(src=");
        sb.append(str);
        sb.append(", width=");
        sb.append(str2);
        sb.append(", height=");
        sb.append(str3);
        sb.append(", alt=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.src;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.width;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.height;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.alt;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.helpcenter.domain.models.ImageAttribute)) {
            return false;
        }
        com.paypal.oslo.feature.helpcenter.domain.models.ImageAttribute imageAttribute = (com.paypal.oslo.feature.helpcenter.domain.models.ImageAttribute) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.src, imageAttribute.src) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, imageAttribute.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, imageAttribute.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.alt, imageAttribute.alt);
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.ImageAttribute copy(java.lang.String src, java.lang.String width, java.lang.String height, java.lang.String alt) {
        return new com.paypal.oslo.feature.helpcenter.domain.models.ImageAttribute(src, width, height, alt);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAlt() {
        return this.alt;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getHeight() {
        return this.height;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getWidth() {
        return this.width;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSrc() {
        return this.src;
    }

    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.domain.models.ImageAttribute copy$default(com.paypal.oslo.feature.helpcenter.domain.models.ImageAttribute imageAttribute, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = imageAttribute.src;
        }
        if ((i & 2) != 0) {
            str2 = imageAttribute.width;
        }
        if ((i & 4) != 0) {
            str3 = imageAttribute.height;
        }
        if ((i & 8) != 0) {
            str4 = imageAttribute.alt;
        }
        return imageAttribute.copy(str, str2, str3, str4);
    }
}
