package com.paypal.oslo.feature.bnplservicing.ui.changefi.content;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentContentKt {
    public static final /* synthetic */ com.paypal.oslo.core.commonui.utils.RefText access$toStringRef(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType cardProductType) {
        int i = com.paypal.oslo.feature.bnplservicing.ui.changefi.content.FundingInstrumentContentKt.WhenMappings.$EnumSwitchMapping$0[cardProductType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_change_fi_funding_instrument_type_credit, new java.lang.Object[0]);
        }
        if (i == 2) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_change_fi_funding_instrument_type_debit, new java.lang.Object[0]);
        }
        if (i == 3) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_change_fi_funding_instrument_type_prepaid, new java.lang.Object[0]);
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("");
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.CREDIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.DEBIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.PREPAID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
