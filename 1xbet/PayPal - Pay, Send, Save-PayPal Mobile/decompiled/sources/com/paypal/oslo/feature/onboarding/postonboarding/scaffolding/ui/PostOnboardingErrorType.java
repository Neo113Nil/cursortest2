package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\"#$%B9\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0001\u0003&'("}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType;", "", "Lcom/paypal/pds/core/Icon;", "p0", "Lcom/paypal/pds/components/AvatarEmphasis;", "p1", "", "p2", "p3", "p4", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType$ErrorAction;", "p5", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/components/AvatarEmphasis;IIILcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType$ErrorAction;)V", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "avatarEmphasis", "Lcom/paypal/pds/components/AvatarEmphasis;", "getAvatarEmphasis", "()Lcom/paypal/pds/components/AvatarEmphasis;", "titleRes", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "()I", "descriptionRes", "getDescriptionRes", "buttonTextRes", "getButtonTextRes", "primaryAction", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType$ErrorAction;", "getPrimaryAction", "()Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType$ErrorAction;", "ErrorAction", "Network", "ApiFirstAttempt", "ApiSecondAttempt", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType$ApiFirstAttempt;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType$ApiSecondAttempt;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PostOnboardingErrorType {
    public static final int $stable = 0;
    private final com.paypal.pds.components.AvatarEmphasis avatarEmphasis;
    private final int buttonTextRes;
    private final int descriptionRes;
    private final com.paypal.pds.core.Icon icon;
    private final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction primaryAction;
    private final int titleRes;

    private PostOnboardingErrorType(com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, int i, int i2, int i3, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction errorAction) {
        this.icon = icon;
        this.avatarEmphasis = avatarEmphasis;
        this.titleRes = i;
        this.descriptionRes = i2;
        this.buttonTextRes = i3;
        this.primaryAction = errorAction;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final com.paypal.pds.components.AvatarEmphasis getAvatarEmphasis() {
        return this.avatarEmphasis;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getDescriptionRes() {
        return this.descriptionRes;
    }

    public final int getButtonTextRes() {
        return this.buttonTextRes;
    }

    public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction getPrimaryAction() {
        return this.primaryAction;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType$ErrorAction;", "", "<init>", "(Ljava/lang/String;I)V", "RETRY", "HOME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorAction {
        public static final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction HOME;
        public static final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction RETRY;
        private static final /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private ErrorAction(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction errorAction = new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction("RETRY", 0);
            RETRY = errorAction;
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction errorAction2 = new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction("HOME", 1);
            HOME = errorAction2;
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction[] errorActionArr = {errorAction, errorAction2};
            getHighResolutionOutputSizeshNQ4ISI = errorActionArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(errorActionArr);
        }

        public static com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction[] values() {
            return (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType$Network;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.Network INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.Network();

        public final int hashCode() {
            return -319528544;
        }

        private Network() {
            super(com.paypal.pds.core.Icon.Alert.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_network_title, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_network_description, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_network_button, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction.RETRY, null);
        }

        public final java.lang.String toString() {
            return "Network";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.Network)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType$ApiFirstAttempt;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApiFirstAttempt extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiFirstAttempt INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiFirstAttempt();

        public final int hashCode() {
            return 793976489;
        }

        private ApiFirstAttempt() {
            super(com.paypal.pds.core.Icon.ArrowClockwise.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_api_first_title, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_api_first_description, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_api_first_button, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction.RETRY, null);
        }

        public final java.lang.String toString() {
            return "ApiFirstAttempt";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiFirstAttempt)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType$ApiSecondAttempt;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApiSecondAttempt extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiSecondAttempt INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiSecondAttempt();

        public final int hashCode() {
            return 1602593933;
        }

        private ApiSecondAttempt() {
            super(com.paypal.pds.core.Icon.NoIcon.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.Transparent.INSTANCE, com.paypal.pds.core.Color.Transparent.INSTANCE), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_api_second_title, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_api_second_description, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_api_second_button, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction.HOME, null);
        }

        public final java.lang.String toString() {
            return "ApiSecondAttempt";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiSecondAttempt)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PostOnboardingErrorType(com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, int i, int i2, int i3, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ErrorAction errorAction, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, avatarEmphasis, i, i2, i3, errorAction);
    }
}
