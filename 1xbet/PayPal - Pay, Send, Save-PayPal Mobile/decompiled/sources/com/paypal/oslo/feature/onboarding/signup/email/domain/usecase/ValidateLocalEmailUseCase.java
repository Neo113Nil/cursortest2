package com.paypal.oslo.feature.onboarding.signup.email.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/ValidateLocalEmailUseCase;", "", "<init>", "()V", "", "email", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/EmailLocalValidationResult;", "invoke", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/EmailLocalValidationResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ValidateLocalEmailUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ValidateLocalEmailUseCase() {
    }

    public final com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.EmailLocalValidationResult invoke(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        boolean z = false;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.jvm.functions.Function1[]{com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.required(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_email_required_message), com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.regex$default(com.paypal.oslo.feature.onboarding.signup.email.validator.EmailRegexKt.getEmailFormatRegex(), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_email_format_message, null, null, 12, null)});
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
        java.util.Iterator it = listOf.iterator();
        while (it.hasNext()) {
            arrayList.add((arrow.core.Either) ((kotlin.jvm.functions.Function1) it.next()).invoke(email));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (!((arrow.core.Either) it2.next()).isRight()) {
                    break;
                }
            }
        }
        z = true;
        return new com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.EmailLocalValidationResult(arrayList2, z);
    }
}
