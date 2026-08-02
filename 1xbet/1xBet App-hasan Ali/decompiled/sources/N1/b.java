package N1;

import G.q;
import P1.d;
import P1.e;
import P1.g;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.l;
import p4.AbstractC2282w;
import p4.D;
import u4.m;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final g f3748a;

    public b(g gVar) {
        this.f3748a = gVar;
    }

    public static final b a(Context context) {
        e eVar;
        int i = Build.VERSION.SDK_INT;
        K1.a aVar = K1.a.f2882a;
        if ((i >= 30 ? aVar.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) q.z());
            l.e("context.getSystemService…opicsManager::class.java)", systemService);
            eVar = new e(d.j(systemService), 1);
        } else {
            if ((i >= 30 ? aVar.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) q.z());
                l.e("context.getSystemService…opicsManager::class.java)", systemService2);
                eVar = new e(d.j(systemService2), 0);
            } else {
                eVar = null;
            }
        }
        if (eVar != null) {
            return new b(eVar);
        }
        return null;
    }

    public E3.a b(P1.a aVar) {
        l.f("request", aVar);
        w4.e eVar = D.f18743a;
        return G4.d.h(AbstractC2282w.c(AbstractC2282w.a(m.f20109a), null, new a(this, aVar, null), 3));
    }
}
