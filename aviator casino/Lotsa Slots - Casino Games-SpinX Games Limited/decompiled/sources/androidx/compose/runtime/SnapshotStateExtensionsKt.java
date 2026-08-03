package androidx.compose.runtime;

/* compiled from: SnapshotStateExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0007\u001a\u0012\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\t0\u0002H\u0007\u001a\u0012\u0010\n\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\f0\u0002H\u0007¨\u0006\r"}, d2 = {"asDoubleState", "Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/State;", "", "asFloatState", "Landroidx/compose/runtime/FloatState;", "", "asIntState", "Landroidx/compose/runtime/IntState;", "", "asLongState", "Landroidx/compose/runtime/LongState;", "", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateExtensionsKt {
    public static final androidx.compose.runtime.IntState asIntState(androidx.compose.runtime.State<java.lang.Integer> state) {
        return state instanceof androidx.compose.runtime.IntState ? (androidx.compose.runtime.IntState) state : new androidx.compose.runtime.UnboxedIntState(state);
    }

    public static final androidx.compose.runtime.LongState asLongState(androidx.compose.runtime.State<java.lang.Long> state) {
        return state instanceof androidx.compose.runtime.LongState ? (androidx.compose.runtime.LongState) state : new androidx.compose.runtime.UnboxedLongState(state);
    }

    public static final androidx.compose.runtime.FloatState asFloatState(androidx.compose.runtime.State<java.lang.Float> state) {
        return state instanceof androidx.compose.runtime.FloatState ? (androidx.compose.runtime.FloatState) state : new androidx.compose.runtime.UnboxedFloatState(state);
    }

    public static final androidx.compose.runtime.DoubleState asDoubleState(androidx.compose.runtime.State<java.lang.Double> state) {
        return state instanceof androidx.compose.runtime.DoubleState ? (androidx.compose.runtime.DoubleState) state : new androidx.compose.runtime.UnboxedDoubleState(state);
    }
}
