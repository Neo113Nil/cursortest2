package androidx.lifecycle;

import io.sentry.protocol.SentryThread;

/* JADX INFO: renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0716k {
    public static EnumC0718m a(EnumC0719n enumC0719n) {
        t6.h.e(enumC0719n, SentryThread.JsonKeys.STATE);
        int iOrdinal = enumC0719n.ordinal();
        if (iOrdinal == 2) {
            return EnumC0718m.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return EnumC0718m.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC0718m.ON_PAUSE;
    }

    public static EnumC0718m b(EnumC0719n enumC0719n) {
        t6.h.e(enumC0719n, SentryThread.JsonKeys.STATE);
        int iOrdinal = enumC0719n.ordinal();
        if (iOrdinal == 1) {
            return EnumC0718m.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC0718m.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC0718m.ON_RESUME;
    }
}
