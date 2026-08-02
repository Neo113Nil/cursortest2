package com.paypal.oslo.feature.p2p.ui.crossborder.effects;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/effects/CrossBorderEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToReview", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/effects/CrossBorderEffect$NavigateToReview;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CrossBorderEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CrossBorderEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJD\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/effects/CrossBorderEffect$NavigateToReview;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/effects/CrossBorderEffect;", "", "amount", "sendAmount", "intent", "fxQuoteId", "receiveCurrencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/crossborder/effects/CrossBorderEffect$NavigateToReview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "getSendAmount", "getIntent", "getFxQuoteId", "getReceiveCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReview extends com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String fxQuoteId;
        private final java.lang.String intent;
        private final java.lang.String receiveCurrencyCode;
        private final java.lang.String sendAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReview(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            super("NavigateToReview", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.amount = str;
            this.sendAmount = str2;
            this.intent = str3;
            this.fxQuoteId = str4;
            this.receiveCurrencyCode = str5;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getSendAmount() {
            return this.sendAmount;
        }

        public final java.lang.String getIntent() {
            return this.intent;
        }

        public final java.lang.String getFxQuoteId() {
            return this.fxQuoteId;
        }

        public final java.lang.String getReceiveCurrencyCode() {
            return this.receiveCurrencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.String str2 = this.sendAmount;
            java.lang.String str3 = this.intent;
            java.lang.String str4 = this.fxQuoteId;
            java.lang.String str5 = this.receiveCurrencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReview(amount=");
            sb.append(str);
            sb.append(", sendAmount=");
            sb.append(str2);
            sb.append(", intent=");
            sb.append(str3);
            sb.append(", fxQuoteId=");
            sb.append(str4);
            sb.append(", receiveCurrencyCode=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            int hashCode2 = this.sendAmount.hashCode();
            int hashCode3 = this.intent.hashCode();
            java.lang.String str = this.fxQuoteId;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.receiveCurrencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect.NavigateToReview)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect.NavigateToReview navigateToReview = (com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect.NavigateToReview) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, navigateToReview.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendAmount, navigateToReview.sendAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, navigateToReview.intent) && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuoteId, navigateToReview.fxQuoteId) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveCurrencyCode, navigateToReview.receiveCurrencyCode);
        }

        public final com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect.NavigateToReview copy(java.lang.String amount, java.lang.String sendAmount, java.lang.String intent, java.lang.String fxQuoteId, java.lang.String receiveCurrencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveCurrencyCode, "");
            return new com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect.NavigateToReview(amount, sendAmount, intent, fxQuoteId, receiveCurrencyCode);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getReceiveCurrencyCode() {
            return this.receiveCurrencyCode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFxQuoteId() {
            return this.fxQuoteId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getIntent() {
            return this.intent;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSendAmount() {
            return this.sendAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect.NavigateToReview copy$default(com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect.NavigateToReview navigateToReview, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToReview.amount;
            }
            if ((i & 2) != 0) {
                str2 = navigateToReview.sendAmount;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = navigateToReview.intent;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = navigateToReview.fxQuoteId;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = navigateToReview.receiveCurrencyCode;
            }
            return navigateToReview.copy(str, str6, str7, str8, str5);
        }
    }

    public /* synthetic */ CrossBorderEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
