package sg.bigo.ads.y0;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Closeable;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import org.apache.http.conn.ConnectTimeoutException;
import sg.bigo.ads.K0.AbstractC4965w;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5503c;
import sg.bigo.ads.x0.C5505e;
import sg.bigo.ads.x0.C5508h;

/* renamed from: sg.bigo.ads.y0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5517c {

    /* renamed from: a, reason: collision with root package name */
    public final C5518d f13416a = new C5518d();
    public final sg.bigo.ads.U.h b;

    public C5517c(u uVar) {
        this.b = uVar;
        HashMap hashMap = AbstractRunnableC5522h.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    public final void a(C5519e c5519e, AbstractC5503c abstractC5503c, boolean z) {
        Throwable th;
        ?? r2;
        boolean z2;
        InputStream inputStream;
        URL url;
        TrafficStats.setThreadStatsTag(9999000);
        C5521g c5521g = null;
        try {
            C5521g c5521g2 = new C5521g(c5519e);
            try {
                C5520f a2 = c5521g2.a();
                if (a2 != null) {
                    abstractC5503c.a(c5519e.f13418a, a2.e);
                    if (a2.c == 0 && (url = a2.f12211a) != null) {
                        this.f13416a.a(c5519e.d, url);
                        C5519e a3 = c5519e.a(a2.f12211a);
                        Objects.toString(a2.f12211a);
                        if (c5519e.h) {
                            c5519e.f13418a.a(HttpHeaders.ACCEPT_ENCODING).clear();
                        }
                        a(a3, abstractC5503c, z);
                        c5521g2.b.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        return;
                    }
                }
                if (abstractC5503c.b(c5519e.f13418a, c5521g2.c)) {
                    c5519e.toString();
                    InputStream inputStream2 = c5521g2.b.getInputStream();
                    ?? r3 = inputStream2;
                    if (c5521g2.f) {
                        r3 = inputStream2;
                        if (c5519e.h) {
                            r3 = new GZIPInputStream(inputStream2);
                        }
                    }
                    try {
                        int i = c5519e.f13418a.f12212a;
                        sg.bigo.ads.C0.c a4 = abstractC5503c.a(new sg.bigo.ads.C0.a(c5521g2.c, (InputStream) r3, c5521g2.e));
                        if (c5519e.e == null) {
                            c5519e.f13418a.b.f();
                        }
                        abstractC5503c.a(c5519e.f13418a, a4);
                        z2 = false;
                        inputStream = r3;
                    } catch (Throwable th2) {
                        C5521g c5521g3 = r3;
                        th = th2;
                        c5521g = c5521g3;
                        r2 = c5521g;
                        c5521g = c5521g2;
                        try {
                            C5508h c5508h = new C5508h(th instanceof SocketTimeoutException ? IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD : th instanceof ConnectTimeoutException ? 701 : 700, th.getMessage());
                            if (c5519e.e == null) {
                                c5519e.f13418a.b.d();
                            }
                            abstractC5503c.a(c5519e.f13418a, c5508h);
                            AbstractC5496a.a("AndroidNetClient", c5519e + ", error = " + th.getMessage());
                            AbstractC4965w.a((Closeable) r2);
                            if (c5521g != null) {
                                c5521g.b.disconnect();
                            }
                            TrafficStats.clearThreadStatsTag();
                        } catch (Throwable th3) {
                            if (z) {
                                AbstractC4965w.a((Closeable) r2);
                                if (c5521g != null) {
                                    c5521g.b.disconnect();
                                }
                            }
                            TrafficStats.clearThreadStatsTag();
                            throw th3;
                        }
                    }
                } else {
                    String str = a2 != null ? a2.d : null;
                    InputStream errorStream = c5521g2.b.getErrorStream();
                    if (TextUtils.isEmpty(str)) {
                        str = AbstractC4965w.a(errorStream);
                    }
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(str)) {
                        sb.append(str).append(", ");
                    }
                    sb.append("responseCode is ").append(c5521g2.c).append(", validate fail.");
                    AbstractC5496a.a("AndroidNetClient", c5519e + ", responseCode = " + c5521g2.c + ", is invalid.");
                    C5505e c5505e = new C5505e(c5521g2.c, sb.toString());
                    if (c5519e.e == null) {
                        c5519e.f13418a.b.f();
                    }
                    abstractC5503c.a(c5519e.f13418a, c5505e);
                    z2 = true;
                    inputStream = errorStream;
                }
                if (z || z2) {
                    AbstractC4965w.a((Closeable) inputStream);
                    c5521g2.b.disconnect();
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            r2 = 0;
        }
        TrafficStats.clearThreadStatsTag();
    }
}
