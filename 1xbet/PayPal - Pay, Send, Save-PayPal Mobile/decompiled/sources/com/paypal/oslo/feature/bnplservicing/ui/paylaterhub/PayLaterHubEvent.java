package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0012\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0012\u001c\u001d\u001e\u001f !\"#$%&'()*+,-"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadData", "ShowError", "BackPressed", "NavigateToAcquisition", "NavigateToPrequal", "NavigateToAllPlans", "NavigateToPlanDetails", "NavigateToVirtualCardOverview", "CheckoutOfferURLClicked", "DataLoaded", "RetrySection", "PrequalLoaded", "PlansLoaded", "PrequalError", "PlansError", "PartialDataLoaded", "RefreshPlansSection", "RefreshAllSections", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$BackPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$CheckoutOfferURLClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$DataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$LoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToAcquisition;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToAllPlans;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToPlanDetails;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToPrequal;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToVirtualCardOverview;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PartialDataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PlansError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PlansLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PrequalError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PrequalLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$RefreshAllSections;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$RefreshPlansSection;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$RetrySection;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$ShowError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PayLaterHubEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$LoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadData extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.LoadData INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.LoadData();

        public final int hashCode() {
            return -1495538317;
        }

        private LoadData() {
            super("LoadData", null);
        }

        public final java.lang.String toString() {
            return "LoadData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.LoadData)) {
                return false;
            }
            return true;
        }
    }

    private PayLaterHubEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$ShowError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$ShowError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowError extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel) {
            super("ShowError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubUiModel, "");
            this.model = payLaterHubUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowError(model=");
            sb.append(payLaterHubUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.ShowError) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.ShowError) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.ShowError copy(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.ShowError(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.ShowError copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.ShowError showError, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                payLaterHubUiModel = showError.model;
            }
            return showError.copy(payLaterHubUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$BackPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackPressed extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.BackPressed INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.BackPressed();

        public final int hashCode() {
            return -111943016;
        }

        private BackPressed() {
            super("BackPressed", null);
        }

        public final java.lang.String toString() {
            return "BackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.BackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToAcquisition;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAcquisition extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAcquisition INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAcquisition();

        public final int hashCode() {
            return 1814232382;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAcquisition)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToPrequal;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPrequal extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPrequal INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPrequal();

        public final int hashCode() {
            return -792217437;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPrequal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToAllPlans;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "", "navigateToHistoryTab", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToAllPlans;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getNavigateToHistoryTab"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAllPlans extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAllPlans) && this.navigateToHistoryTab == ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAllPlans) other).navigateToHistoryTab;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAllPlans copy(boolean navigateToHistoryTab) {
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAllPlans(navigateToHistoryTab);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getNavigateToHistoryTab() {
            return this.navigateToHistoryTab;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAllPlans copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAllPlans navigateToAllPlans, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = navigateToAllPlans.navigateToHistoryTab;
            }
            return navigateToAllPlans.copy(z);
        }

        public NavigateToAllPlans() {
            this(false, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToPlanDetails;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "", "creditAccountId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToPlanDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPlanDetails extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
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
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPlanDetails)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPlanDetails navigateToPlanDetails = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPlanDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, navigateToPlanDetails.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, navigateToPlanDetails.source);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPlanDetails copy(java.lang.String creditAccountId, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPlanDetails(creditAccountId, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPlanDetails copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPlanDetails navigateToPlanDetails, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPlanDetails.creditAccountId;
            }
            if ((i & 2) != 0) {
                str2 = navigateToPlanDetails.source;
            }
            return navigateToPlanDetails.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToVirtualCardOverview;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "", "creditAccountId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$NavigateToVirtualCardOverview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToVirtualCardOverview extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToVirtualCardOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToVirtualCardOverview) other).creditAccountId);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToVirtualCardOverview copy(java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToVirtualCardOverview(creditAccountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToVirtualCardOverview copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToVirtualCardOverview navigateToVirtualCardOverview, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToVirtualCardOverview.creditAccountId;
            }
            return navigateToVirtualCardOverview.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$CheckoutOfferURLClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$CheckoutOfferURLClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CheckoutOfferURLClicked extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckoutOfferURLClicked(java.lang.String str) {
            super("CheckoutOfferURLClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutOfferURLClicked(url=");
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.CheckoutOfferURLClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.CheckoutOfferURLClicked) other).url);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.CheckoutOfferURLClicked copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.CheckoutOfferURLClicked(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.CheckoutOfferURLClicked copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.CheckoutOfferURLClicked checkoutOfferURLClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = checkoutOfferURLClicked.url;
            }
            return checkoutOfferURLClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$DataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$DataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataLoaded extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataLoaded(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel) {
            super("DataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubUiModel, "");
            this.model = payLaterHubUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataLoaded(model=");
            sb.append(payLaterHubUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.DataLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.DataLoaded) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.DataLoaded copy(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.DataLoaded(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.DataLoaded copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.DataLoaded dataLoaded, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                payLaterHubUiModel = dataLoaded.model;
            }
            return dataLoaded.copy(payLaterHubUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$RetrySection;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubSection;", "section", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubSection;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubSection;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubSection;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$RetrySection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubSection;", "getSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetrySection extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetrySection(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection payLaterHubSection) {
            super("RetrySection", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubSection, "");
            this.section = payLaterHubSection;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection getSection() {
            return this.section;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection payLaterHubSection = this.section;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetrySection(section=");
            sb.append(payLaterHubSection);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.section.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RetrySection) && this.section == ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RetrySection) other).section;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RetrySection copy(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection section) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RetrySection(section);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection getSection() {
            return this.section;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RetrySection copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RetrySection retrySection, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection payLaterHubSection, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                payLaterHubSection = retrySection.section;
            }
            return retrySection.copy(payLaterHubSection);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PrequalLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;", "prequalSection", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PrequalLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;", "getPrequalSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrequalLoaded extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSection;

        public PrequalLoaded(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSectionUiModel) {
            super("PrequalLoaded", null);
            this.prequalSection = prequalSectionUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel getPrequalSection() {
            return this.prequalSection;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSectionUiModel = this.prequalSection;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrequalLoaded(prequalSection=");
            sb.append(prequalSectionUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSectionUiModel = this.prequalSection;
            if (prequalSectionUiModel == null) {
                return 0;
            }
            return prequalSectionUiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.prequalSection, ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalLoaded) other).prequalSection);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalLoaded copy(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSection) {
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalLoaded(prequalSection);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel getPrequalSection() {
            return this.prequalSection;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalLoaded copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalLoaded prequalLoaded, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSectionUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                prequalSectionUiModel = prequalLoaded.prequalSection;
            }
            return prequalLoaded.copy(prequalSectionUiModel);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PlansLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PlansLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PlansLoaded extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlansLoaded(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel) {
            super("PlansLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubUiModel, "");
            this.model = payLaterHubUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PlansLoaded(model=");
            sb.append(payLaterHubUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansLoaded) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansLoaded copy(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansLoaded(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansLoaded copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansLoaded plansLoaded, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                payLaterHubUiModel = plansLoaded.model;
            }
            return plansLoaded.copy(payLaterHubUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PrequalError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrequalError extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalError INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalError();

        public final int hashCode() {
            return 1810355449;
        }

        private PrequalError() {
            super("PrequalError", null);
        }

        public final java.lang.String toString() {
            return "PrequalError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PlansError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PlansError extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansError INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansError();

        public final int hashCode() {
            return -747129663;
        }

        private PlansError() {
            super("PlansError", null);
        }

        public final java.lang.String toString() {
            return "PlansError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PartialDataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "model", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubSection;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/SectionState;", "sectionStates", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "component2", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;Ljava/util/Map;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$PartialDataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "getModel", "Ljava/util/Map;", "getSectionStates"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PartialDataLoaded extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel model;
        private final java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> sectionStates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PartialDataLoaded(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel, java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, ? extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> map) {
            super("PartialDataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.model = payLaterHubUiModel;
            this.sectionStates = map;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel getModel() {
            return this.model;
        }

        public final java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> getSectionStates() {
            return this.sectionStates;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel = this.model;
            java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> map = this.sectionStates;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialDataLoaded(model=");
            sb.append(payLaterHubUiModel);
            sb.append(", sectionStates=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.model.hashCode() * 31) + this.sectionStates.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded partialDataLoaded = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.model, partialDataLoaded.model) && kotlin.jvm.internal.Intrinsics.areEqual(this.sectionStates, partialDataLoaded.sectionStates);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded copy(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel model, java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, ? extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> sectionStates) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionStates, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded(model, sectionStates);
        }

        public final java.util.Map<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState> component2() {
            return this.sectionStates;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel getModel() {
            return this.model;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded partialDataLoaded, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                payLaterHubUiModel = partialDataLoaded.model;
            }
            if ((i & 2) != 0) {
                map = partialDataLoaded.sectionStates;
            }
            return partialDataLoaded.copy(payLaterHubUiModel, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$RefreshPlansSection;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshPlansSection extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RefreshPlansSection INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RefreshPlansSection();

        public final int hashCode() {
            return -603062285;
        }

        private RefreshPlansSection() {
            super("RefreshPlansSection", null);
        }

        public final java.lang.String toString() {
            return "RefreshPlansSection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RefreshPlansSection)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent$RefreshAllSections;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshAllSections extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RefreshAllSections INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RefreshAllSections();

        public final int hashCode() {
            return 276324631;
        }

        private RefreshAllSections() {
            super("RefreshAllSections", null);
        }

        public final java.lang.String toString() {
            return "RefreshAllSections";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RefreshAllSections)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PayLaterHubEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
