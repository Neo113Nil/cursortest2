package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \u00162\u00020\u0001:\u0003\u0017\u0018\u0016B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\u0082\u0001\u0002\u0019\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;", "", "Lcom/paypal/pds/core/Icon;", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "p1", "p2", "p3", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "title", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getTitle", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "getDescription", "buttonLabel", "getButtonLabel", "Companion", "GenericError", "CardError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError$CardError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError$GenericError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PushToWalletError {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.Companion(null);
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString buttonLabel;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString description;
    private final com.paypal.pds.core.Icon icon;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString title;

    private PushToWalletError(com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3) {
        this.icon = icon;
        this.title = uiString;
        this.description = uiString2;
        this.buttonLabel = uiString3;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getButtonLabel() {
        return this.buttonLabel;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError$GenericError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GenericError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.GenericError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.GenericError();

        public final int hashCode() {
            return -1445915903;
        }

        private GenericError() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_push_to_wallet_card_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_push_to_wallet_back_to_account, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null);
        }

        public final java.lang.String toString() {
            return "GenericError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.GenericError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError$CardError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.CardError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.CardError();

        public final int hashCode() {
            return -2016481720;
        }

        private CardError() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_push_to_wallet_card_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_push_to_wallet_card_error_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_push_to_wallet_back_to_account, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null);
        }

        public final java.lang.String toString() {
            return "CardError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.CardError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PushToWalletErrorType;", "type", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;", "fromType", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PushToWalletErrorType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError fromType(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            int i = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.Companion.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.GenericError.INSTANCE;
            }
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.CardError.INSTANCE;
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType.values().length];
                try {
                    iArr[com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType.GENERIC.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType.CARD.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PushToWalletError(com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, uiString, uiString2, uiString3);
    }
}
