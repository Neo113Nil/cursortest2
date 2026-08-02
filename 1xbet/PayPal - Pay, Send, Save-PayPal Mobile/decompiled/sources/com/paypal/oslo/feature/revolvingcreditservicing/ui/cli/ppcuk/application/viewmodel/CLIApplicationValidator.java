package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "uiModel", "isFormValid", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;)Z", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/MonthlyIncomeAlert;", "monthlyIncomeAlert", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/MonthlyIncomeAlert;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/RevisedMonthlyIncomeAlert;", "revisedMonthlyIncomeAlert", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/RevisedMonthlyIncomeAlert;", "AmountFieldState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIApplicationValidator {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CLIApplicationValidator() {
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\br\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState;", "", "NoAlert", "EmptyFocused", "EmptyUnfocused", "Invalid", "Valid", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState$EmptyFocused;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState$EmptyUnfocused;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState$Invalid;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState$NoAlert;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    interface AmountFieldState {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState$NoAlert;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoAlert implements com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.NoAlert INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.NoAlert();

            public final int hashCode() {
                return 332018269;
            }

            private NoAlert() {
            }

            public final java.lang.String toString() {
                return "NoAlert";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.NoAlert)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState$EmptyFocused;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EmptyFocused implements com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyFocused INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyFocused();

            public final int hashCode() {
                return -1154097048;
            }

            private EmptyFocused() {
            }

            public final java.lang.String toString() {
                return "EmptyFocused";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyFocused)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState$EmptyUnfocused;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EmptyUnfocused implements com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyUnfocused INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyUnfocused();

            public final int hashCode() {
                return -1594070161;
            }

            private EmptyUnfocused() {
            }

            public final java.lang.String toString() {
                return "EmptyUnfocused";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyUnfocused)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState$Invalid;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Invalid implements com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Invalid INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Invalid();

            public final int hashCode() {
                return 209463353;
            }

            private Invalid() {
            }

            public final java.lang.String toString() {
                return "Invalid";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Invalid)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState$Valid;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationValidator$AmountFieldState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Valid implements com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Valid INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Valid();

            public final int hashCode() {
                return -1793757506;
            }

            private Valid() {
            }

            public final java.lang.String toString() {
                return "Valid";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Valid)) {
                    return false;
                }
                return true;
            }
        }
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, boolean p1, boolean p2) {
        if (!p1 && p0.length() == 0 && !p2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.NoAlert.INSTANCE;
        }
        if (p0.length() != 0) {
            return !com.paypal.oslo.feature.revolvingcreditservicing.utils.NumberUtilsKt.isValidPositiveAmount(p0) ? com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Invalid.INSTANCE : com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Valid.INSTANCE;
        }
        if (p1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyFocused.INSTANCE;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyUnfocused.INSTANCE;
    }

    public final boolean isFormValid(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel uiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
        if (!com.paypal.oslo.feature.revolvingcreditservicing.utils.NumberUtilsKt.isValidPositiveAmount(uiModel.getMonthlyIncomeAfterTax()) || uiModel.getIncomeChangeExpected() == null) {
            return false;
        }
        if (uiModel.getIncomeChangeExpected() != com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption.Yes) {
            return true;
        }
        java.lang.String revisedMonthlyIncomeAfterTax = uiModel.getRevisedMonthlyIncomeAfterTax();
        return com.paypal.oslo.feature.revolvingcreditservicing.utils.NumberUtilsKt.isValidPositiveAmount(revisedMonthlyIncomeAfterTax != null ? revisedMonthlyIncomeAfterTax : "");
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert monthlyIncomeAlert(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel uiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(uiModel.getMonthlyIncomeAfterTax(), uiModel.isMonthlyIncomeFocused(), uiModel.getHasSubmitBeenAttempted());
        if (kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.NoAlert.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Valid.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyFocused.INSTANCE)) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyUnfocused.INSTANCE)) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert.EMPTY;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Invalid.INSTANCE)) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert.INVALID_AMOUNT;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.RevisedMonthlyIncomeAlert revisedMonthlyIncomeAlert(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel uiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
        if (uiModel.getIncomeChangeExpected() == null && uiModel.getHasSubmitBeenAttempted()) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.RevisedMonthlyIncomeAlert.NOT_CHOSEN;
        }
        if (uiModel.getIncomeChangeExpected() == com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption.No) {
            return null;
        }
        java.lang.String revisedMonthlyIncomeAfterTax = uiModel.getRevisedMonthlyIncomeAfterTax();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(revisedMonthlyIncomeAfterTax != null ? revisedMonthlyIncomeAfterTax : "", uiModel.isRevisedMonthlyIncomeFocused(), uiModel.getHasSubmitBeenAttempted());
        if (kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.NoAlert.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Valid.INSTANCE)) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyFocused.INSTANCE)) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.RevisedMonthlyIncomeAlert.EMPTY_WHEN_FOCUSED;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.EmptyUnfocused.INSTANCE)) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.RevisedMonthlyIncomeAlert.EMPTY_WHEN_UNFOCUSED;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationValidator.AmountFieldState.Invalid.INSTANCE)) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.RevisedMonthlyIncomeAlert.INVALID_AMOUNT;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
