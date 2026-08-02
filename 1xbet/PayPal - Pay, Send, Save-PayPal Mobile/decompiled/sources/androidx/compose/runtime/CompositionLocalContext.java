package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/CompositionLocalContext;", "", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "compositionLocals", "<init>", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocals$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionLocalContext {
    public static final int $stable = 0;
    private final androidx.compose.runtime.PersistentCompositionLocalMap compositionLocals;

    public CompositionLocalContext(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.compositionLocals = persistentCompositionLocalMap;
    }

    /* renamed from: getCompositionLocals$runtime, reason: from getter */
    public final androidx.compose.runtime.PersistentCompositionLocalMap getCompositionLocals() {
        return this.compositionLocals;
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof androidx.compose.runtime.CompositionLocalContext) && kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.runtime.CompositionLocalContext) other).compositionLocals, this.compositionLocals);
    }

    public final int hashCode() {
        return this.compositionLocals.hashCode();
    }
}
