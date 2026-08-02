package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToCardManagement", "NavigateToAcquisitionFlow", "NavigateToBDMCAcquisitionFlow", "NavigateToActivateCardFlow", "NavigateToCardReplacementFlow", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToAcquisitionFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToActivateCardFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToBDMCAcquisitionFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToCardManagement;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToCardReplacementFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardWidgetEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitCardWidgetEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToCardManagement;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToCardManagement;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCardManagement extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCardManagement(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("NavigateToCardManagement", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.productName = debitCardProductName;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToCardManagement(productName=");
            sb.append(debitCardProductName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.productName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardManagement) && this.productName == ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardManagement) other).productName;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardManagement copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardManagement(productName);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardManagement copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardManagement navigateToCardManagement, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = navigateToCardManagement.productName;
            }
            return navigateToCardManagement.copy(debitCardProductName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToAcquisitionFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect;", "Landroidx/navigation3/runtime/NavKey;", "destinationKey", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToAcquisitionFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAcquisitionFlow extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destinationKey;

        public NavigateToAcquisitionFlow(androidx.navigation3.runtime.NavKey navKey) {
            super("NavigateToAcquisitionFlow", null);
            this.destinationKey = navKey;
        }

        public /* synthetic */ NavigateToAcquisitionFlow(androidx.navigation3.runtime.NavKey navKey, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : navKey);
        }

        public final androidx.navigation3.runtime.NavKey getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAcquisitionFlow(destinationKey=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            androidx.navigation3.runtime.NavKey navKey = this.destinationKey;
            if (navKey == null) {
                return 0;
            }
            return navKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToAcquisitionFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToAcquisitionFlow) other).destinationKey);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToAcquisitionFlow copy(androidx.navigation3.runtime.NavKey destinationKey) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToAcquisitionFlow(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToAcquisitionFlow copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToAcquisitionFlow navigateToAcquisitionFlow, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = navigateToAcquisitionFlow.destinationKey;
            }
            return navigateToAcquisitionFlow.copy(navKey);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToAcquisitionFlow() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToBDMCAcquisitionFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToBDMCAcquisitionFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToBDMCAcquisitionFlow extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToBDMCAcquisitionFlow(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("NavigateToBDMCAcquisition", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.productName = debitCardProductName;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToBDMCAcquisitionFlow(productName=");
            sb.append(debitCardProductName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.productName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToBDMCAcquisitionFlow) && this.productName == ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToBDMCAcquisitionFlow) other).productName;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToBDMCAcquisitionFlow copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToBDMCAcquisitionFlow(productName);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToBDMCAcquisitionFlow copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToBDMCAcquisitionFlow navigateToBDMCAcquisitionFlow, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = navigateToBDMCAcquisitionFlow.productName;
            }
            return navigateToBDMCAcquisitionFlow.copy(debitCardProductName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToActivateCardFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "debitCardActivationInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToActivateCardFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "getDebitCardActivationInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToActivateCardFlow extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect {
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToActivateCardFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitCardActivationInfo, ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToActivateCardFlow) other).debitCardActivationInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToActivateCardFlow copy(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToActivateCardFlow(debitCardActivationInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo getDebitCardActivationInfo() {
            return this.debitCardActivationInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToActivateCardFlow copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToActivateCardFlow navigateToActivateCardFlow, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardActivationInfo = navigateToActivateCardFlow.debitCardActivationInfo;
            }
            return navigateToActivateCardFlow.copy(debitCardActivationInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToCardReplacementFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect$NavigateToCardReplacementFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "getReplacementInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCardReplacementFlow extends com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCardReplacementFlow(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
            super("NavigateToCardReplacementFlow", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementInfo, "");
            this.replacementInfo = cardReplacementInfo;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
            return this.replacementInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo = this.replacementInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToCardReplacementFlow(replacementInfo=");
            sb.append(cardReplacementInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.replacementInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardReplacementFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.replacementInfo, ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardReplacementFlow) other).replacementInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardReplacementFlow copy(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacementInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardReplacementFlow(replacementInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
            return this.replacementInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardReplacementFlow copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardReplacementFlow navigateToCardReplacementFlow, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardReplacementInfo = navigateToCardReplacementFlow.replacementInfo;
            }
            return navigateToCardReplacementFlow.copy(cardReplacementInfo);
        }
    }

    public /* synthetic */ DebitCardWidgetEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
