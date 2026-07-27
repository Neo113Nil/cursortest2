package sg.bigo.ads.y0;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

/* renamed from: sg.bigo.ads.y0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5519e {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.B0.c f13418a;
    public final C5518d b;
    public final sg.bigo.ads.U.h c;
    public URL d;
    public final URL e;
    public int f;
    public HttpURLConnection g;
    public boolean h = false;

    public C5519e(sg.bigo.ads.B0.c cVar, URL url, URL url2, C5518d c5518d, sg.bigo.ads.U.h hVar) {
        this.f13418a = cVar;
        this.d = url;
        this.e = url2;
        this.b = c5518d;
        this.c = hVar;
        Objects.toString(cVar);
        Objects.toString(url2);
        cVar.b();
    }

    public final C5519e a(URL url) {
        C5519e c5519e = new C5519e(this.f13418a, this.d, url, this.b, this.c);
        c5519e.f = this.f + 1;
        return c5519e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.e != null) {
            sb.append("originUrl=").append(this.f13418a.b.a());
            sb.append(", redirectURL=").append(this.e);
            sb.append(", redirectCount=").append(this.f);
        } else {
            sb.append("requestUrl=").append(this.f13418a.b.a());
        }
        return sb.toString();
    }
}
