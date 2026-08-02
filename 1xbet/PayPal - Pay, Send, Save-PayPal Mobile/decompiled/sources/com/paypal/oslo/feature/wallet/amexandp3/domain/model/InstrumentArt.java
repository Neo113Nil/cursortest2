package com.paypal.oslo.feature.wallet.amexandp3.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;", "", "", "url", "", "width", "height", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Ljava/lang/Integer;", "getWidth", "getHeight", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class InstrumentArt {
    public static final int $stable = 0;
    private final java.lang.Integer height;
    private final java.lang.String mimeType;
    private final java.lang.String url;
    private final java.lang.Integer width;

    public InstrumentArt(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
        this.width = num;
        this.height = num2;
        this.mimeType = str2;
    }

    public /* synthetic */ InstrumentArt(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? "" : str2);
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.Integer getWidth() {
        return this.width;
    }

    public final java.lang.Integer getHeight() {
        return this.height;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        java.lang.Integer num = this.width;
        java.lang.Integer num2 = this.height;
        java.lang.String str2 = this.mimeType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstrumentArt(url=");
        sb.append(str);
        sb.append(", width=");
        sb.append(num);
        sb.append(", height=");
        sb.append(num2);
        sb.append(", mimeType=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode();
        java.lang.Integer num = this.width;
        int hashCode2 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.height;
        int hashCode3 = num2 == null ? 0 : num2.hashCode();
        java.lang.String str = this.mimeType;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt = (com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, instrumentArt.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, instrumentArt.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, instrumentArt.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, instrumentArt.mimeType);
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt copy(java.lang.String url, java.lang.Integer width, java.lang.Integer height, java.lang.String mimeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt(url, width, height, mimeType);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getHeight() {
        return this.height;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getWidth() {
        return this.width;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt copy$default(com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = instrumentArt.url;
        }
        if ((i & 2) != 0) {
            num = instrumentArt.width;
        }
        if ((i & 4) != 0) {
            num2 = instrumentArt.height;
        }
        if ((i & 8) != 0) {
            str2 = instrumentArt.mimeType;
        }
        return instrumentArt.copy(str, num, num2, str2);
    }

    public InstrumentArt() {
        this(null, null, null, null, 15, null);
    }
}
