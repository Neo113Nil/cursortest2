package lib.android.paypal.com.magnessdk.network.base;

/* loaded from: classes5.dex */
public class f implements java.net.CookieStore {
    private static lib.android.paypal.com.magnessdk.network.base.f Camera2StreamConfigurationMap;
    private android.content.Context getHighSpeedVideoFpsRangesFor;

    public static lib.android.paypal.com.magnessdk.network.base.f a() {
        lib.android.paypal.com.magnessdk.network.base.f fVar;
        synchronized (lib.android.paypal.com.magnessdk.network.base.f.class) {
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = new lib.android.paypal.com.magnessdk.network.base.f();
            }
            fVar = Camera2StreamConfigurationMap;
        }
        return fVar;
    }

    @Override // java.net.CookieStore
    public java.util.List<java.net.HttpCookie> get(java.net.URI uri) {
        return null;
    }

    @Override // java.net.CookieStore
    public java.util.List<java.net.URI> getURIs() {
        return null;
    }

    @Override // java.net.CookieStore
    public boolean remove(java.net.URI uri, java.net.HttpCookie httpCookie) {
        return false;
    }

    @Override // java.net.CookieStore
    public boolean removeAll() {
        return false;
    }

    public void a(android.content.Context context) {
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @Override // java.net.CookieStore
    public java.util.List<java.net.HttpCookie> getCookies() {
        java.lang.String b = a.c.b(this.getHighSpeedVideoFpsRangesFor, lib.android.paypal.com.magnessdk.c.b.e);
        if (b == null || b.isEmpty()) {
            return null;
        }
        return java.net.HttpCookie.parse(b);
    }

    @Override // java.net.CookieStore
    public void add(java.net.URI uri, java.net.HttpCookie httpCookie) {
        if (httpCookie != null) {
            if (httpCookie.hasExpired()) {
                a.c.c(this.getHighSpeedVideoFpsRangesFor, lib.android.paypal.com.magnessdk.c.b.e);
                return;
            }
            if (httpCookie.getName() == null || httpCookie.getName().isEmpty()) {
                return;
            }
            android.content.Context context = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(httpCookie.getName());
            sb.append("=");
            sb.append(httpCookie.getValue());
            a.c.b(context, lib.android.paypal.com.magnessdk.c.b.e, sb.toString());
        }
    }

    private f() {
    }
}
