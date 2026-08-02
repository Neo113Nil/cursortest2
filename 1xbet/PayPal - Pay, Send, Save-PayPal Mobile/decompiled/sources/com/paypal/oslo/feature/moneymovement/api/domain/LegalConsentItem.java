package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/LegalConsentItem;", "", "", "id", "label", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/Link;", "links", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/moneymovement/api/domain/LegalConsentItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLabel", "getDescription", "Ljava/util/List;", "getLinks"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LegalConsentItem {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final java.lang.String id;
    private final java.lang.String label;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.Link> links;

    public LegalConsentItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.Link> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.label = str2;
        this.description = str3;
        this.links = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LegalConsentItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        if ((i & 1) != 0) {
            str = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.Link> getLinks() {
        return this.links;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.label;
        java.lang.String str3 = this.description;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.Link> list = this.links;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LegalConsentItem(id=");
        sb.append(str);
        sb.append(", label=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", links=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + this.description.hashCode()) * 31) + this.links.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem legalConsentItem = (com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, legalConsentItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, legalConsentItem.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, legalConsentItem.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.links, legalConsentItem.links);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem copy(java.lang.String id, java.lang.String label, java.lang.String description, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.Link> links) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(links, "");
        return new com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem(id, label, description, links);
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.Link> component4() {
        return this.links;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem copy$default(com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem legalConsentItem, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = legalConsentItem.id;
        }
        if ((i & 2) != 0) {
            str2 = legalConsentItem.label;
        }
        if ((i & 4) != 0) {
            str3 = legalConsentItem.description;
        }
        if ((i & 8) != 0) {
            list = legalConsentItem.links;
        }
        return legalConsentItem.copy(str, str2, str3, list);
    }
}
