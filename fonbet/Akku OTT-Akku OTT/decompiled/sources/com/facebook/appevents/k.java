package com.facebook.appevents;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k {
    static {
        new k();
    }

    @JvmStatic
    public static final synchronized void a(C0689a accessTokenAppIdPair, E appEvents) {
        synchronized (k.class) {
            if (com.facebook.internal.instrument.crashshield.a.b(k.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                int i = com.facebook.appevents.internal.g.a;
                D a = C0694f.a();
                a.a(accessTokenAppIdPair, appEvents.b());
                C0694f.b(a);
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, k.class);
            }
        }
    }

    @JvmStatic
    public static final synchronized void b(C0693e eventsToPersist) {
        synchronized (k.class) {
            if (com.facebook.internal.instrument.crashshield.a.b(k.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
                int i = com.facebook.appevents.internal.g.a;
                D a = C0694f.a();
                for (C0689a c0689a : eventsToPersist.e()) {
                    E b = eventsToPersist.b(c0689a);
                    if (b == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    a.a(c0689a, b.b());
                }
                C0694f.b(a);
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, k.class);
            }
        }
    }
}
