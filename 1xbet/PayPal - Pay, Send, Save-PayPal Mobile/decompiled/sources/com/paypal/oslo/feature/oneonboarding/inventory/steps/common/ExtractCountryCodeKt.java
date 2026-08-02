package com.paypal.oslo.feature.oneonboarding.inventory.steps.common;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lkotlin/Function0;", "", "onUnexpectedIntent", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "extractCountryCodeOrCloseFlow", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtractCountryCodeKt {
    public static final java.lang.String extractCountryCodeOrCloseFlow(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) {
            return ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) intentId).m16649getCountryALGuh4w();
        }
        if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle) {
            return ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle) intentId).m16655getCountryALGuh4w();
        }
        function0.invoke();
        return null;
    }
}
