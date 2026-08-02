package com.paypal.oslo.feature.wallet.cards.domain.add.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "reason", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "Active", "Inactive", "OnHold", "Blocked", "Removed", "Actionable", "Unknown", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Actionable;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Active;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Blocked;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Inactive;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$OnHold;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Removed;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CardStatus {
    public static final int $stable = 0;
    private final java.lang.String reason;

    private CardStatus(java.lang.String str) {
        this.reason = str;
    }

    public java.lang.String getReason() {
        return this.reason;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Active;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Active;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Active extends com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus {
        public static final int $stable = 0;
        private final java.lang.String reason;

        public Active(java.lang.String str) {
            super(str, null);
            this.reason = str;
        }

        @Override // com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus
        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Active(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Active) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Active) other).reason);
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Active copy(java.lang.String reason) {
            return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Active(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Active copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Active active, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = active.reason;
            }
            return active.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Inactive;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Inactive;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Inactive extends com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus {
        public static final int $stable = 0;
        private final java.lang.String reason;

        public Inactive(java.lang.String str) {
            super(str, null);
            this.reason = str;
        }

        @Override // com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus
        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Inactive(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Inactive) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Inactive) other).reason);
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Inactive copy(java.lang.String reason) {
            return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Inactive(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Inactive copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Inactive inactive, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = inactive.reason;
            }
            return inactive.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$OnHold;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$OnHold;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnHold extends com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus {
        public static final int $stable = 0;
        private final java.lang.String reason;

        public OnHold(java.lang.String str) {
            super(str, null);
            this.reason = str;
        }

        @Override // com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus
        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnHold(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.OnHold) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.OnHold) other).reason);
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.OnHold copy(java.lang.String reason) {
            return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.OnHold(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.OnHold copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.OnHold onHold, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onHold.reason;
            }
            return onHold.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Blocked;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Blocked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Blocked extends com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus {
        public static final int $stable = 0;
        private final java.lang.String reason;

        public Blocked(java.lang.String str) {
            super(str, null);
            this.reason = str;
        }

        @Override // com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus
        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Blocked(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Blocked) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Blocked) other).reason);
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Blocked copy(java.lang.String reason) {
            return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Blocked(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Blocked copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Blocked blocked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = blocked.reason;
            }
            return blocked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Removed;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Removed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Removed extends com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus {
        public static final int $stable = 0;
        private final java.lang.String reason;

        public Removed(java.lang.String str) {
            super(str, null);
            this.reason = str;
        }

        @Override // com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus
        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Removed(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Removed) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Removed) other).reason);
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Removed copy(java.lang.String reason) {
            return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Removed(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Removed copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Removed removed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = removed.reason;
            }
            return removed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Actionable;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Actionable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Actionable extends com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus {
        public static final int $stable = 0;
        private final java.lang.String reason;

        public Actionable(java.lang.String str) {
            super(str, null);
            this.reason = str;
        }

        @Override // com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus
        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Actionable(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Actionable) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Actionable) other).reason);
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Actionable copy(java.lang.String reason) {
            return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Actionable(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Actionable copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Actionable actionable, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionable.reason;
            }
            return actionable.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Unknown;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus {
        public static final int $stable = 0;
        private final java.lang.String reason;

        public Unknown(java.lang.String str) {
            super(str, null);
            this.reason = str;
        }

        @Override // com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus
        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Unknown) other).reason);
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Unknown copy(java.lang.String reason) {
            return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Unknown(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Unknown copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Unknown unknown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknown.reason;
            }
            return unknown.copy(str);
        }
    }

    public /* synthetic */ CardStatus(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
