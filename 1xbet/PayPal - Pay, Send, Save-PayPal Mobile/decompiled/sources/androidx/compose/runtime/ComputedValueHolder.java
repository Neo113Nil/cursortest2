package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0013"}, d2 = {"Landroidx/compose/runtime/ComputedValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "map", "readValue", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionLocal;", com.google.android.gms.common.internal.ImagesContract.LOCAL, "Landroidx/compose/runtime/ProvidedValue;", "toProvided", "(Landroidx/compose/runtime/CompositionLocal;)Landroidx/compose/runtime/ProvidedValue;", "component1", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/ComputedValueHolder;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getCompute"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ComputedValueHolder<T> implements androidx.compose.runtime.ValueHolder<T> {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<androidx.compose.runtime.CompositionLocalAccessorScope, T> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public ComputedValueHolder(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.CompositionLocalAccessorScope, ? extends T> function1) {
        this.compute = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.runtime.CompositionLocalAccessorScope, T> getCompute() {
        return this.compute;
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final T readValue(androidx.compose.runtime.PersistentCompositionLocalMap map) {
        return this.compute.invoke(map);
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final androidx.compose.runtime.ProvidedValue<T> toProvided(androidx.compose.runtime.CompositionLocal<T> local) {
        return new androidx.compose.runtime.ProvidedValue<>(local, null, false, null, null, this.compute, false);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ComputedValueHolder(compute=");
        sb.append(this.compute);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.compute.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.runtime.ComputedValueHolder) && kotlin.jvm.internal.Intrinsics.areEqual(this.compute, ((androidx.compose.runtime.ComputedValueHolder) other).compute);
    }

    public final androidx.compose.runtime.ComputedValueHolder<T> copy(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.CompositionLocalAccessorScope, ? extends T> compute) {
        return new androidx.compose.runtime.ComputedValueHolder<>(compute);
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.runtime.CompositionLocalAccessorScope, T> component1() {
        return this.compute;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.runtime.ComputedValueHolder copy$default(androidx.compose.runtime.ComputedValueHolder computedValueHolder, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = computedValueHolder.compute;
        }
        return computedValueHolder.copy(function1);
    }
}
