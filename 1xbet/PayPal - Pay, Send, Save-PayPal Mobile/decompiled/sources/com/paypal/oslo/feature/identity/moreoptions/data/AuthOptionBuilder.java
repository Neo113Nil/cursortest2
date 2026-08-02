package com.paypal.oslo.feature.identity.moreoptions.data;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/data/AuthOptionBuilder;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;)V", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "authOptions", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "currentOptionType", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "build", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)Ljava/util/List;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthOptionBuilder {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;
    private static final java.util.Set<com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType[]{com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_NEW_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE});

    @javax.inject.Inject
    public AuthOptionBuilder(com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        this.getHighSpeedVideoFpsRangesFor = stringProvider;
    }

    public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> build(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOptions, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType currentOptionType) {
        java.util.List listOf;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentOptionType, "");
        boolean contains = Camera2StreamConfigurationMap.contains(currentOptionType);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions2 : authOptions) {
            boolean z = false;
            if (!(authOptions2 instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption)) {
                if (!(authOptions2 instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption)) {
                    if (!(authOptions2 instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption)) {
                        if (!(authOptions2 instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_BIOMETRIC, this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_login_security_touch_id_description), com.paypal.pds.core.Icon.Fingerprint.INSTANCE, true));
                    } else {
                        listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_PASSKEY, this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_common_passkeys), com.paypal.pds.core.Icon.Key.INSTANCE, true));
                    }
                } else {
                    listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option[]{new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_PASSWORD, this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_password_login_enter_your_password), com.paypal.pds.core.Icon.Lock.INSTANCE, true), new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.CREATE_NEW_PASSWORD, this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_password_login_create_new_password), com.paypal.pds.core.Icon.LockLocked.INSTANCE, !contains)});
                }
            } else {
                com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption oTPAuthOption = (com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption) authOptions2;
                com.paypal.oslo.feature.identity.moreoptions.domain.model.Option[] optionArr = new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option[2];
                com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType = contains ? com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_NEW_CODE : com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE;
                com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider = this.getHighSpeedVideoFpsRangesFor;
                if (contains) {
                    i = com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_text_new_code;
                } else {
                    i = com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_sms_password_context;
                }
                optionArr[0] = new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option(optionType, stringProvider.getString(i), contains ? com.paypal.pds.core.Icon.Refresh.INSTANCE : com.paypal.pds.core.Icon.MessageText.INSTANCE, true);
                com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType2 = com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER;
                java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_more_options_use_different_no);
                com.paypal.pds.core.Icon.MessageText messageText = com.paypal.pds.core.Icon.MessageText.INSTANCE;
                if (contains && oTPAuthOption.getPhoneChallenges().size() > 1) {
                    z = true;
                }
                optionArr[1] = new com.paypal.oslo.feature.identity.moreoptions.domain.model.Option(optionType2, string, messageText, z);
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) optionArr);
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, listOf);
        }
        return arrayList;
    }
}
