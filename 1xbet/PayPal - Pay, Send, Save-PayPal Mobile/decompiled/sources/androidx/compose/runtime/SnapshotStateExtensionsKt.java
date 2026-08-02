package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\t0\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/State;", "", "Landroidx/compose/runtime/IntState;", "asIntState", "(Landroidx/compose/runtime/State;)Landroidx/compose/runtime/IntState;", "", "Landroidx/compose/runtime/LongState;", "asLongState", "(Landroidx/compose/runtime/State;)Landroidx/compose/runtime/LongState;", "", "Landroidx/compose/runtime/FloatState;", "asFloatState", "(Landroidx/compose/runtime/State;)Landroidx/compose/runtime/FloatState;", "", "Landroidx/compose/runtime/DoubleState;", "asDoubleState", "(Landroidx/compose/runtime/State;)Landroidx/compose/runtime/DoubleState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
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
