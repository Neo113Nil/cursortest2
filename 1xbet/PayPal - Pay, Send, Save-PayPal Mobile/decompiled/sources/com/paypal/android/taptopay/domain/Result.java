package com.paypal.android.taptopay.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0004\u0005\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/android/taptopay/domain/Result;", "S", "E", "", "Failure", "Success", "Lcom/paypal/android/taptopay/domain/Result$Failure;", "Lcom/paypal/android/taptopay/domain/Result$Success;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Result<S, E> {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00028\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/android/taptopay/domain/Result$Success;", "S", "E", "Lcom/paypal/android/taptopay/domain/Result;", "result", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/android/taptopay/domain/Result$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getResult"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success<S, E> implements com.paypal.android.taptopay.domain.Result<S, E> {
        private final S result;

        public Success(S s) {
            this.result = s;
        }

        public final S getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            S s = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(result=");
            sb.append(s);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            S s = this.result;
            if (s == null) {
                return 0;
            }
            return s.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.android.taptopay.domain.Result.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.android.taptopay.domain.Result.Success) other).result);
        }

        public final com.paypal.android.taptopay.domain.Result.Success<S, E> copy(S result) {
            return new com.paypal.android.taptopay.domain.Result.Success<>(result);
        }

        public final S component1() {
            return this.result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.android.taptopay.domain.Result.Success copy$default(com.paypal.android.taptopay.domain.Result.Success success, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = success.result;
            }
            return success.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00028\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/android/taptopay/domain/Result$Failure;", "S", "E", "Lcom/paypal/android/taptopay/domain/Result;", "error", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/android/taptopay/domain/Result$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getError"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure<S, E> implements com.paypal.android.taptopay.domain.Result<S, E> {
        private final E error;

        public Failure(E e) {
            this.error = e;
        }

        public final E getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            E e = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(error=");
            sb.append(e);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            E e = this.error;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.android.taptopay.domain.Result.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.android.taptopay.domain.Result.Failure) other).error);
        }

        public final com.paypal.android.taptopay.domain.Result.Failure<S, E> copy(E error) {
            return new com.paypal.android.taptopay.domain.Result.Failure<>(error);
        }

        public final E component1() {
            return this.error;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.android.taptopay.domain.Result.Failure copy$default(com.paypal.android.taptopay.domain.Result.Failure failure, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = failure.error;
            }
            return failure.copy(obj);
        }
    }
}
