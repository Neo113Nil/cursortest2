package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ4\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RewardedOffersInput;", "", "Lcom/apollographql/apollo/api/Optional;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_END_TIME, "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RewardedOffersInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getStartTime", "getEndTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardedOffersInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> endTime;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> startTime;

    public RewardedOffersInput(com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.startTime = optional;
        this.endTime = optional2;
    }

    public /* synthetic */ RewardedOffersInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getStartTime() {
        return this.startTime;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getEndTime() {
        return this.endTime;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.startTime;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional2 = this.endTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardedOffersInput(startTime=");
        sb.append(optional);
        sb.append(", endTime=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.startTime.hashCode() * 31) + this.endTime.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RewardedOffersInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RewardedOffersInput rewardedOffersInput = (com.paypal.oslo.api.graphql.schema.type.RewardedOffersInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.startTime, rewardedOffersInput.startTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.endTime, rewardedOffersInput.endTime);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RewardedOffersInput copy(com.apollographql.apollo.api.Optional<? extends java.lang.Object> startTime, com.apollographql.apollo.api.Optional<? extends java.lang.Object> endTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endTime, "");
        return new com.paypal.oslo.api.graphql.schema.type.RewardedOffersInput(startTime, endTime);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.endTime;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component1() {
        return this.startTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RewardedOffersInput copy$default(com.paypal.oslo.api.graphql.schema.type.RewardedOffersInput rewardedOffersInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = rewardedOffersInput.startTime;
        }
        if ((i & 2) != 0) {
            optional2 = rewardedOffersInput.endTime;
        }
        return rewardedOffersInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RewardedOffersInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
