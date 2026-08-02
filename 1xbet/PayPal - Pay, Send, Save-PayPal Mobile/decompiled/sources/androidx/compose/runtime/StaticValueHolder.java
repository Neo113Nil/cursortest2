package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/StaticValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "map", "readValue", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionLocal;", com.google.android.gms.common.internal.ImagesContract.LOCAL, "Landroidx/compose/runtime/ProvidedValue;", "toProvided", "(Landroidx/compose/runtime/CompositionLocal;)Landroidx/compose/runtime/ProvidedValue;", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Landroidx/compose/runtime/StaticValueHolder;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StaticValueHolder<T> implements androidx.compose.runtime.ValueHolder<T> {
    public static final int $stable = 0;
    private final T value;

    public StaticValueHolder(T t) {
        this.value = t;
    }

    public final T getValue() {
        return this.value;
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final T readValue(androidx.compose.runtime.PersistentCompositionLocalMap map) {
        return this.value;
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final androidx.compose.runtime.ProvidedValue<T> toProvided(androidx.compose.runtime.CompositionLocal<T> local) {
        T t = this.value;
        return new androidx.compose.runtime.ProvidedValue<>(local, t, t == null, null, null, null, false);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StaticValueHolder(value=");
        sb.append(this.value);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.runtime.StaticValueHolder) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((androidx.compose.runtime.StaticValueHolder) other).value);
    }

    public final androidx.compose.runtime.StaticValueHolder<T> copy(T value) {
        return new androidx.compose.runtime.StaticValueHolder<>(value);
    }

    public final T component1() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.runtime.StaticValueHolder copy$default(androidx.compose.runtime.StaticValueHolder staticValueHolder, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = staticValueHolder.value;
        }
        return staticValueHolder.copy(obj);
    }
}
