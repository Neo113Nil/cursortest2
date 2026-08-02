package com.paypal.oslo.feature.inappcheckout.ui.card.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract;", "", "<init>", "()V", "UserInput", "OperationType", "State", "Event", "Effect", "Error"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardFormContract {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract();

    private CardFormContract() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput;", "", "<init>", "()V", "CardDetailsInput", "BillingAddressInput", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput$BillingAddressInput;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput$CardDetailsInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class UserInput {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput$CardDetailsInput;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "cardDetails", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput$CardDetailsInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "getCardDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardDetailsInput extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CardDetailsInput(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
                this.cardDetails = cardDetails;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails getCardDetails() {
                return this.cardDetails;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails = this.cardDetails;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CardDetailsInput(cardDetails=");
                sb.append(cardDetails);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.cardDetails.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.CardDetailsInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDetails, ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.CardDetailsInput) other).cardDetails);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.CardDetailsInput copy(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.CardDetailsInput(cardDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails getCardDetails() {
                return this.cardDetails;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.CardDetailsInput copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.CardDetailsInput cardDetailsInput, com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    cardDetails = cardDetailsInput.cardDetails;
                }
                return cardDetailsInput.copy(cardDetails);
            }
        }

        private UserInput() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput$BillingAddressInput;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;", "billingAddress", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput$BillingAddressInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;", "getBillingAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BillingAddressInput extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BillingAddressInput(com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
                this.billingAddress = billingAddress;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress getBillingAddress() {
                return this.billingAddress;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress = this.billingAddress;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("BillingAddressInput(billingAddress=");
                sb.append(billingAddress);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.billingAddress.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.BillingAddressInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.BillingAddressInput) other).billingAddress);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.BillingAddressInput copy(com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.BillingAddressInput(billingAddress);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress getBillingAddress() {
                return this.billingAddress;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.BillingAddressInput copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.BillingAddressInput billingAddressInput, com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    billingAddress = billingAddressInput.billingAddress;
                }
                return billingAddressInput.copy(billingAddress);
            }
        }

        public /* synthetic */ UserInput(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;", "", "<init>", "(Ljava/lang/String;I)V", "ADD", "UPDATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OperationType {
        public static final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType ADD;
        private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType[] Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType UPDATE;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

        private OperationType(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType("ADD", 0);
            ADD = operationType;
            com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType2 = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType("UPDATE", 1);
            UPDATE = operationType2;
            com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType[] operationTypeArr = {operationType, operationType2};
            Camera2StreamConfigurationMap = operationTypeArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(operationTypeArr);
        }

        public static com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType[] values() {
            return (com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType[]) Camera2StreamConfigurationMap.clone();
        }

        public static com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b-\u0010+J\u0012\u0010.\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b.\u0010/J\u001c\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0017HÆ\u0003¢\u0006\u0004\b0\u00101J¨\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0017HÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b:\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010&R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bI\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\b\u0012\u0010+R\u001a\u0010\u0013\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\b\u0013\u0010+R\u001a\u0010\u0014\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\b\u0014\u0010+R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bL\u0010/R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010M\u001a\u0004\bN\u00101"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$State;", "", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;", "operationType", "", "fiId", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "cardDetails", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;", "billingAddress", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "cardFormDataResponse", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "fiMetadataResponse", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "cardValidations", "selectedAddressId", "", "isBillingAddressExpanded", "isLoading", "isSaveButtonClicked", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;", "error", "", "stateList", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;Ljava/lang/String;ZZZLcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "component4", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;", "component5", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "component6", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "component7", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "component8", "component9", "()Z", "component10", "component11", "component12", "()Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;", "component13", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;Ljava/lang/String;ZZZLcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;Ljava/util/Map;)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$State;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;", "getOperationType", "Ljava/lang/String;", "getFiId", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "getCardDetails", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;", "getBillingAddress", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "getCardFormDataResponse", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "getFiMetadataResponse", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "getCardValidations", "getSelectedAddressId", "Z", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;", "getError", "Ljava/util/Map;", "getStateList"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress;
        private final com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataResponse;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition cardValidations;
        private final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error;
        private final java.lang.String fiId;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fiMetadataResponse;
        private final boolean isBillingAddressExpanded;
        private final boolean isLoading;
        private final boolean isSaveButtonClicked;
        private final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType;
        private final java.lang.String selectedAddressId;
        private final java.util.Map<java.lang.String, java.lang.String> stateList;

        public State(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, java.lang.String str2, boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentMetadataDefinition, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.operationType = operationType;
            this.fiId = str;
            this.cardDetails = cardDetails;
            this.billingAddress = billingAddress;
            this.cardFormDataResponse = cardFormDataEntity;
            this.fiMetadataResponse = fIMetadataEntity;
            this.cardValidations = financialInstrumentMetadataDefinition;
            this.selectedAddressId = str2;
            this.isBillingAddressExpanded = z;
            this.isLoading = z2;
            this.isSaveButtonClicked = z3;
            this.error = error;
            this.stateList = map;
        }

        public /* synthetic */ State(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, java.lang.String str2, boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.ADD : operationType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? new com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails(null, null, null, null, null, 31, null) : cardDetails, (i & 8) != 0 ? new com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress(null, null, null, null, null, 31, null) : billingAddress, (i & 16) != 0 ? null : cardFormDataEntity, (i & 32) != 0 ? null : fIMetadataEntity, (i & 64) != 0 ? com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntityKt.getDefaultCardMetadata() : financialInstrumentMetadataDefinition, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) == 0 ? z3 : false, (i & 2048) == 0 ? error : null, (i & 4096) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType getOperationType() {
            return this.operationType;
        }

        public final java.lang.String getFiId() {
            return this.fiId;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails getCardDetails() {
            return this.cardDetails;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity getCardFormDataResponse() {
            return this.cardFormDataResponse;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity getFiMetadataResponse() {
            return this.fiMetadataResponse;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition getCardValidations() {
            return this.cardValidations;
        }

        public final java.lang.String getSelectedAddressId() {
            return this.selectedAddressId;
        }

        public final boolean isBillingAddressExpanded() {
            return this.isBillingAddressExpanded;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isSaveButtonClicked() {
            return this.isSaveButtonClicked;
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error getError() {
            return this.error;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getStateList() {
            return this.stateList;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType = this.operationType;
            java.lang.String str = this.fiId;
            com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails = this.cardDetails;
            com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress = this.billingAddress;
            com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity = this.cardFormDataResponse;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity = this.fiMetadataResponse;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition = this.cardValidations;
            java.lang.String str2 = this.selectedAddressId;
            boolean z = this.isBillingAddressExpanded;
            boolean z2 = this.isLoading;
            boolean z3 = this.isSaveButtonClicked;
            com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error = this.error;
            java.util.Map<java.lang.String, java.lang.String> map = this.stateList;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State(operationType=");
            sb.append(operationType);
            sb.append(", fiId=");
            sb.append(str);
            sb.append(", cardDetails=");
            sb.append(cardDetails);
            sb.append(", billingAddress=");
            sb.append(billingAddress);
            sb.append(", cardFormDataResponse=");
            sb.append(cardFormDataEntity);
            sb.append(", fiMetadataResponse=");
            sb.append(fIMetadataEntity);
            sb.append(", cardValidations=");
            sb.append(financialInstrumentMetadataDefinition);
            sb.append(", selectedAddressId=");
            sb.append(str2);
            sb.append(", isBillingAddressExpanded=");
            sb.append(z);
            sb.append(", isLoading=");
            sb.append(z2);
            sb.append(", isSaveButtonClicked=");
            sb.append(z3);
            sb.append(", error=");
            sb.append(error);
            sb.append(", stateList=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.operationType.hashCode();
            java.lang.String str = this.fiId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.cardDetails.hashCode();
            int hashCode4 = this.billingAddress.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity = this.cardFormDataResponse;
            int hashCode5 = cardFormDataEntity == null ? 0 : cardFormDataEntity.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity = this.fiMetadataResponse;
            int hashCode6 = fIMetadataEntity == null ? 0 : fIMetadataEntity.hashCode();
            int hashCode7 = this.cardValidations.hashCode();
            java.lang.String str2 = this.selectedAddressId;
            int hashCode8 = str2 == null ? 0 : str2.hashCode();
            int hashCode9 = java.lang.Boolean.hashCode(this.isBillingAddressExpanded);
            int hashCode10 = java.lang.Boolean.hashCode(this.isLoading);
            int hashCode11 = java.lang.Boolean.hashCode(this.isSaveButtonClicked);
            com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error = this.error;
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (error != null ? error.hashCode() : 0)) * 31) + this.stateList.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State state = (com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) other;
            return this.operationType == state.operationType && kotlin.jvm.internal.Intrinsics.areEqual(this.fiId, state.fiId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDetails, state.cardDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, state.billingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardFormDataResponse, state.cardFormDataResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiMetadataResponse, state.fiMetadataResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardValidations, state.cardValidations) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedAddressId, state.selectedAddressId) && this.isBillingAddressExpanded == state.isBillingAddressExpanded && this.isLoading == state.isLoading && this.isSaveButtonClicked == state.isSaveButtonClicked && kotlin.jvm.internal.Intrinsics.areEqual(this.error, state.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.stateList, state.stateList);
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, java.lang.String fiId, com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataResponse, com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fiMetadataResponse, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition cardValidations, java.lang.String selectedAddressId, boolean isBillingAddressExpanded, boolean isLoading, boolean isSaveButtonClicked, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error, java.util.Map<java.lang.String, java.lang.String> stateList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardValidations, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateList, "");
            return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State(operationType, fiId, cardDetails, billingAddress, cardFormDataResponse, fiMetadataResponse, cardValidations, selectedAddressId, isBillingAddressExpanded, isLoading, isSaveButtonClicked, error, stateList);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsBillingAddressExpanded() {
            return this.isBillingAddressExpanded;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getSelectedAddressId() {
            return this.selectedAddressId;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition getCardValidations() {
            return this.cardValidations;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity getFiMetadataResponse() {
            return this.fiMetadataResponse;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity getCardFormDataResponse() {
            return this.cardFormDataResponse;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails getCardDetails() {
            return this.cardDetails;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFiId() {
            return this.fiId;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component13() {
            return this.stateList;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error getError() {
            return this.error;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsSaveButtonClicked() {
            return this.isSaveButtonClicked;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType getOperationType() {
            return this.operationType;
        }

        public State() {
            this(null, null, null, null, null, null, null, null, false, false, false, null, null, 8191, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "", "<init>", "()V", "Initialize", "UpdateUserInput", "AddressSelected", "UpdateStateList", "SetCardValidations", "AddBillingAddressClicked", "CancelBillingAddressClicked", "SaveCardClicked", "OnSaveCardSuccess", "OnSaveCardFailure", "BackClicked", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$AddBillingAddressClicked;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$AddressSelected;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$BackClicked;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$CancelBillingAddressClicked;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$OnSaveCardFailure;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$OnSaveCardSuccess;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$SaveCardClicked;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$SetCardValidations;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$UpdateStateList;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$UpdateUserInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Event {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ`\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b\r\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;", "operationType", "", "fiId", "cardBrand", "lastDigits", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "cardFormData", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "fiMetadata", "", "isCardFormDataLoading", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;Z)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "component6", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "component7", "()Z", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;Z)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$Initialize;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;", "getOperationType", "Ljava/lang/String;", "getFiId", "getCardBrand", "getLastDigits", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "getCardFormData", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "getFiMetadata", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Initialize extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event {
            public static final int $stable = 8;
            private final java.lang.String cardBrand;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormData;
            private final java.lang.String fiId;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fiMetadata;
            private final boolean isCardFormDataLoading;
            private final java.lang.String lastDigits;
            private final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Initialize(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity, boolean z) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "");
                this.operationType = operationType;
                this.fiId = str;
                this.cardBrand = str2;
                this.lastDigits = str3;
                this.cardFormData = cardFormDataEntity;
                this.fiMetadata = fIMetadataEntity;
                this.isCardFormDataLoading = z;
            }

            public /* synthetic */ Initialize(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(operationType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : cardFormDataEntity, (i & 32) == 0 ? fIMetadataEntity : null, (i & 64) != 0 ? false : z);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType getOperationType() {
                return this.operationType;
            }

            public final java.lang.String getFiId() {
                return this.fiId;
            }

            public final java.lang.String getCardBrand() {
                return this.cardBrand;
            }

            public final java.lang.String getLastDigits() {
                return this.lastDigits;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity getCardFormData() {
                return this.cardFormData;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity getFiMetadata() {
                return this.fiMetadata;
            }

            public final boolean isCardFormDataLoading() {
                return this.isCardFormDataLoading;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType = this.operationType;
                java.lang.String str = this.fiId;
                java.lang.String str2 = this.cardBrand;
                java.lang.String str3 = this.lastDigits;
                com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity = this.cardFormData;
                com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity = this.fiMetadata;
                boolean z = this.isCardFormDataLoading;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(operationType=");
                sb.append(operationType);
                sb.append(", fiId=");
                sb.append(str);
                sb.append(", cardBrand=");
                sb.append(str2);
                sb.append(", lastDigits=");
                sb.append(str3);
                sb.append(", cardFormData=");
                sb.append(cardFormDataEntity);
                sb.append(", fiMetadata=");
                sb.append(fIMetadataEntity);
                sb.append(", isCardFormDataLoading=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.operationType.hashCode();
                java.lang.String str = this.fiId;
                int hashCode2 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.cardBrand;
                int hashCode3 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.lastDigits;
                int hashCode4 = str3 == null ? 0 : str3.hashCode();
                com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity = this.cardFormData;
                int hashCode5 = cardFormDataEntity == null ? 0 : cardFormDataEntity.hashCode();
                com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity = this.fiMetadata;
                return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (fIMetadataEntity != null ? fIMetadataEntity.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isCardFormDataLoading);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize)) {
                    return false;
                }
                com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize initialize = (com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize) other;
                return this.operationType == initialize.operationType && kotlin.jvm.internal.Intrinsics.areEqual(this.fiId, initialize.fiId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardBrand, initialize.cardBrand) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, initialize.lastDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardFormData, initialize.cardFormData) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiMetadata, initialize.fiMetadata) && this.isCardFormDataLoading == initialize.isCardFormDataLoading;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize copy(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, java.lang.String fiId, java.lang.String cardBrand, java.lang.String lastDigits, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormData, com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fiMetadata, boolean isCardFormDataLoading) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize(operationType, fiId, cardBrand, lastDigits, cardFormData, fiMetadata, isCardFormDataLoading);
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getIsCardFormDataLoading() {
                return this.isCardFormDataLoading;
            }

            /* renamed from: component6, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity getFiMetadata() {
                return this.fiMetadata;
            }

            /* renamed from: component5, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity getCardFormData() {
                return this.cardFormData;
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.String getLastDigits() {
                return this.lastDigits;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getCardBrand() {
                return this.cardBrand;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getFiId() {
                return this.fiId;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType getOperationType() {
                return this.operationType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize initialize, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    operationType = initialize.operationType;
                }
                if ((i & 2) != 0) {
                    str = initialize.fiId;
                }
                java.lang.String str4 = str;
                if ((i & 4) != 0) {
                    str2 = initialize.cardBrand;
                }
                java.lang.String str5 = str2;
                if ((i & 8) != 0) {
                    str3 = initialize.lastDigits;
                }
                java.lang.String str6 = str3;
                if ((i & 16) != 0) {
                    cardFormDataEntity = initialize.cardFormData;
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity2 = cardFormDataEntity;
                if ((i & 32) != 0) {
                    fIMetadataEntity = initialize.fiMetadata;
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity2 = fIMetadataEntity;
                if ((i & 64) != 0) {
                    z = initialize.isCardFormDataLoading;
                }
                return initialize.copy(operationType, str4, str5, str6, cardFormDataEntity2, fIMetadataEntity2, z);
            }
        }

        private Event() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$UpdateUserInput;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput;", "userInput", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput;)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$UpdateUserInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$UserInput;", "getUserInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UpdateUserInput extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput userInput;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateUserInput(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput userInput) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInput, "");
                this.userInput = userInput;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput getUserInput() {
                return this.userInput;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput userInput = this.userInput;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateUserInput(userInput=");
                sb.append(userInput);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.userInput.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.userInput, ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput) other).userInput);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput copy(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput userInput) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInput, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput(userInput);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput getUserInput() {
                return this.userInput;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput updateUserInput, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput userInput, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    userInput = updateUserInput.userInput;
                }
                return updateUserInput.copy(userInput);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$AddressSelected;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "", "addressId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$AddressSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AddressSelected extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event {
            public static final int $stable = 0;
            private final java.lang.String addressId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddressSelected(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.addressId = str;
            }

            public final java.lang.String getAddressId() {
                return this.addressId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.addressId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSelected(addressId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.addressId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddressSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddressSelected) other).addressId);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddressSelected copy(java.lang.String addressId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressId, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddressSelected(addressId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getAddressId() {
                return this.addressId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddressSelected copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddressSelected addressSelected, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = addressSelected.addressId;
                }
                return addressSelected.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$UpdateStateList;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "", "", "stateList", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$UpdateStateList;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getStateList"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UpdateStateList extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event {
            public static final int $stable = 8;
            private final java.util.Map<java.lang.String, java.lang.String> stateList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateStateList(java.util.Map<java.lang.String, java.lang.String> map) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                this.stateList = map;
            }

            public final java.util.Map<java.lang.String, java.lang.String> getStateList() {
                return this.stateList;
            }

            public final java.lang.String toString() {
                java.util.Map<java.lang.String, java.lang.String> map = this.stateList;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateStateList(stateList=");
                sb.append(map);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.stateList.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateStateList) && kotlin.jvm.internal.Intrinsics.areEqual(this.stateList, ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateStateList) other).stateList);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateStateList copy(java.util.Map<java.lang.String, java.lang.String> stateList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateList, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateStateList(stateList);
            }

            public final java.util.Map<java.lang.String, java.lang.String> component1() {
                return this.stateList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateStateList copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateStateList updateStateList, java.util.Map map, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    map = updateStateList.stateList;
                }
                return updateStateList.copy(map);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$SetCardValidations;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "cardValidations", "", "maskedCardNumber", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$SetCardValidations;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "getCardValidations", "Ljava/lang/String;", "getMaskedCardNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SetCardValidations extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition cardValidations;
            private final java.lang.String maskedCardNumber;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetCardValidations(com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentMetadataDefinition, "");
                this.cardValidations = financialInstrumentMetadataDefinition;
                this.maskedCardNumber = str;
            }

            public /* synthetic */ SetCardValidations(com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(financialInstrumentMetadataDefinition, (i & 2) != 0 ? null : str);
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition getCardValidations() {
                return this.cardValidations;
            }

            public final java.lang.String getMaskedCardNumber() {
                return this.maskedCardNumber;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition = this.cardValidations;
                java.lang.String str = this.maskedCardNumber;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SetCardValidations(cardValidations=");
                sb.append(financialInstrumentMetadataDefinition);
                sb.append(", maskedCardNumber=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.cardValidations.hashCode();
                java.lang.String str = this.maskedCardNumber;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SetCardValidations)) {
                    return false;
                }
                com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SetCardValidations setCardValidations = (com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SetCardValidations) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.cardValidations, setCardValidations.cardValidations) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedCardNumber, setCardValidations.maskedCardNumber);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SetCardValidations copy(com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition cardValidations, java.lang.String maskedCardNumber) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardValidations, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SetCardValidations(cardValidations, maskedCardNumber);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getMaskedCardNumber() {
                return this.maskedCardNumber;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition getCardValidations() {
                return this.cardValidations;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SetCardValidations copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SetCardValidations setCardValidations, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    financialInstrumentMetadataDefinition = setCardValidations.cardValidations;
                }
                if ((i & 2) != 0) {
                    str = setCardValidations.maskedCardNumber;
                }
                return setCardValidations.copy(financialInstrumentMetadataDefinition, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$AddBillingAddressClicked;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AddBillingAddressClicked extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddBillingAddressClicked INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddBillingAddressClicked();

            private AddBillingAddressClicked() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$CancelBillingAddressClicked;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CancelBillingAddressClicked extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.CancelBillingAddressClicked INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.CancelBillingAddressClicked();

            private CancelBillingAddressClicked() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$SaveCardClicked;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SaveCardClicked extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SaveCardClicked INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SaveCardClicked();

            private SaveCardClicked() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$OnSaveCardSuccess;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "", "billingAddressAdded", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$OnSaveCardSuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getBillingAddressAdded"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnSaveCardSuccess extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event {
            public static final int $stable = 0;
            private final boolean billingAddressAdded;

            public OnSaveCardSuccess(boolean z) {
                super(null);
                this.billingAddressAdded = z;
            }

            public final boolean getBillingAddressAdded() {
                return this.billingAddressAdded;
            }

            public final java.lang.String toString() {
                boolean z = this.billingAddressAdded;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSaveCardSuccess(billingAddressAdded=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.billingAddressAdded);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardSuccess) && this.billingAddressAdded == ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardSuccess) other).billingAddressAdded;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardSuccess copy(boolean billingAddressAdded) {
                return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardSuccess(billingAddressAdded);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getBillingAddressAdded() {
                return this.billingAddressAdded;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardSuccess copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardSuccess onSaveCardSuccess, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = onSaveCardSuccess.billingAddressAdded;
                }
                return onSaveCardSuccess.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$OnSaveCardFailure;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;", "error", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$OnSaveCardFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnSaveCardFailure extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSaveCardFailure(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                this.error = error;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSaveCardFailure(error=");
                sb.append(error);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardFailure) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardFailure) other).error);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardFailure copy(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardFailure(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardFailure copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardFailure onSaveCardFailure, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    error = onSaveCardFailure.error;
                }
                return onSaveCardFailure.copy(error);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event$BackClicked;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BackClicked extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.BackClicked INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.BackClicked();

            private BackClicked() {
                super(null);
            }
        }

        public /* synthetic */ Event(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Effect;", "", "<init>", "()V", "NavigateBack", "CardSavedSuccessfully", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Effect$CardSavedSuccessfully;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Effect$NavigateBack;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Effect$NavigateBack;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateBack extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect.NavigateBack INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect.NavigateBack();

            private NavigateBack() {
                super(null);
            }
        }

        private Effect() {
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Effect$CardSavedSuccessfully;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Effect;", "", "billingAddressAdded", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Effect$CardSavedSuccessfully;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getBillingAddressAdded"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardSavedSuccessfully extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect {
            public static final int $stable = 0;
            private final boolean billingAddressAdded;

            public CardSavedSuccessfully(boolean z) {
                super(null);
                this.billingAddressAdded = z;
            }

            public final boolean getBillingAddressAdded() {
                return this.billingAddressAdded;
            }

            public final java.lang.String toString() {
                boolean z = this.billingAddressAdded;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CardSavedSuccessfully(billingAddressAdded=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.billingAddressAdded);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect.CardSavedSuccessfully) && this.billingAddressAdded == ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect.CardSavedSuccessfully) other).billingAddressAdded;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect.CardSavedSuccessfully copy(boolean billingAddressAdded) {
                return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect.CardSavedSuccessfully(billingAddressAdded);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getBillingAddressAdded() {
                return this.billingAddressAdded;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect.CardSavedSuccessfully copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect.CardSavedSuccessfully cardSavedSuccessfully, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = cardSavedSuccessfully.billingAddressAdded;
                }
                return cardSavedSuccessfully.copy(z);
            }
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;", "", "<init>", "()V", "ClientSideValidationError", "ApiError", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error$ApiError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error$ClientSideValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Error {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error$ClientSideValidationError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ClientSideValidationError extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ClientSideValidationError INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ClientSideValidationError();

            private ClientSideValidationError() {
                super(null);
            }
        }

        private Error() {
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error$ApiError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Error$ApiError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ApiError extends com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApiError(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ApiError(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ApiError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ApiError) other).message);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ApiError copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ApiError(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ApiError copy$default(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ApiError apiError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = apiError.message;
                }
                return apiError.copy(str);
            }
        }

        public /* synthetic */ Error(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
