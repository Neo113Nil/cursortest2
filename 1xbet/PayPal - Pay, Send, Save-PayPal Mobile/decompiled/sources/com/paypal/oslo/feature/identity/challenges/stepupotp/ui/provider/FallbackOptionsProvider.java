package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.provider;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/provider/FallbackOptionsProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "stringProvider", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "getTextChallengeFallbackOptions", "(Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FallbackOptionsProvider {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.provider.FallbackOptionsProvider INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.provider.FallbackOptionsProvider();

    private FallbackOptionsProvider() {
    }

    public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> getTextChallengeFallbackOptions(com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option[]{new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_NEW_CODE, stringProvider.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_text_new_code), com.paypal.pds.core.Icon.Refresh.INSTANCE, true), new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.EMAIL_CODE, stringProvider.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_email_code), com.paypal.pds.core.Icon.Send.INSTANCE, true), new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER, stringProvider.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_use_different_no), com.paypal.pds.core.Icon.Phone.INSTANCE, true), new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.ANSWER_SECURITY_QUESTIONS, stringProvider.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_answer_security_questions), com.paypal.pds.core.Icon.Information.INSTANCE, true)});
    }
}
