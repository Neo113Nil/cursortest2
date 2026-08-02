package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "Ljava/util/Locale;", "toLocale", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Ljava/util/Locale;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocaleMapperKt {
    public static final java.util.Locale toLocale(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        switch (com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.WhenMappings.$EnumSwitchMapping$0[creditProductIdentifier.ordinal()]) {
            case 1:
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                return locale;
            case 2:
                java.util.Locale locale2 = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
                return locale2;
            case 3:
                java.util.Locale locale3 = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale3, "");
                return locale3;
            case 4:
                java.util.Locale locale4 = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale4, "");
                return locale4;
            case 5:
                java.util.Locale locale5 = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale5, "");
                return locale5;
            case 6:
                java.util.Locale locale6 = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale6, "");
                return locale6;
            case 7:
                java.util.Locale locale7 = java.util.Locale.UK;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale7, "");
                return locale7;
            case 8:
                java.util.Locale locale8 = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale8, "");
                return locale8;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PPC_US_V2.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_EBAYMC.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_PPMC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_SMTCNCT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
