package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToAcquisition", "NavigateToPrequal", "NavigateToAllPlans", "NavigateToPlanDetails", "NavigateToVirtualCardOverview", "NavigateToWebView", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToAcquisition;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToAllPlans;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToPlanDetails;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToPrequal;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToVirtualCardOverview;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToWebView;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PayLaterHubUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PayLaterHubUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateBack();

        public final int hashCode() {
            return 1801943666;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToAcquisition;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAcquisition extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAcquisition INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAcquisition();

        public final int hashCode() {
            return 1914729703;
        }

        private NavigateToAcquisition() {
            super("NavigateToAcquisition", null);
        }

        public final java.lang.String toString() {
            return "NavigateToAcquisition";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAcquisition)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToPrequal;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPrequal extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPrequal INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPrequal();

        public final int hashCode() {
            return -830640948;
        }

        private NavigateToPrequal() {
            super("NavigateToPrequal", null);
        }

        public final java.lang.String toString() {
            return "NavigateToPrequal";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPrequal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToAllPlans;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect;", "", "navigateToHistoryTab", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToAllPlans;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getNavigateToHistoryTab"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAllPlans extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect {
        public static final int $stable = 0;
        private final boolean navigateToHistoryTab;

        public NavigateToAllPlans(boolean z) {
            super("NavigateToAllPlans", null);
            this.navigateToHistoryTab = z;
        }

        public /* synthetic */ NavigateToAllPlans(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getNavigateToHistoryTab() {
            return this.navigateToHistoryTab;
        }

        public final java.lang.String toString() {
            boolean z = this.navigateToHistoryTab;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAllPlans(navigateToHistoryTab=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.navigateToHistoryTab);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAllPlans) && this.navigateToHistoryTab == ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAllPlans) other).navigateToHistoryTab;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAllPlans copy(boolean navigateToHistoryTab) {
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAllPlans(navigateToHistoryTab);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getNavigateToHistoryTab() {
            return this.navigateToHistoryTab;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAllPlans copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAllPlans navigateToAllPlans, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = navigateToAllPlans.navigateToHistoryTab;
            }
            return navigateToAllPlans.copy(z);
        }

        public NavigateToAllPlans() {
            this(false, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToPlanDetails;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect;", "", "creditAccountId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToPlanDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPlanDetails extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPlanDetails(java.lang.String str, java.lang.String str2) {
            super("NavigateToPlanDetails", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.creditAccountId = str;
            this.source = str2;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.String str2 = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPlanDetails(creditAccountId=");
            sb.append(str);
            sb.append(", source=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.creditAccountId.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPlanDetails)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPlanDetails navigateToPlanDetails = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPlanDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, navigateToPlanDetails.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, navigateToPlanDetails.source);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPlanDetails copy(java.lang.String creditAccountId, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPlanDetails(creditAccountId, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPlanDetails copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPlanDetails navigateToPlanDetails, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPlanDetails.creditAccountId;
            }
            if ((i & 2) != 0) {
                str2 = navigateToPlanDetails.source;
            }
            return navigateToPlanDetails.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToVirtualCardOverview;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect;", "", "creditAccountId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToVirtualCardOverview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToVirtualCardOverview extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToVirtualCardOverview(java.lang.String str) {
            super("NavigateToVirtualCardOverview", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.creditAccountId = str;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToVirtualCardOverview(creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.creditAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToVirtualCardOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToVirtualCardOverview) other).creditAccountId);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToVirtualCardOverview copy(java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToVirtualCardOverview(creditAccountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToVirtualCardOverview copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToVirtualCardOverview navigateToVirtualCardOverview, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToVirtualCardOverview.creditAccountId;
            }
            return navigateToVirtualCardOverview.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToWebView;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect$NavigateToWebView;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToWebView extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToWebView(java.lang.String str) {
            super("NavigateToWebView", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToWebView(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToWebView) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToWebView) other).url);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToWebView copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToWebView(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToWebView copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToWebView navigateToWebView, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToWebView.url;
            }
            return navigateToWebView.copy(str);
        }
    }

    public /* synthetic */ PayLaterHubUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
