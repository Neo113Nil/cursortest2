package com.paypal.oslo.feature.subscriptions.shared.ui.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;", "", "<init>", "()V", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "Bank", "PayPal", "PayPalBalance", "Unknown", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Bank;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Card;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$PayPal;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$PayPalBalance;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FundingInstrumentTypeUiModel {
    public static final int $stable = 0;

    private FundingInstrumentTypeUiModel() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Card;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;", "<init>", "()V", "Credit", "Debit", "Prepaid", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Card$Credit;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Card$Debit;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Card$Prepaid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static abstract class Card extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel {
        public static final int $stable = 0;

        private Card() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Card$Credit;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Card;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Credit extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Credit INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Credit();

            public final int hashCode() {
                return 1255417631;
            }

            private Credit() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Credit";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Credit)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Card$Debit;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Card;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Debit extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Debit INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Debit();

            public final int hashCode() {
                return 1980693510;
            }

            private Debit() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Debit";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Debit)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Card$Prepaid;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Card;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Prepaid extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Prepaid INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Prepaid();

            public final int hashCode() {
                return -1083763575;
            }

            private Prepaid() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Prepaid";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Prepaid)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Card(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Bank;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;", "<init>", "()V", "Checking", com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS, "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Bank$Checking;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Bank$Savings;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static abstract class Bank extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel {
        public static final int $stable = 0;

        private Bank() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Bank$Checking;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Bank;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Checking extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank.Checking INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank.Checking();

            public final int hashCode() {
                return 1095206612;
            }

            private Checking() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Checking";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank.Checking)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Bank$Savings;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Bank;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Savings extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank.Savings INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank.Savings();

            public final int hashCode() {
                return 1997247615;
            }

            private Savings() {
                super(null);
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank.Savings)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Bank(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$PayPal;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;", "<init>", "()V", "Credit", "Debit", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$PayPal$Credit;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$PayPal$Debit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static abstract class PayPal extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel {
        public static final int $stable = 0;

        private PayPal() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$PayPal$Credit;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$PayPal;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Credit extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Credit INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Credit();

            public final int hashCode() {
                return -438611972;
            }

            private Credit() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Credit";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Credit)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$PayPal$Debit;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$PayPal;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Debit extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit();

            public final int hashCode() {
                return 1094763401;
            }

            private Debit() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Debit";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ PayPal(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$PayPalBalance;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class PayPalBalance extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance();

        public final int hashCode() {
            return 984816113;
        }

        private PayPalBalance() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PayPalBalance";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel$Unknown;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Unknown INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Unknown();

        public final int hashCode() {
            return 1890621362;
        }

        private Unknown() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Unknown)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ FundingInstrumentTypeUiModel(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
