package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;", "", "<init>", "()V", "Logout", "SessionExpired", "HigherPriorityFlow", "Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason$HigherPriorityFlow;", "Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason$Logout;", "Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason$SessionExpired;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class InterruptReason {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason$Logout;", "Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Logout extends com.paypal.oslo.feature.identity.login.domain.model.InterruptReason {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.Logout INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.Logout();

        public final int hashCode() {
            return 1104194332;
        }

        private Logout() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Logout";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.Logout)) {
                return false;
            }
            return true;
        }
    }

    private InterruptReason() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason$SessionExpired;", "Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SessionExpired extends com.paypal.oslo.feature.identity.login.domain.model.InterruptReason {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.SessionExpired INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.SessionExpired();

        public final int hashCode() {
            return 1249094465;
        }

        private SessionExpired() {
            super(null);
        }

        public final java.lang.String toString() {
            return "SessionExpired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.SessionExpired)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason$HigherPriorityFlow;", "Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;", "", "source", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason$HigherPriorityFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HigherPriorityFlow extends com.paypal.oslo.feature.identity.login.domain.model.InterruptReason {
        public static final int $stable = 0;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HigherPriorityFlow(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.source = str;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HigherPriorityFlow(source=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.HigherPriorityFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, ((com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.HigherPriorityFlow) other).source);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.HigherPriorityFlow copy(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.HigherPriorityFlow(source);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.HigherPriorityFlow copy$default(com.paypal.oslo.feature.identity.login.domain.model.InterruptReason.HigherPriorityFlow higherPriorityFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = higherPriorityFlow.source;
            }
            return higherPriorityFlow.copy(str);
        }
    }

    public /* synthetic */ InterruptReason(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
