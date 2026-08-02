package com.paypal.android.taptopay.domain.model.replenishment;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysError;", "", "DefaultError", "Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysError$DefaultError;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ReplenishPaymentKeysError {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysError$DefaultError;", "Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysError$DefaultError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DefaultError implements com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError {
        private final java.lang.String message;

        public DefaultError(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError.DefaultError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError.DefaultError) other).message);
        }

        public final com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError.DefaultError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError.DefaultError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError.DefaultError copy$default(com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError.DefaultError defaultError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = defaultError.message;
            }
            return defaultError.copy(str);
        }
    }
}
