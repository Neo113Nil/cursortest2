package androidx.lifecycle;

import io.sentry.protocol.SentryThread;

/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737k {
    public static EnumC0739m a(EnumC0740n enumC0740n) {
        t6.h.e(enumC0740n, SentryThread.JsonKeys.STATE);
        int ordinal = enumC0740n.ordinal();
        if (ordinal == 2) {
            return EnumC0739m.ON_DESTROY;
        }
        if (ordinal == 3) {
            return EnumC0739m.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return EnumC0739m.ON_PAUSE;
    }

    public static EnumC0739m b(EnumC0740n enumC0740n) {
        t6.h.e(enumC0740n, SentryThread.JsonKeys.STATE);
        int ordinal = enumC0740n.ordinal();
        if (ordinal == 1) {
            return EnumC0739m.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0739m.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0739m.ON_RESUME;
    }
}
