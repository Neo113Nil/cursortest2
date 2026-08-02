package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingVariantPolicyFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingInstrumentFormat;", "instrumentFormat", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingUsageChannel;", "usageChannel", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingAutopayRequirement;", "autopayRequirement", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingInstrumentFormat;Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingUsageChannel;Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingAutopayRequirement;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingInstrumentFormat;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingUsageChannel;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingAutopayRequirement;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingInstrumentFormat;Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingUsageChannel;Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingAutopayRequirement;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingVariantPolicyFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingInstrumentFormat;", "getInstrumentFormat", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingUsageChannel;", "getUsageChannel", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingAutopayRequirement;", "getAutopayRequirement"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplServicingVariantPolicyFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLServicingAutopayRequirement autopayRequirement;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLServicingInstrumentFormat instrumentFormat;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLServicingUsageChannel usageChannel;

    public BnplServicingVariantPolicyFragment(com.paypal.oslo.api.graphql.schema.type.BNPLServicingInstrumentFormat bNPLServicingInstrumentFormat, com.paypal.oslo.api.graphql.schema.type.BNPLServicingUsageChannel bNPLServicingUsageChannel, com.paypal.oslo.api.graphql.schema.type.BNPLServicingAutopayRequirement bNPLServicingAutopayRequirement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLServicingInstrumentFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLServicingUsageChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLServicingAutopayRequirement, "");
        this.instrumentFormat = bNPLServicingInstrumentFormat;
        this.usageChannel = bNPLServicingUsageChannel;
        this.autopayRequirement = bNPLServicingAutopayRequirement;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingInstrumentFormat getInstrumentFormat() {
        return this.instrumentFormat;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingUsageChannel getUsageChannel() {
        return this.usageChannel;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingAutopayRequirement getAutopayRequirement() {
        return this.autopayRequirement;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingInstrumentFormat bNPLServicingInstrumentFormat = this.instrumentFormat;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingUsageChannel bNPLServicingUsageChannel = this.usageChannel;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingAutopayRequirement bNPLServicingAutopayRequirement = this.autopayRequirement;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplServicingVariantPolicyFragment(instrumentFormat=");
        sb.append(bNPLServicingInstrumentFormat);
        sb.append(", usageChannel=");
        sb.append(bNPLServicingUsageChannel);
        sb.append(", autopayRequirement=");
        sb.append(bNPLServicingAutopayRequirement);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.instrumentFormat.hashCode() * 31) + this.usageChannel.hashCode()) * 31) + this.autopayRequirement.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment bnplServicingVariantPolicyFragment = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment) other;
        return this.instrumentFormat == bnplServicingVariantPolicyFragment.instrumentFormat && this.usageChannel == bnplServicingVariantPolicyFragment.usageChannel && this.autopayRequirement == bnplServicingVariantPolicyFragment.autopayRequirement;
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment copy(com.paypal.oslo.api.graphql.schema.type.BNPLServicingInstrumentFormat instrumentFormat, com.paypal.oslo.api.graphql.schema.type.BNPLServicingUsageChannel usageChannel, com.paypal.oslo.api.graphql.schema.type.BNPLServicingAutopayRequirement autopayRequirement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(usageChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayRequirement, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment(instrumentFormat, usageChannel, autopayRequirement);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingAutopayRequirement getAutopayRequirement() {
        return this.autopayRequirement;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingUsageChannel getUsageChannel() {
        return this.usageChannel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingInstrumentFormat getInstrumentFormat() {
        return this.instrumentFormat;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment bnplServicingVariantPolicyFragment, com.paypal.oslo.api.graphql.schema.type.BNPLServicingInstrumentFormat bNPLServicingInstrumentFormat, com.paypal.oslo.api.graphql.schema.type.BNPLServicingUsageChannel bNPLServicingUsageChannel, com.paypal.oslo.api.graphql.schema.type.BNPLServicingAutopayRequirement bNPLServicingAutopayRequirement, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bNPLServicingInstrumentFormat = bnplServicingVariantPolicyFragment.instrumentFormat;
        }
        if ((i & 2) != 0) {
            bNPLServicingUsageChannel = bnplServicingVariantPolicyFragment.usageChannel;
        }
        if ((i & 4) != 0) {
            bNPLServicingAutopayRequirement = bnplServicingVariantPolicyFragment.autopayRequirement;
        }
        return bnplServicingVariantPolicyFragment.copy(bNPLServicingInstrumentFormat, bNPLServicingUsageChannel, bNPLServicingAutopayRequirement);
    }
}
