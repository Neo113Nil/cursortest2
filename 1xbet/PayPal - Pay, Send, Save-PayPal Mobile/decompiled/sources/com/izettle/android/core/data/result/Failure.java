package com.izettle.android.core.data.result;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/izettle/android/core/data/result/Failure;", "E", "Lcom/izettle/android/core/data/result/Result;", "", "error", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/izettle/android/core/data/result/Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getError"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final /* data */ class Failure<E> extends com.izettle.android.core.data.result.Result {
    private final E error;

    public final E getError() {
        return this.error;
    }

    public Failure(E e) {
        super(null);
        this.error = e;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(");
        sb.append(this.error);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        E e = this.error;
        if (e != null) {
            return e.hashCode();
        }
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof com.izettle.android.core.data.result.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.izettle.android.core.data.result.Failure) other).error);
        }
        return true;
    }

    public final com.izettle.android.core.data.result.Failure<E> copy(E error) {
        return new com.izettle.android.core.data.result.Failure<>(error);
    }

    public final E component1() {
        return this.error;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.izettle.android.core.data.result.Failure copy$default(com.izettle.android.core.data.result.Failure failure, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = failure.error;
        }
        return failure.copy(obj);
    }
}
