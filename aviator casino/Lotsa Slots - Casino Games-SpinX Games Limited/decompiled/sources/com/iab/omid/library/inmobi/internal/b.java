package com.iab.omid.library.inmobi.internal;

/* loaded from: classes5.dex */
public class b extends com.iab.omid.library.inmobi.internal.d {
    private static com.iab.omid.library.inmobi.internal.b d = new com.iab.omid.library.inmobi.internal.b();

    private b() {
    }

    public static com.iab.omid.library.inmobi.internal.b g() {
        return d;
    }

    @Override // com.iab.omid.library.inmobi.internal.d
    public void b(boolean z) {
        java.util.Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().a(z);
        }
    }

    @Override // com.iab.omid.library.inmobi.internal.d
    public boolean d() {
        java.util.Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
        while (it.hasNext()) {
            android.view.View e = it.next().e();
            if (e != null && e.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
