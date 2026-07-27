package Q0;

import A0.q;
import I1.y;
import R0.l;
import R0.t;
import R0.v;
import S0.C0060c;
import S0.r;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import i1.C0335e;
import i1.C0337g;
import i1.C0341k;
import java.util.Collections;
import java.util.Set;
import p.C1153c;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1161a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1162b;

    /* renamed from: c, reason: collision with root package name */
    public final a1.e f1163c;

    /* renamed from: d, reason: collision with root package name */
    public final b f1164d;

    /* renamed from: e, reason: collision with root package name */
    public final R0.a f1165e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final P0.j f1166g;

    /* renamed from: h, reason: collision with root package name */
    public final R0.c f1167h;

    public f(Context context, a1.e eVar, b bVar, e eVar2) {
        r.d(context, "Null context is not permitted.");
        r.d(eVar, "Api must not be null.");
        r.d(eVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        r.d(applicationContext, "The provided context did not have an application context.");
        this.f1161a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f1162b = attributionTag;
        this.f1163c = eVar;
        this.f1164d = bVar;
        this.f1165e = new R0.a(eVar, bVar, attributionTag);
        R0.c e3 = R0.c.e(applicationContext);
        this.f1167h = e3;
        this.f = e3.f1198h.getAndIncrement();
        this.f1166g = eVar2.f1160a;
        b1.e eVar3 = e3.f1203m;
        eVar3.sendMessage(eVar3.obtainMessage(7, this));
    }

    public final A0.j a() {
        A0.j jVar = new A0.j(7, false);
        Set set = Collections.EMPTY_SET;
        if (((C1153c) jVar.f67c) == null) {
            jVar.f67c = new C1153c(0);
        }
        ((C1153c) jVar.f67c).addAll(set);
        Context context = this.f1161a;
        jVar.f68d = context.getClass().getName();
        jVar.f66b = context.getPackageName();
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0341k b(int i3, y yVar) {
        R0.r rVar;
        C0335e c0335e = new C0335e();
        R0.c cVar = this.f1167h;
        cVar.getClass();
        int i4 = yVar.f685b;
        b1.e eVar = cVar.f1203m;
        C0341k c0341k = c0335e.f5011a;
        if (i4 != 0) {
            if (cVar.a()) {
                S0.h hVar = (S0.h) S0.g.b().f1329a;
                R0.a aVar = this.f1165e;
                boolean z3 = true;
                if (hVar != null) {
                    if (hVar.f1331b) {
                        l lVar = (l) cVar.f1200j.get(aVar);
                        if (lVar != null) {
                            c cVar2 = lVar.f1209d;
                            if (cVar2 instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar2 = (com.google.android.gms.common.internal.a) cVar2;
                                if (aVar2.f2591u != null && !aVar2.e()) {
                                    C0060c a3 = R0.r.a(lVar, aVar2, i4);
                                    if (a3 != null) {
                                        lVar.f1218n++;
                                        z3 = a3.f1301c;
                                    }
                                }
                            }
                        }
                        z3 = hVar.f1332c;
                    }
                }
                rVar = new R0.r(cVar, i4, aVar, z3 ? System.currentTimeMillis() : 0L, z3 ? SystemClock.elapsedRealtime() : 0L);
                if (rVar != null) {
                    eVar.getClass();
                    q qVar = new q(1, eVar);
                    c0341k.getClass();
                    c0341k.f5023b.d(new C0337g(qVar, rVar));
                    c0341k.g();
                }
            }
            rVar = null;
            if (rVar != null) {
            }
        }
        eVar.sendMessage(eVar.obtainMessage(4, new t(new v(i3, yVar, c0335e, this.f1166g), cVar.f1199i.get(), this)));
        return c0341k;
    }
}
