package androidx.lifecycle;

/* loaded from: classes.dex */
public final class b {
    public static androidx.lifecycle.d a(androidx.lifecycle.e state) {
        kotlin.jvm.internal.i.e(state, "state");
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            return androidx.lifecycle.d.ON_CREATE;
        }
        if (ordinal == 2) {
            return androidx.lifecycle.d.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return androidx.lifecycle.d.ON_RESUME;
    }
}
