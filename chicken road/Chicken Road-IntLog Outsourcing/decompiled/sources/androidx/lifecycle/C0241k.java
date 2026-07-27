package androidx.lifecycle;

/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241k {
    public static EnumC0243m a(EnumC0244n state) {
        kotlin.jvm.internal.i.e(state, "state");
        int ordinal = state.ordinal();
        if (ordinal == 2) {
            return EnumC0243m.ON_DESTROY;
        }
        if (ordinal == 3) {
            return EnumC0243m.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return EnumC0243m.ON_PAUSE;
    }

    public static EnumC0243m b(EnumC0244n state) {
        kotlin.jvm.internal.i.e(state, "state");
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            return EnumC0243m.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0243m.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0243m.ON_RESUME;
    }
}
