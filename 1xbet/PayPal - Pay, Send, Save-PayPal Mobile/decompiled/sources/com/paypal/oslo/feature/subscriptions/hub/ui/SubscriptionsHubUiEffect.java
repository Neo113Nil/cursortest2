package com.paypal.oslo.feature.subscriptions.hub.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "effectName", "Ljava/lang/String;", "getEffectName", "()Ljava/lang/String;", "NavigateToAboutSubscriptions", "NavigateToBulkUpdateFi", "NavigateToSubscriptionDetails", "NavigateToLinkSubscriptions", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect$NavigateToAboutSubscriptions;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect$NavigateToBulkUpdateFi;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect$NavigateToLinkSubscriptions;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect$NavigateToSubscriptionDetails;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SubscriptionsHubUiEffect {
    public static final int $stable = 0;
    private final java.lang.String effectName;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect$NavigateToAboutSubscriptions;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAboutSubscriptions extends com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToAboutSubscriptions INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToAboutSubscriptions();

        public final int hashCode() {
            return -1733098905;
        }

        private NavigateToAboutSubscriptions() {
            super("NavigateToAboutSubscriptions", null);
        }

        public final java.lang.String toString() {
            return "NavigateToAboutSubscriptions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToAboutSubscriptions)) {
                return false;
            }
            return true;
        }
    }

    private SubscriptionsHubUiEffect(java.lang.String str) {
        this.effectName = str;
    }

    public final java.lang.String getEffectName() {
        return this.effectName;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect$NavigateToBulkUpdateFi;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToBulkUpdateFi extends com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToBulkUpdateFi INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToBulkUpdateFi();

        public final int hashCode() {
            return 669371164;
        }

        private NavigateToBulkUpdateFi() {
            super("NavigateToBulkUpdateFi", null);
        }

        public final java.lang.String toString() {
            return "NavigateToBulkUpdateFi";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToBulkUpdateFi)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect$NavigateToSubscriptionDetails;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect;", "", "agreementId", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "component3-QDVFmTU", "component3", "copy-vFXjZRc", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect$NavigateToSubscriptionDetails;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAgreementId", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType", "getRequestId-QDVFmTU"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSubscriptionDetails extends com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect {
        public static final int $stable = 8;
        private final java.lang.String agreementId;
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private NavigateToSubscriptionDetails(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.lang.String str2) {
            super("NavigateToSubscriptionDetails", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.agreementId = str;
            this.agreementType = agreementType;
            this.requestId = str2;
        }

        public final java.lang.String getAgreementId() {
            return this.agreementId;
        }

        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        /* renamed from: getRequestId-QDVFmTU, reason: not valid java name */
        public final java.lang.String m19891getRequestIdQDVFmTU() {
            return this.requestId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.agreementId;
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.String m11591toStringimpl = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11591toStringimpl(this.requestId);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSubscriptionDetails(agreementId=");
            sb.append(str);
            sb.append(", agreementType=");
            sb.append(agreementType);
            sb.append(", requestId=");
            sb.append(m11591toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.agreementId.hashCode() * 31) + this.agreementType.hashCode()) * 31) + com.paypal.oslo.core.navigation.result.NavResultRequestId.m11590hashCodeimpl(this.requestId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails navigateToSubscriptionDetails = (com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.agreementId, navigateToSubscriptionDetails.agreementId) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, navigateToSubscriptionDetails.agreementType) && com.paypal.oslo.core.navigation.result.NavResultRequestId.m11589equalsimpl0(this.requestId, navigateToSubscriptionDetails.requestId);
        }

        /* renamed from: copy-vFXjZRc, reason: not valid java name */
        public final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails m19890copyvFXjZRc(java.lang.String agreementId, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.lang.String requestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            return new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails(agreementId, agreementType, requestId, null);
        }

        /* renamed from: component3-QDVFmTU, reason: not valid java name and from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAgreementId() {
            return this.agreementId;
        }

        /* renamed from: copy-vFXjZRc$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails m19888copyvFXjZRc$default(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToSubscriptionDetails navigateToSubscriptionDetails, java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToSubscriptionDetails.agreementId;
            }
            if ((i & 2) != 0) {
                agreementType = navigateToSubscriptionDetails.agreementType;
            }
            if ((i & 4) != 0) {
                str2 = navigateToSubscriptionDetails.requestId;
            }
            return navigateToSubscriptionDetails.m19890copyvFXjZRc(str, agreementType, str2);
        }

        public /* synthetic */ NavigateToSubscriptionDetails(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, agreementType, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect$NavigateToLinkSubscriptions;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLinkSubscriptions extends com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToLinkSubscriptions INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToLinkSubscriptions();

        public final int hashCode() {
            return -419259554;
        }

        private NavigateToLinkSubscriptions() {
            super("NavigateToLinkSubscriptions", null);
        }

        public final java.lang.String toString() {
            return "NavigateToLinkSubscriptions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubUiEffect.NavigateToLinkSubscriptions)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SubscriptionsHubUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
