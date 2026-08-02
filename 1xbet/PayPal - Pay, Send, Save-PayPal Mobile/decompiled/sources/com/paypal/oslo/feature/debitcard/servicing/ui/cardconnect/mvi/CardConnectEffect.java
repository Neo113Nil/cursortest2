package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LaunchKnotSdk", "NavigateBack", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEffect$LaunchKnotSdk;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEffect$NavigateBack;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CardConnectEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CardConnectEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEffect$LaunchKnotSdk;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEffect;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "session", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;)V", "component1", "()Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "copy", "(Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEffect$LaunchKnotSdk;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "getSession"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchKnotSdk extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchKnotSdk(com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession cardConnectSession) {
            super("LaunchKnotSdk", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectSession, "");
            this.session = cardConnectSession;
        }

        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession getSession() {
            return this.session;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession cardConnectSession = this.session;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchKnotSdk(session=");
            sb.append(cardConnectSession);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.session.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.LaunchKnotSdk) && kotlin.jvm.internal.Intrinsics.areEqual(this.session, ((com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.LaunchKnotSdk) other).session);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.LaunchKnotSdk copy(com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession session) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.LaunchKnotSdk(session);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession getSession() {
            return this.session;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.LaunchKnotSdk copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.LaunchKnotSdk launchKnotSdk, com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession cardConnectSession, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardConnectSession = launchKnotSdk.session;
            }
            return launchKnotSdk.copy(cardConnectSession);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEffect$NavigateBack;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.NavigateBack();

        public final int hashCode() {
            return 1730864408;
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
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CardConnectEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
