package com.paypal.oslo.feature.p2p.ui.currencypicker.effect;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "CurrencySelected", "NavigateToXoom", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect$CurrencySelected;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect$NavigateToXoom;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CurrencyPickerEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CurrencyPickerEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect$CurrencySelected;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect;", "", "currencyId", "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect$CurrencySelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrencyId", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrencySelected extends com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect {
        public static final int $stable = 0;
        private final java.lang.String currencyCode;
        private final java.lang.String currencyId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrencySelected(java.lang.String str, java.lang.String str2) {
            super("CurrencySelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyId = str;
            this.currencyCode = str2;
        }

        public /* synthetic */ CurrencySelected(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, str2);
        }

        public final java.lang.String getCurrencyId() {
            return this.currencyId;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.currencyId;
            java.lang.String str2 = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencySelected(currencyId=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.currencyId;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.CurrencySelected)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.CurrencySelected currencySelected = (com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.CurrencySelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyId, currencySelected.currencyId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, currencySelected.currencyCode);
        }

        public final com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.CurrencySelected copy(java.lang.String currencyId, java.lang.String currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.CurrencySelected(currencyId, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCurrencyId() {
            return this.currencyId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.CurrencySelected copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.CurrencySelected currencySelected, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = currencySelected.currencyId;
            }
            if ((i & 2) != 0) {
                str2 = currencySelected.currencyCode;
            }
            return currencySelected.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect$NavigateToXoom;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect;", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "selectedCurrency", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect$NavigateToXoom;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "getSelectedCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToXoom extends com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.CurrencyItem selectedCurrency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToXoom(com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem) {
            super("NavigateToXoom", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyItem, "");
            this.selectedCurrency = currencyItem;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.CurrencyItem getSelectedCurrency() {
            return this.selectedCurrency;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem = this.selectedCurrency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToXoom(selectedCurrency=");
            sb.append(currencyItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.selectedCurrency.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.NavigateToXoom) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCurrency, ((com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.NavigateToXoom) other).selectedCurrency);
        }

        public final com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.NavigateToXoom copy(com.paypal.oslo.feature.p2p.domain.model.CurrencyItem selectedCurrency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCurrency, "");
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.NavigateToXoom(selectedCurrency);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.CurrencyItem getSelectedCurrency() {
            return this.selectedCurrency;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.NavigateToXoom copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.NavigateToXoom navigateToXoom, com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                currencyItem = navigateToXoom.selectedCurrency;
            }
            return navigateToXoom.copy(currencyItem);
        }
    }

    public /* synthetic */ CurrencyPickerEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
