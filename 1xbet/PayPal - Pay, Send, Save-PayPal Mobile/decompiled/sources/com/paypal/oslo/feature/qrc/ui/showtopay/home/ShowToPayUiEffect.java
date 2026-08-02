package com.paypal.oslo.feature.qrc.ui.showtopay.home;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToLoading", "NavigateToEnterAmount", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect$NavigateToEnterAmount;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect$NavigateToLoading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ShowToPayUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ShowToPayUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect$NavigateToLoading;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect;", "", "titleRes", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect$NavigateToLoading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLoading extends com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect {
        public static final int $stable = 0;
        private final int titleRes;

        public NavigateToLoading(int i) {
            super("ShowToPayUiEffect.NavigateToLoading", null);
            this.titleRes = i;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToLoading(titleRes=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.titleRes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToLoading) && this.titleRes == ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToLoading) other).titleRes;
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToLoading copy(int titleRes) {
            return new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToLoading(titleRes);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToLoading copy$default(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToLoading navigateToLoading, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = navigateToLoading.titleRes;
            }
            return navigateToLoading.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect$NavigateToEnterAmount;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect;", "", "detectedCountryCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect$NavigateToEnterAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDetectedCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToEnterAmount extends com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect {
        public static final int $stable = 0;
        private final java.lang.String detectedCountryCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToEnterAmount(java.lang.String str) {
            super("ShowToPayUiEffect.NavigateToEnterAmount", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.detectedCountryCode = str;
        }

        public final java.lang.String getDetectedCountryCode() {
            return this.detectedCountryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.detectedCountryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToEnterAmount(detectedCountryCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.detectedCountryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToEnterAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.detectedCountryCode, ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToEnterAmount) other).detectedCountryCode);
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToEnterAmount copy(java.lang.String detectedCountryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detectedCountryCode, "");
            return new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToEnterAmount(detectedCountryCode);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDetectedCountryCode() {
            return this.detectedCountryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToEnterAmount copy$default(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToEnterAmount navigateToEnterAmount, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToEnterAmount.detectedCountryCode;
            }
            return navigateToEnterAmount.copy(str);
        }
    }

    public /* synthetic */ ShowToPayUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
