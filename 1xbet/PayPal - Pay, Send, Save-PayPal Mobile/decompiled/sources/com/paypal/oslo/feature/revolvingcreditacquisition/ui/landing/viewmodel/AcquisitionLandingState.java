package com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Unavailable", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState$Unavailable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AcquisitionLandingState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "webViewUrl", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState$Initial;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getWebViewUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier;
        private final java.lang.String webViewUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str) {
            super("Initial", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.creditProductIdentifier = creditProductIdentifier;
            this.webViewUrl = str;
        }

        public /* synthetic */ Initial(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditProductIdentifier, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String getWebViewUrl() {
            return this.webViewUrl;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.String str = this.webViewUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", webViewUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.creditProductIdentifier.hashCode();
            java.lang.String str = this.webViewUrl;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Initial)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Initial initial = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Initial) other;
            return this.creditProductIdentifier == initial.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.webViewUrl, initial.webViewUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Initial copy(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String webViewUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Initial(creditProductIdentifier, webViewUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getWebViewUrl() {
            return this.webViewUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Initial copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Initial initial, com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = initial.creditProductIdentifier;
            }
            if ((i & 2) != 0) {
                str = initial.webViewUrl;
            }
            return initial.copy(creditProductIdentifier, str);
        }
    }

    private AcquisitionLandingState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState$Unavailable;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "creditProductIdentifier", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState$Unavailable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "getCreditProductIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unavailable extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unavailable(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier) {
            super("Unavailable", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.creditProductIdentifier = creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unavailable(creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.creditProductIdentifier.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Unavailable) && this.creditProductIdentifier == ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Unavailable) other).creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Unavailable copy(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Unavailable(creditProductIdentifier);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Unavailable copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Unavailable unavailable, com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = unavailable.creditProductIdentifier;
            }
            return unavailable.copy(creditProductIdentifier);
        }
    }

    public /* synthetic */ AcquisitionLandingState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
