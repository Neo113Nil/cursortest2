package p161x0;

import D6.E;
import D6.M;
import I6.o;
import android.content.Context;
import android.os.Build;
import io.sentry.SentryBaseEvent;
import p144u0.a;
import p170z0.d;
import p170z0.f;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f18089a;

    public b(f fVar) {
        this.f18089a = fVar;
    }

    public static final b a(Context context) {
        d dVar;
        h.e(context, "context");
        int i7 = Build.VERSION.SDK_INT;
        a aVar = a.f16541a;
        if ((i7 >= 30 ? aVar.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) io.flutter.plugin.editing.a.w());
            h.d(systemService, "context.getSystemService…opicsManager::class.java)");
            dVar = new d(io.flutter.plugin.editing.a.l(systemService), 1);
        } else {
            if ((i7 >= 30 ? aVar.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) io.flutter.plugin.editing.a.w());
                h.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                dVar = new d(io.flutter.plugin.editing.a.l(systemService2), 0);
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            return new b(dVar);
        }
        return null;
    }

    public I3.b b(p170z0.a aVar) {
        h.e(aVar, SentryBaseEvent.JsonKeys.REQUEST);
        K6.d dVar = M.f1796a;
        return r6.a.a(E.c(E.b(o.f3752a), new a(this, aVar, null)));
    }
}
