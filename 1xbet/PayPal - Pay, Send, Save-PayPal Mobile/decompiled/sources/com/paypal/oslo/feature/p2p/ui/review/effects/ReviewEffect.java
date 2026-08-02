package com.paypal.oslo.feature.p2p.ui.review.effects;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToConversionOptions", "NavigateToSuccess", "NavigateToSearchContacts", "ShowError", "NavigateToNetworkError", "OpenDisclosureLink", "NavigateToConfirmBank", "FundingOptionsRefreshed", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$FundingOptionsRefreshed;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateBack;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToConfirmBank;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToConversionOptions;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToNetworkError;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToSearchContacts;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToSuccess;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$OpenDisclosureLink;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$ShowError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ReviewEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ReviewEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateBack;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateBack();

        public final int hashCode() {
            return 434784900;
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToConversionOptions;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToConversionOptions extends com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConversionOptions INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConversionOptions();

        public final int hashCode() {
            return 243783728;
        }

        private NavigateToConversionOptions() {
            super("NavigateToConversionOptions", null);
        }

        public final java.lang.String toString() {
            return "NavigateToConversionOptions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConversionOptions)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToSuccess;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;", "result", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "transferAmount", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "contact", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "component3", "()Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;)Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;", "getResult", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "getTransferAmount", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "getContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSuccess extends com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem contact;
        private final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult result;
        private final com.paypal.oslo.feature.p2p.domain.model.Amount transferAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToSuccess(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult paymentTransferResult, com.paypal.oslo.feature.p2p.domain.model.Amount amount, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem) {
            super("NavigateToSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferResult, "");
            this.result = paymentTransferResult;
            this.transferAmount = amount;
            this.contact = p2PContactItem;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult getResult() {
            return this.result;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.Amount getTransferAmount() {
            return this.transferAmount;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem getContact() {
            return this.contact;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult paymentTransferResult = this.result;
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.transferAmount;
            com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem = this.contact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSuccess(result=");
            sb.append(paymentTransferResult);
            sb.append(", transferAmount=");
            sb.append(amount);
            sb.append(", contact=");
            sb.append(p2PContactItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.result.hashCode();
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.transferAmount;
            int hashCode2 = amount == null ? 0 : amount.hashCode();
            com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem = this.contact;
            return (((hashCode * 31) + hashCode2) * 31) + (p2PContactItem != null ? p2PContactItem.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSuccess navigateToSuccess = (com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.result, navigateToSuccess.result) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAmount, navigateToSuccess.transferAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.contact, navigateToSuccess.contact);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSuccess copy(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult result, com.paypal.oslo.feature.p2p.domain.model.Amount transferAmount, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem contact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSuccess(result, transferAmount, contact);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem getContact() {
            return this.contact;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.Amount getTransferAmount() {
            return this.transferAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSuccess copy$default(com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSuccess navigateToSuccess, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult paymentTransferResult, com.paypal.oslo.feature.p2p.domain.model.Amount amount, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferResult = navigateToSuccess.result;
            }
            if ((i & 2) != 0) {
                amount = navigateToSuccess.transferAmount;
            }
            if ((i & 4) != 0) {
                p2PContactItem = navigateToSuccess.contact;
            }
            return navigateToSuccess.copy(paymentTransferResult, amount, p2PContactItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToSearchContacts;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "intent", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;)Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToSearchContacts;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSearchContacts extends com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToSearchContacts(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent) {
            super("NavigateToSearchContacts", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
            this.intent = paymentTransferIntent;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSearchContacts(intent=");
            sb.append(paymentTransferIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.intent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSearchContacts) && this.intent == ((com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSearchContacts) other).intent;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSearchContacts copy(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSearchContacts(intent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent getIntent() {
            return this.intent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSearchContacts copy$default(com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSearchContacts navigateToSearchContacts, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferIntent = navigateToSearchContacts.intent;
            }
            return navigateToSearchContacts.copy(paymentTransferIntent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$ShowError;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;", "Lcom/paypal/oslo/feature/p2p/ui/UiText;", "message", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/UiText;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/UiText;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/UiText;)Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$ShowError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/UiText;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowError extends com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.UiText message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(com.paypal.oslo.feature.p2p.ui.UiText uiText) {
            super("ShowError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiText, "");
            this.message = uiText;
        }

        public final com.paypal.oslo.feature.p2p.ui.UiText getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.UiText uiText = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowError(message=");
            sb.append(uiText);
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
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.ShowError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.ShowError) other).message);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.ShowError copy(com.paypal.oslo.feature.p2p.ui.UiText message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.ShowError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.UiText getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.ShowError copy$default(com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.ShowError showError, com.paypal.oslo.feature.p2p.ui.UiText uiText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiText = showError.message;
            }
            return showError.copy(uiText);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToNetworkError;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToNetworkError extends com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToNetworkError INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToNetworkError();

        public final int hashCode() {
            return -575808526;
        }

        private NavigateToNetworkError() {
            super("NavigateToNetworkError", null);
        }

        public final java.lang.String toString() {
            return "NavigateToNetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToNetworkError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$OpenDisclosureLink;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;", "", "linkUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$OpenDisclosureLink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLinkUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenDisclosureLink extends com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect {
        public static final int $stable = 0;
        private final java.lang.String linkUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenDisclosureLink(java.lang.String str) {
            super("OpenDisclosureLink", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.linkUrl = str;
        }

        public final java.lang.String getLinkUrl() {
            return this.linkUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.linkUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenDisclosureLink(linkUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.linkUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.OpenDisclosureLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkUrl, ((com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.OpenDisclosureLink) other).linkUrl);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.OpenDisclosureLink copy(java.lang.String linkUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkUrl, "");
            return new com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.OpenDisclosureLink(linkUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLinkUrl() {
            return this.linkUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.OpenDisclosureLink copy$default(com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.OpenDisclosureLink openDisclosureLink, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openDisclosureLink.linkUrl;
            }
            return openDisclosureLink.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToConfirmBank;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;", "bankFundingSource", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;)Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$NavigateToConfirmBank;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;", "getBankFundingSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToConfirmBank extends com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.FundingSource bankFundingSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConfirmBank(com.paypal.oslo.feature.p2p.domain.model.FundingSource fundingSource) {
            super("NavigateToConfirmBank", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSource, "");
            this.bankFundingSource = fundingSource;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FundingSource getBankFundingSource() {
            return this.bankFundingSource;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.FundingSource fundingSource = this.bankFundingSource;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToConfirmBank(bankFundingSource=");
            sb.append(fundingSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.bankFundingSource.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConfirmBank) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankFundingSource, ((com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConfirmBank) other).bankFundingSource);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConfirmBank copy(com.paypal.oslo.feature.p2p.domain.model.FundingSource bankFundingSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankFundingSource, "");
            return new com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConfirmBank(bankFundingSource);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FundingSource getBankFundingSource() {
            return this.bankFundingSource;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConfirmBank copy$default(com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConfirmBank navigateToConfirmBank, com.paypal.oslo.feature.p2p.domain.model.FundingSource fundingSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingSource = navigateToConfirmBank.bankFundingSource;
            }
            return navigateToConfirmBank.copy(fundingSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$FundingOptionsRefreshed;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "fundingOptions", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect$FundingOptionsRefreshed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "getFundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingOptionsRefreshed extends com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FundingOptionsRefreshed(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
            super("FundingOptionsRefreshed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
            this.fundingOptions = fundingOptions;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.fundingOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingOptionsRefreshed(fundingOptions=");
            sb.append(fundingOptions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.FundingOptionsRefreshed) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptions, ((com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.FundingOptionsRefreshed) other).fundingOptions);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.FundingOptionsRefreshed copy(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
            return new com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.FundingOptionsRefreshed(fundingOptions);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.FundingOptionsRefreshed copy$default(com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.FundingOptionsRefreshed fundingOptionsRefreshed, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingOptions = fundingOptionsRefreshed.fundingOptions;
            }
            return fundingOptionsRefreshed.copy(fundingOptions);
        }
    }

    public /* synthetic */ ReviewEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
