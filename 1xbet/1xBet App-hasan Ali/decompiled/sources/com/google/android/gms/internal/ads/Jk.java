package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class Jk implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10040k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10041l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f10042m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f10043n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f10044o;

    public /* synthetic */ Jk(Vi vi, C1074hg c1074hg, C1041gs c1041gs, Xm xm) {
        this.f10041l = vi;
        this.f10042m = c1074hg;
        this.f10043n = c1041gs;
        this.f10044o = xm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        switch (this.f10040k) {
            case 0:
                Object obj2 = ((WeakReference) this.f10041l).get();
                if (obj2 != null) {
                    ((InterfaceC1821y9) this.f10043n).b(obj2, map);
                    break;
                } else {
                    ((Kk) this.f10044o).d((String) this.f10042m, this);
                    break;
                }
            default:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                AbstractC1776x9.b(map, (Vi) this.f10041l);
                String str = (String) map.get("u");
                if (str != null) {
                    E3.a a5 = AbstractC1776x9.a(interfaceC0677Re, str);
                    m2.g gVar = new m2.g(interfaceC0677Re, (C1074hg) this.f10042m, (C1041gs) this.f10043n, (Xm) this.f10044o, 13, false);
                    a5.a(new Kw(0, a5, gVar), AbstractC0613Id.f9539a);
                    break;
                } else {
                    U2.j.i("URL missing from click GMSG.");
                    break;
                }
        }
    }

    public /* synthetic */ Jk(Kk kk, WeakReference weakReference, String str, InterfaceC1821y9 interfaceC1821y9) {
        this.f10044o = kk;
        this.f10041l = weakReference;
        this.f10042m = str;
        this.f10043n = interfaceC1821y9;
    }
}
