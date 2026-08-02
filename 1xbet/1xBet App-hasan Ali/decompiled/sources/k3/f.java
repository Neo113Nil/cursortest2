package k3;

import D3.n;
import D3.o;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.Jt;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import l3.C2054a;
import l3.C2055b;
import l3.C2057d;
import l3.m;
import l3.r;
import l3.t;
import m3.AbstractC2095e;
import m3.C2096f;
import m3.l;
import m3.v;
import q3.AbstractC2309b;
import r.C2328f;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: k, reason: collision with root package name */
    public final Context f17590k;

    /* renamed from: l, reason: collision with root package name */
    public final String f17591l;

    /* renamed from: m, reason: collision with root package name */
    public final v3.g f17592m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2034b f17593n;

    /* renamed from: o, reason: collision with root package name */
    public final C2055b f17594o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17595p;

    /* renamed from: q, reason: collision with root package name */
    public final C2054a f17596q;

    /* renamed from: r, reason: collision with root package name */
    public final C2057d f17597r;

    public f(Context context, v3.g gVar, InterfaceC2034b interfaceC2034b, e eVar) {
        v.f("Null context is not permitted.", context);
        v.f("Api must not be null.", gVar);
        v.f("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", eVar);
        this.f17590k = context.getApplicationContext();
        String str = null;
        if (AbstractC2309b.f()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f17591l = str;
        this.f17592m = gVar;
        this.f17593n = interfaceC2034b;
        this.f17594o = new C2055b(gVar, interfaceC2034b, str);
        C2057d e3 = C2057d.e(this.f17590k);
        this.f17597r = e3;
        this.f17595p = e3.f17793r.getAndIncrement();
        this.f17596q = eVar.f17589a;
        Jt jt = e3.f17798w;
        jt.sendMessage(jt.obtainMessage(7, this));
    }

    public final v3.e a() {
        v3.e eVar = new v3.e(19);
        Set set = Collections.EMPTY_SET;
        if (((C2328f) eVar.f20432l) == null) {
            eVar.f20432l = new C2328f(0);
        }
        ((C2328f) eVar.f20432l).addAll(set);
        Context context = this.f17590k;
        eVar.f20434n = context.getClass().getName();
        eVar.f20433m = context.getPackageName();
        return eVar;
    }

    public final o b(int i, l3.j jVar) {
        D3.f fVar = new D3.f();
        C2057d c2057d = this.f17597r;
        c2057d.getClass();
        int i5 = jVar.f17803d;
        Jt jt = c2057d.f17798w;
        o oVar = fVar.f946a;
        if (i5 != 0) {
            r rVar = null;
            if (c2057d.a()) {
                l lVar = (l) m3.k.b().f18078k;
                C2055b c2055b = this.f17594o;
                boolean z3 = true;
                if (lVar != null) {
                    if (lVar.f18080l) {
                        m mVar = (m) c2057d.f17795t.get(c2055b);
                        if (mVar != null) {
                            Object obj = mVar.f17807l;
                            if (obj instanceof AbstractC2095e) {
                                AbstractC2095e abstractC2095e = (AbstractC2095e) obj;
                                if (abstractC2095e.f18042v != null && !abstractC2095e.h()) {
                                    C2096f a5 = r.a(mVar, abstractC2095e, i5);
                                    if (a5 != null) {
                                        mVar.f17817v++;
                                        z3 = a5.f18046m;
                                    }
                                }
                            }
                        }
                        z3 = lVar.f18081m;
                    }
                    rVar = null;
                }
                rVar = new r(c2057d, i5, c2055b, z3 ? System.currentTimeMillis() : 0L, z3 ? SystemClock.elapsedRealtime() : 0L);
            }
            if (rVar != null) {
                jt.getClass();
                n nVar = new n(1, jt);
                oVar.getClass();
                oVar.f967b.e(new D3.i(nVar, rVar));
                oVar.i();
            }
        }
        jt.sendMessage(jt.obtainMessage(4, new t(new l3.v(i, jVar, fVar, this.f17596q), c2057d.f17794s.get(), this)));
        return oVar;
    }
}
