package com.paypal.oslo.feature.searchandintelligence.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "name", "", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Object;", "getLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class StoreFields implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String id;
    private final java.lang.Object logoUrl;
    private final java.lang.String name;

    public StoreFields(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.name = str2;
        this.logoUrl = obj;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.Object getLogoUrl() {
        return this.logoUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.Object obj = this.logoUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StoreFields(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", logoUrl=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.name.hashCode();
        java.lang.Object obj = this.logoUrl;
        return (((hashCode * 31) + hashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields)) {
            return false;
        }
        com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields = (com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, storeFields.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, storeFields.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, storeFields.logoUrl);
    }

    public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields copy(java.lang.String id, java.lang.String name2, java.lang.Object logoUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields(id, name2, logoUrl);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = storeFields.id;
        }
        if ((i & 2) != 0) {
            str2 = storeFields.name;
        }
        if ((i & 4) != 0) {
            obj = storeFields.logoUrl;
        }
        return storeFields.copy(str, str2, obj);
    }
}
