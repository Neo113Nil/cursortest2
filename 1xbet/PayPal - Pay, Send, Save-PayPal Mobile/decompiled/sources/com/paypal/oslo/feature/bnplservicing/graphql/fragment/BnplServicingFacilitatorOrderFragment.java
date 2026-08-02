package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingFacilitatorOrderFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingFacilitatorOrderFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplServicingFacilitatorOrderFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String id;
    private final java.lang.Object url;

    public BnplServicingFacilitatorOrderFragment(java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.id = str;
        this.url = obj;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.Object getUrl() {
        return this.url;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.Object obj = this.url;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplServicingFacilitatorOrderFragment(id=");
        sb.append(str);
        sb.append(", url=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.id.hashCode() * 31) + this.url.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment bnplServicingFacilitatorOrderFragment = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bnplServicingFacilitatorOrderFragment.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, bnplServicingFacilitatorOrderFragment.url);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment copy(java.lang.String id, java.lang.Object url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment(id, url);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getUrl() {
        return this.url;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment bnplServicingFacilitatorOrderFragment, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = bnplServicingFacilitatorOrderFragment.id;
        }
        if ((i & 2) != 0) {
            obj = bnplServicingFacilitatorOrderFragment.url;
        }
        return bnplServicingFacilitatorOrderFragment.copy(str, obj);
    }
}
