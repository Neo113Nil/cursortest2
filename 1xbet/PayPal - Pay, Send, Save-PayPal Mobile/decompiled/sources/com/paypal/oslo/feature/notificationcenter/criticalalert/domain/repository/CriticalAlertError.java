package com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/repository/CriticalAlertError;", "", "<init>", "()V", "Network", "Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/repository/CriticalAlertError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CriticalAlertError {
    public static final int $stable = 0;

    private CriticalAlertError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/repository/CriticalAlertError$Network;", "Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/repository/CriticalAlertError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/repository/CriticalAlertError$Network;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Network(java.lang.String str) {
            super(null);
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Network(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError.Network) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError.Network) other).message);
        }

        public final com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError.Network copy(java.lang.String message) {
            return new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError.Network(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError.Network copy$default(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError.Network network, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = network.message;
            }
            return network.copy(str);
        }
    }

    public /* synthetic */ CriticalAlertError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
