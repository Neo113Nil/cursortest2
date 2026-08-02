package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingLinkFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingDocumentLinkType;", "type", "", "staticUrl", "", "relativePath", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingDocumentLinkType;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingDocumentLinkType;", "component2", "()Ljava/lang/Object;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingDocumentLinkType;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingLinkFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingDocumentLinkType;", "getType", "Ljava/lang/Object;", "getStaticUrl", "Ljava/lang/String;", "getRelativePath"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplServicingLinkFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String relativePath;
    private final java.lang.Object staticUrl;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLServicingDocumentLinkType type;

    public BnplServicingLinkFragment(com.paypal.oslo.api.graphql.schema.type.BNPLServicingDocumentLinkType bNPLServicingDocumentLinkType, java.lang.Object obj, java.lang.String str) {
        this.type = bNPLServicingDocumentLinkType;
        this.staticUrl = obj;
        this.relativePath = str;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingDocumentLinkType getType() {
        return this.type;
    }

    public final java.lang.Object getStaticUrl() {
        return this.staticUrl;
    }

    public final java.lang.String getRelativePath() {
        return this.relativePath;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingDocumentLinkType bNPLServicingDocumentLinkType = this.type;
        java.lang.Object obj = this.staticUrl;
        java.lang.String str = this.relativePath;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplServicingLinkFragment(type=");
        sb.append(bNPLServicingDocumentLinkType);
        sb.append(", staticUrl=");
        sb.append(obj);
        sb.append(", relativePath=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingDocumentLinkType bNPLServicingDocumentLinkType = this.type;
        int hashCode = bNPLServicingDocumentLinkType == null ? 0 : bNPLServicingDocumentLinkType.hashCode();
        java.lang.Object obj = this.staticUrl;
        int hashCode2 = obj == null ? 0 : obj.hashCode();
        java.lang.String str = this.relativePath;
        return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingLinkFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingLinkFragment bnplServicingLinkFragment = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingLinkFragment) other;
        return this.type == bnplServicingLinkFragment.type && kotlin.jvm.internal.Intrinsics.areEqual(this.staticUrl, bnplServicingLinkFragment.staticUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.relativePath, bnplServicingLinkFragment.relativePath);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingLinkFragment copy(com.paypal.oslo.api.graphql.schema.type.BNPLServicingDocumentLinkType type, java.lang.Object staticUrl, java.lang.String relativePath) {
        return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingLinkFragment(type, staticUrl, relativePath);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRelativePath() {
        return this.relativePath;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getStaticUrl() {
        return this.staticUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingDocumentLinkType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingLinkFragment copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingLinkFragment bnplServicingLinkFragment, com.paypal.oslo.api.graphql.schema.type.BNPLServicingDocumentLinkType bNPLServicingDocumentLinkType, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            bNPLServicingDocumentLinkType = bnplServicingLinkFragment.type;
        }
        if ((i & 2) != 0) {
            obj = bnplServicingLinkFragment.staticUrl;
        }
        if ((i & 4) != 0) {
            str = bnplServicingLinkFragment.relativePath;
        }
        return bnplServicingLinkFragment.copy(bNPLServicingDocumentLinkType, obj, str);
    }
}
