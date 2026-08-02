package com.paypal.oslo.core.companion.domain;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/EnvironmentUrlHandler;", "", "<init>", "()V", "Lcom/paypal/oslo/core/companion/domain/EnvironmentType;", "environmentType", "", "userInput", "generateUrl", "(Lcom/paypal/oslo/core/companion/domain/EnvironmentType;Ljava/lang/String;)Ljava/lang/String;", "url", "determineEnvironmentType", "(Ljava/lang/String;)Lcom/paypal/oslo/core/companion/domain/EnvironmentType;", "getSuffixForEnvironment", "(Lcom/paypal/oslo/core/companion/domain/EnvironmentType;)Ljava/lang/String;", "getPrefixForEnvironment", "getPlaceholderForEnvironment", "getLabelForEnvironment", "PROD_BASE_URL", "Ljava/lang/String;", "STAGE_SUFFIX", "QA_SUFFIX", "HTTPS_PREFIX"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EnvironmentUrlHandler {
    public static final java.lang.String HTTPS_PREFIX = "https://api.";
    public static final com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler INSTANCE = new com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler();
    public static final java.lang.String PROD_BASE_URL = "https://api-m.paypal.com";
    public static final java.lang.String QA_SUFFIX = ".qa.paypal.com";
    public static final java.lang.String STAGE_SUFFIX = ".stage.paypal.com";

    private EnvironmentUrlHandler() {
    }

    public final java.lang.String generateUrl(com.paypal.oslo.core.companion.domain.EnvironmentType environmentType, java.lang.String userInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInput, "");
        int i = com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler.WhenMappings.$EnumSwitchMapping$0[environmentType.ordinal()];
        if (i == 1) {
            return "https://api-m.paypal.com";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (userInput.length() == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(HTTPS_PREFIX);
        sb.append(userInput);
        sb.append(STAGE_SUFFIX);
        return sb.toString();
    }

    public final com.paypal.oslo.core.companion.domain.EnvironmentType determineEnvironmentType(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(url, "https://api-m.paypal.com") || kotlin.text.StringsKt.startsWith$default(url, "https://api-m.paypal.com", false, 2, (java.lang.Object) null)) {
            return com.paypal.oslo.core.companion.domain.EnvironmentType.PROD;
        }
        java.lang.String str = url;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) STAGE_SUFFIX, false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) QA_SUFFIX, false, 2, (java.lang.Object) null)) {
            return com.paypal.oslo.core.companion.domain.EnvironmentType.STAGE;
        }
        return null;
    }

    public final java.lang.String getSuffixForEnvironment(com.paypal.oslo.core.companion.domain.EnvironmentType environmentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentType, "");
        int i = com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler.WhenMappings.$EnumSwitchMapping$0[environmentType.ordinal()];
        if (i == 1) {
            return "";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return STAGE_SUFFIX;
    }

    public final java.lang.String getPrefixForEnvironment(com.paypal.oslo.core.companion.domain.EnvironmentType environmentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentType, "");
        int i = com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler.WhenMappings.$EnumSwitchMapping$0[environmentType.ordinal()];
        if (i == 1) {
            return "https://api-m.paypal.com";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return HTTPS_PREFIX;
    }

    public final java.lang.String getPlaceholderForEnvironment(com.paypal.oslo.core.companion.domain.EnvironmentType environmentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentType, "");
        int i = com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler.WhenMappings.$EnumSwitchMapping$0[environmentType.ordinal()];
        if (i == 1) {
            return "Production URL (fixed)";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "Enter subdomain (e.g., te-mobile-activity)";
    }

    public final java.lang.String getLabelForEnvironment(com.paypal.oslo.core.companion.domain.EnvironmentType environmentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentType, "");
        int i = com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler.WhenMappings.$EnumSwitchMapping$0[environmentType.ordinal()];
        if (i == 1) {
            return "Production URL";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "Stage Subdomain";
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.companion.domain.EnvironmentType.values().length];
            try {
                iArr[com.paypal.oslo.core.companion.domain.EnvironmentType.PROD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.companion.domain.EnvironmentType.STAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
