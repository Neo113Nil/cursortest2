package com.paypal.oslo.feature.userprofile.ui.utils.email;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0012J!\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J5\u0010&\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00102\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b&\u0010'J3\u0010\u0018\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010(2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0018\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0010028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u00103"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorHandler;", "", "Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;", "config", "<init>", "(Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;)V", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "error", "", "isOTPLimitExceededError", "(Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;)Z", "", "Lcom/paypal/oslo/feature/userprofile/domain/model/GraphQLErrorDetail;", "details", "isRiskDeclined$user_profile_prodRelease", "(Ljava/util/List;)Z", "", "getComplianceRestrictionUrl", "()Ljava/lang/String;", "getRiskRestrictionUrl", "getAboutLinkedEmailsUrl", "p0", "Landroid/content/Context;", "p1", "getHighSpeedVideoSizes", "(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailAction;", "action", "context", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy;", "mapToEmailErrorStrategies", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailAction;Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;Landroid/content/Context;)Ljava/util/List;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Landroid/content/Context;)Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "p2", "p3", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Retryable;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Retryable;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Banner;", "(Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Banner;", "Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;", "getConfig", "()Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;", "", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "", "[Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EmailErrorHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.userprofile.config.UserProfileConfig config;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String[] Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public EmailErrorHandler(com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileConfig, "");
        this.config = userProfileConfig;
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ACCOUNT_RESTRICTED_RISK, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ACCOUNT_RESTRICTED_RISK_AND_COMP, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ACCOUNT_HIGH_RESTRICTED_RISK, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ACCOUNT_HIGH_RESTRICTED_RISK_AND_COMP});
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ACCOUNT_RESTRICTED_COMP, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ACCOUNT_HIGH_RESTRICTED_COMP});
        this.getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ACCOUNT_RESTRICTED, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ACCOUNT_HIGH_RESTRICTED});
        this.Camera2StreamConfigurationMap = new java.lang.String[]{com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.WALLET_SETTING_ERROR_EMAIL_LIMIT_EXCEEDED, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.EMAIL_OTP_VALIDATION_LIMIT_EXCEEDED, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.OTP_VALIDATION_LIMIT_EXCEEDED};
    }

    public final com.paypal.oslo.feature.userprofile.config.UserProfileConfig getConfig() {
        return this.config;
    }

    public final boolean isOTPLimitExceededError(com.paypal.oslo.feature.userprofile.domain.model.email.EmailError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (!(error instanceof com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ValidationError)) {
            return false;
        }
        java.util.List<com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail> extractDetails = com.paypal.oslo.feature.userprofile.domain.utils.GraphQLErrorExtensionsKt.extractDetails(((com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ValidationError) error).getGraphQLError());
        if ((extractDetails instanceof java.util.Collection) && extractDetails.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = extractDetails.iterator();
        while (it.hasNext()) {
            if (kotlin.collections.ArraysKt.contains(this.Camera2StreamConfigurationMap, ((com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) it.next()).getIssue())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isRiskDeclined$user_profile_prodRelease(java.util.List<com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail> details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "");
        java.util.List<com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail> list = details;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) it.next()).getIssue(), "WALLET_SETTING_RISK_DECLINED")) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String getComplianceRestrictionUrl() {
        java.lang.String webBaseUrl = this.config.getWebBaseUrl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(webBaseUrl);
        sb.append("/policydashboard/process/compliance/cip?policyName=cip_verification&nativeSDKVersion=v2&attemptIntention=dia&invocationPage=dia");
        return sb.toString();
    }

    public final java.lang.String getRiskRestrictionUrl() {
        java.lang.String webBaseUrl = this.config.getWebBaseUrl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(webBaseUrl);
        sb.append("/restore/dashboard");
        return sb.toString();
    }

    public final java.lang.String getAboutLinkedEmailsUrl() {
        java.lang.String webBaseUrl = this.config.getWebBaseUrl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(webBaseUrl);
        sb.append("/cshelp/article/help1094");
        return sb.toString();
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String p0, android.content.Context p1) {
        switch (p0.hashCode()) {
            case -1854992746:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ALIAS_COUNT_EXCEEDED_UPDATED_LINK)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_limit_exceeded);
            case -1702630906:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.WALLET_SETTING_ERROR_EMAIL_LIMIT_EXCEEDED)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_otp_limit_exceeded_message);
            case -1448635296:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.INVALID_CONFIRMATION_CODE)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_confirmation_otp_error);
            case -1208234303:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.EMAIL_ALREADY_ADDED)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_already_exists);
            case -1070754873:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ALIAS_COUNT_EXCEEDED)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_limit_exceeded);
            case -1007960611:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.OTP_VALIDATION_LIMIT_EXCEEDED)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_otp_limit_exceeded_message);
            case -738155636:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ALIAS_UNAVAILABLE)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_already_linked_to_another_account);
            case -444521839:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.CONFIRMATION_CODE_EXPIRED)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_confirmation_otp_error);
            case -424631974:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.EMAIL_OTP_VALIDATION_LIMIT_EXCEEDED)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_otp_limit_exceeded_message);
            case 178649564:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.EMAIL_ALREADY_ADDED_UPDATED_LINK)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_already_exists);
            case 357347891:
                if (p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.INVALID_ALIAS)) {
                    return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_enter_valid_address);
                }
                return null;
            case 1526236913:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.EMAIL_ALREADY_LINKED_TO_ANOTHER_ACCOUNT)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_already_linked_to_another_account);
            case 2055294952:
                if (!p0.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ALIAS_LIFETIME_COUNT_EXCEEDED_UPDATED_LINK)) {
                    return null;
                }
                return p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_limit_exceeded);
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0338, code lost:
    
        if (r10.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ALIAS_COUNT_EXCEEDED_UPDATED_LINK) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01fc, code lost:
    
        if (r10.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.EMAIL_OTP_VALIDATION_LIMIT_EXCEEDED) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0219, code lost:
    
        r1 = getHighSpeedVideoSizes(r10, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x021d, code lost:
    
        if (r1 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021f, code lost:
    
        r1 = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0205, code lost:
    
        if (r10.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.CONFIRMATION_CODE_EXPIRED) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x020e, code lost:
    
        if (r10.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.OTP_VALIDATION_LIMIT_EXCEEDED) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0217, code lost:
    
        if (r10.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.INVALID_CONFIRMATION_CODE) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0283, code lost:
    
        if (r10.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ALIAS_LIFETIME_COUNT_EXCEEDED_UPDATED_LINK) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x033a, code lost:
    
        r1 = getHighSpeedVideoSizes(r10, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x033e, code lost:
    
        if (r1 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0340, code lost:
    
        r1 = kotlin.collections.CollectionsKt.listOf(getHighSpeedVideoSizes(r1, com.paypal.oslo.feature.userprofile.api.navigation.AllEmailsDestination.INSTANCE, r22.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_view_your_emails)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x028d, code lost:
    
        if (r10.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.EMAIL_ALREADY_LINKED_TO_ANOTHER_ACCOUNT) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02bc, code lost:
    
        r1 = new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy[2];
        r2 = r22.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_enter_diff_email_continue);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        r1[0] = new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline(r2);
        r2 = getHighSpeedVideoSizes(r10, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02d2, code lost:
    
        if (r2 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02d4, code lost:
    
        r1[1] = getHighSpeedVideoSizes(r2, new com.paypal.oslo.feature.userprofile.api.navigation.UserProfileWebViewDestination(getAboutLinkedEmailsUrl(), "", "user-profile-email-management"), r22.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_learn_more_about_linked_emails));
        r1 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02b0, code lost:
    
        if (r10.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.EMAIL_ALREADY_ADDED_UPDATED_LINK) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02ba, code lost:
    
        if (r10.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ALIAS_UNAVAILABLE) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02fa, code lost:
    
        if (r10.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.ALIAS_COUNT_EXCEEDED) == false) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy> mapToEmailErrorStrategies(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction action, com.paypal.oslo.feature.userprofile.domain.model.email.EmailError error, android.content.Context context) {
        java.util.List listOf;
        java.util.List listOf2;
        java.lang.String highSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (error instanceof com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.NetworkError) {
            int i = com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler.WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            if (i == 1 || i == 2) {
                return kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI(context, context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_looks_like_you_are_offline), context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_check_your_connection_and_try_again), null));
            }
            java.lang.String string = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_error_no_internet);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            return kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI(string, true));
        }
        if (error instanceof com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ServerError) {
            com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ServerError serverError = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ServerError) error;
            int i2 = com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler.WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            return (i2 == 1 || i2 == 2) ? kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI(context, context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_error_generic), context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_lets_try_that_again), null)) : i2 != 5 ? kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline(serverError.getMessage())) : kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI(context, null, null, null));
        }
        if (!(error instanceof com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ValidationError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail> extractDetails = com.paypal.oslo.feature.userprofile.domain.utils.GraphQLErrorExtensionsKt.extractDetails(((com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ValidationError) error).getGraphQLError());
        java.lang.String string2 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
        java.util.List<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy> listOf3 = kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI(string2, true));
        if (extractDetails.isEmpty()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "GraphQL validation error missing details. Defaulting to generic error.", null, null, 6, null);
            int i3 = com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler.WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            if (i3 == 1 || i3 == 2) {
                return kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI(context, null, null, null));
            }
        } else {
            java.lang.String issue = ((com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) kotlin.collections.CollectionsKt.first((java.util.List) extractDetails)).getIssue();
            if (issue != null) {
                if (isRiskDeclined$user_profile_prodRelease(extractDetails)) {
                    java.lang.String string3 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_we_could_not_confirm);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                    java.lang.String string4 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_we_are_unable_to_add_or_update_email);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
                    java.lang.String string5 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_back_to_profile);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
                    listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen(string3, string4, string5, "Info", com.paypal.oslo.feature.settings.api.navigation.SettingsDestination.INSTANCE));
                } else {
                    java.util.List<com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail> list = extractDetails;
                    boolean z = list instanceof java.util.Collection;
                    if (!z || !list.isEmpty()) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (kotlin.collections.CollectionsKt.contains(this.getHighSpeedVideoFpsRangesFor, ((com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) it.next()).getIssue())) {
                                listOf = kotlin.collections.CollectionsKt.listOf(getHighSpeedVideoFpsRanges(getRiskRestrictionUrl(), context));
                                break;
                            }
                        }
                    }
                    if (!z || !list.isEmpty()) {
                        java.util.Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (kotlin.collections.CollectionsKt.contains(this.getHighResolutionOutputSizeshNQ4ISI, ((com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) it2.next()).getIssue())) {
                                listOf = kotlin.collections.CollectionsKt.listOf(getHighSpeedVideoFpsRanges(getComplianceRestrictionUrl(), context));
                                break;
                            }
                        }
                    }
                    if ((action == com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.ADD || action == com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.EDIT) && (!z || !list.isEmpty())) {
                        java.util.Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (kotlin.collections.CollectionsKt.contains(this.getHighSpeedVideoSizes, ((com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) it3.next()).getIssue())) {
                                java.lang.String string6 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_account_restricted_banner);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "");
                                listOf = kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI(string6, false));
                                break;
                            }
                        }
                    }
                    listOf = kotlin.collections.CollectionsKt.emptyList();
                }
                java.util.List list2 = listOf;
                if (list2.isEmpty()) {
                    int i4 = com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler.WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
                    if (i4 == 1) {
                        listOf2 = kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI(context, null, null, null));
                    } else if (i4 == 2) {
                        listOf2 = kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI(context, null, null, null));
                    } else if (i4 == 3 || i4 == 4) {
                        switch (issue.hashCode()) {
                            case -1854992746:
                                break;
                            case -1208234303:
                                if (issue.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.EMAIL_ALREADY_ADDED)) {
                                    com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy[] emailErrorStrategyArr = new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy[2];
                                    java.lang.String string7 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_enter_diff_email_continue);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "");
                                    emailErrorStrategyArr[0] = new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline(string7);
                                    java.lang.String highSpeedVideoSizes2 = getHighSpeedVideoSizes(issue, context);
                                    if (highSpeedVideoSizes2 != null) {
                                        emailErrorStrategyArr[1] = getHighSpeedVideoSizes(highSpeedVideoSizes2, com.paypal.oslo.feature.userprofile.api.navigation.AllEmailsDestination.INSTANCE, context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_view_your_emails));
                                        listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) emailErrorStrategyArr);
                                        break;
                                    }
                                }
                                listOf2 = kotlin.collections.CollectionsKt.emptyList();
                                break;
                            case -1070754873:
                                break;
                            case -738155636:
                                break;
                            case 178649564:
                                break;
                            case 357347891:
                                if (issue.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.INVALID_ALIAS) && (highSpeedVideoSizes = getHighSpeedVideoSizes(issue, context)) != null) {
                                    listOf2 = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline(highSpeedVideoSizes));
                                    break;
                                }
                                listOf2 = kotlin.collections.CollectionsKt.emptyList();
                                break;
                            case 1526236913:
                                break;
                            case 2055294952:
                                break;
                            default:
                                listOf2 = kotlin.collections.CollectionsKt.emptyList();
                                break;
                        }
                    } else {
                        if (i4 != 5) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        switch (issue.hashCode()) {
                            case -1702630906:
                                if (issue.equals(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorCodes.WALLET_SETTING_ERROR_EMAIL_LIMIT_EXCEEDED)) {
                                    java.lang.String string8 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_otp_limit_exceeded_title);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "");
                                    java.lang.String highSpeedVideoSizes3 = getHighSpeedVideoSizes(issue, context);
                                    if (highSpeedVideoSizes3 == null) {
                                        highSpeedVideoSizes3 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_error_generic);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(highSpeedVideoSizes3, "");
                                    }
                                    java.lang.String string9 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_got_it);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "");
                                    listOf2 = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen(string8, highSpeedVideoSizes3, string9, "Info", null, 16, null));
                                    break;
                                }
                                listOf2 = kotlin.collections.CollectionsKt.emptyList();
                                break;
                            case -1448635296:
                                break;
                            case -1007960611:
                                break;
                            case -444521839:
                                break;
                            case -424631974:
                                break;
                            default:
                                listOf2 = kotlin.collections.CollectionsKt.emptyList();
                                break;
                        }
                    }
                    list2 = listOf2;
                }
                java.util.List list3 = list2;
                if (!list3.isEmpty()) {
                    listOf3 = list3;
                }
                return listOf3;
            }
        }
        return listOf3;
    }

    private static com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen getHighSpeedVideoFpsRanges(java.lang.String p0, android.content.Context p1) {
        java.lang.String string = p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_your_acc_is_temporarily_blocked);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_before_you_update_we_need_additional_info);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = p1.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_add_info);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
        return new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen(string, string2, string3, "Info", new com.paypal.oslo.feature.userprofile.api.navigation.UserProfileWebViewDestination(p0, "", "user-profile-email-management"));
    }

    private static com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable getHighResolutionOutputSizeshNQ4ISI(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
        if (p1 == null) {
            p1 = p0.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_error_generic);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(p1, "");
        }
        if (p2 == null) {
            p2 = p0.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_this_happens_sometimes_lets_try_that_again);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(p2, "");
        }
        java.lang.String string = p0.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_retry_button);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable(p1, p2, string, "Info");
    }

    private static com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner getHighSpeedVideoSizes(java.lang.String str, androidx.navigation3.runtime.NavKey navKey, java.lang.String str2) {
        com.paypal.pds.core.RichText richText;
        java.lang.String str3 = str2;
        if (str3 != null && !kotlin.text.StringsKt.isBlank(str3)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            str = sb.toString();
        }
        if (str3 != null && !kotlin.text.StringsKt.isBlank(str3)) {
            richText = com.paypal.pds.core.RichTextKt.toRichText(str, kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(str2, new java.lang.String())));
        } else {
            richText = com.paypal.pds.core.RichTextKt.toRichText(str, kotlin.collections.CollectionsKt.emptyList());
        }
        return new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner(richText, str, false, navKey);
    }

    private static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, boolean z) {
        return new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner(com.paypal.pds.core.RichTextKt.toRichText$default(str, null, false, null, 7, null), str, z, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.DELETE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.MAKE_PRIMARY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.ADD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.EDIT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.CONFIRM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
