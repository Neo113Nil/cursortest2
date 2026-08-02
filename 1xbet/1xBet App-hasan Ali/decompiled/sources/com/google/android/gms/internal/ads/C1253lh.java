package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1253lh {

    /* renamed from: a, reason: collision with root package name */
    public final C1258lm f14392a;

    /* renamed from: b, reason: collision with root package name */
    public final Wq f14393b;

    /* renamed from: c, reason: collision with root package name */
    public final Gr f14394c;

    /* renamed from: d, reason: collision with root package name */
    public final C0709Wb f14395d;

    /* renamed from: e, reason: collision with root package name */
    public final C0947eo f14396e;
    public final Ai f;

    /* renamed from: g, reason: collision with root package name */
    public Sq f14397g;

    /* renamed from: h, reason: collision with root package name */
    public final C0905dr f14398h;
    public final C0580Dh i;

    /* renamed from: j, reason: collision with root package name */
    public final Qw f14399j;

    /* renamed from: k, reason: collision with root package name */
    public final C1707vm f14400k;

    /* renamed from: l, reason: collision with root package name */
    public final C1528rn f14401l;

    public C1253lh(C1258lm c1258lm, Wq wq, Gr gr, C0709Wb c0709Wb, C0947eo c0947eo, Ai ai, Sq sq, C0905dr c0905dr, C0580Dh c0580Dh, Qw qw, C1707vm c1707vm, C1528rn c1528rn) {
        this.f14392a = c1258lm;
        this.f14393b = wq;
        this.f14394c = gr;
        this.f14395d = c0709Wb;
        this.f14396e = c0947eo;
        this.f = ai;
        this.f14397g = sq;
        this.f14398h = c0905dr;
        this.i = c0580Dh;
        this.f14399j = qw;
        this.f14400k = c1707vm;
        this.f14401l = c1528rn;
    }

    public final Cr a(E3.a aVar) {
        C1324n6 p5 = this.f14394c.a(aVar, Dr.f8391o).n(new Qt(13, this)).p(this.f14396e);
        A7 a7 = F7.l5;
        Q2.r rVar = Q2.r.f5053d;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            long intValue = ((Integer) rVar.f5056c.a(F7.m5)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            p5 = p5.t(intValue);
        }
        return p5.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ed, code lost:
    
        if (r11.d(r6, r8, r0) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[Catch: all -> 0x00b3, TryCatch #2 {, blocks: (B:28:0x0075, B:30:0x0095, B:33:0x009d, B:35:0x00b0, B:36:0x00b8, B:39:0x00bf, B:41:0x00c7, B:42:0x00cd, B:46:0x00d6, B:49:0x010e, B:52:0x00e8, B:55:0x00f7, B:57:0x0113, B:60:0x00b6, B:62:0x0129, B:66:0x0144, B:70:0x014c, B:72:0x0170, B:74:0x0186, B:76:0x01a9, B:77:0x01bf, B:80:0x01d3, B:82:0x01d9, B:83:0x01e6, B:85:0x01e9, B:87:0x01f2, B:91:0x01ef, B:92:0x01b3, B:93:0x0198, B:96:0x015a, B:99:0x0133, B:100:0x0138), top: B:27:0x0075, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9 A[Catch: all -> 0x00b3, TryCatch #2 {, blocks: (B:28:0x0075, B:30:0x0095, B:33:0x009d, B:35:0x00b0, B:36:0x00b8, B:39:0x00bf, B:41:0x00c7, B:42:0x00cd, B:46:0x00d6, B:49:0x010e, B:52:0x00e8, B:55:0x00f7, B:57:0x0113, B:60:0x00b6, B:62:0x0129, B:66:0x0144, B:70:0x014c, B:72:0x0170, B:74:0x0186, B:76:0x01a9, B:77:0x01bf, B:80:0x01d3, B:82:0x01d9, B:83:0x01e6, B:85:0x01e9, B:87:0x01f2, B:91:0x01ef, B:92:0x01b3, B:93:0x0198, B:96:0x015a, B:99:0x0133, B:100:0x0138), top: B:27:0x0075, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d9 A[Catch: all -> 0x00b3, TryCatch #2 {, blocks: (B:28:0x0075, B:30:0x0095, B:33:0x009d, B:35:0x00b0, B:36:0x00b8, B:39:0x00bf, B:41:0x00c7, B:42:0x00cd, B:46:0x00d6, B:49:0x010e, B:52:0x00e8, B:55:0x00f7, B:57:0x0113, B:60:0x00b6, B:62:0x0129, B:66:0x0144, B:70:0x014c, B:72:0x0170, B:74:0x0186, B:76:0x01a9, B:77:0x01bf, B:80:0x01d3, B:82:0x01d9, B:83:0x01e6, B:85:0x01e9, B:87:0x01f2, B:91:0x01ef, B:92:0x01b3, B:93:0x0198, B:96:0x015a, B:99:0x0133, B:100:0x0138), top: B:27:0x0075, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e9 A[Catch: all -> 0x00b3, TryCatch #2 {, blocks: (B:28:0x0075, B:30:0x0095, B:33:0x009d, B:35:0x00b0, B:36:0x00b8, B:39:0x00bf, B:41:0x00c7, B:42:0x00cd, B:46:0x00d6, B:49:0x010e, B:52:0x00e8, B:55:0x00f7, B:57:0x0113, B:60:0x00b6, B:62:0x0129, B:66:0x0144, B:70:0x014c, B:72:0x0170, B:74:0x0186, B:76:0x01a9, B:77:0x01bf, B:80:0x01d3, B:82:0x01d9, B:83:0x01e6, B:85:0x01e9, B:87:0x01f2, B:91:0x01ef, B:92:0x01b3, B:93:0x0198, B:96:0x015a, B:99:0x0133, B:100:0x0138), top: B:27:0x0075, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b3 A[Catch: all -> 0x00b3, TryCatch #2 {, blocks: (B:28:0x0075, B:30:0x0095, B:33:0x009d, B:35:0x00b0, B:36:0x00b8, B:39:0x00bf, B:41:0x00c7, B:42:0x00cd, B:46:0x00d6, B:49:0x010e, B:52:0x00e8, B:55:0x00f7, B:57:0x0113, B:60:0x00b6, B:62:0x0129, B:66:0x0144, B:70:0x014c, B:72:0x0170, B:74:0x0186, B:76:0x01a9, B:77:0x01bf, B:80:0x01d3, B:82:0x01d9, B:83:0x01e6, B:85:0x01e9, B:87:0x01f2, B:91:0x01ef, B:92:0x01b3, B:93:0x0198, B:96:0x015a, B:99:0x0133, B:100:0x0138), top: B:27:0x0075, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Cr b() {
        AbstractC1403ow Z4;
        String str;
        int i;
        String str2;
        String str3;
        Boolean bool;
        String string;
        Q2.X0 x02 = this.f14393b.f12098d;
        if (x02.f4955H == null && x02.f4950C == null) {
            return c(this.i.f());
        }
        Gr gr = this.f14394c;
        C1258lm c1258lm = this.f14392a;
        Dr dr = Dr.f8386H;
        String str4 = c1258lm.f14414d.f12098d.f4955H;
        if (!TextUtils.isEmpty(str4)) {
            String d5 = C1258lm.d(str4);
            A7 a7 = F7.F6;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && d5.isEmpty()) {
                int lastIndexOf = str4.lastIndexOf("&request_id=");
                d5 = lastIndexOf != -1 ? str4.substring(lastIndexOf + 12) : "";
            }
            String str5 = d5;
            if (TextUtils.isEmpty(str5)) {
                Z4 = AbstractC1400ot.Z(new C0858co("Invalid ad string.", 15));
            } else {
                synchronized (c1258lm.f14418j) {
                    a3.K k5 = (a3.K) c1258lm.f14411a.f7628L.d();
                    String a5 = k5.a(str5, c1258lm.i);
                    if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                        C1392ol c1392ol = c1258lm.i;
                        if (!TextUtils.isEmpty(a5)) {
                            if (new JSONObject(a5).optString("is_gbid").equals("true")) {
                                bool = Boolean.TRUE;
                                if (bool.booleanValue()) {
                                    int lastIndexOf2 = str4.lastIndexOf("&");
                                    String substring = lastIndexOf2 != -1 ? str4.substring(0, lastIndexOf2) : null;
                                    if (!TextUtils.isEmpty(substring)) {
                                        try {
                                            byte[] decode = Base64.decode(substring, 11);
                                            byte[] bytes = str5.getBytes("UTF-8");
                                            if (!TextUtils.isEmpty(a5)) {
                                                try {
                                                    string = new JSONObject(a5).getString("arek");
                                                } catch (JSONException e3) {
                                                    T2.G.m("Failed to get key from QueryJSONMap".concat(e3.toString()));
                                                    P2.o.f4767B.f4774g.i("CryptoUtils.getKeyFromQueryJsonMap", e3);
                                                }
                                                str4 = C0772ar.a(decode, bytes, string, c1392ol);
                                            }
                                            string = null;
                                            str4 = C0772ar.a(decode, bytes, string, c1392ol);
                                        } catch (UnsupportedEncodingException e5) {
                                            T2.G.m("Failed to decode the adResponse. ".concat(e5.toString()));
                                            P2.o.f4767B.f4774g.i("PreloadedLoader.decryptAdResponseIfNecessary", e5);
                                        }
                                    }
                                }
                            }
                            bool = Boolean.FALSE;
                            if (bool.booleanValue()) {
                            }
                        }
                    }
                    if (TextUtils.isEmpty(str4)) {
                        str = "";
                    } else {
                        try {
                            str = new JSONObject(str4).optString("render_id", "");
                        } catch (JSONException unused) {
                            str = "";
                        }
                    }
                    String str6 = str;
                    if (!TextUtils.isEmpty(str6)) {
                        String str7 = "";
                        try {
                            str7 = new String(Base64.decode(str6, 0), StandardCharsets.UTF_8);
                        } catch (IllegalArgumentException e6) {
                            T2.G.m("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str6)));
                            P2.o.f4767B.f4774g.i("PreloadedLoader.decodeRenderId", e6);
                        }
                        List i5 = Hq.e(new C1221ku(':')).i(str7);
                        if (i5.size() == 2) {
                            str2 = (String) i5.get(0);
                            i = Integer.parseInt((String) i5.get(1));
                            Pair pair = str2 == null ? new Pair(str2, Integer.valueOf(i)) : new Pair("", 0);
                            str3 = (String) pair.first;
                            int intValue = ((Integer) pair.second).intValue();
                            if (!TextUtils.isEmpty(str3) && intValue > 0) {
                                if (!k5.e(str5, str3)) {
                                    Z4 = AbstractC1400ot.Z(new C0858co("The ad has already been shown.", 10));
                                }
                            }
                            k5.c(str5);
                            if (!TextUtils.isEmpty(a5)) {
                                Z4 = c1258lm.a(str4, c1258lm.b(a5));
                            }
                        } else {
                            T2.G.m("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str6)));
                        }
                    }
                    i = 0;
                    str2 = null;
                    if (str2 == null) {
                    }
                    str3 = (String) pair.first;
                    int intValue2 = ((Integer) pair.second).intValue();
                    if (!TextUtils.isEmpty(str3)) {
                        if (!k5.e(str5, str3)) {
                        }
                    }
                    k5.c(str5);
                    if (!TextUtils.isEmpty(a5)) {
                    }
                }
            }
            return new C1324n6(gr, dr, null, Gr.f9278d, Collections.EMPTY_LIST, Z4).a();
        }
        Q2.M m5 = c1258lm.f14414d.f12098d.f4950C;
        if (m5 != null) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.x6)).booleanValue()) {
                String str8 = m5.f4931k;
                String str9 = m5.f4932l;
                String d6 = C1258lm.d(str8);
                String d7 = C1258lm.d(str9);
                if (TextUtils.isEmpty(d7) || !d6.equals(d7)) {
                    c1258lm.i.f14844a.put("ridmm", "true");
                } else {
                    ((a3.K) c1258lm.f14411a.f7628L.d()).c(d6);
                    c1258lm.i.f14844a.put("request_id", d6);
                }
            }
            Z4 = c1258lm.a(m5.f4931k, c1258lm.b(m5.f4932l));
            return new C1324n6(gr, dr, null, Gr.f9278d, Collections.EMPTY_LIST, Z4).a();
        }
        Z4 = AbstractC1400ot.Z(new C0858co("Mismatch request IDs.", 14));
        return new C1324n6(gr, dr, null, Gr.f9278d, Collections.EMPTY_LIST, Z4).a();
    }

    public final Cr c(E3.a aVar) {
        Sq sq = this.f14397g;
        if (sq != null) {
            return new C1324n6(this.f14394c, Dr.f8390n, null, Gr.f9278d, Collections.EMPTY_LIST, AbstractC1400ot.c0(sq)).a();
        }
        C1324n6 c1324n6 = P2.o.f4767B.i;
        c1324n6.getClass();
        A7 a7 = F7.f8822e4;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            synchronized (c1324n6.f14580m) {
                try {
                    c1324n6.x();
                    ScheduledFuture scheduledFuture = (ScheduledFuture) c1324n6.f14578k;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    c1324n6.f14578k = AbstractC0613Id.f9542d.schedule((K4) c1324n6.f14579l, ((Long) rVar.f5056c.a(F7.f8827f4)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.f14394c.a(aVar, Dr.f8390n).p(new N9(4, this.f14400k)).a();
    }
}
