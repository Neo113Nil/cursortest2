package com.applovin.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import androidx.webkit.ProxyConfig;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.common.net.HttpHeaders;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class r0 {
    private static final List f = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4404a;
    private final com.applovin.impl.sdk.p b;
    private final g4 c;
    private d d;
    private final Set e = Collections.synchronizedSet(new HashSet());

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f4405a;
        private long b;

        public long a() {
            return this.f4405a;
        }

        public long b() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            this.f4405a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            this.b = j;
        }
    }

    private class c implements Consumer {

        /* renamed from: a, reason: collision with root package name */
        private final String f4406a;
        private final com.applovin.impl.sdk.network.a b;
        private final String c;
        private final Object d;
        private final boolean e;
        private final b f;
        private final e g;

        @Override // androidx.core.util.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(g4.d dVar) {
            int i;
            long e = dVar.e();
            Object obj = null;
            try {
                try {
                    int c = dVar.c();
                    try {
                        if (c <= 0) {
                            r0.this.a(this.c, this.f4406a, c, e, (Throwable) null);
                            this.g.a(this.f4406a, c, null, null);
                            return;
                        }
                        if (c < 200 || c >= 400) {
                            this.g.a(this.f4406a, c, null, null);
                            return;
                        }
                        b bVar = this.f;
                        if (bVar != null) {
                            bVar.a(e);
                        }
                        r0.this.a(this.c, this.f4406a, c, e);
                        byte[] d = dVar.d();
                        if (t7.h(com.applovin.impl.sdk.l.p()) && (!this.e || z4.b(d) != z4.a.V2)) {
                            r0.this.f4404a.u().a(d != null ? new String(dVar.d(), Charset.forName("UTF-8")) : "", this.f4406a, this.b.b() != null ? this.b.b().toString() : "");
                        }
                        if (d == null) {
                            this.g.a(this.f4406a, this.d, c);
                            return;
                        }
                        String str = new String(dVar.d(), Charset.forName("UTF-8"));
                        b bVar2 = this.f;
                        if (bVar2 != null) {
                            bVar2.b(d.length);
                            if (this.b.r()) {
                                r0.this.d = new d(this.b.f(), d.length, e);
                            }
                        }
                        if (this.e) {
                            String b = z4.b(d, r0.this.f4404a);
                            if (b == null) {
                                HashMap<String, String> hashMap = CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f4406a));
                                if (((Boolean) r0.this.f4404a.a(c5.T5)).booleanValue()) {
                                    CollectionUtils.putStringIfValid("details", str, hashMap);
                                }
                                r0.this.f4404a.E().d(h2.q1, hashMap);
                            }
                            str = b;
                        }
                        try {
                            this.g.a(this.f4406a, r0.this.a(str, this.d), c);
                        } catch (Throwable th) {
                            String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f4406a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                            com.applovin.impl.sdk.p unused = r0.this.b;
                            if (com.applovin.impl.sdk.p.a()) {
                                r0.this.b.a("ConnectionManager", str2, th);
                            }
                            r0.this.f4404a.E().a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f4406a)));
                            this.g.a(this.f4406a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                        }
                    } catch (MalformedURLException e2) {
                        e = e2;
                        i = c;
                        if (this.d != null) {
                            r0.this.a(this.c, this.f4406a, i, e, e);
                            this.g.a(this.f4406a, -901, e.getMessage(), null);
                        } else {
                            r0.this.a(this.c, this.f4406a, i, e);
                            this.g.a(this.f4406a, this.d, -901);
                        }
                    }
                } catch (MalformedURLException e3) {
                    e = e3;
                    i = 0;
                }
            } catch (Throwable th2) {
                int b2 = dVar.b();
                try {
                    byte[] f = dVar.f();
                    String str3 = new String(f);
                    if (f != null) {
                        if (this.e) {
                            str3 = z4.b(f, r0.this.f4404a);
                        }
                        obj = r0.this.a(str3, this.d);
                    }
                } catch (Throwable unused2) {
                }
                r0.this.a(this.c, this.f4406a, b2, e, th2);
                this.g.a(this.f4406a, b2, th2.getMessage(), obj);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z, b bVar, e eVar) {
            this.f4406a = str;
            this.b = aVar;
            this.c = str2;
            this.d = obj;
            this.e = z;
            this.f = bVar;
            this.g = eVar;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f4407a = System.currentTimeMillis();
        private final String b;
        private final long c;
        private final long d;

        public d(String str, long j, long j2) {
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        protected boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.c;
        }

        public long c() {
            return this.f4407a;
        }

        public String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String d = d();
            String d2 = dVar.d();
            return d != null ? d.equals(d2) : d2 == null;
        }

        public int hashCode() {
            long c = c();
            long b = b();
            int i = ((((int) (c ^ (c >>> 32))) + 59) * 59) + ((int) (b ^ (b >>> 32)));
            long a2 = a();
            String d = d();
            return (((i * 59) + ((int) ((a2 >>> 32) ^ a2))) * 59) + (d == null ? 43 : d.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.d;
        }
    }

    public interface e {
        void a(String str, int i, String str2, Object obj);

        void a(String str, Object obj, int i);
    }

    public r0(com.applovin.impl.sdk.l lVar) {
        this.f4404a = lVar;
        this.b = lVar.Q();
        g4 g4Var = new g4(lVar);
        this.c = g4Var;
        g4Var.a();
    }

    private String c(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    public void b(String str) {
        if (((Boolean) this.f4404a.a(c5.B3)).booleanValue()) {
            String hostAndPath = StringUtils.getHostAndPath(str);
            if (TextUtils.isEmpty(hostAndPath)) {
                return;
            }
            this.e.add(hostAndPath);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ff A[Catch: all -> 0x0278, TryCatch #1 {all -> 0x0278, blocks: (B:33:0x00ee, B:35:0x00fe, B:38:0x0129, B:39:0x0125, B:40:0x013a, B:44:0x0162, B:46:0x0172, B:49:0x0193, B:52:0x01e5, B:55:0x01f4, B:57:0x01ff, B:58:0x0197, B:61:0x019f, B:68:0x01b7, B:70:0x01bd, B:71:0x01d3, B:72:0x0180, B:73:0x0202, B:75:0x0208, B:77:0x0220, B:78:0x022e, B:79:0x0243, B:64:0x01b0), top: B:32:0x00ee, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(com.applovin.impl.sdk.network.a aVar, b bVar, e eVar) {
        byte[] bytes;
        byte[] a2;
        if (aVar != null) {
            String f2 = aVar.f();
            String h = aVar.h();
            if (f2 == null) {
                throw new IllegalArgumentException("No endpoint specified");
            }
            if (h == null) {
                throw new IllegalArgumentException("No method specified");
            }
            if (eVar != null) {
                if (!f2.toLowerCase().startsWith(ProxyConfig.MATCH_HTTP)) {
                    String str = "Requested postback submission to non HTTP endpoint " + f2 + "; skipping...";
                    com.applovin.impl.sdk.p.h("ConnectionManager", str);
                    eVar.a(f2, AppLovinErrorCodes.INVALID_URL, str, null);
                    return;
                }
                String httpsString = StringUtils.toHttpsString(f2);
                HashMap hashMap = new HashMap(2);
                boolean m = aVar.m();
                z4.a a3 = ((Boolean) this.f4404a.a(c5.y5)).booleanValue() ? z4.a.a(((Integer) this.f4404a.a(c5.v5)).intValue()) : aVar.e();
                long a4 = t7.a(this.f4404a);
                if ((aVar.i() != null && !aVar.i().isEmpty()) || aVar.c() > 0) {
                    Map i = aVar.i();
                    Boolean bool = (Boolean) this.f4404a.a(c5.q3);
                    if (i != null && aVar.c() > 0) {
                        i.put("current_retry_attempt", String.valueOf(aVar.c()));
                    }
                    if (m) {
                        String a5 = t7.a(i, bool.booleanValue());
                        String b2 = z4.b(a5, a4, a3, this.f4404a);
                        if (StringUtils.isValidString(a5) && TextUtils.isEmpty(b2)) {
                            CollectionUtils.putStringIfValid("query", a5, hashMap);
                        }
                        httpsString = StringUtils.appendQueryParameter(httpsString, "p", b2);
                    } else {
                        httpsString = StringUtils.appendQueryParameters(httpsString, i, bool.booleanValue());
                    }
                }
                String str2 = httpsString;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Boolean endsWith = StringUtils.endsWith(StringUtils.getHostAndPath(str2), f);
                    if (com.applovin.impl.sdk.p.a()) {
                        this.b.d("ConnectionManager", "Sending " + h + " request to id=#" + str2.hashCode() + " \"" + (endsWith.booleanValue() ? str2 : StringUtils.getHostAndPath(str2)) + "\"...");
                    }
                    g4.c.a a6 = new g4.c.a().a(str2).b(h).a(aVar.g()).a(aVar.l());
                    if (aVar.b() != null) {
                        if (m) {
                            bytes = z4.a(aVar.b().toString(), a4, a3, this.f4404a);
                            if (bytes == null) {
                                CollectionUtils.putStringIfValid("body", aVar.b().toString(), hashMap);
                            }
                        } else {
                            bytes = aVar.b().toString().getBytes("UTF-8");
                        }
                        byte[] bArr = bytes;
                        if ((!m || a3 != z4.a.V2) && aVar.o() && bArr != null && bArr.length > ((Integer) this.f4404a.a(c5.U5)).intValue()) {
                            try {
                                a2 = t7.a(bArr);
                            } catch (Throwable th) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.b.a("ConnectionManager", "Failed to gzip POST body for request " + c(str2), th);
                                }
                                this.f4404a.E().a("ConnectionManager", "gzip", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(str2)));
                            }
                            a6.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o() && a2 != null) {
                                a6.a(HttpHeaders.CONTENT_ENCODING, "gzip");
                                a6.a(a2);
                            } else if (bArr != null) {
                                a6.a(bArr);
                            }
                        }
                        a2 = null;
                        a6.a("Content-Type", "application/json; charset=utf-8");
                        if (!aVar.o()) {
                        }
                        if (bArr != null) {
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        HashMap<String, String> hashMap2 = CollectionUtils.hashMap("url", StringUtils.getHostAndPath(str2));
                        if (((Boolean) this.f4404a.a(c5.T5)).booleanValue()) {
                            CollectionUtils.putStringIfValid("details", new JSONObject(hashMap).toString(), hashMap2);
                        }
                        this.f4404a.E().a(h2.p1, UByte$$ExternalSyntheticBackport0.m((CharSequence) ",", (Iterable) hashMap.keySet()), hashMap2);
                    }
                    this.c.a(a6.a(new c(str2, aVar, h, aVar.d(), m, bVar, eVar)).a(this.f4404a.s0().c()).a());
                    return;
                } catch (Throwable th2) {
                    a(h, str2, 0, SystemClock.elapsedRealtime() - elapsedRealtime, th2);
                    eVar.a(str2, 0, th2.getMessage(), null);
                    return;
                }
            }
            throw new IllegalArgumentException("No callback specified");
        }
        throw new IllegalArgumentException("No request specified");
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.e.contains(str);
    }

    public d a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof t8) {
                return u8.a(str, this.f4404a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j) {
        if (com.applovin.impl.sdk.p.a()) {
            this.b.d("ConnectionManager", "Successful " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + s0.g(this.f4404a) + " to " + c(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j, Throwable th) {
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("ConnectionManager", "Failed " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + s0.g(this.f4404a) + " to " + c(str2), th);
        }
    }
}
