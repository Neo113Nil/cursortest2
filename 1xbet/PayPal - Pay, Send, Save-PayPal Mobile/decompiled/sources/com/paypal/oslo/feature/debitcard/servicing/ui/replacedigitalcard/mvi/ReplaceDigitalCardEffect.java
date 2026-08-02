package com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBackWithSuccess", "ReplaceCardFlowCancelled", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEffect$NavigateBackWithSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEffect$ReplaceCardFlowCancelled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ReplaceDigitalCardEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ReplaceDigitalCardEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEffect$NavigateBackWithSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEffect;", "", "isRefreshRequired", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEffect$NavigateBackWithSuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithSuccess extends com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect {
        public static final int $stable = 0;
        private final boolean isRefreshRequired;

        public NavigateBackWithSuccess(boolean z) {
            super("NavigateBackWithSuccess", null);
            this.isRefreshRequired = z;
        }

        public final boolean isRefreshRequired() {
            return this.isRefreshRequired;
        }

        public final java.lang.String toString() {
            boolean z = this.isRefreshRequired;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithSuccess(isRefreshRequired=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isRefreshRequired);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.NavigateBackWithSuccess) && this.isRefreshRequired == ((com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.NavigateBackWithSuccess) other).isRefreshRequired;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.NavigateBackWithSuccess copy(boolean isRefreshRequired) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.NavigateBackWithSuccess(isRefreshRequired);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRefreshRequired() {
            return this.isRefreshRequired;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.NavigateBackWithSuccess copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.NavigateBackWithSuccess navigateBackWithSuccess, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = navigateBackWithSuccess.isRefreshRequired;
            }
            return navigateBackWithSuccess.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEffect$ReplaceCardFlowCancelled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReplaceCardFlowCancelled extends com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.ReplaceCardFlowCancelled INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.ReplaceCardFlowCancelled();

        public final int hashCode() {
            return 26116603;
        }

        private ReplaceCardFlowCancelled() {
            super("ReplaceCardFlowCancelled", null);
        }

        public final java.lang.String toString() {
            return "ReplaceCardFlowCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.ReplaceCardFlowCancelled)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ReplaceDigitalCardEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
