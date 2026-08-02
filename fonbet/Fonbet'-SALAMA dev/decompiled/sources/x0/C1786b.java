package x0;

import D6.E;
import D6.M;
import I6.o;
import K6.d;
import android.content.Context;
import android.os.Build;
import io.sentry.SentryBaseEvent;
import t6.h;
import u0.C1619a;
import z0.AbstractC1813f;
import z0.C1808a;
import z0.C1811d;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1786b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1813f f18083a;

    public C1786b(AbstractC1813f abstractC1813f) {
        this.f18083a = abstractC1813f;
    }

    public static final C1786b a(Context context) {
        C1811d c1811d;
        h.e(context, "context");
        int i7 = Build.VERSION.SDK_INT;
        C1619a c1619a = C1619a.f16535a;
        if ((i7 >= 30 ? c1619a.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) io.flutter.plugin.editing.a.w());
            h.d(systemService, "context.getSystemService…opicsManager::class.java)");
            c1811d = new C1811d(io.flutter.plugin.editing.a.l(systemService), 1);
        } else {
            if ((i7 >= 30 ? c1619a.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) io.flutter.plugin.editing.a.w());
                h.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                c1811d = new C1811d(io.flutter.plugin.editing.a.l(systemService2), 0);
            } else {
                c1811d = null;
            }
        }
        if (c1811d != null) {
            return new C1786b(c1811d);
        }
        return null;
    }

    public I3.b b(C1808a c1808a) {
        h.e(c1808a, SentryBaseEvent.JsonKeys.REQUEST);
        d dVar = M.f1796a;
        return r6.a.a(E.c(E.b(o.f3752a), new C1785a(this, c1808a, null)));
    }
}
