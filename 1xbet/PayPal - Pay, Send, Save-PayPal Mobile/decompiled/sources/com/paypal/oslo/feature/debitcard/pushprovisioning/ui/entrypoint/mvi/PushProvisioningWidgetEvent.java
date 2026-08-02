package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "TokenEligibilityCheckRequested", "TokenEligibilityRetrieved", "AddToWalletButtonClicked", "TokenEligibilityRetrievalFailed", "RetryTokenEligibilityCheckRequested", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$AddToWalletButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$RetryTokenEligibilityCheckRequested;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$TokenEligibilityCheckRequested;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$TokenEligibilityRetrievalFailed;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$TokenEligibilityRetrieved;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PushProvisioningWidgetEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PushProvisioningWidgetEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$TokenEligibilityCheckRequested;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "component2", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$TokenEligibilityCheckRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "getStarPayClient", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TokenEligibilityCheckRequested extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenEligibilityCheckRequested(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("TokenEligibilityCheckRequested", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.starPayClient = starPayClient;
            this.productName = debitCardProductName;
        }

        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = this.starPayClient;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenEligibilityCheckRequested(starPayClient=");
            sb.append(starPayClient);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.starPayClient.hashCode() * 31) + this.productName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityCheckRequested)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityCheckRequested tokenEligibilityCheckRequested = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityCheckRequested) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.starPayClient, tokenEligibilityCheckRequested.starPayClient) && this.productName == tokenEligibilityCheckRequested.productName;
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityCheckRequested copy(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityCheckRequested(starPayClient, productName);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityCheckRequested copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityCheckRequested tokenEligibilityCheckRequested, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                starPayClient = tokenEligibilityCheckRequested.starPayClient;
            }
            if ((i & 2) != 0) {
                debitCardProductName = tokenEligibilityCheckRequested.productName;
            }
            return tokenEligibilityCheckRequested.copy(starPayClient, debitCardProductName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$TokenEligibilityRetrieved;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityUiData;", "debitInstrumentTokenEligibilityUiData", "<init>", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityUiData;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityUiData;", "copy", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityUiData;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$TokenEligibilityRetrieved;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityUiData;", "getDebitInstrumentTokenEligibilityUiData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TokenEligibilityRetrieved extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData debitInstrumentTokenEligibilityUiData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenEligibilityRetrieved(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData debitInstrumentTokenEligibilityUiData) {
            super("TokenEligibilityRetrieved", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentTokenEligibilityUiData, "");
            this.debitInstrumentTokenEligibilityUiData = debitInstrumentTokenEligibilityUiData;
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData getDebitInstrumentTokenEligibilityUiData() {
            return this.debitInstrumentTokenEligibilityUiData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData debitInstrumentTokenEligibilityUiData = this.debitInstrumentTokenEligibilityUiData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenEligibilityRetrieved(debitInstrumentTokenEligibilityUiData=");
            sb.append(debitInstrumentTokenEligibilityUiData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debitInstrumentTokenEligibilityUiData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrieved) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentTokenEligibilityUiData, ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrieved) other).debitInstrumentTokenEligibilityUiData);
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrieved copy(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData debitInstrumentTokenEligibilityUiData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentTokenEligibilityUiData, "");
            return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrieved(debitInstrumentTokenEligibilityUiData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData getDebitInstrumentTokenEligibilityUiData() {
            return this.debitInstrumentTokenEligibilityUiData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrieved copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrieved tokenEligibilityRetrieved, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData debitInstrumentTokenEligibilityUiData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentTokenEligibilityUiData = tokenEligibilityRetrieved.debitInstrumentTokenEligibilityUiData;
            }
            return tokenEligibilityRetrieved.copy(debitInstrumentTokenEligibilityUiData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$AddToWalletButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "debitInstrument", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$AddToWalletButtonClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "getDebitInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddToWalletButtonClicked extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddToWalletButtonClicked(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
            super("AddToWalletButtonClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            this.debitInstrument = debitInstrument;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = this.debitInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddToWalletButtonClicked(debitInstrument=");
            sb.append(debitInstrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debitInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.AddToWalletButtonClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrument, ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.AddToWalletButtonClicked) other).debitInstrument);
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.AddToWalletButtonClicked copy(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.AddToWalletButtonClicked(debitInstrument);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.AddToWalletButtonClicked copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.AddToWalletButtonClicked addToWalletButtonClicked, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrument = addToWalletButtonClicked.debitInstrument;
            }
            return addToWalletButtonClicked.copy(debitInstrument);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$TokenEligibilityRetrievalFailed;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "errorCode", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$TokenEligibilityRetrievalFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TokenEligibilityRetrievalFailed extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenEligibilityRetrievalFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str) {
            super("TokenEligibilityRetrievalFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorType = debitErrorType;
            this.errorCode = str;
        }

        public /* synthetic */ TokenEligibilityRetrievalFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE : debitErrorType, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenEligibilityRetrievalFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(", errorCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorType.hashCode();
            java.lang.String str = this.errorCode;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrievalFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrievalFailed tokenEligibilityRetrievalFailed = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrievalFailed) other;
            return this.errorType == tokenEligibilityRetrievalFailed.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, tokenEligibilityRetrievalFailed.errorCode);
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrievalFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrievalFailed(errorType, errorCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrievalFailed copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrievalFailed tokenEligibilityRetrievalFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = tokenEligibilityRetrievalFailed.errorType;
            }
            if ((i & 2) != 0) {
                str = tokenEligibilityRetrievalFailed.errorCode;
            }
            return tokenEligibilityRetrievalFailed.copy(debitErrorType, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TokenEligibilityRetrievalFailed() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$RetryTokenEligibilityCheckRequested;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "component2", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent$RetryTokenEligibilityCheckRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "getStarPayClient", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryTokenEligibilityCheckRequested extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryTokenEligibilityCheckRequested(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("RetryTokenEligibilityCheckRequested", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.starPayClient = starPayClient;
            this.productName = debitCardProductName;
        }

        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = this.starPayClient;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryTokenEligibilityCheckRequested(starPayClient=");
            sb.append(starPayClient);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.starPayClient.hashCode() * 31) + this.productName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested retryTokenEligibilityCheckRequested = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.starPayClient, retryTokenEligibilityCheckRequested.starPayClient) && this.productName == retryTokenEligibilityCheckRequested.productName;
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested copy(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested(starPayClient, productName);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested retryTokenEligibilityCheckRequested, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                starPayClient = retryTokenEligibilityCheckRequested.starPayClient;
            }
            if ((i & 2) != 0) {
                debitCardProductName = retryTokenEligibilityCheckRequested.productName;
            }
            return retryTokenEligibilityCheckRequested.copy(starPayClient, debitCardProductName);
        }
    }

    public /* synthetic */ PushProvisioningWidgetEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
