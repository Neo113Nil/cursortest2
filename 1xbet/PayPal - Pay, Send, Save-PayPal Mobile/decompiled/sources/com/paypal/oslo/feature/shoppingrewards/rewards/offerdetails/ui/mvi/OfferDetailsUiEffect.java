package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "DismissBottomSheetWithResult", "DismissBottomSheet", "NavigateToTerms", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect$DismissBottomSheet;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect$DismissBottomSheetWithResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect$NavigateToTerms;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class OfferDetailsUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect$DismissBottomSheetWithResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissBottomSheetWithResult extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheetWithResult INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheetWithResult();

        public final int hashCode() {
            return 1070497059;
        }

        private DismissBottomSheetWithResult() {
            super("DismissBottomSheetWithResult", null);
        }

        public final java.lang.String toString() {
            return "DismissBottomSheetWithResult";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheetWithResult)) {
                return false;
            }
            return true;
        }
    }

    private OfferDetailsUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect$DismissBottomSheet;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissBottomSheet extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheet INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheet();

        public final int hashCode() {
            return -1210775424;
        }

        private DismissBottomSheet() {
            super("DismissBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect$NavigateToTerms;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect$NavigateToTerms;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToTerms extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToTerms(java.lang.String str) {
            super("NavigateToTerms", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToTerms(url=");
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
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.NavigateToTerms) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.NavigateToTerms) other).url);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.NavigateToTerms copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.NavigateToTerms(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.NavigateToTerms copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.NavigateToTerms navigateToTerms, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToTerms.url;
            }
            return navigateToTerms.copy(str);
        }
    }

    public /* synthetic */ OfferDetailsUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
