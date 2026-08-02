package com.paypal.oslo.feature.p2p.ui.claim.effects;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToSuccess", "NavigateToHardDecline", "NavigateToNetworkError", "Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect$NavigateBack;", "Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect$NavigateToHardDecline;", "Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect$NavigateToNetworkError;", "Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect$NavigateToSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ClaimPreviewEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ClaimPreviewEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect$NavigateBack;", "Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateBack();

        public final int hashCode() {
            return 1300888546;
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect$NavigateToSuccess;", "Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSuccess extends com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToSuccess INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToSuccess();

        public final int hashCode() {
            return 1972422381;
        }

        private NavigateToSuccess() {
            super("NavigateToSuccess", null);
        }

        public final java.lang.String toString() {
            return "NavigateToSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect$NavigateToHardDecline;", "Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToHardDecline extends com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToHardDecline INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToHardDecline();

        public final int hashCode() {
            return -757305995;
        }

        private NavigateToHardDecline() {
            super("NavigateToHardDecline", null);
        }

        public final java.lang.String toString() {
            return "NavigateToHardDecline";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToHardDecline)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect$NavigateToNetworkError;", "Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToNetworkError extends com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToNetworkError INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToNetworkError();

        public final int hashCode() {
            return 572387280;
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToNetworkError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ClaimPreviewEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
