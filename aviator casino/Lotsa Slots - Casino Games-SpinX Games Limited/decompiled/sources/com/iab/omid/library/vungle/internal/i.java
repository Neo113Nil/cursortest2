package com.iab.omid.library.vungle.internal;

/* loaded from: classes5.dex */
public class i implements com.iab.omid.library.vungle.internal.d.a, com.iab.omid.library.vungle.devicevolume.c {
    private static com.iab.omid.library.vungle.internal.i f;

    /* renamed from: a, reason: collision with root package name */
    private float f4551a = 0.0f;
    private final com.iab.omid.library.vungle.devicevolume.e b;
    private final com.iab.omid.library.vungle.devicevolume.b c;
    private com.iab.omid.library.vungle.devicevolume.d d;
    private com.iab.omid.library.vungle.internal.c e;

    public i(com.iab.omid.library.vungle.devicevolume.e eVar, com.iab.omid.library.vungle.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    private com.iab.omid.library.vungle.internal.c a() {
        if (this.e == null) {
            this.e = com.iab.omid.library.vungle.internal.c.c();
        }
        return this.e;
    }

    public static com.iab.omid.library.vungle.internal.i c() {
        if (f == null) {
            f = new com.iab.omid.library.vungle.internal.i(new com.iab.omid.library.vungle.devicevolume.e(), new com.iab.omid.library.vungle.devicevolume.b());
        }
        return f;
    }

    @Override // com.iab.omid.library.vungle.devicevolume.c
    public void a(float f2) {
        this.f4551a = f2;
        java.util.Iterator<com.iab.omid.library.vungle.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f2);
        }
    }

    public void a(android.content.Context context) {
        this.d = this.b.a(new android.os.Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z) {
        if (z) {
            com.iab.omid.library.vungle.walking.TreeWalker.getInstance().h();
        } else {
            com.iab.omid.library.vungle.walking.TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f4551a;
    }

    public void d() {
        com.iab.omid.library.vungle.internal.b.g().a(this);
        com.iab.omid.library.vungle.internal.b.g().e();
        com.iab.omid.library.vungle.walking.TreeWalker.getInstance().h();
        this.d.b();
    }

    public void e() {
        com.iab.omid.library.vungle.walking.TreeWalker.getInstance().j();
        com.iab.omid.library.vungle.internal.b.g().f();
        this.d.c();
    }
}
