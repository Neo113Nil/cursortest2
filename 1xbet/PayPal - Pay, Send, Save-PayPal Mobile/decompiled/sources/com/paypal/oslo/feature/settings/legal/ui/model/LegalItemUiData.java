package com.paypal.oslo.feature.settings.legal.ui.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JN\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "", "", "id", "title", "subtitle", "url", "", "showDivider", "showChevron", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "getUrl", "Z", "getShowDivider", "getShowChevron"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LegalItemUiData {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final boolean showChevron;
    private final boolean showDivider;
    private final java.lang.String subtitle;
    private final java.lang.String title;
    private final java.lang.String url;

    public LegalItemUiData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.url = str4;
        this.showDivider = z;
        this.showChevron = z2;
    }

    public /* synthetic */ LegalItemUiData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? true : z, (i & 32) != 0 ? true : z2);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final boolean getShowChevron() {
        return this.showChevron;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.subtitle;
        java.lang.String str4 = this.url;
        boolean z = this.showDivider;
        boolean z2 = this.showChevron;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LegalItemUiData(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", subtitle=");
        sb.append(str3);
        sb.append(", url=");
        sb.append(str4);
        sb.append(", showDivider=");
        sb.append(z);
        sb.append(", showChevron=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.title.hashCode();
        java.lang.String str = this.subtitle;
        return (((((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.url.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showDivider)) * 31) + java.lang.Boolean.hashCode(this.showChevron);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData)) {
            return false;
        }
        com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData legalItemUiData = (com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, legalItemUiData.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, legalItemUiData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, legalItemUiData.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, legalItemUiData.url) && this.showDivider == legalItemUiData.showDivider && this.showChevron == legalItemUiData.showChevron;
    }

    public final com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData copy(java.lang.String id, java.lang.String title, java.lang.String subtitle, java.lang.String url, boolean showDivider, boolean showChevron) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return new com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData(id, title, subtitle, url, showDivider, showChevron);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowChevron() {
        return this.showChevron;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowDivider() {
        return this.showDivider;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData copy$default(com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData legalItemUiData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = legalItemUiData.id;
        }
        if ((i & 2) != 0) {
            str2 = legalItemUiData.title;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = legalItemUiData.subtitle;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = legalItemUiData.url;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            z = legalItemUiData.showDivider;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = legalItemUiData.showChevron;
        }
        return legalItemUiData.copy(str, str5, str6, str7, z3, z2);
    }
}
