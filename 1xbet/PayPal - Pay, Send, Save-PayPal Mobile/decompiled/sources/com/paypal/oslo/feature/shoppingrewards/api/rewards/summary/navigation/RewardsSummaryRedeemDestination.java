package com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002'&B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/summary/navigation/RewardsSummaryRedeemDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", "trafficSource", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/summary/navigation/RewardsSummaryRedeemDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$shopping_rewards_api_prodRelease", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/summary/navigation/RewardsSummaryRedeemDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTrafficSource", "setTrafficSource", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class RewardsSummaryRedeemDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination.Companion(null);
    private java.lang.String trafficSource;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/summary/navigation/RewardsSummaryRedeemDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/summary/navigation/RewardsSummaryRedeemDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination> serializer() {
            return com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RewardsSummaryRedeemDestination(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.trafficSource = null;
        } else {
            this.trafficSource = str;
        }
    }

    public RewardsSummaryRedeemDestination(java.lang.String str) {
        this.trafficSource = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$shopping_rewards_api_prodRelease(com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.trafficSource != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.trafficSource);
        }
    }

    public /* synthetic */ RewardsSummaryRedeemDestination(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final java.lang.String getTrafficSource() {
        return this.trafficSource;
    }

    public final void setTrafficSource(java.lang.String str) {
        this.trafficSource = str;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        java.util.Set emptySet;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("rewards", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.FEATURE, "view");
        java.lang.String str = this.trafficSource;
        if (str == null || (emptySet = kotlin.collections.SetsKt.setOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext(str, null))) == null) {
            emptySet = kotlin.collections.SetsKt.emptySet();
        }
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.SCREEN_NAME, userIntentContext, emptySet);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.trafficSource;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardsSummaryRedeemDestination(trafficSource=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.trafficSource;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.trafficSource, ((com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination) other).trafficSource);
    }

    public final com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination copy(java.lang.String trafficSource) {
        return new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination(trafficSource);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTrafficSource() {
        return this.trafficSource;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination copy$default(com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination rewardsSummaryRedeemDestination, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rewardsSummaryRedeemDestination.trafficSource;
        }
        return rewardsSummaryRedeemDestination.copy(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RewardsSummaryRedeemDestination() {
        this((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
