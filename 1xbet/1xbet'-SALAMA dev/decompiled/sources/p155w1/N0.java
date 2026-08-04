package p155w1;

import D0.i;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p036e6.c;
import p096n1.e;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public e f17460A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public HttpURLConnection f17461B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f17462C;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public M0 f17466G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Serializable f17467H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Object f17468I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Y0 f17469J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public c f17470K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17471a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17476f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f17472b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f17473c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17474d = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f17477x = 10000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f17478y = 15000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f17479z = true;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f17463D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f17464E = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final p145u1.c f17465F = new p145u1.c(27, false);

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        this.f17460A = new e(this, 22);
        p145u1.c cVar = this.f17465F;
        try {
            try {
                if (this.f17475e != null && H2.a().f17404b.f17606B) {
                    int i7 = this.f17476f;
                    if (i7 == 0 || p136t.e.b(1, i7)) {
                        this.f17476f = 2;
                    }
                    d();
                }
            } catch (Exception e7) {
                Log.getStackTraceString(e7);
                HttpURLConnection httpURLConnection = this.f17461B;
                if (httpURLConnection != null) {
                    httpURLConnection.getReadTimeout();
                    this.f17461B.getConnectTimeout();
                }
            }
        } finally {
            cVar.c();
            b();
        }
    }

    public final void b() {
        if (this.f17460A == null) {
            return;
        }
        c();
        N0 n2 = (N0) this.f17460A.f15314b;
        if (n2.f17466G != null) {
            n2.c();
            n2.f17466G.o(n2.f17468I, n2);
        }
    }

    public final boolean c() {
        synchronized (this.f17474d) {
        }
        return false;
    }

    public final void d() {
        OutputStream outputStream;
        Y0 y4;
        InputStream inputStream;
        String strConcat = this.f17475e;
        if (!TextUtils.isEmpty(strConcat) && Uri.parse(strConcat).getScheme() == null) {
            strConcat = "http://".concat(String.valueOf(strConcat));
        }
        this.f17475e = strConcat;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f17475e).openConnection();
                this.f17461B = httpURLConnection;
                httpURLConnection.setConnectTimeout(this.f17477x);
                this.f17461B.setReadTimeout(this.f17478y);
                this.f17461B.setRequestMethod(L.d(this.f17476f));
                this.f17461B.setInstanceFollowRedirects(this.f17479z);
                this.f17461B.setDoOutput(p136t.e.b(3, this.f17476f));
                this.f17461B.setDoInput(true);
                TrafficStats.setThreadStatsTag(1234);
                for (Map.Entry entry : this.f17472b.a()) {
                    this.f17461B.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!p136t.e.b(2, this.f17476f) && !p136t.e.b(3, this.f17476f)) {
                    this.f17461B.setRequestProperty("Accept-Encoding", "");
                }
                if (this.f17464E) {
                    HttpURLConnection httpURLConnection2 = this.f17461B;
                    if (httpURLConnection2 instanceof HttpsURLConnection) {
                        httpURLConnection2.connect();
                        P0.a((HttpsURLConnection) this.f17461B);
                    }
                }
                Closeable closeable = null;
                if (p136t.e.b(3, this.f17476f)) {
                    try {
                        outputStream = this.f17461B.getOutputStream();
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                            try {
                                if (this.f17460A != null) {
                                    c();
                                    N0 n2 = (N0) this.f17460A.f15314b;
                                    Serializable serializable = n2.f17467H;
                                    if (serializable != null && (y4 = n2.f17469J) != null) {
                                        y4.s(serializable, bufferedOutputStream);
                                    }
                                }
                                AbstractC0997i0.h(bufferedOutputStream);
                                AbstractC0997i0.h(outputStream);
                            } catch (Throwable th) {
                                th = th;
                                closeable = bufferedOutputStream;
                                AbstractC0997i0.h(closeable);
                                AbstractC0997i0.h(outputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = null;
                    }
                }
                this.f17463D = this.f17461B.getResponseCode();
                this.f17465F.c();
                for (Map.Entry<String, List<String>> entry2 : this.f17461B.getHeaderFields().entrySet()) {
                    for (String str : entry2.getValue()) {
                        i iVar = this.f17473c;
                        String key = entry2.getKey();
                        if (key == null) {
                            iVar.getClass();
                        } else {
                            HashMap map = iVar.f1652a;
                            List arrayList = (List) map.get(key);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                map.put(key, arrayList);
                            }
                            arrayList.add(str);
                        }
                    }
                }
                if (!p136t.e.b(2, this.f17476f) && !p136t.e.b(3, this.f17476f)) {
                    e();
                    return;
                }
                try {
                    InputStream inputStream2 = this.f17463D == 200 ? this.f17461B.getInputStream() : this.f17461B.getErrorStream();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream2);
                        try {
                            if (this.f17460A != null) {
                                c();
                                N0 n7 = (N0) this.f17460A.f15314b;
                                c cVar = n7.f17470K;
                                if (cVar != null) {
                                    n7.f17468I = cVar.h(bufferedInputStream);
                                }
                            }
                            AbstractC0997i0.h(bufferedInputStream);
                            AbstractC0997i0.h(inputStream2);
                            e();
                        } catch (Throwable th4) {
                            closeable = bufferedInputStream;
                            inputStream = inputStream2;
                            th = th4;
                            AbstractC0997i0.h(closeable);
                            AbstractC0997i0.h(inputStream);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        inputStream = inputStream2;
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    inputStream = null;
                }
            } catch (Exception e7) {
                e7.getLocalizedMessage();
                e();
            }
        } catch (Throwable th7) {
            e();
            throw th7;
        }
    }

    public final void e() {
        if (this.f17462C) {
            return;
        }
        this.f17462C = true;
        HttpURLConnection httpURLConnection = this.f17461B;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
