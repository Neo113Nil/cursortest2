package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "DismissScreen", "DismissScreenAfterRedemption", "OpenTermsUrl", "ShowTermsBottomSheet", "NavigateToActivity", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$DismissScreen;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$DismissScreenAfterRedemption;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$NavigateToActivity;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$OpenTermsUrl;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$ShowTermsBottomSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class RedeemUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RedeemUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$DismissScreen;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissScreen extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreen INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreen();

        public final int hashCode() {
            return 2113488108;
        }

        private DismissScreen() {
            super("DismissScreen", null);
        }

        public final java.lang.String toString() {
            return "DismissScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$DismissScreenAfterRedemption;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissScreenAfterRedemption extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreenAfterRedemption INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreenAfterRedemption();

        public final int hashCode() {
            return -1922980197;
        }

        private DismissScreenAfterRedemption() {
            super("DismissScreenAfterRedemption", null);
        }

        public final java.lang.String toString() {
            return "DismissScreenAfterRedemption";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreenAfterRedemption)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$OpenTermsUrl;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$OpenTermsUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenTermsUrl extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenTermsUrl(java.lang.String str) {
            super("OpenTermsUrl", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenTermsUrl(url=");
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
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.OpenTermsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.OpenTermsUrl) other).url);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.OpenTermsUrl copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.OpenTermsUrl(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.OpenTermsUrl copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.OpenTermsUrl openTermsUrl, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openTermsUrl.url;
            }
            return openTermsUrl.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$ShowTermsBottomSheet;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$ShowTermsBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowTermsBottomSheet extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTermsBottomSheet(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType) {
            super("ShowTermsBottomSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            this.redeemType = redeemType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowTermsBottomSheet(redeemType=");
            sb.append(redeemType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.redeemType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.ShowTermsBottomSheet) && this.redeemType == ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.ShowTermsBottomSheet) other).redeemType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.ShowTermsBottomSheet copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.ShowTermsBottomSheet(redeemType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.ShowTermsBottomSheet copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.ShowTermsBottomSheet showTermsBottomSheet, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                redeemType = showTermsBottomSheet.redeemType;
            }
            return showTermsBottomSheet.copy(redeemType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect$NavigateToActivity;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToActivity extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.NavigateToActivity INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.NavigateToActivity();

        public final int hashCode() {
            return 1276326757;
        }

        private NavigateToActivity() {
            super("NavigateToActivity", null);
        }

        public final java.lang.String toString() {
            return "NavigateToActivity";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.NavigateToActivity)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ RedeemUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
