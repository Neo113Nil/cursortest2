package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.view.MotionEvent;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Reader;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import k0.C2023c;
import k4.AbstractC2036a;
import org.json.JSONException;
import org.json.JSONObject;
import q3.AbstractC2309b;
import q3.C2308a;
import t.AbstractC2390b;
import t.C2386H;
import t.C2387I;
import u.AbstractC2470q;
import x0.InterfaceC2637x;

/* renamed from: com.google.android.gms.internal.ads.hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1071hd implements U2.f, P1, Jw, Ar {

    /* renamed from: p, reason: collision with root package name */
    public static C1071hd f13759p;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13760k;

    /* renamed from: l, reason: collision with root package name */
    public Object f13761l;

    /* renamed from: m, reason: collision with root package name */
    public Object f13762m;

    /* renamed from: n, reason: collision with root package name */
    public Object f13763n;

    /* renamed from: o, reason: collision with root package name */
    public Object f13764o;

    public C1071hd(Context context, C2308a c2308a, T2.I i, C1204kd c1204kd) {
        this.f13760k = 0;
        this.f13761l = c2308a;
        ED a5 = ED.a(context);
        ED a6 = ED.a(i);
        int i5 = 0;
        this.f13762m = CD.b(new C0847cd(a5, a6, i5));
        ED a7 = ED.a(c2308a);
        CD b3 = CD.b(new C0936ed(a7, a6, ED.a(c1204kd), i5));
        this.f13763n = b3;
        this.f13764o = CD.b(new C0847cd(a5, new C1026gd(a7, b3), 1));
    }

    public static String F(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C1771x4 w5 = C1816y4.w();
        w5.e();
        C1816y4.z((C1816y4) w5.f10141l, 5);
        C1733wB r5 = AbstractC1823yB.r(bArr, 0, bArr.length);
        w5.e();
        C1816y4.x((C1816y4) w5.f10141l, r5);
        return Base64.encodeToString(((C1816y4) w5.b()).d(), 11);
    }

    public static C1071hd n(Reader reader, C1428pc c1428pc) {
        try {
            try {
                return new C1071hd(new JsonReader(reader), c1428pc);
            } finally {
                AbstractC2309b.c(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e3) {
            throw new Oq("unable to parse ServerResponse", e3);
        }
    }

    public static synchronized C1071hd y(Context context) {
        synchronized (C1071hd.class) {
            try {
                C1071hd c1071hd = f13759p;
                if (c1071hd != null) {
                    return c1071hd;
                }
                Context applicationContext = context.getApplicationContext();
                F7.a(applicationContext);
                P2.o oVar = P2.o.f4767B;
                T2.I d5 = oVar.f4774g.d();
                d5.y(applicationContext);
                applicationContext.getClass();
                C2308a c2308a = oVar.f4776j;
                c2308a.getClass();
                C1204kd c1204kd = oVar.f4790x;
                AbstractC1400ot.L(C1204kd.class, c1204kd);
                C1071hd c1071hd2 = new C1071hd(applicationContext, c2308a, d5, c1204kd);
                f13759p = c1071hd2;
                SharedPreferencesOnSharedPreferenceChangeListenerC0803bd sharedPreferencesOnSharedPreferenceChangeListenerC0803bd = (SharedPreferencesOnSharedPreferenceChangeListenerC0803bd) ((CD) c1071hd2.f13762m).d();
                SharedPreferences sharedPreferences = sharedPreferencesOnSharedPreferenceChangeListenerC0803bd.f12832b;
                sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC0803bd);
                sharedPreferencesOnSharedPreferenceChangeListenerC0803bd.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
                A7 a7 = F7.f8666C0;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC0803bd.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
                } else {
                    sharedPreferencesOnSharedPreferenceChangeListenerC0803bd.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
                }
                C1339nd c1339nd = (C1339nd) ((CD) f13759p.f13764o).d();
                if (((Boolean) rVar.f5056c.a(F7.f8912v0)).booleanValue()) {
                    HashMap I5 = T2.L.I((String) rVar.f5056c.a(F7.f8917w0));
                    Iterator it = I5.keySet().iterator();
                    while (it.hasNext()) {
                        c1339nd.a((String) it.next());
                    }
                    c1339nd.b(new C1249ld(c1339nd, I5));
                }
                return f13759p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void A(Zy zy) {
        C1361nz c1361nz = new C1361nz(zy.f12547a, C1181jz.class);
        HashMap hashMap = (HashMap) this.f13763n;
        if (!hashMap.containsKey(c1361nz)) {
            hashMap.put(c1361nz, zy);
            return;
        }
        Zy zy2 = (Zy) hashMap.get(c1361nz);
        if (!zy2.equals(zy) || !zy.equals(zy2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c1361nz.toString()));
        }
    }

    public synchronized int B() {
        try {
        } catch (Exception e3) {
            throw new At(2006, e3);
        }
        return ((Integer) this.f13761l.getClass().getDeclaredMethod("lcs", null).invoke(this.f13761l, null)).intValue();
    }

    public Jx C() {
        Integer num = (Integer) this.f13761l;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f13762m) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f13763n) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        int intValue2 = ((Integer) this.f13762m).intValue();
        ((Integer) this.f13763n).getClass();
        return new Jx(intValue, intValue2, (Ix) this.f13764o);
    }

    public synchronized void D() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f13761l.getClass().getDeclaredMethod("close", null).invoke(this.f13761l, null);
            ((P.W) this.f13764o).h(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e3) {
            throw new At(2003, e3);
        }
    }

    public synchronized boolean E() {
        try {
        } catch (Exception e3) {
            throw new At(2001, e3);
        }
        return ((Boolean) this.f13761l.getClass().getDeclaredMethod("init", null).invoke(this.f13761l, null)).booleanValue();
    }

    public synchronized byte[] G(HashMap hashMap) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e3) {
            ((P.W) this.f13764o).g(2007, System.currentTimeMillis() - currentTimeMillis, e3);
            return null;
        }
        return (byte[]) this.f13761l.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f13761l, null, hashMap);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public void a(t0.j jVar, boolean z3) {
        ?? r02 = jVar.f19485a;
        int size = r02.size();
        for (int i = 0; i < size; i++) {
            if (((t0.s) r02.get(i)).b()) {
                l(jVar);
                return;
            }
        }
        InterfaceC2637x interfaceC2637x = (InterfaceC2637x) this.f13761l;
        if (interfaceC2637x == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        t0.q.f(jVar, interfaceC2637x.J(0L), new i0.K(3, this, (t0.x) this.f13764o), false);
        if (((t0.w) this.f13762m) == t0.w.f19526l) {
            if (z3) {
                int size2 = r02.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((t0.s) r02.get(i5)).a();
                }
            }
            D3.l lVar = jVar.f19486b;
            if (lVar != null) {
                lVar.f961l = !r5.f19531m;
            }
        }
    }

    public synchronized ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f13761l) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = z4.b.f21984g + " Dispatcher";
                kotlin.jvm.internal.l.f("name", str);
                this.f13761l = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new z4.a(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f13761l;
            kotlin.jvm.internal.l.c(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public void c(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        i();
    }

    public void d(C4.f fVar) {
        fVar.f872l.decrementAndGet();
        c((ArrayDeque) this.f13763n, fVar);
    }

    @Override // U2.f
    public void e(JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value((String) this.f13761l);
        jsonWriter.name("verb").value((String) this.f13762m);
        jsonWriter.endObject();
        U2.g.e(jsonWriter, (Map) this.f13763n);
        byte[] bArr = (byte[]) this.f13764o;
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        r8.i(r0);
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    @Override // com.google.android.gms.internal.ads.P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(byte[] bArr, int i, int i5, Q1 q12) {
        int i6;
        int i7;
        C1881zg c1881zg;
        int i8;
        int i9;
        C1617tm c1617tm;
        int x5;
        boolean z3;
        int i10 = 128;
        C1617tm c1617tm2 = (C1617tm) this.f13761l;
        c1617tm2.h(i + i5, bArr);
        c1617tm2.j(i);
        int i11 = 255;
        int i12 = 0;
        if (c1617tm2.o() > 0 && (c1617tm2.f15724a[c1617tm2.f15725b] & 255) == 120) {
            if (((Inflater) this.f13764o) == null) {
                this.f13764o = new Inflater();
            }
            Inflater inflater = (Inflater) this.f13764o;
            int i13 = AbstractC1260lo.f14419a;
            int o5 = c1617tm2.o();
            C1617tm c1617tm3 = (C1617tm) this.f13762m;
            if (o5 <= 0) {
                z3 = false;
            } else {
                if (c1617tm3.f15724a.length < c1617tm2.o()) {
                    int o6 = c1617tm2.o();
                    c1617tm3.e(o6 + o6);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                Inflater inflater2 = inflater;
                inflater2.setInput(c1617tm2.f15724a, c1617tm2.f15725b, c1617tm2.o());
                int i14 = 0;
                while (true) {
                    try {
                        byte[] bArr2 = c1617tm3.f15724a;
                        i14 += inflater2.inflate(bArr2, i14, bArr2.length - i14);
                        if (!inflater2.finished()) {
                            if (inflater2.needsDictionary() || inflater2.needsInput()) {
                                break;
                            }
                            byte[] bArr3 = c1617tm3.f15724a;
                            if (i14 == bArr3.length) {
                                int length = bArr3.length;
                                c1617tm3.e(length + length);
                            }
                        } else {
                            break;
                        }
                    } catch (DataFormatException unused) {
                    } catch (Throwable th) {
                        inflater2.reset();
                        throw th;
                    }
                }
                inflater2.reset();
            }
            if (z3) {
                c1617tm2.h(c1617tm3.f15726c, c1617tm3.f15724a);
            }
        }
        C0739a2 c0739a2 = (C0739a2) this.f13763n;
        c0739a2.f12615d = 0;
        c0739a2.f12616e = 0;
        c0739a2.f = 0;
        c0739a2.f12617g = 0;
        c0739a2.f12618h = 0;
        c0739a2.i = 0;
        C1617tm c1617tm4 = c0739a2.f12612a;
        c1617tm4.g(0);
        c0739a2.f12614c = false;
        ArrayList arrayList = new ArrayList();
        while (c1617tm2.o() >= 3) {
            int i15 = c1617tm2.f15726c;
            int v4 = c1617tm2.v();
            int z5 = c1617tm2.z();
            int i16 = c1617tm2.f15725b + z5;
            if (i16 > i15) {
                c1617tm2.j(i15);
                i7 = i10;
                i8 = i12;
                c1881zg = null;
                i6 = i11;
            } else {
                int[] iArr = c0739a2.f12613b;
                if (v4 != i10) {
                    switch (v4) {
                        case 20:
                            if (z5 % 5 != 2) {
                                i6 = i11;
                                c1617tm = c1617tm2;
                            } else {
                                c1617tm2.k(2);
                                Arrays.fill(iArr, i12);
                                int i17 = z5 / 5;
                                int i18 = i12;
                                while (i18 < i17) {
                                    int v5 = c1617tm2.v();
                                    double v6 = c1617tm2.v();
                                    int v7 = c1617tm2.v() - 128;
                                    int v8 = c1617tm2.v() - 128;
                                    int v9 = c1617tm2.v() << 24;
                                    double d5 = v7;
                                    int max = Math.max(0, Math.min((int) ((1.402d * d5) + v6), i11)) << 16;
                                    double d6 = v8;
                                    iArr[v5] = v9 | max | (Math.max(0, Math.min((int) ((v6 - (0.34414d * d6)) - (d5 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d6 * 1.772d) + v6), 255));
                                    i18++;
                                    i11 = 255;
                                    c1617tm2 = c1617tm2;
                                }
                                i6 = i11;
                                c1617tm = c1617tm2;
                                c0739a2.f12614c = true;
                            }
                            c1617tm2 = c1617tm;
                            i8 = 0;
                            i7 = 128;
                            c1881zg = null;
                            break;
                        case C1639u7.zzm /* 21 */:
                            if (z5 >= 4) {
                                c1617tm2.k(3);
                                int i19 = z5 - 4;
                                if ((c1617tm2.v() & i10) != 0) {
                                    if (i19 >= 7 && (x5 = c1617tm2.x()) >= 4) {
                                        c0739a2.f12618h = c1617tm2.z();
                                        c0739a2.i = c1617tm2.z();
                                        c1617tm4.g(x5 - 4);
                                        i19 = z5 - 11;
                                    }
                                }
                                int i20 = c1617tm4.f15725b;
                                int i21 = c1617tm4.f15726c;
                                if (i20 < i21 && i19 > 0) {
                                    int min = Math.min(i19, i21 - i20);
                                    c1617tm2.f(c1617tm4.f15724a, i20, min);
                                    c1617tm4.j(i20 + min);
                                }
                            }
                            i7 = i10;
                            i8 = i12;
                            c1881zg = null;
                            i6 = i11;
                            break;
                        case 22:
                            if (z5 >= 19) {
                                c0739a2.f12615d = c1617tm2.z();
                                c0739a2.f12616e = c1617tm2.z();
                                c1617tm2.k(11);
                                c0739a2.f = c1617tm2.z();
                                c0739a2.f12617g = c1617tm2.z();
                            }
                            i7 = i10;
                            i8 = i12;
                            c1881zg = null;
                            i6 = i11;
                            break;
                        default:
                            i7 = i10;
                            i8 = i12;
                            c1881zg = null;
                            i6 = i11;
                            break;
                    }
                } else {
                    i6 = i11;
                    C1617tm c1617tm5 = c1617tm2;
                    if (c0739a2.f12615d == 0 || c0739a2.f12616e == 0 || c0739a2.f12618h == 0 || c0739a2.i == 0 || (i9 = c1617tm4.f15726c) == 0 || c1617tm4.f15725b != i9 || !c0739a2.f12614c) {
                        i7 = 128;
                        c1881zg = null;
                    } else {
                        c1617tm4.j(0);
                        int i22 = c0739a2.f12618h * c0739a2.i;
                        int[] iArr2 = new int[i22];
                        int i23 = 0;
                        while (i23 < i22) {
                            int v10 = c1617tm4.v();
                            if (v10 != 0) {
                                iArr2[i23] = iArr[v10];
                                i23++;
                            } else {
                                int v11 = c1617tm4.v();
                                if (v11 != 0) {
                                    int i24 = v11 & 63;
                                    if ((v11 & 64) != 0) {
                                        i24 = (i24 << 8) | c1617tm4.v();
                                    }
                                    int i25 = (v11 & 128) == 0 ? iArr[0] : iArr[c1617tm4.v()];
                                    int i26 = i23 + i24;
                                    Arrays.fill(iArr2, i23, i26, i25);
                                    i23 = i26;
                                }
                            }
                        }
                        i7 = 128;
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, c0739a2.f12618h, c0739a2.i, Bitmap.Config.ARGB_8888);
                        float f = c0739a2.f;
                        float f5 = c0739a2.f12615d;
                        float f6 = f / f5;
                        float f7 = c0739a2.f12617g;
                        float f8 = c0739a2.f12616e;
                        c1881zg = new C1881zg(null, null, null, createBitmap, f7 / f8, 0, 0, f6, 0, Integer.MIN_VALUE, -3.4028235E38f, c0739a2.f12618h / f5, c0739a2.i / f8, Integer.MIN_VALUE, 0.0f);
                    }
                    i8 = 0;
                    c0739a2.f12615d = 0;
                    c0739a2.f12616e = 0;
                    c0739a2.f = 0;
                    c0739a2.f12617g = 0;
                    c0739a2.f12618h = 0;
                    c0739a2.i = 0;
                    c1617tm4.g(0);
                    c0739a2.f12614c = false;
                    c1617tm2 = c1617tm5;
                }
                c1617tm2.j(i16);
            }
            if (c1881zg != null) {
                arrayList.add(c1881zg);
            }
            i11 = i6;
            i12 = i8;
            i10 = i7;
        }
        q12.mo11k(new L1(arrayList, -9223372036854775807L, -9223372036854775807L));
        z3 = false;
        inflater2.reset();
        if (z3) {
        }
        C0739a2 c0739a22 = (C0739a2) this.f13763n;
        c0739a22.f12615d = 0;
        c0739a22.f12616e = 0;
        c0739a22.f = 0;
        c0739a22.f12617g = 0;
        c0739a22.f12618h = 0;
        c0739a22.i = 0;
        C1617tm c1617tm42 = c0739a22.f12612a;
        c1617tm42.g(0);
        c0739a22.f12614c = false;
        ArrayList arrayList2 = new ArrayList();
        while (c1617tm2.o() >= 3) {
        }
        q12.mo11k(new L1(arrayList2, -9223372036854775807L, -9223372036854775807L));
    }

    public AbstractC2470q g(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2) {
        if (((AbstractC2470q) this.f13763n) == null) {
            this.f13763n = abstractC2470q.c();
        }
        AbstractC2470q abstractC2470q3 = (AbstractC2470q) this.f13763n;
        if (abstractC2470q3 == null) {
            kotlin.jvm.internal.l.k("velocityVector");
            throw null;
        }
        int b3 = abstractC2470q3.b();
        for (int i = 0; i < b3; i++) {
            AbstractC2470q abstractC2470q4 = (AbstractC2470q) this.f13763n;
            if (abstractC2470q4 == null) {
                kotlin.jvm.internal.l.k("velocityVector");
                throw null;
            }
            abstractC2470q.getClass();
            long j6 = j5 / 1000000;
            C2386H a5 = ((C2387I) ((C2023c) this.f13761l).f17544l).a(abstractC2470q2.a(i));
            long j7 = a5.f19347c;
            abstractC2470q4.e(i, (((Math.signum(a5.f19345a) * AbstractC2390b.a(j7 > 0 ? j6 / j7 : 1.0f).f19357b) * a5.f19346b) / j7) * 1000.0f);
        }
        AbstractC2470q abstractC2470q5 = (AbstractC2470q) this.f13763n;
        if (abstractC2470q5 != null) {
            return abstractC2470q5;
        }
        kotlin.jvm.internal.l.k("velocityVector");
        throw null;
    }

    public androidx.lifecycle.S h(kotlin.jvm.internal.e eVar, String str) {
        androidx.lifecycle.S s2;
        boolean isInstance;
        androidx.lifecycle.S create;
        kotlin.jvm.internal.l.f("key", str);
        synchronized (((F1.c) this.f13764o)) {
            try {
                androidx.lifecycle.X x5 = (androidx.lifecycle.X) this.f13761l;
                x5.getClass();
                s2 = (androidx.lifecycle.S) x5.f7043a.get(str);
                Class cls = eVar.f17615k;
                kotlin.jvm.internal.l.f("jClass", cls);
                Map map = kotlin.jvm.internal.e.f17612l;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>", map);
                Integer num = (Integer) map.get(cls);
                if (num != null) {
                    isInstance = kotlin.jvm.internal.z.c(num.intValue(), s2);
                } else {
                    if (cls.isPrimitive()) {
                        cls = AbstractC2036a.A(kotlin.jvm.internal.x.a(cls));
                    }
                    isInstance = cls.isInstance(s2);
                }
                if (isInstance) {
                    Object obj = (androidx.lifecycle.U) this.f13762m;
                    if (obj instanceof androidx.lifecycle.V) {
                        kotlin.jvm.internal.l.c(s2);
                        ((androidx.lifecycle.V) obj).a(s2);
                    }
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel", s2);
                } else {
                    D1.c cVar = new D1.c((D1.b) this.f13763n);
                    cVar.f924a.put(androidx.lifecycle.W.f7041b, str);
                    androidx.lifecycle.U u5 = (androidx.lifecycle.U) this.f13762m;
                    try {
                        try {
                            create = u5.create(eVar, cVar);
                        } catch (AbstractMethodError unused) {
                            create = u5.create(AbstractC2036a.z(eVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        create = u5.create(AbstractC2036a.z(eVar), cVar);
                    }
                    s2 = create;
                    androidx.lifecycle.X x6 = (androidx.lifecycle.X) this.f13761l;
                    x6.getClass();
                    kotlin.jvm.internal.l.f("viewModel", s2);
                    androidx.lifecycle.S s5 = (androidx.lifecycle.S) x6.f7043a.put(str, s2);
                    if (s5 != null) {
                        s5.clear$lifecycle_viewmodel();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s2;
    }

    public void i() {
        byte[] bArr = z4.b.f21979a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f13762m).iterator();
                kotlin.jvm.internal.l.e("readyAsyncCalls.iterator()", it);
                while (it.hasNext()) {
                    C4.f fVar = (C4.f) it.next();
                    if (((ArrayDeque) this.f13763n).size() >= 64) {
                        break;
                    }
                    if (fVar.f872l.get() < 5) {
                        it.remove();
                        fVar.f872l.incrementAndGet();
                        arrayList.add(fVar);
                        ((ArrayDeque) this.f13763n).add(fVar);
                    }
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4.f fVar2 = (C4.f) arrayList.get(i);
            ExecutorService b3 = b();
            fVar2.getClass();
            C4.i iVar = fVar2.f873m;
            C1071hd c1071hd = iVar.f876k.f21411k;
            byte[] bArr2 = z4.b.f21979a;
            try {
                try {
                    ((ThreadPoolExecutor) b3).execute(fVar2);
                } catch (RejectedExecutionException e3) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e3);
                    iVar.k(interruptedIOException);
                    fVar2.f871k.l(iVar, interruptedIOException);
                    iVar.f876k.f21411k.d(fVar2);
                }
            } catch (Throwable th2) {
                iVar.f876k.f21411k.d(fVar2);
                throw th2;
            }
        }
    }

    public synchronized int j() {
        return ((ArrayDeque) this.f13763n).size() + ((ArrayDeque) this.f13764o).size();
    }

    @Override // com.google.android.gms.internal.ads.Ar
    public Object k(Object obj) {
        return ((InterfaceC1573sn) ((C1395oo) this.f13761l).f14855e).a((Sq) this.f13762m, (Lq) this.f13763n, (C1394on) this.f13764o);
    }

    public void l(t0.j jVar) {
        if (((t0.w) this.f13762m) == t0.w.f19526l) {
            InterfaceC2637x interfaceC2637x = (InterfaceC2637x) this.f13761l;
            if (interfaceC2637x == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            t0.q.f(jVar, interfaceC2637x.J(0L), new A.B(29, (t0.x) this.f13764o), true);
        }
        this.f13762m = t0.w.f19527m;
    }

    public C1875za m(Context context, U2.a aVar, Nr nr) {
        C1875za c1875za;
        synchronized (this.f13761l) {
            try {
                if (((C1875za) this.f13763n) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f13763n = new C1875za(context, aVar, (String) Q2.r.f5053d.f5056c.a(F7.f8796a), nr);
                }
                c1875za = (C1875za) this.f13763n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1875za;
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        switch (this.f13760k) {
            case 8:
                C0606Hd c0606Hd = ((C1074hg) this.f13764o).f13774e;
                A0.J0 j02 = (A0.J0) this.f13763n;
                c0606Hd.b(new RunnableC1029gg((C1041gs) this.f13761l, (String) obj, j02, 0));
                break;
            default:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                Lq lq = (Lq) this.f13761l;
                interfaceC0677Re.i0(lq, (Nq) this.f13762m);
                C1028gf I5 = interfaceC0677Re.I();
                A7 a7 = F7.I9;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && I5 != null) {
                    Kk kk = (Kk) this.f13764o;
                    C1041gs c1041gs = kk.f10224j;
                    C1074hg c1074hg = (C1074hg) this.f13763n;
                    Xm xm = kk.i;
                    I5.d(c1074hg, xm, c1041gs);
                    I5.i(c1074hg, xm, kk.f10220d);
                }
                if (((Boolean) rVar.f5056c.a(F7.Bc)).booleanValue() && I5 != null) {
                    C1204kd c1204kd = P2.o.f4767B.f4790x;
                    C0733Ze c0733Ze = I5.f13613k;
                    if (c1204kd.e(c0733Ze.getContext())) {
                        I5.j("/logScionEvent");
                        new HashMap();
                        I5.a("/logScionEvent", new C1641u9(1, c0733Ze.getContext(), lq.f10532w0));
                        break;
                    }
                }
                break;
        }
    }

    public void p(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.f13762m = Integer.valueOf(i);
    }

    public void q(Ey ey) {
        ey.getClass();
        C1316mz c1316mz = new C1316mz(C1136iz.class, ey.f8634a);
        HashMap hashMap = (HashMap) this.f13762m;
        if (!hashMap.containsKey(c1316mz)) {
            hashMap.put(c1316mz, ey);
            return;
        }
        Ey ey2 = (Ey) hashMap.get(c1316mz);
        if (!ey2.equals(ey) || !ey.equals(ey2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c1316mz.toString()));
        }
    }

    public C1875za s(Context context, U2.a aVar, Nr nr) {
        C1875za c1875za;
        synchronized (this.f13762m) {
            try {
                if (((C1875za) this.f13764o) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f13764o = new C1875za(context, aVar, (String) JB.f9908u.s(), nr);
                }
                c1875za = (C1875za) this.f13764o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1875za;
    }

    public void t(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f13761l = Integer.valueOf(i);
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        switch (this.f13760k) {
            case 8:
                ((C1074hg) this.f13764o).f13774e.b(new RunnableC1699ve(this, th, (C1041gs) this.f13761l, (String) this.f13762m, (A0.J0) this.f13763n));
                break;
        }
    }

    public void v(Gy gy) {
        C1361nz c1361nz = new C1361nz(gy.f9290a, C1136iz.class);
        HashMap hashMap = (HashMap) this.f13761l;
        if (!hashMap.containsKey(c1361nz)) {
            hashMap.put(c1361nz, gy);
            return;
        }
        Gy gy2 = (Gy) hashMap.get(c1361nz);
        if (!gy2.equals(gy) || !gy.equals(gy2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c1361nz.toString()));
        }
    }

    public void w() {
        this.f13763n = 16;
    }

    public void x(Xy xy) {
        xy.getClass();
        C1316mz c1316mz = new C1316mz(C1181jz.class, xy.f12261a);
        HashMap hashMap = (HashMap) this.f13764o;
        if (!hashMap.containsKey(c1316mz)) {
            hashMap.put(c1316mz, xy);
            return;
        }
        Xy xy2 = (Xy) hashMap.get(c1316mz);
        if (!xy2.equals(xy) || !xy.equals(xy2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c1316mz.toString()));
        }
    }

    public synchronized void z(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.f13761l.getClass().getDeclaredMethod("he", Map.class).invoke(this.f13761l, hashMap);
            ((P.W) this.f13764o).h(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e3) {
            throw new At(2005, e3);
        }
    }

    public C1071hd(C0554Af c0554Af, C2.h hVar) {
        int i = 23;
        int i5 = 4;
        this.f13760k = 7;
        this.f13764o = c0554Af;
        this.f13761l = hVar;
        this.f13762m = CD.b(new C1796xl(c0554Af.f7672p, i));
        Zp zp = new Zp(1, hVar);
        Zp zp2 = new Zp(2, hVar);
        Zp zp3 = new Zp(i5, hVar);
        C1565sf c1565sf = c0554Af.f7655g;
        CD cd = c0554Af.f7650d;
        new a3.y(c1565sf, cd, zp, zp2, zp3, 17);
        new C1520rf(c1565sf, 25);
        Zp zp4 = new Zp(0, hVar);
        new C0650Nf(i, zp4);
        new C1655uf(cd, c1565sf, 7);
        Zp zp5 = new Zp(3, hVar);
        CD cd2 = c0554Af.f7632O;
        new a3.y(cd2, (DD) zp5, (DD) zp3, (DD) zp4, cd, 18);
        new C1755wp(zp4, cd2, cd, i5);
        Zp zp6 = new Zp(5, hVar);
        CD b3 = CD.b(JB.f9880G);
        CD b5 = CD.b(AbstractC1561sb.f15503S);
        CD b6 = CD.b(AbstractC1561sb.f15504T);
        CD b7 = CD.b(JB.f9881H);
        int i6 = FD.f8943b;
        LinkedHashMap G5 = AbstractC0952et.G(4);
        Dr dr = Dr.f8392p;
        AbstractC1400ot.l("provider", b3);
        G5.put(dr, b3);
        Dr dr2 = Dr.f8393q;
        AbstractC1400ot.l("provider", b5);
        G5.put(dr2, b5);
        Dr dr3 = Dr.f8394r;
        AbstractC1400ot.l("provider", b6);
        G5.put(dr3, b6);
        Dr dr4 = Dr.f8395s;
        AbstractC1400ot.l("provider", b7);
        G5.put(dr4, b7);
        CD b8 = CD.b(new C0936ed(zp6, c0554Af.f7655g, new FD(G5), 13));
        int i7 = KD.f10142c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(b8);
        this.f13763n = CD.b(new C0903dp(c0554Af.f7650d, new Lh(new KD(list, arrayList), 24), 18));
    }

    public C1071hd(TG tg, boolean[] zArr) {
        this.f13760k = 18;
        this.f13761l = tg;
        this.f13762m = zArr;
        int i = tg.f11646a;
        this.f13763n = new boolean[i];
        this.f13764o = new boolean[i];
    }

    public /* synthetic */ C1071hd(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f13760k = i;
        this.f13761l = obj;
        this.f13762m = obj2;
        this.f13763n = obj3;
        this.f13764o = obj4;
    }

    public /* synthetic */ C1071hd(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z3) {
        this.f13760k = i;
        this.f13761l = obj2;
        this.f13762m = obj3;
        this.f13763n = obj4;
        this.f13764o = obj;
    }

    public C1071hd(int i) {
        this.f13760k = i;
        switch (i) {
            case 5:
                this.f13761l = new Object();
                this.f13762m = new Object();
                break;
            case 16:
                this.f13761l = null;
                this.f13762m = null;
                this.f13763n = null;
                this.f13764o = Ix.f9646o;
                break;
            case 17:
                this.f13761l = new HashMap();
                this.f13762m = new HashMap();
                this.f13763n = new HashMap();
                this.f13764o = new HashMap();
                break;
            case 22:
                this.f13762m = new ArrayDeque();
                this.f13763n = new ArrayDeque();
                this.f13764o = new ArrayDeque();
                break;
            default:
                this.f13761l = new C1617tm();
                this.f13762m = new C1617tm();
                this.f13763n = new C0739a2();
                break;
        }
    }

    private final void r(Throwable th) {
    }

    public C1071hd(Context context, C0733Ze c0733Ze, C0733Ze c0733Ze2) {
        this.f13760k = 6;
        this.f13761l = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f13763n = c0733Ze;
        this.f13762m = c0733Ze2;
        this.f13764o = null;
    }

    public C1071hd(Context context, String str) {
        String packageName;
        this.f13760k = 4;
        this.f13763n = context;
        this.f13764o = str;
        this.f13761l = (String) JB.f9907t.s();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f13762m = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        P2.o oVar = P2.o.f4767B;
        T2.L l5 = oVar.f4771c;
        linkedHashMap.put("device", T2.L.H());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        linkedHashMap.put("is_lite_sdk", true != T2.L.e(context) ? "0" : "1");
        Mt mt = oVar.f4781o;
        mt.getClass();
        E3.a d5 = AbstractC0613Id.f9539a.d(new A4(2, mt, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C1562sc) d5.get()).f15548j));
            linkedHashMap.put("network_fine", Integer.toString(((C1562sc) d5.get()).f15549k));
        } catch (Exception e3) {
            P2.o.f4767B.f4774g.i("CsiConfiguration.CsiConfiguration", e3);
        }
        A7 a7 = F7.Ta;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f13762m;
            T2.L l6 = P2.o.f4767B.f4771c;
            linkedHashMap2.put("is_bstar", true != T2.L.c(context) ? "0" : "1");
        }
        A7 a72 = F7.Z8;
        D7 d7 = rVar.f5056c;
        if (((Boolean) d7.a(a72)).booleanValue() && ((Boolean) d7.a(F7.f8850k2)).booleanValue()) {
            P2.o oVar2 = P2.o.f4767B;
            if (AbstractC0952et.u(oVar2.f4774g.f8014g)) {
                return;
            }
            ((LinkedHashMap) this.f13762m).put("plugin", oVar2.f4774g.f8014g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public C1071hd(JsonReader jsonReader, C1428pc c1428pc) {
        Bundle bundle;
        Bundle bundle2;
        this.f13760k = 13;
        this.f13764o = c1428pc;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8805b2)).booleanValue() && c1428pc != null && (bundle2 = c1428pc.f15007w) != null) {
            AbstractC0467k.C(P2.o.f4767B.f4776j, bundle2, "server-response-parse-start");
        }
        ?? r02 = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        Nq nq = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        r02 = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            r02.add(new Lq(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        nq = new Nq(jsonReader);
                        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8810c2)).booleanValue() && c1428pc != null && (bundle = c1428pc.f15007w) != null) {
                            bundle.putLong("normalize-ad-response-start", nq.f10838s);
                            bundle.putLong("normalize-ad-response-end", nq.f10839t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = N4.b.f0(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new Qq(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f13763n = arrayList;
        this.f13761l = r02;
        this.f13762m = nq == null ? new Nq(new JsonReader(new StringReader("{}"))) : nq;
    }

    public C1071hd(C1761wv c1761wv, C0709Wb c0709Wb, Rq rq, Rq rq2) {
        Object obj;
        this.f13760k = 14;
        if (c1761wv != null) {
            obj = AbstractC1044gv.l(c1761wv);
        } else {
            C0954ev c0954ev = AbstractC1044gv.f13676l;
            obj = C1761wv.f16184o;
        }
        this.f13761l = obj;
        this.f13762m = c0709Wb;
        this.f13763n = rq;
        this.f13764o = rq2;
    }

    public C1071hd(C1406oz c1406oz) {
        this.f13760k = 17;
        this.f13761l = new HashMap(c1406oz.f14881a);
        this.f13762m = new HashMap(c1406oz.f14882b);
        this.f13763n = new HashMap(c1406oz.f14883c);
        this.f13764o = new HashMap(c1406oz.f14884d);
    }

    public C1071hd(WorkDatabase_Impl workDatabase_Impl) {
        this.f13760k = 19;
        this.f13761l = workDatabase_Impl;
        this.f13762m = new o2.b(workDatabase_Impl, 4);
        this.f13763n = new o2.e(workDatabase_Impl, 1);
        this.f13764o = new o2.e(workDatabase_Impl, 2);
    }

    public C1071hd(androidx.lifecycle.X x5, androidx.lifecycle.U u5, D1.b bVar) {
        this.f13760k = 1;
        kotlin.jvm.internal.l.f("store", x5);
        kotlin.jvm.internal.l.f("defaultExtras", bVar);
        this.f13761l = x5;
        this.f13762m = u5;
        this.f13763n = bVar;
        this.f13764o = new F1.c();
    }

    public C1071hd(t0.x xVar) {
        this.f13760k = 20;
        this.f13764o = xVar;
        this.f13762m = t0.w.f19525k;
    }

    public C1071hd(C2023c c2023c) {
        this.f13760k = 21;
        this.f13761l = c2023c;
    }
}
