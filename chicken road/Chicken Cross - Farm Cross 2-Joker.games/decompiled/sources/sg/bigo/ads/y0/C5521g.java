package sg.bigo.ads.y0;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.C4966x;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.x0.C5506f;
import sg.bigo.ads.x0.InterfaceC5501a;

/* renamed from: sg.bigo.ads.y0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5521g {

    /* renamed from: a, reason: collision with root package name */
    public final C5519e f13419a;
    public final HttpURLConnection b;
    public final int c;
    public final String d;
    public final C4966x e;
    public final boolean f;

    public C5521g(C5519e c5519e) {
        URL a2;
        String str;
        HttpURLConnection httpURLConnection;
        String l;
        this.f13419a = c5519e;
        URL url = c5519e.e;
        if (url != null) {
            a2 = sg.bigo.ads.A0.c.a(Uri.parse(url.toString()), c5519e.f13418a, c5519e.c);
        } else {
            c5519e.f13418a.a("PreHost").clear();
            InterfaceC5501a interfaceC5501a = c5519e.f13418a.b;
            String a3 = interfaceC5501a.a();
            String e = interfaceC5501a.e();
            String b = interfaceC5501a.b();
            if (!TextUtils.isEmpty(e) && !TextUtils.isEmpty(b) && !TextUtils.equals(e, b)) {
                c5519e.f13418a.a("PreHost", e);
            }
            if (interfaceC5501a.c()) {
                c5519e.f13418a.a(HttpHeaders.HOST, b);
            }
            c5519e.f13418a.g();
            a2 = sg.bigo.ads.A0.c.a(Uri.parse(a3), c5519e.f13418a, c5519e.c);
            c5519e.d = a2;
        }
        boolean equalsIgnoreCase = "HTTPS".equalsIgnoreCase(a2.getProtocol());
        URLConnection openConnection = a2.openConnection();
        c5519e.g = equalsIgnoreCase ? (HttpsURLConnection) openConnection : (HttpURLConnection) openConnection;
        c5519e.g.setInstanceFollowRedirects(false);
        c5519e.g.setDoInput(true);
        c5519e.g.setUseCaches(false);
        c5519e.g.setConnectTimeout((int) c5519e.f13418a.d);
        c5519e.g.setReadTimeout((int) c5519e.f13418a.d);
        c5519e.g.setRequestMethod(c5519e.f13418a.e());
        HashMap hashMap = c5519e.f13418a.e;
        c5519e.h = sg.bigo.ads.A0.c.a(hashMap);
        if (!hashMap.containsKey(HttpHeaders.HOST)) {
            try {
                C5518d c5518d = c5519e.b;
                String host = c5519e.g.getURL().getHost();
                c5518d.getClass();
                str = TextUtils.isEmpty(host) ? "" : (String) c5518d.f13417a.get(host);
            } catch (Exception unused) {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(HttpHeaders.HOST, new HashSet(Collections.singletonList(str)));
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            Set<String> set = (Set) entry.getValue();
            if (!TextUtils.isEmpty(str2) && !A.a(set)) {
                for (String str3 : set) {
                    if (!TextUtils.isEmpty(str3)) {
                        c5519e.g.addRequestProperty(str2, str3);
                    }
                }
            }
        }
        byte[] a4 = sg.bigo.ads.A0.c.a(c5519e.f13418a, c5519e.c);
        if (a4 != null) {
            C5506f d = c5519e.f13418a.d();
            if (d != null) {
                c5519e.g.setRequestProperty("Content-Type", d.f13383a);
            }
            c5519e.g.setDoOutput(true);
            sg.bigo.ads.B0.c cVar = c5519e.f13418a;
            sg.bigo.ads.U.h hVar = c5519e.c;
            if ((cVar instanceof sg.bigo.ads.B0.b) && hVar != null && ((u) hVar).c.B.a(27)) {
                long longValue = ((Long) sg.bigo.ads.F0.b.a("sp_ads", "sp_gzip_server_fail", (Object) 0L, 1)).longValue();
                if (0 == longValue || Math.abs(System.currentTimeMillis() - longValue) >= 14400000) {
                    c5519e.g.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
                    httpURLConnection = c5519e.g;
                    l = String.valueOf(a4.length);
                    httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, l);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c5519e.g.getOutputStream());
                    bufferedOutputStream.write(a4);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                }
            }
            httpURLConnection = c5519e.g;
            l = Long.toString(c5519e.f13418a.c());
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, l);
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(c5519e.g.getOutputStream());
            bufferedOutputStream2.write(a4);
            bufferedOutputStream2.flush();
            bufferedOutputStream2.close();
        }
        HttpURLConnection httpURLConnection2 = c5519e.g;
        this.b = httpURLConnection2;
        this.c = httpURLConnection2.getResponseCode();
        this.d = httpURLConnection2.getRequestMethod();
        C4966x c4966x = new C4966x();
        this.e = c4966x;
        Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
        if (headerFields != null && !headerFields.isEmpty()) {
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                String key = entry2.getKey();
                List<String> value = entry2.getValue();
                if (key != null && value != null) {
                    c4966x.f12365a.put(key.toLowerCase(), value);
                }
            }
        }
        boolean equalsIgnoreCase2 = "gzip".equalsIgnoreCase(this.b.getContentEncoding());
        this.f = equalsIgnoreCase2;
        if (equalsIgnoreCase2 && c5519e.h) {
            this.e.f12365a.remove(HttpHeaders.CONTENT_ENCODING.toLowerCase());
            this.e.f12365a.remove(HttpHeaders.CONTENT_LENGTH.toLowerCase());
        }
    }

    public final C5520f a() {
        int i = this.c;
        if (i != 307 && i != 308) {
            switch (i) {
            }
            return null;
        }
        List list = (List) this.e.f12365a.get(HttpHeaders.LOCATION.toLowerCase());
        int size = list != null ? list.size() : 0;
        String str = "";
        while (TextUtils.isEmpty(str) && size > 0) {
            str = (String) list.get(0);
        }
        sg.bigo.ads.A0.a a2 = sg.bigo.ads.A0.b.a(this.c, str, this.d, this.b.getURL(), this.f13419a.d);
        if (a2 == null) {
            return null;
        }
        return new C5520f(a2.f12211a, a2.b, a2.c, a2.d, a2.e);
    }
}
