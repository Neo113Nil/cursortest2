package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBackWithSuccess", "NavigateToBalanceDashboard", "NavigateToDebitCardManagement", "NavigateToChangeAddress", "NavigateBackWithCancellation", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect$NavigateBackWithCancellation;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect$NavigateBackWithSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect$NavigateToBalanceDashboard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect$NavigateToChangeAddress;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect$NavigateToDebitCardManagement;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CardReplacementEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CardReplacementEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect$NavigateBackWithSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithSuccess extends com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateBackWithSuccess INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateBackWithSuccess();

        public final int hashCode() {
            return -1012003167;
        }

        private NavigateBackWithSuccess() {
            super("NavigateBackWithSuccess", null);
        }

        public final java.lang.String toString() {
            return "NavigateBackWithSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateBackWithSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect$NavigateToBalanceDashboard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToBalanceDashboard extends com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToBalanceDashboard INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToBalanceDashboard();

        public final int hashCode() {
            return 1824347688;
        }

        private NavigateToBalanceDashboard() {
            super("NavigateToBalanceDashboard", null);
        }

        public final java.lang.String toString() {
            return "NavigateToBalanceDashboard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToBalanceDashboard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect$NavigateToDebitCardManagement;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDebitCardManagement extends com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToDebitCardManagement INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToDebitCardManagement();

        public final int hashCode() {
            return -1316277649;
        }

        private NavigateToDebitCardManagement() {
            super("NavigateToDebitCardManagement", null);
        }

        public final java.lang.String toString() {
            return "NavigateToDebitCardManagement";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToDebitCardManagement)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect$NavigateToChangeAddress;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect;", "", "debitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect$NavigateToChangeAddress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToChangeAddress extends com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect {
        public static final int $stable = 0;
        private final java.lang.String debitInstrumentId;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToChangeAddress(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("NavigateToChangeAddress", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.debitInstrumentId = str;
            this.productName = debitCardProductName;
        }

        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.debitInstrumentId;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToChangeAddress(debitInstrumentId=");
            sb.append(str);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.debitInstrumentId.hashCode() * 31) + this.productName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToChangeAddress)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToChangeAddress navigateToChangeAddress = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToChangeAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentId, navigateToChangeAddress.debitInstrumentId) && this.productName == navigateToChangeAddress.productName;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToChangeAddress copy(java.lang.String debitInstrumentId, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToChangeAddress(debitInstrumentId, productName);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToChangeAddress copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToChangeAddress navigateToChangeAddress, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToChangeAddress.debitInstrumentId;
            }
            if ((i & 2) != 0) {
                debitCardProductName = navigateToChangeAddress.productName;
            }
            return navigateToChangeAddress.copy(str, debitCardProductName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect$NavigateBackWithCancellation;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithCancellation extends com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateBackWithCancellation INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateBackWithCancellation();

        public final int hashCode() {
            return 958803237;
        }

        private NavigateBackWithCancellation() {
            super("NavigateBackWithCancellation", null);
        }

        public final java.lang.String toString() {
            return "NavigateBackWithCancellation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateBackWithCancellation)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CardReplacementEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
