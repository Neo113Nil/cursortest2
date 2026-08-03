package com.iab.omid.library.fyber.internal;

/* loaded from: classes5.dex */
public class i implements com.iab.omid.library.fyber.internal.d.a, com.iab.omid.library.fyber.devicevolume.c {
    private static com.iab.omid.library.fyber.internal.i f;

    /* renamed from: a, reason: collision with root package name */
    private float f4394a = 0.0f;
    private final com.iab.omid.library.fyber.devicevolume.e b;
    private final com.iab.omid.library.fyber.devicevolume.b c;
    private com.iab.omid.library.fyber.devicevolume.d d;
    private com.iab.omid.library.fyber.internal.c e;

    public i(com.iab.omid.library.fyber.devicevolume.e eVar, com.iab.omid.library.fyber.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    private com.iab.omid.library.fyber.internal.c a() {
        if (this.e == null) {
            this.e = com.iab.omid.library.fyber.internal.c.c();
        }
        return this.e;
    }

    public static com.iab.omid.library.fyber.internal.i c() {
        if (f == null) {
            f = new com.iab.omid.library.fyber.internal.i(new com.iab.omid.library.fyber.devicevolume.e(), new com.iab.omid.library.fyber.devicevolume.b());
        }
        return f;
    }

    @Override // com.iab.omid.library.fyber.devicevolume.c
    public void a(float f2) {
        this.f4394a = f2;
        java.util.Iterator<com.iab.omid.library.fyber.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f2);
        }
    }

    public void a(android.content.Context context) {
        this.d = this.b.a(new android.os.Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.fyber.internal.d.a
    public void a(boolean z) {
        if (z) {
            com.iab.omid.library.fyber.walking.TreeWalker.getInstance().h();
        } else {
            com.iab.omid.library.fyber.walking.TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f4394a;
    }

    public void d() {
        com.iab.omid.library.fyber.internal.b.g().a(this);
        com.iab.omid.library.fyber.internal.b.g().e();
        com.iab.omid.library.fyber.walking.TreeWalker.getInstance().h();
        this.d.c();
    }

    public void e() {
        com.iab.omid.library.fyber.walking.TreeWalker.getInstance().j();
        com.iab.omid.library.fyber.internal.b.g().f();
        this.d.d();
    }
}
