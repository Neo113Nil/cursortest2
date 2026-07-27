package sg.bigo.ads.z0;

import android.net.Uri;
import android.net.http.HttpEngine;
import android.net.http.UrlRequest;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.x0.C5506f;
import sg.bigo.ads.x0.InterfaceC5501a;

/* renamed from: sg.bigo.ads.z0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5534i {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.B0.c f13435a;
    public final sg.bigo.ads.U.h b;
    public URL c;
    public boolean d = false;

    public C5534i(sg.bigo.ads.B0.c cVar, sg.bigo.ads.U.h hVar) {
        this.f13435a = cVar;
        this.b = hVar;
    }

    public final UrlRequest a(HttpEngine httpEngine, Executor executor, C5536k c5536k) {
        String l;
        this.f13435a.a("PreHost").clear();
        InterfaceC5501a interfaceC5501a = this.f13435a.b;
        String a2 = interfaceC5501a.a();
        String e = interfaceC5501a.e();
        String b = interfaceC5501a.b();
        if (!TextUtils.isEmpty(e) && !TextUtils.isEmpty(b) && !TextUtils.equals(e, b)) {
            this.f13435a.a("PreHost", e);
        }
        if (interfaceC5501a.c()) {
            this.f13435a.a(HttpHeaders.HOST, b);
        }
        this.f13435a.g();
        URL a3 = sg.bigo.ads.A0.c.a(Uri.parse(a2), this.f13435a, this.b);
        this.c = a3;
        UrlRequest.Builder newUrlRequestBuilder = httpEngine.newUrlRequestBuilder(a3.toString(), executor, c5536k);
        newUrlRequestBuilder.setHttpMethod(this.f13435a.e());
        HashMap hashMap = this.f13435a.e;
        this.d = sg.bigo.ads.A0.c.a(hashMap);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Set<String> set = (Set) entry.getValue();
            if (!TextUtils.isEmpty(str) && !A.a(set)) {
                for (String str2 : set) {
                    if (!TextUtils.isEmpty(str2)) {
                        newUrlRequestBuilder.addHeader(str, str2);
                    }
                }
            }
        }
        byte[] a4 = sg.bigo.ads.A0.c.a(this.f13435a, this.b);
        if (a4 != null) {
            C5506f d = this.f13435a.d();
            if (d != null) {
                newUrlRequestBuilder.addHeader("Content-Type", d.f13383a);
            }
            sg.bigo.ads.B0.c cVar = this.f13435a;
            sg.bigo.ads.U.h hVar = this.b;
            if ((cVar instanceof sg.bigo.ads.B0.b) && hVar != null && ((u) hVar).c.B.a(27)) {
                long longValue = ((Long) sg.bigo.ads.F0.b.a("sp_ads", "sp_gzip_server_fail", (Object) 0L, 1)).longValue();
                if (0 == longValue || Math.abs(System.currentTimeMillis() - longValue) >= 14400000) {
                    newUrlRequestBuilder.addHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
                    l = String.valueOf(a4.length);
                    newUrlRequestBuilder.addHeader(HttpHeaders.CONTENT_LENGTH, l);
                    newUrlRequestBuilder.setUploadDataProvider(new C5533h(a4), executor);
                }
            }
            l = Long.toString(this.f13435a.c());
            newUrlRequestBuilder.addHeader(HttpHeaders.CONTENT_LENGTH, l);
            newUrlRequestBuilder.setUploadDataProvider(new C5533h(a4), executor);
        }
        return newUrlRequestBuilder.build();
    }

    public final String toString() {
        return "requestUrl=" + this.f13435a.b.a();
    }
}
