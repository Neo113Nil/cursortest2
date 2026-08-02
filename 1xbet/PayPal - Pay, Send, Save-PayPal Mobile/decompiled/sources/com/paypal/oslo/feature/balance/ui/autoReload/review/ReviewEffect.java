package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEffect;", "", "<init>", "()V", "GoBackWithResult", "ShowAddFlowFailToast", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEffect$GoBackWithResult;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEffect$ShowAddFlowFailToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ReviewEffect {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEffect$GoBackWithResult;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEffect;", "Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;)Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEffect$GoBackWithResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoBackWithResult extends com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoBackWithResult(com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowNavResult, "");
            this.result = autoReloadFlowNavResult;
        }

        public final com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GoBackWithResult(result=");
            sb.append(autoReloadFlowNavResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect.GoBackWithResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect.GoBackWithResult) other).result);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect.GoBackWithResult copy(com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect.GoBackWithResult(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect.GoBackWithResult copy$default(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect.GoBackWithResult goBackWithResult, com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoReloadFlowNavResult = goBackWithResult.result;
            }
            return goBackWithResult.copy(autoReloadFlowNavResult);
        }
    }

    private ReviewEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEffect$ShowAddFlowFailToast;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowAddFlowFailToast extends com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect.ShowAddFlowFailToast INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect.ShowAddFlowFailToast();

        public final int hashCode() {
            return 2073085237;
        }

        private ShowAddFlowFailToast() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShowAddFlowFailToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect.ShowAddFlowFailToast)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ReviewEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
