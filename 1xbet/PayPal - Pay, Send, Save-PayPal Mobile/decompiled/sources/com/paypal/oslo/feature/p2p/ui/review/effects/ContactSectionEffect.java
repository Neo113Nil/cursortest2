package com.paypal.oslo.feature.p2p.ui.review.effects;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "PaymentLinkReceiverUpdateSuccess", "GoBackToReviewScreenForContingency", "NavigateToScamAlert", "NavigateToHighRiskScamDecline", "ShowContactRemovedToast", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$GoBackToReviewScreenForContingency;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$NavigateToHighRiskScamDecline;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$NavigateToScamAlert;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$PaymentLinkReceiverUpdateSuccess;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$ShowContactRemovedToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ContactSectionEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ContactSectionEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$PaymentLinkReceiverUpdateSuccess;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentLinkReceiverUpdateSuccess extends com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.PaymentLinkReceiverUpdateSuccess INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.PaymentLinkReceiverUpdateSuccess();

        public final int hashCode() {
            return -436227670;
        }

        private PaymentLinkReceiverUpdateSuccess() {
            super("PaymentLinkReceiverUpdateSuccess", null);
        }

        public final java.lang.String toString() {
            return "PaymentLinkReceiverUpdateSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.PaymentLinkReceiverUpdateSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$GoBackToReviewScreenForContingency;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoBackToReviewScreenForContingency extends com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.GoBackToReviewScreenForContingency INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.GoBackToReviewScreenForContingency();

        public final int hashCode() {
            return 994318611;
        }

        private GoBackToReviewScreenForContingency() {
            super("GoBackToReviewScreenForContingency", null);
        }

        public final java.lang.String toString() {
            return "GoBackToReviewScreenForContingency";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.GoBackToReviewScreenForContingency)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$NavigateToScamAlert;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect;", "Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "scamAlertType", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;)Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$NavigateToScamAlert;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "getScamAlertType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToScamAlert extends com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToScamAlert(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType) {
            super("NavigateToScamAlert", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertType, "");
            this.scamAlertType = scamAlertType;
        }

        public final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType getScamAlertType() {
            return this.scamAlertType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType = this.scamAlertType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToScamAlert(scamAlertType=");
            sb.append(scamAlertType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.scamAlertType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.NavigateToScamAlert) && this.scamAlertType == ((com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.NavigateToScamAlert) other).scamAlertType;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.NavigateToScamAlert copy(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertType, "");
            return new com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.NavigateToScamAlert(scamAlertType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType getScamAlertType() {
            return this.scamAlertType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.NavigateToScamAlert copy$default(com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.NavigateToScamAlert navigateToScamAlert, com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                scamAlertType = navigateToScamAlert.scamAlertType;
            }
            return navigateToScamAlert.copy(scamAlertType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$NavigateToHighRiskScamDecline;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToHighRiskScamDecline extends com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.NavigateToHighRiskScamDecline INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.NavigateToHighRiskScamDecline();

        public final int hashCode() {
            return 1087403486;
        }

        private NavigateToHighRiskScamDecline() {
            super("NavigateToHighRiskScamDecline", null);
        }

        public final java.lang.String toString() {
            return "NavigateToHighRiskScamDecline";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.NavigateToHighRiskScamDecline)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$ShowContactRemovedToast;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect;", "", "contactName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect$ShowContactRemovedToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContactName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowContactRemovedToast extends com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect {
        public static final int $stable = 0;
        private final java.lang.String contactName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowContactRemovedToast(java.lang.String str) {
            super("ShowContactRemovedToast", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.contactName = str;
        }

        public final java.lang.String getContactName() {
            return this.contactName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contactName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowContactRemovedToast(contactName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contactName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.ShowContactRemovedToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactName, ((com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.ShowContactRemovedToast) other).contactName);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.ShowContactRemovedToast copy(java.lang.String contactName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactName, "");
            return new com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.ShowContactRemovedToast(contactName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContactName() {
            return this.contactName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.ShowContactRemovedToast copy$default(com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect.ShowContactRemovedToast showContactRemovedToast, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showContactRemovedToast.contactName;
            }
            return showContactRemovedToast.copy(str);
        }
    }

    public /* synthetic */ ContactSectionEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
