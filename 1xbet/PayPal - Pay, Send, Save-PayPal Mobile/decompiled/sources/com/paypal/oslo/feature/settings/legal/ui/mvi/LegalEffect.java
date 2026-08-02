package com.paypal.oslo.feature.settings.legal.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\t"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "name", "NavigateBack", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEffect$NavigateBack;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class LegalEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;

    private LegalEffect() {
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel.LEGAL_EFFECT;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEffect$NavigateBack;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEffect.NavigateBack();

        public final int hashCode() {
            return -1719907563;
        }

        private NavigateBack() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ LegalEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
