package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/GenericActivityAvatarFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/graphql/fragment/GenericActivityAvatarFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GenericActivityAvatarFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.String name;

    public GenericActivityAvatarFragment(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GenericActivityAvatarFragment(name=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.activity.graphql.fragment.GenericActivityAvatarFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.activity.graphql.fragment.GenericActivityAvatarFragment) other).name);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.GenericActivityAvatarFragment copy(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.GenericActivityAvatarFragment(name2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.GenericActivityAvatarFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.GenericActivityAvatarFragment genericActivityAvatarFragment, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = genericActivityAvatarFragment.name;
        }
        return genericActivityAvatarFragment.copy(str);
    }
}
