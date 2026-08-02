package com.izettle.android.core.data.maybe;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/izettle/android/core/data/maybe/Just;", "T", "Lcom/izettle/android/core/data/maybe/Maybe;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class Just<T> extends com.izettle.android.core.data.maybe.Maybe<T> {
    private final T value;

    public Just(T t) {
        super(null);
        this.value = t;
    }

    public final T getValue() {
        return this.value;
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof com.izettle.android.core.data.maybe.Just) && kotlin.jvm.internal.Intrinsics.areEqual(((com.izettle.android.core.data.maybe.Just) other).value, this.value);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.value);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Just(");
        sb.append(this.value);
        sb.append(')');
        return sb.toString();
    }
}
