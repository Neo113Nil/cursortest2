package com.paypal.oslo.feature.activity.domain.ledger.models;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/RedeemedRewardInfoItem;", "", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityRewardType;", "activityRewardType", "<init>", "(Ljava/lang/Integer;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityRewardType;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityRewardType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityRewardType;", "copy", "(Ljava/lang/Integer;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityRewardType;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/RedeemedRewardInfoItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/RedeemedRewardInfoItem;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Integer;", "getPoints", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityRewardType;", "getActivityRewardType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class RedeemedRewardInfoItem {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType;
    private final java.lang.Integer points;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem.Companion INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/RedeemedRewardInfoItem$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/RedeemedRewardInfoItem;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem> serializer() {
            return com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RedeemedRewardInfoItem(int i, java.lang.Integer num, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.points = null;
        } else {
            this.points = num;
        }
        if ((i & 2) == 0) {
            this.activityRewardType = null;
        } else {
            this.activityRewardType = activityRewardType;
        }
    }

    public RedeemedRewardInfoItem(java.lang.Integer num, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType) {
        this.points = num;
        this.activityRewardType = activityRewardType;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.points != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.points);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.activityRewardType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.activityRewardType);
        }
    }

    public /* synthetic */ RedeemedRewardInfoItem(java.lang.Integer num, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : activityRewardType);
    }

    public final java.lang.Integer getPoints() {
        return this.points;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType getActivityRewardType() {
        return this.activityRewardType;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.points;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType = this.activityRewardType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemedRewardInfoItem(points=");
        sb.append(num);
        sb.append(", activityRewardType=");
        sb.append(activityRewardType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.points;
        int hashCode = num == null ? 0 : num.hashCode();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType = this.activityRewardType;
        return (hashCode * 31) + (activityRewardType != null ? activityRewardType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem redeemedRewardInfoItem = (com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.points, redeemedRewardInfoItem.points) && this.activityRewardType == redeemedRewardInfoItem.activityRewardType;
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem copy(java.lang.Integer points, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType) {
        return new com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem(points, activityRewardType);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType getActivityRewardType() {
        return this.activityRewardType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getPoints() {
        return this.points;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem redeemedRewardInfoItem, java.lang.Integer num, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = redeemedRewardInfoItem.points;
        }
        if ((i & 2) != 0) {
            activityRewardType = redeemedRewardInfoItem.activityRewardType;
        }
        return redeemedRewardInfoItem.copy(num, activityRewardType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RedeemedRewardInfoItem() {
        this((java.lang.Integer) null, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
