package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0011"}, d2 = {"Landroidx/compose/runtime/DynamicValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/MutableState;", "state", "<init>", "(Landroidx/compose/runtime/MutableState;)V", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "map", "readValue", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionLocal;", com.google.android.gms.common.internal.ImagesContract.LOCAL, "Landroidx/compose/runtime/ProvidedValue;", "toProvided", "(Landroidx/compose/runtime/CompositionLocal;)Landroidx/compose/runtime/ProvidedValue;", "component1", "()Landroidx/compose/runtime/MutableState;", "copy", "(Landroidx/compose/runtime/MutableState;)Landroidx/compose/runtime/DynamicValueHolder;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/MutableState;", "getState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DynamicValueHolder<T> implements androidx.compose.runtime.ValueHolder<T> {
    public static final int $stable = 0;
    private final androidx.compose.runtime.MutableState<T> state;

    public DynamicValueHolder(androidx.compose.runtime.MutableState<T> mutableState) {
        this.state = mutableState;
    }

    public final androidx.compose.runtime.MutableState<T> getState() {
        return this.state;
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final T readValue(androidx.compose.runtime.PersistentCompositionLocalMap map) {
        return this.state.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final androidx.compose.runtime.ProvidedValue<T> toProvided(androidx.compose.runtime.CompositionLocal<T> local) {
        return new androidx.compose.runtime.ProvidedValue<>(local, null, false, null, this.state, null, true);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DynamicValueHolder(state=");
        sb.append(this.state);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.state.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.runtime.DynamicValueHolder) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, ((androidx.compose.runtime.DynamicValueHolder) other).state);
    }

    public final androidx.compose.runtime.DynamicValueHolder<T> copy(androidx.compose.runtime.MutableState<T> state) {
        return new androidx.compose.runtime.DynamicValueHolder<>(state);
    }

    public final androidx.compose.runtime.MutableState<T> component1() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.runtime.DynamicValueHolder copy$default(androidx.compose.runtime.DynamicValueHolder dynamicValueHolder, androidx.compose.runtime.MutableState mutableState, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutableState = dynamicValueHolder.state;
        }
        return dynamicValueHolder.copy(mutableState);
    }
}
