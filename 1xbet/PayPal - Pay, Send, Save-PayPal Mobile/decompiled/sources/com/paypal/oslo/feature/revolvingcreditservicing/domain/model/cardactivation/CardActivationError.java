package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError;", "", "<init>", "()V", "NetworkError", "MaxAttemptsReached", "NotYetImplemented", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError$MaxAttemptsReached;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError$NetworkError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError$NotYetImplemented;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CardActivationError {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError$NetworkError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError {
        public static final int $stable = 8;
        private final java.lang.Throwable throwable;

        public NetworkError(java.lang.Throwable th) {
            super(null);
            this.throwable = th;
        }

        public /* synthetic */ NetworkError(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.throwable;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NetworkError) other).throwable);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NetworkError copy(java.lang.Throwable throwable) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NetworkError(throwable);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NetworkError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NetworkError networkError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = networkError.throwable;
            }
            return networkError.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NetworkError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    private CardActivationError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError$MaxAttemptsReached;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError;", "", "supportPhoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError$MaxAttemptsReached;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSupportPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MaxAttemptsReached extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError {
        public static final int $stable = 0;
        private final java.lang.String supportPhoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaxAttemptsReached(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.supportPhoneNumber = str;
        }

        public final java.lang.String getSupportPhoneNumber() {
            return this.supportPhoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.supportPhoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MaxAttemptsReached(supportPhoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.supportPhoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.MaxAttemptsReached) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportPhoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.MaxAttemptsReached) other).supportPhoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.MaxAttemptsReached copy(java.lang.String supportPhoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportPhoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.MaxAttemptsReached(supportPhoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSupportPhoneNumber() {
            return this.supportPhoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.MaxAttemptsReached copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.MaxAttemptsReached maxAttemptsReached, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = maxAttemptsReached.supportPhoneNumber;
            }
            return maxAttemptsReached.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError$NotYetImplemented;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotYetImplemented extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NotYetImplemented INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NotYetImplemented();

        public final int hashCode() {
            return 2145624024;
        }

        private NotYetImplemented() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NotYetImplemented";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NotYetImplemented)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CardActivationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
