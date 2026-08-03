package com.iab.omid.library.inmobi.internal;

/* loaded from: classes5.dex */
public class a implements com.iab.omid.library.inmobi.internal.d.a {
    private static com.iab.omid.library.inmobi.internal.a f = new com.iab.omid.library.inmobi.internal.a(new com.iab.omid.library.inmobi.internal.d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.inmobi.utils.f f4425a = new com.iab.omid.library.inmobi.utils.f();
    private java.util.Date b;
    private boolean c;
    private com.iab.omid.library.inmobi.internal.d d;
    private boolean e;

    private a(com.iab.omid.library.inmobi.internal.d dVar) {
        this.d = dVar;
    }

    public static com.iab.omid.library.inmobi.internal.a a() {
        return f;
    }

    private void c() {
        if (!this.c || this.b == null) {
            return;
        }
        java.util.Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
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

    @Override // com.iab.omid.library.inmobi.internal.d.a
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
        java.util.Date a2 = this.f4425a.a();
        java.util.Date date = this.b;
        if (date == null || a2.after(date)) {
            this.b = a2;
            c();
        }
    }
}
