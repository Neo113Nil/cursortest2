package m1;

import I1.o;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Set;
import n1.C1300D;
import n1.C1309M;
import n1.C1311O;
import n1.C1313Q;
import n1.C1314a;
import n1.C1318e;
import n1.T;
import o1.C1367e;
import o1.C1371i;
import o1.C1372j;
import o1.u;
import r.C1393c;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11129a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11130b;

    /* renamed from: c, reason: collision with root package name */
    public final e f11131c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1275b f11132d;

    /* renamed from: e, reason: collision with root package name */
    public final C1314a f11133e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11134f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.j f11135g;

    /* renamed from: h, reason: collision with root package name */
    public final C1318e f11136h;

    public h(Context context, e eVar, InterfaceC1275b interfaceC1275b, g gVar) {
        u.h(context, "Null context is not permitted.");
        u.h(eVar, "Api must not be null.");
        u.h(gVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        u.h(applicationContext, "The provided context did not have an application context.");
        this.f11129a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f11130b = attributionTag;
        this.f11131c = eVar;
        this.f11132d = interfaceC1275b;
        this.f11133e = new C1314a(eVar, interfaceC1275b, attributionTag);
        C1318e e3 = C1318e.e(applicationContext);
        this.f11136h = e3;
        this.f11134f = e3.f11378h.getAndIncrement();
        this.f11135g = gVar.f11128a;
        A1.c cVar = e3.f11383m;
        cVar.sendMessage(cVar.obtainMessage(7, this));
    }

    public final B4.i a() {
        B4.i iVar = new B4.i(24, false);
        Set emptySet = Collections.emptySet();
        if (((C1393c) iVar.f311b) == null) {
            iVar.f311b = new C1393c(0);
        }
        ((C1393c) iVar.f311b).addAll(emptySet);
        Context context = this.f11129a;
        iVar.f313d = context.getClass().getName();
        iVar.f312c = context.getPackageName();
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o b(int i2, C1313Q c1313q) {
        C1309M c1309m;
        I1.h hVar = new I1.h();
        C1318e c1318e = this.f11136h;
        c1318e.getClass();
        int i3 = c1313q.f11340a;
        A1.c cVar = c1318e.f11383m;
        o oVar = hVar.f1248a;
        if (i3 != 0) {
            if (c1318e.a()) {
                C1372j c1372j = (C1372j) C1371i.a().f11562a;
                C1314a c1314a = this.f11133e;
                boolean z = true;
                if (c1372j != null) {
                    if (c1372j.f11564b) {
                        C1300D c1300d = (C1300D) c1318e.f11380j.get(c1314a);
                        if (c1300d != null) {
                            InterfaceC1276c interfaceC1276c = c1300d.f11294e;
                            if (interfaceC1276c instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) interfaceC1276c;
                                if (aVar.z != null && !aVar.g()) {
                                    C1367e a6 = C1309M.a(c1300d, aVar, i3);
                                    if (a6 != null) {
                                        c1300d.f11304o++;
                                        z = a6.f11531c;
                                    }
                                }
                            }
                        }
                        z = c1372j.f11565c;
                    }
                }
                c1309m = new C1309M(c1318e, i3, c1314a, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
                if (c1309m != null) {
                    cVar.getClass();
                    oVar.f(new A.c(4, cVar), c1309m);
                }
            }
            c1309m = null;
            if (c1309m != null) {
            }
        }
        cVar.sendMessage(cVar.obtainMessage(4, new C1311O(new T(i2, c1313q, hVar, this.f11135g), c1318e.f11379i.get(), this)));
        return oVar;
    }
}
