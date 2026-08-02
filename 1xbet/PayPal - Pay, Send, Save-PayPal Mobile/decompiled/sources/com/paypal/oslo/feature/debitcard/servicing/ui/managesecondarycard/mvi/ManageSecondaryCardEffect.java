package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToSecondaryCardManagement", "NavigateToAddCardholder", "NavigateToActivateCardFlow", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect$NavigateBack;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect$NavigateToActivateCardFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect$NavigateToAddCardholder;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect$NavigateToSecondaryCardManagement;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ManageSecondaryCardEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    public static int getHighSpeedVideoFpsRanges;
    public static int getHighSpeedVideoSizes;
    private final java.lang.String name;

    private ManageSecondaryCardEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect$NavigateBack;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateBack();

        public final int hashCode() {
            return 710600942;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect$NavigateToSecondaryCardManagement;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "cardId", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect$NavigateToSecondaryCardManagement;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSecondaryCardManagement extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect {
        public static final int $stable = 0;
        private final java.lang.String cardId;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToSecondaryCardManagement(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
            super("NavigateToSecondaryCardManagement", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.productName = debitCardProductName;
            this.cardId = str;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSecondaryCardManagement(productName=");
            sb.append(debitCardProductName);
            sb.append(", cardId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.productName.hashCode() * 31) + this.cardId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToSecondaryCardManagement)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToSecondaryCardManagement navigateToSecondaryCardManagement = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToSecondaryCardManagement) other;
            return this.productName == navigateToSecondaryCardManagement.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, navigateToSecondaryCardManagement.cardId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToSecondaryCardManagement copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToSecondaryCardManagement(productName, cardId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToSecondaryCardManagement copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToSecondaryCardManagement navigateToSecondaryCardManagement, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = navigateToSecondaryCardManagement.productName;
            }
            if ((i & 2) != 0) {
                str = navigateToSecondaryCardManagement.cardId;
            }
            return navigateToSecondaryCardManagement.copy(debitCardProductName, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect$NavigateToAddCardholder;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddCardholder extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToAddCardholder INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToAddCardholder();

        public final int hashCode() {
            return -1859100901;
        }

        private NavigateToAddCardholder() {
            super("NavigateToAddCardholder", null);
        }

        public final java.lang.String toString() {
            return "NavigateToAddCardholder";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToAddCardholder)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect$NavigateToActivateCardFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "debitCardActivationInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEffect$NavigateToActivateCardFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "getDebitCardActivationInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToActivateCardFlow extends com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToActivateCardFlow(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo) {
            super("NavigateToActivateCardFlow", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationInfo, "");
            this.debitCardActivationInfo = debitCardActivationInfo;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo getDebitCardActivationInfo() {
            return this.debitCardActivationInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo = this.debitCardActivationInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToActivateCardFlow(debitCardActivationInfo=");
            sb.append(debitCardActivationInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debitCardActivationInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToActivateCardFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitCardActivationInfo, ((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToActivateCardFlow) other).debitCardActivationInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToActivateCardFlow copy(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToActivateCardFlow(debitCardActivationInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo getDebitCardActivationInfo() {
            return this.debitCardActivationInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToActivateCardFlow copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToActivateCardFlow navigateToActivateCardFlow, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardActivationInfo = navigateToActivateCardFlow.debitCardActivationInfo;
            }
            return navigateToActivateCardFlow.copy(debitCardActivationInfo);
        }
    }

    public static int getHighSpeedVideoFpsRanges() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i % 6924573;
        getHighSpeedVideoFpsRanges = i + 1;
        if (i2 != 0) {
            return getHighSpeedVideoSizes;
        }
        int nextInt = new java.util.Random().nextInt(792093285);
        getHighSpeedVideoSizes = nextInt;
        return nextInt;
    }

    public /* synthetic */ ManageSecondaryCardEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
