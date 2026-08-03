package n0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f8087a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f8088b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.e f8089c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.InterfaceC0938b f8090d;

    /* renamed from: e, reason: collision with root package name */
    public final o0.C0942a f8091e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8092f;

    /* renamed from: g, reason: collision with root package name */
    public final f1.L f8093g;

    /* renamed from: h, reason: collision with root package name */
    public final o0.c f8094h;

    public f(android.content.Context context, x0.e eVar, n0.InterfaceC0938b interfaceC0938b, n0.e eVar2) {
        p0.AbstractC0966r.d(context, "Null context is not permitted.");
        p0.AbstractC0966r.d(eVar, "Api must not be null.");
        p0.AbstractC0966r.d(eVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        android.content.Context applicationContext = context.getApplicationContext();
        p0.AbstractC0966r.d(applicationContext, "The provided context did not have an application context.");
        this.f8087a = applicationContext;
        java.lang.String attributionTag = android.os.Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f8088b = attributionTag;
        this.f8089c = eVar;
        this.f8090d = interfaceC0938b;
        this.f8091e = new o0.C0942a(eVar, interfaceC0938b, attributionTag);
        o0.c e2 = o0.c.e(applicationContext);
        this.f8094h = e2;
        this.f8092f = e2.f8140h.getAndIncrement();
        this.f8093g = eVar2.f8086a;
        A0.a aVar = e2.f8145m;
        aVar.sendMessage(aVar.obtainMessage(7, this));
    }

    public final I0.b a() {
        I0.b bVar = new I0.b(14, false);
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (((l.C0925c) bVar.f657b) == null) {
            bVar.f657b = new l.C0925c(0);
        }
        ((l.C0925c) bVar.f657b).addAll(emptySet);
        android.content.Context context = this.f8087a;
        bVar.f659d = context.getClass().getName();
        bVar.f658c = context.getPackageName();
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D0.m b(int i2, K.a aVar) {
        o0.s sVar;
        D0.d dVar = new D0.d();
        o0.c cVar = this.f8094h;
        cVar.getClass();
        int i3 = aVar.f939b;
        A0.a aVar2 = cVar.f8145m;
        D0.m mVar = dVar.f194a;
        if (i3 != 0) {
            if (cVar.a()) {
                p0.C0956h c0956h = (p0.C0956h) p0.C0955g.b().f8255a;
                o0.C0942a c0942a = this.f8091e;
                boolean z2 = true;
                if (c0956h != null) {
                    if (c0956h.f8257b) {
                        o0.m mVar2 = (o0.m) cVar.f8142j.get(c0942a);
                        if (mVar2 != null) {
                            n0.InterfaceC0939c interfaceC0939c = mVar2.f8154b;
                            if (interfaceC0939c instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar3 = (com.google.android.gms.common.internal.a) interfaceC0939c;
                                if (aVar3.f2618u != null && !aVar3.a()) {
                                    p0.C0951c a2 = o0.s.a(mVar2, aVar3, i3);
                                    if (a2 != null) {
                                        mVar2.f8164l++;
                                        z2 = a2.f8224c;
                                    }
                                }
                            }
                        }
                        z2 = c0956h.f8258c;
                    }
                }
                sVar = new o0.s(cVar, i3, c0942a, z2 ? java.lang.System.currentTimeMillis() : 0L, z2 ? android.os.SystemClock.elapsedRealtime() : 0L);
                if (sVar != null) {
                    aVar2.getClass();
                    D0.l lVar = new D0.l(aVar2, 1);
                    mVar.getClass();
                    mVar.f214b.c(new D0.g(lVar, sVar));
                    mVar.h();
                }
            }
            sVar = null;
            if (sVar != null) {
            }
        }
        aVar2.sendMessage(aVar2.obtainMessage(4, new o0.u(new o0.w(i2, aVar, dVar, this.f8093g), cVar.f8141i.get(), this)));
        return mVar;
    }
}
