package w1;

import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import e6.C1054c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import n1.C1450e;

/* loaded from: classes.dex */
public final class N0 extends AbstractRunnableC1687d1 {

    /* renamed from: A, reason: collision with root package name */
    public C1450e f17454A;

    /* renamed from: B, reason: collision with root package name */
    public HttpURLConnection f17455B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17456C;

    /* renamed from: G, reason: collision with root package name */
    public M0 f17460G;

    /* renamed from: H, reason: collision with root package name */
    public Serializable f17461H;

    /* renamed from: I, reason: collision with root package name */
    public Object f17462I;

    /* renamed from: J, reason: collision with root package name */
    public Y0 f17463J;

    /* renamed from: K, reason: collision with root package name */
    public C1054c f17464K;

    /* renamed from: a, reason: collision with root package name */
    public int f17465a;

    /* renamed from: e, reason: collision with root package name */
    public String f17469e;

    /* renamed from: f, reason: collision with root package name */
    public int f17470f;

    /* renamed from: b, reason: collision with root package name */
    public final D0.i f17466b = new D0.i();

    /* renamed from: c, reason: collision with root package name */
    public final D0.i f17467c = new D0.i();

    /* renamed from: d, reason: collision with root package name */
    public final Object f17468d = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final int f17471x = 10000;

    /* renamed from: y, reason: collision with root package name */
    public final int f17472y = 15000;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f17473z = true;

    /* renamed from: D, reason: collision with root package name */
    public int f17457D = -1;

    /* renamed from: E, reason: collision with root package name */
    public boolean f17458E = false;

    /* renamed from: F, reason: collision with root package name */
    public final u1.c f17459F = new u1.c(27, false);

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        this.f17454A = new C1450e(this, 22);
        u1.c cVar = this.f17459F;
        try {
            try {
                if (this.f17469e != null && H2.a().f17398b.f17600B) {
                    int i7 = this.f17470f;
                    if (i7 != 0) {
                        if (t.e.b(1, i7)) {
                        }
                        d();
                    }
                    this.f17470f = 2;
                    d();
                }
            } catch (Exception e7) {
                Log.getStackTraceString(e7);
                HttpURLConnection httpURLConnection = this.f17455B;
                if (httpURLConnection != null) {
                    httpURLConnection.getReadTimeout();
                    this.f17455B.getConnectTimeout();
                }
            }
        } finally {
            cVar.c();
            b();
        }
    }

    public final void b() {
        if (this.f17454A == null) {
            return;
        }
        c();
        N0 n02 = (N0) this.f17454A.f15308b;
        if (n02.f17460G != null) {
            n02.c();
            n02.f17460G.o(n02.f17462I, n02);
        }
    }

    public final boolean c() {
        synchronized (this.f17468d) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v5, types: [e6.c] */
    public final void d() {
        OutputStream outputStream;
        BufferedOutputStream bufferedOutputStream;
        Y0 y02;
        InputStream inputStream;
        InputStream inputStream2;
        ?? bufferedInputStream;
        String str = this.f17469e;
        if (!TextUtils.isEmpty(str) && Uri.parse(str).getScheme() == null) {
            str = "http://".concat(String.valueOf(str));
        }
        this.f17469e = str;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f17469e).openConnection();
                this.f17455B = httpURLConnection;
                httpURLConnection.setConnectTimeout(this.f17471x);
                this.f17455B.setReadTimeout(this.f17472y);
                this.f17455B.setRequestMethod(L.d(this.f17470f));
                this.f17455B.setInstanceFollowRedirects(this.f17473z);
                this.f17455B.setDoOutput(t.e.b(3, this.f17470f));
                this.f17455B.setDoInput(true);
                TrafficStats.setThreadStatsTag(1234);
                Iterator it = this.f17466b.a().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.f17455B.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!t.e.b(2, this.f17470f) && !t.e.b(3, this.f17470f)) {
                    this.f17455B.setRequestProperty("Accept-Encoding", "");
                }
                if (this.f17458E) {
                    HttpURLConnection httpURLConnection2 = this.f17455B;
                    if (httpURLConnection2 instanceof HttpsURLConnection) {
                        httpURLConnection2.connect();
                        P0.a((HttpsURLConnection) this.f17455B);
                    }
                }
                BufferedOutputStream bufferedOutputStream2 = null;
                if (t.e.b(3, this.f17470f)) {
                    try {
                        outputStream = this.f17455B.getOutputStream();
                        try {
                            bufferedOutputStream = new BufferedOutputStream(outputStream);
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                    }
                    try {
                        if (this.f17454A != null) {
                            c();
                            N0 n02 = (N0) this.f17454A.f15308b;
                            Serializable serializable = n02.f17461H;
                            if (serializable != null && (y02 = n02.f17463J) != null) {
                                y02.s(serializable, bufferedOutputStream);
                            }
                        }
                        AbstractC1706i0.h(bufferedOutputStream);
                        AbstractC1706i0.h(outputStream);
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream2 = bufferedOutputStream;
                        AbstractC1706i0.h(bufferedOutputStream2);
                        AbstractC1706i0.h(outputStream);
                        throw th;
                    }
                }
                this.f17457D = this.f17455B.getResponseCode();
                this.f17459F.c();
                for (Map.Entry<String, List<String>> entry2 : this.f17455B.getHeaderFields().entrySet()) {
                    for (String str2 : entry2.getValue()) {
                        D0.i iVar = this.f17467c;
                        String key = entry2.getKey();
                        if (key == null) {
                            iVar.getClass();
                        } else {
                            HashMap hashMap = iVar.f1652a;
                            List list = (List) hashMap.get(key);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(key, list);
                            }
                            list.add(str2);
                        }
                    }
                }
                if (!t.e.b(2, this.f17470f) && !t.e.b(3, this.f17470f)) {
                    e();
                    return;
                }
                try {
                    inputStream2 = this.f17457D == 200 ? this.f17455B.getInputStream() : this.f17455B.getErrorStream();
                    try {
                        bufferedInputStream = new BufferedInputStream(inputStream2);
                    } catch (Throwable th4) {
                        inputStream = inputStream2;
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                }
                try {
                    if (this.f17454A != null) {
                        c();
                        N0 n03 = (N0) this.f17454A.f15308b;
                        ?? r32 = n03.f17464K;
                        if (r32 != 0) {
                            n03.f17462I = r32.h(bufferedInputStream);
                        }
                    }
                    AbstractC1706i0.h(bufferedInputStream);
                    AbstractC1706i0.h(inputStream2);
                    e();
                } catch (Throwable th6) {
                    bufferedOutputStream2 = bufferedInputStream;
                    inputStream = inputStream2;
                    th = th6;
                    AbstractC1706i0.h(bufferedOutputStream2);
                    AbstractC1706i0.h(inputStream);
                    throw th;
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
        if (this.f17456C) {
            return;
        }
        this.f17456C = true;
        HttpURLConnection httpURLConnection = this.f17455B;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
