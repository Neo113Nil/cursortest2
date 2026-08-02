package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPartnerFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "externalId", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityPartnerType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityPartnerType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityPartnerType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityPartnerType;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPartnerFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExternalId", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityPartnerType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityPartnerFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.String externalId;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType type;

    public ActivityPartnerFragment(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType activityPartnerType) {
        this.externalId = str;
        this.type = activityPartnerType;
    }

    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.externalId;
        com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType activityPartnerType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityPartnerFragment(externalId=");
        sb.append(str);
        sb.append(", type=");
        sb.append(activityPartnerType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.externalId;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType activityPartnerType = this.type;
        return (hashCode * 31) + (activityPartnerType != null ? activityPartnerType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragment activityPartnerFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.externalId, activityPartnerFragment.externalId) && this.type == activityPartnerFragment.type;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragment copy(java.lang.String externalId, com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType type) {
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragment(externalId, type);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragment activityPartnerFragment, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType activityPartnerType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityPartnerFragment.externalId;
        }
        if ((i & 2) != 0) {
            activityPartnerType = activityPartnerFragment.type;
        }
        return activityPartnerFragment.copy(str, activityPartnerType);
    }
}
