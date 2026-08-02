package com.paypal.oslo.feature.bnplservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingVariantPolicyFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy;", "toVariantPolicy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingVariantPolicyFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VariantPolicyMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy toVariantPolicy(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment bnplServicingVariantPolicyFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingVariantPolicyFragment, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.INSTANCE.from(bnplServicingVariantPolicyFragment.getInstrumentFormat().name()), com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.INSTANCE.from(bnplServicingVariantPolicyFragment.getUsageChannel().name()), com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.INSTANCE.from(bnplServicingVariantPolicyFragment.getAutopayRequirement().name()));
    }
}
