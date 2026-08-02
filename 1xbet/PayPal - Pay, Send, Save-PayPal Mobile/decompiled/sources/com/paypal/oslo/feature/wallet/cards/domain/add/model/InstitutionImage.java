package com.paypal.oslo.feature.wallet.cards.domain.add.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/InstitutionImage;", "", "", "url", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "width", "height", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/InstitutionImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getMimeType", "Ljava/lang/Integer;", "getWidth", "getHeight", "getCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class InstitutionImage {
    public static final int $stable = 0;
    private final java.lang.String category;
    private final java.lang.Integer height;
    private final java.lang.String mimeType;
    private final java.lang.String url;
    private final java.lang.Integer width;

    public InstitutionImage(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3) {
        this.url = str;
        this.mimeType = str2;
        this.width = num;
        this.height = num2;
        this.category = str3;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final java.lang.Integer getWidth() {
        return this.width;
    }

    public final java.lang.Integer getHeight() {
        return this.height;
    }

    public final java.lang.String getCategory() {
        return this.category;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        java.lang.String str2 = this.mimeType;
        java.lang.Integer num = this.width;
        java.lang.Integer num2 = this.height;
        java.lang.String str3 = this.category;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstitutionImage(url=");
        sb.append(str);
        sb.append(", mimeType=");
        sb.append(str2);
        sb.append(", width=");
        sb.append(num);
        sb.append(", height=");
        sb.append(num2);
        sb.append(", category=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.url;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.mimeType;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.width;
        int hashCode3 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.height;
        int hashCode4 = num2 == null ? 0 : num2.hashCode();
        java.lang.String str3 = this.category;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage institutionImage = (com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, institutionImage.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, institutionImage.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, institutionImage.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, institutionImage.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.category, institutionImage.category);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage copy(java.lang.String url, java.lang.String mimeType, java.lang.Integer width, java.lang.Integer height, java.lang.String category) {
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage(url, mimeType, width, height, category);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCategory() {
        return this.category;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage institutionImage, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = institutionImage.url;
        }
        if ((i & 2) != 0) {
            str2 = institutionImage.mimeType;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            num = institutionImage.width;
        }
        java.lang.Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = institutionImage.height;
        }
        java.lang.Integer num4 = num2;
        if ((i & 16) != 0) {
            str3 = institutionImage.category;
        }
        return institutionImage.copy(str, str4, num3, num4, str3);
    }
}
