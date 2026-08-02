package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\"\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\",-./0123456789:;<=>?@ABCDEFGHIJKLM"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnReload", "OnDataLoaded", "OnDataLoadFailed", "OnAppUpdateNeeded", "OnRecurringAccountItemClicked", "OnSeeAllActivitiesButtonClicked", "OnRecentActivityClicked", "OnSeeAllSpecialFinancingButtonClicked", "OnSpecialFinancingItemClicked", "OnMakePaymentClicked", "OnNavigateBack", "OnInfoMessageClicked", "OnViewAutopayClicked", "OnDetailsPageClick", "OnPhoneNumberClick", "OnAmountToAvoidInterestInfoClicked", "OnCashbackRewardClicked", "OnCardActivationClicked", "OnPaymentsClicked", "OnPrioritizedAccountActionClicked", "OnPrioritizedAccountActionDismissed", "OnNavigateToPrioritizedAccountActionDestination", "OnNavigateToAccountFeatureDestination", "OnAccountFeatureClicked", "OnSeeAllAccountFeaturesClicked", "OnFullScreenErrorButtonClicked", "OnPushToWalletClicked", "OnPushToWalletFailed", "OnRequestVirtualCardClicked", "OnBottomSheetDismissed", "OnAutopayUpdateReceived", "OnCreditDisclosureCompleted", "OnCreditDisclosureFailed", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnAccountFeatureClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnAmountToAvoidInterestInfoClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnAppUpdateNeeded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnAutopayUpdateReceived;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnBottomSheetDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnCardActivationClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnCashbackRewardClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnCreditDisclosureCompleted;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnCreditDisclosureFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDetailsPageClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnFullScreenErrorButtonClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnInfoMessageClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnMakePaymentClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnNavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnNavigateToAccountFeatureDestination;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnNavigateToPrioritizedAccountActionDestination;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPaymentsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPhoneNumberClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPrioritizedAccountActionClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPrioritizedAccountActionDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPushToWalletClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPushToWalletFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnRecentActivityClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnRecurringAccountItemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnReload;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnRequestVirtualCardClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnSeeAllAccountFeaturesClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnSeeAllActivitiesButtonClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnSeeAllSpecialFinancingButtonClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnSpecialFinancingItemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnViewAutopayClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AccountSummaryEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnViewCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
            super("OnViewCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.creditProductIdentifier = creditProductIdentifier;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(creditProductIdentifier=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewCreated) && this.creditProductIdentifier == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewCreated) other).creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewCreated copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewCreated(creditProductIdentifier);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewCreated onViewCreated, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = onViewCreated.creditProductIdentifier;
            }
            return onViewCreated.copy(creditProductIdentifier);
        }
    }

    private AccountSummaryEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnReload;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnReload extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnReload INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnReload();

        public final int hashCode() {
            return -1760589894;
        }

        private OnReload() {
            super("OnReload", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnReload";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnReload)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B±\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u001c\u0010\u000e\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\r\u0012\u001c\u0010\u0011\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\u0010\u0012\u001c\u0010\u0014\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\u0013\u0012\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\tj\u0002`\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J&\u0010'\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\rHÆ\u0003¢\u0006\u0004\b'\u0010(J&\u0010)\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\u0010HÆ\u0003¢\u0006\u0004\b)\u0010(J&\u0010*\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\u0013HÆ\u0003¢\u0006\u0004\b*\u0010(J \u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\tj\u0002`\u0017HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0012\u0010,\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\b0\u00101JÊ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001e\b\u0002\u0010\u000e\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\r2\u001e\b\u0002\u0010\u0011\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\u00102\u001e\b\u0002\u0010\u0014\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\u00132\u0018\b\u0002\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\tj\u0002`\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dHÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010=\u001a\u00020<HÖ\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010&R0\u0010\u000e\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010(R0\u0010\u0011\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bG\u0010(R0\u0010\u0014\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n\u0012\u0004\u0012\u00020\f0\tj\u0002`\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bH\u0010(R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\tj\u0002`\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bI\u0010(R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010J\u001a\u0004\bK\u0010-R\u001a\u0010\u001c\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010L\u001a\u0004\bM\u0010/R\u001a\u0010\u001e\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010N\u001a\u0004\bO\u00101"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "accountSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;", "balanceModuleUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/transactionitem/TransactionItemUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recentactivites/RecentActivitiesSectionUiState;", "recentActivitiesSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/UnEnrolledAccountFeatureRowUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/accountfeatures/AccountFeaturesSectionUiState;", "accountFeaturesSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/specialfinancing/SpecialFinancingSectionUiState;", "specialFinancingSectionUiState", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/prioritizedaccountactionmodule/PrioritizedAccountActionSectionUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/prioritizedaccountactionmodule/PrioritizedAccountActionSectionUiState;", "prioritizedAccountActionSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "starPayWalletOverview", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;", "bottomSheetToShow", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;", "cashbackRewardUiModel", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "component9", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;", "component10", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "getAccountSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;", "getBalanceModuleUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "getRecentActivitiesSection", "getAccountFeaturesSection", "getSpecialFinancingSectionUiState", "getPrioritizedAccountActionSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "getStarPayWalletOverview", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;", "getBottomSheetToShow", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;", "getCashbackRewardUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoaded extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountFeaturesSection;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummary;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType bottomSheetToShow;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> prioritizedAccountActionSection;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState recentActivitiesSection;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState specialFinancingSectionUiState;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnDataLoaded(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState2, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState3, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, ? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> accountSummarySectionUiState4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType accountSummaryBottomSheetType, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel) {
            super("OnDataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryOverView, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryBottomSheetType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashbackRewardUiModel, "");
            this.creditProductIdentifier = creditProductIdentifier;
            this.accountSummary = accountSummaryOverView;
            this.balanceModuleUiModel = balanceModuleUiModel;
            this.recentActivitiesSection = accountSummarySectionUiState;
            this.accountFeaturesSection = accountSummarySectionUiState2;
            this.specialFinancingSectionUiState = accountSummarySectionUiState3;
            this.prioritizedAccountActionSection = accountSummarySectionUiState4;
            this.starPayWalletOverview = starPayWalletOverview;
            this.bottomSheetToShow = accountSummaryBottomSheetType;
            this.cashbackRewardUiModel = cashbackRewardUiModel;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView getAccountSummary() {
            return this.accountSummary;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel getBalanceModuleUiModel() {
            return this.balanceModuleUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getRecentActivitiesSection() {
            return this.recentActivitiesSection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getAccountFeaturesSection() {
            return this.accountFeaturesSection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getSpecialFinancingSectionUiState() {
            return this.specialFinancingSectionUiState;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> getPrioritizedAccountActionSection() {
            return this.prioritizedAccountActionSection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview getStarPayWalletOverview() {
            return this.starPayWalletOverview;
        }

        public /* synthetic */ OnDataLoaded(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState2, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState3, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType accountSummaryBottomSheetType, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditProductIdentifier, accountSummaryOverView, balanceModuleUiModel, accountSummarySectionUiState, accountSummarySectionUiState2, accountSummarySectionUiState3, accountSummarySectionUiState4, (i & 128) != 0 ? null : starPayWalletOverview, (i & 256) != 0 ? com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.None.INSTANCE : accountSummaryBottomSheetType, cashbackRewardUiModel);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType getBottomSheetToShow() {
            return this.bottomSheetToShow;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel getCashbackRewardUiModel() {
            return this.cashbackRewardUiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView = this.accountSummary;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = this.balanceModuleUiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState = this.recentActivitiesSection;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState2 = this.accountFeaturesSection;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState3 = this.specialFinancingSectionUiState;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> accountSummarySectionUiState4 = this.prioritizedAccountActionSection;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview = this.starPayWalletOverview;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType accountSummaryBottomSheetType = this.bottomSheetToShow;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel = this.cashbackRewardUiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDataLoaded(creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", accountSummary=");
            sb.append(accountSummaryOverView);
            sb.append(", balanceModuleUiModel=");
            sb.append(balanceModuleUiModel);
            sb.append(", recentActivitiesSection=");
            sb.append(accountSummarySectionUiState);
            sb.append(", accountFeaturesSection=");
            sb.append(accountSummarySectionUiState2);
            sb.append(", specialFinancingSectionUiState=");
            sb.append(accountSummarySectionUiState3);
            sb.append(", prioritizedAccountActionSection=");
            sb.append(accountSummarySectionUiState4);
            sb.append(", starPayWalletOverview=");
            sb.append(starPayWalletOverview);
            sb.append(", bottomSheetToShow=");
            sb.append(accountSummaryBottomSheetType);
            sb.append(", cashbackRewardUiModel=");
            sb.append(cashbackRewardUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.creditProductIdentifier.hashCode();
            int hashCode2 = this.accountSummary.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = this.balanceModuleUiModel;
            int hashCode3 = balanceModuleUiModel == null ? 0 : balanceModuleUiModel.hashCode();
            int hashCode4 = this.recentActivitiesSection.hashCode();
            int hashCode5 = this.accountFeaturesSection.hashCode();
            int hashCode6 = this.specialFinancingSectionUiState.hashCode();
            int hashCode7 = this.prioritizedAccountActionSection.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview = this.starPayWalletOverview;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (starPayWalletOverview != null ? starPayWalletOverview.hashCode() : 0)) * 31) + this.bottomSheetToShow.hashCode()) * 31) + this.cashbackRewardUiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded onDataLoaded = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded) other;
            return this.creditProductIdentifier == onDataLoaded.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.accountSummary, onDataLoaded.accountSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceModuleUiModel, onDataLoaded.balanceModuleUiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentActivitiesSection, onDataLoaded.recentActivitiesSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountFeaturesSection, onDataLoaded.accountFeaturesSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.specialFinancingSectionUiState, onDataLoaded.specialFinancingSectionUiState) && kotlin.jvm.internal.Intrinsics.areEqual(this.prioritizedAccountActionSection, onDataLoaded.prioritizedAccountActionSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.starPayWalletOverview, onDataLoaded.starPayWalletOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetToShow, onDataLoaded.bottomSheetToShow) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashbackRewardUiModel, onDataLoaded.cashbackRewardUiModel);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummary, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState recentActivitiesSection, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountFeaturesSection, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState specialFinancingSectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, ? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> prioritizedAccountActionSection, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType bottomSheetToShow, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummary, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentActivitiesSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountFeaturesSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingSectionUiState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prioritizedAccountActionSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetToShow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashbackRewardUiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded(creditProductIdentifier, accountSummary, balanceModuleUiModel, recentActivitiesSection, accountFeaturesSection, specialFinancingSectionUiState, prioritizedAccountActionSection, starPayWalletOverview, bottomSheetToShow, cashbackRewardUiModel);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType getBottomSheetToShow() {
            return this.bottomSheetToShow;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview getStarPayWalletOverview() {
            return this.starPayWalletOverview;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> component7() {
            return this.prioritizedAccountActionSection;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getSpecialFinancingSectionUiState() {
            return this.specialFinancingSectionUiState;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getAccountFeaturesSection() {
            return this.accountFeaturesSection;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getRecentActivitiesSection() {
            return this.recentActivitiesSection;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel getBalanceModuleUiModel() {
            return this.balanceModuleUiModel;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView getAccountSummary() {
            return this.accountSummary;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel getCashbackRewardUiModel() {
            return this.cashbackRewardUiModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoadFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoadFailed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoadFailed();

        public final int hashCode() {
            return -984181458;
        }

        private OnDataLoadFailed() {
            super("OnDataLoadFailed", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnDataLoadFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoadFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnAppUpdateNeeded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAppUpdateNeeded extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAppUpdateNeeded INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAppUpdateNeeded();

        public final int hashCode() {
            return 869688734;
        }

        private OnAppUpdateNeeded() {
            super("OnAppUpdateNeeded", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnAppUpdateNeeded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAppUpdateNeeded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnRecurringAccountItemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recurringaccountactionsmodule/RecurringAccountItemType;", "recurringAccountItemType", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recurringaccountactionsmodule/RecurringAccountItemType;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recurringaccountactionsmodule/RecurringAccountItemType;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recurringaccountactionsmodule/RecurringAccountItemType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnRecurringAccountItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recurringaccountactionsmodule/RecurringAccountItemType;", "getRecurringAccountItemType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRecurringAccountItemClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType recurringAccountItemType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRecurringAccountItemClicked(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType recurringAccountItemType) {
            super("OnRecurringAccountItemClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringAccountItemType, "");
            this.recurringAccountItemType = recurringAccountItemType;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType getRecurringAccountItemType() {
            return this.recurringAccountItemType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType recurringAccountItemType = this.recurringAccountItemType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRecurringAccountItemClicked(recurringAccountItemType=");
            sb.append(recurringAccountItemType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.recurringAccountItemType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecurringAccountItemClicked) && this.recurringAccountItemType == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecurringAccountItemClicked) other).recurringAccountItemType;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecurringAccountItemClicked copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType recurringAccountItemType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringAccountItemType, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecurringAccountItemClicked(recurringAccountItemType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType getRecurringAccountItemType() {
            return this.recurringAccountItemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecurringAccountItemClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecurringAccountItemClicked onRecurringAccountItemClicked, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType recurringAccountItemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                recurringAccountItemType = onRecurringAccountItemClicked.recurringAccountItemType;
            }
            return onRecurringAccountItemClicked.copy(recurringAccountItemType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnSeeAllActivitiesButtonClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSeeAllActivitiesButtonClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllActivitiesButtonClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllActivitiesButtonClicked();

        public final int hashCode() {
            return 1306781241;
        }

        private OnSeeAllActivitiesButtonClicked() {
            super("OnSeeAllActivities", null);
        }

        public final java.lang.String toString() {
            return "OnSeeAllActivitiesButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllActivitiesButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnRecentActivityClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "transaction", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnRecentActivityClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "getTransaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRecentActivityClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRecentActivityClicked(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction) {
            super("OnRecentActivityClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
            this.transaction = transaction;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction getTransaction() {
            return this.transaction;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction = this.transaction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRecentActivityClicked(transaction=");
            sb.append(transaction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transaction.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecentActivityClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.transaction, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecentActivityClicked) other).transaction);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecentActivityClicked copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecentActivityClicked(transaction);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction getTransaction() {
            return this.transaction;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecentActivityClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecentActivityClicked onRecentActivityClicked, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transaction = onRecentActivityClicked.transaction;
            }
            return onRecentActivityClicked.copy(transaction);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnSeeAllSpecialFinancingButtonClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSeeAllSpecialFinancingButtonClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllSpecialFinancingButtonClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllSpecialFinancingButtonClicked();

        public final int hashCode() {
            return -1583885400;
        }

        private OnSeeAllSpecialFinancingButtonClicked() {
            super("OnSeeAllSpecialFinancingButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "OnSeeAllSpecialFinancingButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllSpecialFinancingButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnSpecialFinancingItemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "", "promoId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnSpecialFinancingItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPromoId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSpecialFinancingItemClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        private final java.lang.String promoId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSpecialFinancingItemClicked(java.lang.String str) {
            super("OnSpecialFinancingItemClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.promoId = str;
        }

        public final java.lang.String getPromoId() {
            return this.promoId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.promoId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSpecialFinancingItemClicked(promoId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.promoId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSpecialFinancingItemClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.promoId, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSpecialFinancingItemClicked) other).promoId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSpecialFinancingItemClicked copy(java.lang.String promoId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSpecialFinancingItemClicked(promoId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPromoId() {
            return this.promoId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSpecialFinancingItemClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSpecialFinancingItemClicked onSpecialFinancingItemClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSpecialFinancingItemClicked.promoId;
            }
            return onSpecialFinancingItemClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnMakePaymentClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMakePaymentClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnMakePaymentClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnMakePaymentClicked();

        public final int hashCode() {
            return 1519090032;
        }

        private OnMakePaymentClicked() {
            super("OnMakePaymentClicked", null);
        }

        public final java.lang.String toString() {
            return "OnMakePaymentClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnMakePaymentClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnNavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateBack();

        public final int hashCode() {
            return -478869671;
        }

        private OnNavigateBack() {
            super("OnNavigateBack", null);
        }

        public final java.lang.String toString() {
            return "OnNavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnInfoMessageClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInfoMessageClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnInfoMessageClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnInfoMessageClicked();

        public final int hashCode() {
            return -368335089;
        }

        private OnInfoMessageClicked() {
            super("OnInfoMessageClicked", null);
        }

        public final java.lang.String toString() {
            return "OnInfoMessageClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnInfoMessageClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnViewAutopayClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewAutopayClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewAutopayClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewAutopayClicked();

        public final int hashCode() {
            return 966825972;
        }

        private OnViewAutopayClicked() {
            super("OnViewAutopayClicked", null);
        }

        public final java.lang.String toString() {
            return "OnViewAutopayClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewAutopayClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDetailsPageClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDetailsPageClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDetailsPageClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDetailsPageClick(java.lang.String str) {
            super("OnDetailsPageClick", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDetailsPageClick(url=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDetailsPageClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDetailsPageClick) other).url);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDetailsPageClick copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDetailsPageClick(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDetailsPageClick copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDetailsPageClick onDetailsPageClick, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onDetailsPageClick.url;
            }
            return onDetailsPageClick.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPhoneNumberClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPhoneNumberClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPhoneNumberClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPhoneNumberClick(java.lang.String str) {
            super("OnPhoneNumberClick", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPhoneNumberClick(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPhoneNumberClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPhoneNumberClick) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPhoneNumberClick copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPhoneNumberClick(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPhoneNumberClick copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPhoneNumberClick onPhoneNumberClick, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPhoneNumberClick.phoneNumber;
            }
            return onPhoneNumberClick.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnAmountToAvoidInterestInfoClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;", "url", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnAmountToAvoidInterestInfoClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAmountToAvoidInterestInfoClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAmountToAvoidInterestInfoClicked(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
            super("OnAmountToAvoidInterestInfoClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUrl, "");
            this.url = contentUrl;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAmountToAvoidInterestInfoClicked(url=");
            sb.append(contentUrl);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAmountToAvoidInterestInfoClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAmountToAvoidInterestInfoClicked) other).url);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAmountToAvoidInterestInfoClicked copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAmountToAvoidInterestInfoClicked(url);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAmountToAvoidInterestInfoClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAmountToAvoidInterestInfoClicked onAmountToAvoidInterestInfoClicked, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contentUrl = onAmountToAvoidInterestInfoClicked.url;
            }
            return onAmountToAvoidInterestInfoClicked.copy(contentUrl);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnCashbackRewardClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCashbackRewardClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCashbackRewardClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCashbackRewardClicked();

        public final int hashCode() {
            return 1994364221;
        }

        private OnCashbackRewardClicked() {
            super("OnCashbackRewardClicked", null);
        }

        public final java.lang.String toString() {
            return "OnCashbackRewardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCashbackRewardClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnCardActivationClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCardActivationClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCardActivationClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCardActivationClicked();

        public final int hashCode() {
            return -918258496;
        }

        private OnCardActivationClicked() {
            super("OnCardActivationClicked", null);
        }

        public final java.lang.String toString() {
            return "OnCardActivationClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCardActivationClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPaymentsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentsClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPaymentsClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPaymentsClicked();

        public final int hashCode() {
            return 1107847993;
        }

        private OnPaymentsClicked() {
            super("OnPaymentsClicked", null);
        }

        public final java.lang.String toString() {
            return "OnPaymentsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPaymentsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPrioritizedAccountActionClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "", "actionName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPrioritizedAccountActionClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getActionName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPrioritizedAccountActionClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        private final java.lang.String actionName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPrioritizedAccountActionClicked(java.lang.String str) {
            super("OnPrioritizedAccountActionClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.actionName = str;
        }

        public final java.lang.String getActionName() {
            return this.actionName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.actionName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPrioritizedAccountActionClicked(actionName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.actionName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionName, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionClicked) other).actionName);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionClicked copy(java.lang.String actionName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionName, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionClicked(actionName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getActionName() {
            return this.actionName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionClicked onPrioritizedAccountActionClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPrioritizedAccountActionClicked.actionName;
            }
            return onPrioritizedAccountActionClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPrioritizedAccountActionDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "", "actionName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPrioritizedAccountActionDismissed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getActionName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPrioritizedAccountActionDismissed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        private final java.lang.String actionName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPrioritizedAccountActionDismissed(java.lang.String str) {
            super("OnPrioritizedAccountActionDismissed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.actionName = str;
        }

        public final java.lang.String getActionName() {
            return this.actionName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.actionName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPrioritizedAccountActionDismissed(actionName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.actionName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionDismissed) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionName, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionDismissed) other).actionName);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionDismissed copy(java.lang.String actionName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionName, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionDismissed(actionName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getActionName() {
            return this.actionName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionDismissed copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionDismissed onPrioritizedAccountActionDismissed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPrioritizedAccountActionDismissed.actionName;
            }
            return onPrioritizedAccountActionDismissed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnNavigateToPrioritizedAccountActionDestination;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnNavigateToPrioritizedAccountActionDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNavigateToPrioritizedAccountActionDestination extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnNavigateToPrioritizedAccountActionDestination(androidx.navigation3.runtime.NavKey navKey) {
            super("OnNavigateToPrioritizedAccountActionDestination", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destination = navKey;
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnNavigateToPrioritizedAccountActionDestination(destination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToPrioritizedAccountActionDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToPrioritizedAccountActionDestination) other).destination);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToPrioritizedAccountActionDestination copy(androidx.navigation3.runtime.NavKey destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToPrioritizedAccountActionDestination(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToPrioritizedAccountActionDestination copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToPrioritizedAccountActionDestination onNavigateToPrioritizedAccountActionDestination, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = onNavigateToPrioritizedAccountActionDestination.destination;
            }
            return onNavigateToPrioritizedAccountActionDestination.copy(navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnNavigateToAccountFeatureDestination;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnNavigateToAccountFeatureDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNavigateToAccountFeatureDestination extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnNavigateToAccountFeatureDestination(androidx.navigation3.runtime.NavKey navKey) {
            super("OnNavigateToAccountFeatureDestination", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destination = navKey;
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnNavigateToAccountFeatureDestination(destination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToAccountFeatureDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToAccountFeatureDestination) other).destination);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToAccountFeatureDestination copy(androidx.navigation3.runtime.NavKey destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToAccountFeatureDestination(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToAccountFeatureDestination copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToAccountFeatureDestination onNavigateToAccountFeatureDestination, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = onNavigateToAccountFeatureDestination.destination;
            }
            return onNavigateToAccountFeatureDestination.copy(navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnAccountFeatureClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "", "featureId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnAccountFeatureClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFeatureId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAccountFeatureClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        private final java.lang.String featureId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAccountFeatureClicked(java.lang.String str) {
            super("OnAccountFeatureClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.featureId = str;
        }

        public final java.lang.String getFeatureId() {
            return this.featureId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.featureId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAccountFeatureClicked(featureId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.featureId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAccountFeatureClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.featureId, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAccountFeatureClicked) other).featureId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAccountFeatureClicked copy(java.lang.String featureId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAccountFeatureClicked(featureId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFeatureId() {
            return this.featureId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAccountFeatureClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAccountFeatureClicked onAccountFeatureClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAccountFeatureClicked.featureId;
            }
            return onAccountFeatureClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnSeeAllAccountFeaturesClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSeeAllAccountFeaturesClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllAccountFeaturesClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllAccountFeaturesClicked();

        public final int hashCode() {
            return 1196787852;
        }

        private OnSeeAllAccountFeaturesClicked() {
            super("OnSeeAllAccountFeaturesClicked", null);
        }

        public final java.lang.String toString() {
            return "OnSeeAllAccountFeaturesClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllAccountFeaturesClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnFullScreenErrorButtonClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;", "error", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnFullScreenErrorButtonClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFullScreenErrorButtonClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFullScreenErrorButtonClicked(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel accountSummaryFullScreenErrorUiModel) {
            super("OnFullScreenErrorButtonClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryFullScreenErrorUiModel, "");
            this.error = accountSummaryFullScreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel accountSummaryFullScreenErrorUiModel = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFullScreenErrorButtonClicked(error=");
            sb.append(accountSummaryFullScreenErrorUiModel);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnFullScreenErrorButtonClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnFullScreenErrorButtonClicked) other).error);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnFullScreenErrorButtonClicked copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnFullScreenErrorButtonClicked(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnFullScreenErrorButtonClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnFullScreenErrorButtonClicked onFullScreenErrorButtonClicked, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel accountSummaryFullScreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                accountSummaryFullScreenErrorUiModel = onFullScreenErrorButtonClicked.error;
            }
            return onFullScreenErrorButtonClicked.copy(accountSummaryFullScreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPushToWalletClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPushToWalletClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletClicked();

        public final int hashCode() {
            return -2055846856;
        }

        private OnPushToWalletClicked() {
            super("OnPushToWalletClicked", null);
        }

        public final java.lang.String toString() {
            return "OnPushToWalletClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPushToWalletFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;", "error", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnPushToWalletFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPushToWalletFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPushToWalletFailed(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError pushToWalletError) {
            super("OnPushToWalletFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushToWalletError, "");
            this.error = pushToWalletError;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError pushToWalletError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPushToWalletFailed(error=");
            sb.append(pushToWalletError);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletFailed) other).error);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletFailed copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletFailed copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletFailed onPushToWalletFailed, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError pushToWalletError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pushToWalletError = onPushToWalletFailed.error;
            }
            return onPushToWalletFailed.copy(pushToWalletError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnRequestVirtualCardClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRequestVirtualCardClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRequestVirtualCardClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRequestVirtualCardClicked();

        public final int hashCode() {
            return -1492843494;
        }

        private OnRequestVirtualCardClicked() {
            super("OnRequestVirtualCardClicked", null);
        }

        public final java.lang.String toString() {
            return "OnRequestVirtualCardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRequestVirtualCardClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnBottomSheetDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBottomSheetDismissed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnBottomSheetDismissed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnBottomSheetDismissed();

        public final int hashCode() {
            return 1846319478;
        }

        private OnBottomSheetDismissed() {
            super("OnBottomSheetDismissed", null);
        }

        public final java.lang.String toString() {
            return "OnBottomSheetDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnBottomSheetDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnAutopayUpdateReceived;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAutopayUpdateReceived extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAutopayUpdateReceived INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAutopayUpdateReceived();

        public final int hashCode() {
            return -1070002558;
        }

        private OnAutopayUpdateReceived() {
            super("OnAutopayUpdateReceived", null);
        }

        public final java.lang.String toString() {
            return "OnAutopayUpdateReceived";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAutopayUpdateReceived)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnCreditDisclosureCompleted;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCreditDisclosureCompleted extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCreditDisclosureCompleted INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCreditDisclosureCompleted();

        public final int hashCode() {
            return 1702413156;
        }

        private OnCreditDisclosureCompleted() {
            super("OnCreditDisclosureCompleted", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnCreditDisclosureCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCreditDisclosureCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnCreditDisclosureFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCreditDisclosureFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCreditDisclosureFailed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCreditDisclosureFailed();

        public final int hashCode() {
            return -211122748;
        }

        private OnCreditDisclosureFailed() {
            super("OnCreditDisclosureFailed", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnCreditDisclosureFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCreditDisclosureFailed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AccountSummaryEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
