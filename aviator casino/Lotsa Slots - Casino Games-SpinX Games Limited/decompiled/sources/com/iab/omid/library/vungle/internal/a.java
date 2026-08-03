package com.iab.omid.library.vungle.internal;

/* loaded from: classes5.dex */
public class a implements com.iab.omid.library.vungle.internal.d.a {
    private static com.iab.omid.library.vungle.internal.a f = new com.iab.omid.library.vungle.internal.a(new com.iab.omid.library.vungle.internal.d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.vungle.utils.f f4543a = new com.iab.omid.library.vungle.utils.f();
    private java.util.Date b;
    private boolean c;
    private com.iab.omid.library.vungle.internal.d d;
    private boolean e;

    private a(com.iab.omid.library.vungle.internal.d dVar) {
        this.d = dVar;
    }

    public static com.iab.omid.library.vungle.internal.a a() {
        return f;
    }

    private void c() {
        if (!this.c || this.b == null) {
            return;
        }
        java.util.Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.internal.c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(android.content.Context context) {
        if (this.c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.e = this.d.c();
        this.c = true;
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z) {
        if (!this.e && z) {
            d();
        }
        this.e = z;
    }

    public java.util.Date b() {
        java.util.Date date = this.b;
        if (date != null) {
            return (java.util.Date) date.clone();
        }
        return null;
    }

    public void d() {
        java.util.Date a2 = this.f4543a.a();
        java.util.Date date = this.b;
        if (date == null || a2.after(date)) {
            this.b = a2;
            c();
        }
    }
}
