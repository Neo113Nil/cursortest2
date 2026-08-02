package com.google.android.gms.internal.ads;

import Q2.C0355e;
import Q2.C0375o;
import Q2.C0379q;
import Q2.C0387u0;
import T2.C0438p;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import c3.AbstractC0539a;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import m3.InterfaceC2093c;
import org.json.JSONException;
import org.json.JSONObject;
import q3.AbstractC2309b;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.Wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0709Wb implements InterfaceC1856z, InterfaceC2093c, InterfaceC0641Md, Jw, Xu, A8, Cif, Ar, InterfaceC1165jj, Br, InterfaceC1621tq {

    /* renamed from: n, reason: collision with root package name */
    public static InterfaceC1563sd f12038n;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12039k;

    /* renamed from: l, reason: collision with root package name */
    public Object f12040l;

    /* renamed from: m, reason: collision with root package name */
    public Object f12041m;

    public /* synthetic */ C0709Wb() {
        this.f12039k = 3;
    }

    @Override // m3.InterfaceC2093c
    public void Y(j3.b bVar) {
        synchronized (((D3.l) this.f12041m).f962m) {
            ((C1548s6) this.f12040l).c(new RuntimeException("Connection failed."));
        }
    }

    @Override // com.google.android.gms.internal.ads.Xu
    /* renamed from: a */
    public InterfaceC1402ov mo19a() {
        AtomicInteger atomicInteger = C0614Ie.f9545E;
        InterfaceC1402ov mo19a = ((Xu) this.f12040l).mo19a();
        byte[] bArr = (byte[]) this.f12041m;
        return new C0593Fe(new C0953eu(bArr), bArr.length, mo19a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1856z
    public C1811y c(B b3, long j5) {
        long j6 = b3.f7752n;
        int min = (int) Math.min(20000L, b3.f7751m - j6);
        C1617tm c1617tm = (C1617tm) this.f12041m;
        c1617tm.g(min);
        b3.G(c1617tm.f15724a, 0, min, false);
        int i = -1;
        int i5 = -1;
        long j7 = -9223372036854775807L;
        while (c1617tm.o() >= 4) {
            if (C1363o0.d(c1617tm.f15725b, c1617tm.f15724a) != 442) {
                c1617tm.k(1);
            } else {
                c1617tm.k(4);
                long a5 = V2.a(c1617tm);
                if (a5 != -9223372036854775807L) {
                    long b5 = ((Kn) this.f12040l).b(a5);
                    if (b5 > j5) {
                        return j7 == -9223372036854775807L ? new C1811y(-1, b5, j6) : new C1811y(0, -9223372036854775807L, j6 + i5);
                    }
                    if (b5 + 100000 > j5) {
                        return new C1811y(0, -9223372036854775807L, j6 + c1617tm.f15725b);
                    }
                    j7 = b5;
                    i5 = c1617tm.f15725b;
                }
                int i6 = c1617tm.f15726c;
                if (c1617tm.o() >= 10) {
                    c1617tm.k(9);
                    int v4 = c1617tm.v() & 7;
                    if (c1617tm.o() >= v4) {
                        c1617tm.k(v4);
                        if (c1617tm.o() >= 4) {
                            if (C1363o0.d(c1617tm.f15725b, c1617tm.f15724a) == 443) {
                                c1617tm.k(4);
                                int z3 = c1617tm.z();
                                if (c1617tm.o() < z3) {
                                    c1617tm.j(i6);
                                } else {
                                    c1617tm.k(z3);
                                }
                            }
                            while (true) {
                                if (c1617tm.o() < 4) {
                                    break;
                                }
                                int d5 = C1363o0.d(c1617tm.f15725b, c1617tm.f15724a);
                                if (d5 == 442 || d5 == 441 || (d5 >>> 8) != 1) {
                                    break;
                                }
                                c1617tm.k(4);
                                if (c1617tm.o() < 2) {
                                    c1617tm.j(i6);
                                    break;
                                }
                                c1617tm.j(Math.min(c1617tm.f15726c, c1617tm.f15725b + c1617tm.z()));
                            }
                        } else {
                            c1617tm.j(i6);
                        }
                    } else {
                        c1617tm.j(i6);
                    }
                } else {
                    c1617tm.j(i6);
                }
                i = c1617tm.f15725b;
            }
        }
        return j7 != -9223372036854775807L ? new C1811y(-2, j7, j6 + i) : C1811y.f16372d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    @Override // com.google.android.gms.internal.ads.A8
    public JSONObject d() {
        return ((E5) this.f12040l).r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1621tq
    public /* bridge */ /* synthetic */ E3.a e(C1390oj c1390oj, InterfaceC1576sq interfaceC1576sq) {
        return m(c1390oj, interfaceC1576sq, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnTouchListener, com.google.android.gms.internal.ads.E5] */
    @Override // com.google.android.gms.internal.ads.A8
    public void f(MotionEvent motionEvent) {
        ((E5) this.f12040l).onTouch(null, motionEvent);
    }

    public void g(long j5, C1617tm c1617tm) {
        if (c1617tm.o() < 9) {
            return;
        }
        int q5 = c1617tm.q();
        int q6 = c1617tm.q();
        int v4 = c1617tm.v();
        if (q5 == 434 && q6 == 1195456820 && v4 == 3) {
            AbstractC1803xs.v(j5, c1617tm, (InterfaceC0737a0[]) this.f12041m);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    @Override // com.google.android.gms.internal.ads.A8
    public void i() {
        C1761wv c1761wv = Oj.f10958z;
        ?? r1 = (E5) this.f12040l;
        Map l5 = r1.l();
        if (l5 == null) {
            return;
        }
        int i = c1761wv.f16186n;
        int i5 = 0;
        while (i5 < i) {
            Object obj = l5.get((String) c1761wv.get(i5));
            i5++;
            if (obj != null) {
                r1.onClick((ViewGroup) this.f12041m);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1621tq
    public Object j() {
        InterfaceC0588Eh interfaceC0588Eh;
        synchronized (this) {
            interfaceC0588Eh = (InterfaceC0588Eh) this.f12041m;
        }
        return interfaceC0588Eh;
    }

    @Override // com.google.android.gms.internal.ads.Ar
    public Object k(Object obj) {
        switch (this.f12039k) {
            case 24:
                return p((Hm) obj);
            default:
                Xm xm = (Xm) this.f12040l;
                xm.getClass();
                ContentValues contentValues = new ContentValues();
                K3 k32 = (K3) this.f12041m;
                contentValues.put("timestamp", Long.valueOf(k32.f10115a));
                contentValues.put("gws_query_id", (String) k32.f10117c);
                contentValues.put("url", (String) k32.f10118d);
                contentValues.put("event_state", Integer.valueOf(k32.f10116b - 1));
                ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
                T2.L l5 = P2.o.f4767B.f4771c;
                Context context = xm.f12235k;
                T2.x a5 = T2.L.a(context);
                if (a5 != null) {
                    try {
                        a5.zze(new BinderC2361b(context));
                    } catch (RemoteException e3) {
                        T2.G.n("Failed to schedule offline ping sender.", e3);
                    }
                }
                return null;
        }
    }

    public synchronized E3.a m(C1390oj c1390oj, InterfaceC1576sq interfaceC1576sq, InterfaceC0588Eh interfaceC0588Eh) {
        C1428pc c1428pc;
        this.f12041m = interfaceC0588Eh;
        if (interfaceC0588Eh == null || (c1428pc = (C1428pc) c1390oj.f14827l) == null) {
            return ((Qt) this.f12040l).m(c1390oj, interfaceC1576sq, interfaceC0588Eh);
        }
        C1253lh d5 = interfaceC0588Eh.d();
        return d5.a(d5.c(AbstractC1400ot.c0(c1428pc)));
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public void n(String str, int i, String str2, boolean z3) {
        switch (this.f12039k) {
            case 19:
                C0765ak c0765ak = (C0765ak) this.f12040l;
                c0765ak.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("messageType", "validatorHtmlLoaded");
                hashMap.put("id", (String) ((Map) this.f12041m).get("id"));
                c0765ak.f12700b.b(hashMap);
                break;
            default:
                C0634Ld c0634Ld = (C0634Ld) this.f12041m;
                if (!z3) {
                    c0634Ld.c(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
                    break;
                } else {
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8816d2)).booleanValue()) {
                        P2.o.f4767B.f4776j.getClass();
                        ((Bundle) this.f12040l).putLong("rendering-webview-load-html-end", System.currentTimeMillis());
                    }
                    c0634Ld.b(null);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        switch (this.f12039k) {
            case 11:
                ((InterfaceC0648Nd) this.f12040l).mo13k(obj);
                break;
            case 16:
                AbstractC0613Id.f.execute(new K4(22, (C1075hh) this.f12041m));
                ((C0375o) this.f12040l).mo14o((AbstractC0762ah) obj);
                break;
            case 20:
                ((InterfaceC0677Re) obj).s0((String) this.f12040l, (InterfaceC1821y9) this.f12041m);
                break;
            case 22:
                ((Ol) obj).f10986w = true;
                ((BinderC0767am) this.f12041m).f12706n.b((String) this.f12040l);
                break;
            default:
                String str = (String) obj;
                try {
                    C1338nc c1338nc = (C1338nc) this.f12041m;
                    C1025gc c1025gc = (C1025gc) this.f12040l;
                    Parcel N5 = c1338nc.N();
                    N5.writeString(str);
                    F5.c(N5, c1025gc);
                    c1338nc.d1(N5, 1);
                    break;
                } catch (RemoteException e3) {
                    T2.G.n("Service can't call client", e3);
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0252, code lost:
    
        U2.j.i("Received error HTTP response code: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0279, code lost:
    
        throw new com.google.android.gms.internal.ads.C0856cm("Received error HTTP response code: " + r0, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c8, code lost:
    
        r14.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x029c, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Im p(Hm hm) {
        String str;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        BufferedOutputStream bufferedOutputStream;
        C0709Wb c0709Wb = this;
        String str2 = (String) c0709Wb.f12041m;
        String str3 = hm.f9470a;
        int i = hm.f9471b;
        HashMap hashMap = hm.f9472c;
        byte[] bArr = hm.f9473d;
        String str4 = hm.f9474e;
        P2.o.f4767B.f4776j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Im im = new Im();
            im.f9614a = 0;
            im.f9615b = new HashMap();
            im.f9616c = "";
            im.f9617d = -1L;
            U2.j.h("SDK version: " + str2);
            U2.j.d("AdRequestServiceImpl: Sending request: " + str3);
            URL url = new URL(str3);
            HashMap hashMap2 = new HashMap();
            int i5 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    try {
                        P2.o.f4767B.f4771c.z((Context) c0709Wb.f12040l, str2, httpURLConnection, i);
                        for (Iterator it = hashMap.entrySet().iterator(); it.hasNext(); it = it) {
                            Map.Entry entry = (Map.Entry) it.next();
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            httpURLConnection.setRequestProperty("Content-Type", str4);
                        }
                        U2.g gVar = new U2.g();
                        try {
                            gVar.a(httpURLConnection, bArr);
                            str = str2;
                        } catch (Throwable th) {
                            U2.j.g("Network request logging failed.", th);
                            str = str2;
                            P2.o.f4767B.f4774g.h("HttpRequestFunction.logAdRequest", th);
                        }
                        int length = bArr.length;
                        int i6 = 1;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr);
                                    AbstractC2309b.c(bufferedOutputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    AbstractC2309b.c(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = null;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        Iterator<Map.Entry<String, List<String>>> it2 = httpURLConnection.getHeaderFields().entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, List<String>> next = it2.next();
                            int i7 = i6;
                            String key = next.getKey();
                            Iterator<Map.Entry<String, List<String>>> it3 = it2;
                            List<String> value = next.getValue();
                            if (hashMap2.containsKey(key)) {
                                ((List) hashMap2.get(key)).addAll(value);
                            } else {
                                hashMap2.put(key, new ArrayList(value));
                                i = i;
                            }
                            it2 = it3;
                            i6 = i7;
                        }
                        int i8 = i6;
                        int i9 = i;
                        gVar.b(httpURLConnection, responseCode);
                        im.f9614a = responseCode;
                        im.f9615b = hashMap2;
                        im.f9616c = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                            } catch (Throwable th4) {
                                th = th4;
                                inputStreamReader = null;
                            }
                            try {
                                T2.L l5 = P2.o.f4767B.f4771c;
                                StringBuilder sb = new StringBuilder(8192);
                                char[] cArr = new char[2048];
                                while (true) {
                                    int read = inputStreamReader2.read(cArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    sb.append(cArr, 0, read);
                                }
                                String sb2 = sb.toString();
                                AbstractC2309b.c(inputStreamReader2);
                                if (U2.g.c() && sb2 != null) {
                                    gVar.d("onNetworkResponseBody", new A0.J0(sb2.getBytes()));
                                }
                                im.f9616c = sb2;
                                if (TextUtils.isEmpty(sb2)) {
                                    if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.j5)).booleanValue()) {
                                        throw new C0856cm(3);
                                    }
                                }
                                P2.o.f4767B.f4776j.getClass();
                                im.f9617d = SystemClock.elapsedRealtime() - elapsedRealtime;
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = inputStreamReader2;
                                AbstractC2309b.c(inputStreamReader);
                                throw th;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                break;
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                U2.j.i("No location header to follow redirect.");
                                throw new C0856cm("No location header to follow redirect", 1);
                            }
                            A7 a7 = F7.v7;
                            Q2.r rVar = Q2.r.f5053d;
                            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e3) {
                                    throw new C0856cm(e3.getMessage(), e3);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            i5++;
                            if (i5 > ((Integer) rVar.f5056c.a(F7.f8744P4)).intValue()) {
                                U2.j.i("Too many redirects.");
                                throw new C0856cm("Too many redirects", i8);
                            }
                            httpURLConnection.disconnect();
                            c0709Wb = this;
                            str2 = str;
                            i = i9;
                        }
                    } catch (C0856cm e5) {
                        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.T7)).booleanValue()) {
                            throw e5;
                        }
                        P2.o.f4767B.f4776j.getClass();
                        im.f9617d = SystemClock.elapsedRealtime() - elapsedRealtime;
                    }
                } catch (Throwable th6) {
                    httpURLConnection.disconnect();
                    throw th6;
                }
            }
        } catch (IOException e6) {
            String concat = "Error while connecting to ad server: ".concat(String.valueOf(e6.getMessage()));
            U2.j.i(concat);
            throw new C0856cm(concat, e6);
        }
    }

    public void q(AbstractC0539a abstractC0539a) {
        InterfaceC1563sd interfaceC1563sd;
        InterfaceC1563sd interfaceC1563sd2;
        BinderC2361b binderC2361b;
        Q2.X0 a5;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = (Context) this.f12040l;
        synchronized (C0709Wb.class) {
            try {
                if (f12038n == null) {
                    C0375o c0375o = C0379q.f.f5049b;
                    BinderC0610Ia binderC0610Ia = new BinderC0610Ia();
                    c0375o.getClass();
                    f12038n = (InterfaceC1563sd) new C0355e(context, binderC0610Ia).d(context, false);
                }
                interfaceC1563sd = f12038n;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC1563sd == null) {
            abstractC0539a.a("Internal Error, query info generator is null.");
            return;
        }
        Context context2 = (Context) this.f12040l;
        Q2.A0 a02 = (Q2.A0) this.f12041m;
        BinderC2361b binderC2361b2 = new BinderC2361b(context2);
        if (a02 == null) {
            binderC2361b = binderC2361b2;
            interfaceC1563sd2 = interfaceC1563sd;
            a5 = new Q2.X0(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, currentTimeMillis);
        } else {
            interfaceC1563sd2 = interfaceC1563sd;
            binderC2361b = binderC2361b2;
            a02.f4898j = currentTimeMillis;
            a5 = Q2.Z0.a((Context) this.f12040l, (Q2.A0) this.f12041m);
        }
        try {
            interfaceC1563sd2.s3(binderC2361b, new C1743wd(null, "BANNER", null, a5, 0, null), new BinderC0702Vb(abstractC0539a));
        } catch (RemoteException unused) {
            abstractC0539a.a("Internal Error.");
        }
    }

    public void r(H h3, C0829c3 c0829c3) {
        int i = 0;
        while (true) {
            InterfaceC0737a0[] interfaceC0737a0Arr = (InterfaceC0737a0[]) this.f12041m;
            if (i >= interfaceC0737a0Arr.length) {
                return;
            }
            c0829c3.a();
            c0829c3.b();
            InterfaceC0737a0 w5 = h3.w(c0829c3.f12965d, 3);
            C1407p c1407p = (C1407p) ((List) this.f12040l).get(i);
            String str = c1407p.f14904m;
            boolean z3 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z3 = false;
            }
            AbstractC1668us.W("Invalid closed caption MIME type provided: ".concat(String.valueOf(str)), z3);
            C1649uH c1649uH = new C1649uH();
            c0829c3.b();
            c1649uH.f15839a = c0829c3.f12966e;
            c1649uH.c(str);
            c1649uH.f15843e = c1407p.f14898e;
            c1649uH.f15842d = c1407p.f14897d;
            c1649uH.f15836F = c1407p.f14891G;
            c1649uH.f15851o = c1407p.f14907p;
            w5.e(new C1407p(c1649uH));
            interfaceC0737a0Arr[i] = w5;
            i++;
        }
    }

    public void s(SD sd) {
        synchronized (sd) {
        }
        Handler handler = (Handler) this.f12040l;
        if (handler != null) {
            handler.post(new Kw(2, this, sd));
        }
    }

    public void t(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", (String) this.f12041m);
            InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f12040l;
            if (interfaceC0677Re != null) {
                interfaceC0677Re.k("onError", put);
            }
        } catch (JSONException e3) {
            U2.j.g("Error occurred while dispatching error event.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        switch (this.f12039k) {
            case 11:
                ((InterfaceC0641Md) this.f12041m).mo16a();
                break;
            case 16:
                AbstractC0613Id.f.execute(new K4(22, (C1075hh) this.f12041m));
                ((C0375o) this.f12040l).u(th);
                break;
            case 20:
            case 22:
                break;
            default:
                try {
                    C1338nc c1338nc = (C1338nc) this.f12041m;
                    C0387u0 d5 = AbstractC1803xs.d(th);
                    C0438p c0438p = new C0438p(AbstractC0952et.u(th.getMessage()) ? d5.f5059l : th.getMessage(), d5.f5058k);
                    Parcel N5 = c1338nc.N();
                    F5.c(N5, c0438p);
                    c1338nc.d1(N5, 2);
                    break;
                } catch (RemoteException e3) {
                    T2.G.n("Service can't call client", e3);
                }
        }
    }

    public void v(int i, int i5, int i6, int i7, float f, int i8) {
        try {
            ((InterfaceC0677Re) this.f12040l).k("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i5).put("maxSizeWidth", i6).put("maxSizeHeight", i7).put("density", f).put("rotation", i8));
        } catch (JSONException e3) {
            U2.j.g("Error occurred while obtaining screen information.", e3);
        }
    }

    public void w(int i, int i5, int i6, int i7) {
        try {
            ((InterfaceC0677Re) this.f12040l).k("onSizeChanged", new JSONObject().put("x", i).put("y", i5).put("width", i6).put("height", i7));
        } catch (JSONException e3) {
            U2.j.g("Error occurred while dispatching size change.", e3);
        }
    }

    public void x(String str) {
        try {
            ((InterfaceC0677Re) this.f12040l).k("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e3) {
            U2.j.g("Error occurred while dispatching state change.", e3);
        }
    }

    public void y(C1519re c1519re) {
        Handler handler = (Handler) this.f12040l;
        if (handler != null) {
            handler.post(new Kw(1, this, c1519re));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1165jj
    public void z(boolean z3, Context context, Sh sh) {
        Yq yq;
        C1394on c1394on = (C1394on) this.f12041m;
        Dn dn = (Dn) this.f12040l;
        dn.getClass();
        Object obj = c1394on.f14849b;
        try {
            ((C0950er) obj).b(z3);
            if (((U2.a) dn.f8365d).f5854m < ((Integer) Q2.r.f5053d.f5056c.a(F7.f8706J0)).intValue()) {
                try {
                    ((C0950er) obj).f13363a.b0();
                    return;
                } finally {
                }
            } else {
                try {
                    ((C0950er) obj).f13363a.p3(new BinderC2361b(context));
                    return;
                } finally {
                }
            }
        } catch (Yq e3) {
            U2.j.h("Cannot show interstitial.");
            throw new C1121ij(e3.getCause());
        }
        U2.j.h("Cannot show interstitial.");
        throw new C1121ij(e3.getCause());
    }

    public /* synthetic */ C0709Wb(int i, Object obj, Object obj2) {
        this.f12039k = i;
        this.f12040l = obj;
        this.f12041m = obj2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1856z
    /* renamed from: d, reason: collision with other method in class */
    public void mo18d() {
        byte[] bArr = AbstractC1260lo.f;
        int length = bArr.length;
        ((C1617tm) this.f12041m).h(0, bArr);
    }

    public /* synthetic */ C0709Wb(int i, Object obj, Object obj2, boolean z3) {
        this.f12039k = i;
        this.f12040l = obj2;
        this.f12041m = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    @Override // com.google.android.gms.internal.ads.A8
    /* renamed from: a, reason: collision with other method in class */
    public JSONObject mo17a() {
        return ((E5) this.f12040l).n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0709Wb(InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk, ViewGroup viewGroup) {
        this.f12039k = 18;
        this.f12040l = (E5) interfaceViewOnClickListenerC0810bk;
        this.f12041m = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0641Md
    /* renamed from: a */
    public void mo16a() {
        switch (this.f12039k) {
            case 8:
                T2.G.m("callJs > getEngine: Promise rejected");
                ((C0634Ld) this.f12040l).c(new C1650ua("Unable to obtain a JavascriptEngine."));
                ((C1471qa) this.f12041m).q();
                break;
            default:
                N7 n7 = (N7) ((Fn) this.f12040l).f9118d;
                M7 m7 = (M7) this.f12041m;
                Parcel N5 = n7.N();
                F5.e(N5, m7);
                n7.d1(N5, 1);
                break;
        }
    }

    public C0709Wb(Qt qt) {
        this.f12039k = 28;
        this.f12040l = qt;
    }

    public /* synthetic */ C0709Wb(Kn kn) {
        this.f12039k = 4;
        this.f12040l = kn;
        this.f12041m = new C1617tm();
    }

    public C0709Wb(C1761wv c1761wv, int[] iArr) {
        this.f12039k = 29;
        this.f12040l = AbstractC1044gv.l(c1761wv);
        this.f12041m = iArr;
    }

    public C0709Wb(List list) {
        this.f12039k = 5;
        this.f12040l = list;
        this.f12041m = new InterfaceC0737a0[list.size()];
    }

    private final void h(Throwable th) {
    }

    private final void l(Throwable th) {
    }
}
