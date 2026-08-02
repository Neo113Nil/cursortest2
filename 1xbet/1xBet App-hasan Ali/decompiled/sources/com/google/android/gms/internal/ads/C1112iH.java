package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.iH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1112iH {

    /* renamed from: j, reason: collision with root package name */
    public static final Vu f13929j = new Vu(new C1589t2(6));

    /* renamed from: a, reason: collision with root package name */
    public C1332nE f13930a;

    /* renamed from: b, reason: collision with root package name */
    public C1514rH f13931b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13932c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f13933d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13934e;
    public C0843cH f;

    /* renamed from: g, reason: collision with root package name */
    public final P.W f13935g;

    /* renamed from: h, reason: collision with root package name */
    public Mm f13936h;
    public final RE i;

    public C1112iH(Context context) {
        Spatializer spatializer;
        P.W w5;
        RE re = new RE(13);
        int i = C0843cH.f12987u;
        C0843cH c0843cH = new C0843cH(new C0799bH(context));
        this.f13932c = new Object();
        this.f13933d = context.getApplicationContext();
        this.i = re;
        this.f = c0843cH;
        this.f13936h = Mm.f10718b;
        boolean e3 = AbstractC1260lo.e(context);
        this.f13934e = e3;
        if (!e3 && AbstractC1260lo.f14419a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                w5 = null;
            } else {
                spatializer = audioManager.getSpatializer();
                w5 = new P.W(spatializer);
            }
            this.f13935g = w5;
        }
        boolean z3 = this.f.f12992p;
    }

    public static int b(C1407p c1407p, String str, boolean z3) {
        if (!TextUtils.isEmpty(str) && str.equals(c1407p.f14897d)) {
            return 4;
        }
        String c5 = c(str);
        String c6 = c(c1407p.f14897d);
        if (c6 == null || c5 == null) {
            return (z3 && c6 == null) ? 1 : 0;
        }
        if (c6.startsWith(c5) || c5.startsWith(c6)) {
            return 3;
        }
        int i = AbstractC1260lo.f14419a;
        return c6.split("-", 2)[0].equals(c5.split("-", 2)[0]) ? 2 : 0;
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static final Pair g(int i, C0375o c0375o, int[][][] iArr, InterfaceC0977fH interfaceC0977fH, Comparator comparator) {
        RandomAccess randomAccess;
        C0375o c0375o2 = c0375o;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < 2) {
            if (i == ((int[]) c0375o2.f5042l)[i5]) {
                TG tg = ((TG[]) c0375o2.f5043m)[i5];
                for (int i6 = 0; i6 < tg.f11646a; i6++) {
                    C1292mb a5 = tg.a(i6);
                    C1761wv b3 = interfaceC0977fH.b(i5, a5, iArr[i5][i6]);
                    int i7 = a5.f14495a;
                    boolean[] zArr = new boolean[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        int i9 = i8 + 1;
                        AbstractC1022gH abstractC1022gH = (AbstractC1022gH) b3.get(i8);
                        int a6 = abstractC1022gH.a();
                        if (!zArr[i8] && a6 != 0) {
                            if (a6 == 1) {
                                randomAccess = AbstractC1044gv.n(abstractC1022gH);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC1022gH);
                                for (int i10 = i9; i10 < i7; i10++) {
                                    AbstractC1022gH abstractC1022gH2 = (AbstractC1022gH) b3.get(i10);
                                    if (abstractC1022gH2.a() == 2 && abstractC1022gH.b(abstractC1022gH2)) {
                                        arrayList2.add(abstractC1022gH2);
                                        zArr[i10] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i8 = i9;
                    }
                }
            }
            i5++;
            c0375o2 = c0375o;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((AbstractC1022gH) list.get(i11)).f13585m;
        }
        AbstractC1022gH abstractC1022gH3 = (AbstractC1022gH) list.get(0);
        return Pair.create(new C1155jH(abstractC1022gH3.f13584l, iArr2), Integer.valueOf(abstractC1022gH3.f13583k));
    }

    public final void a() {
        synchronized (this.f13932c) {
            this.f.getClass();
        }
    }

    public final void d() {
        P.W w5;
        C0888dH c0888dH;
        synchronized (this.f13932c) {
            try {
                if (AbstractC1260lo.f14419a >= 32 && (w5 = this.f13935g) != null && (c0888dH = (C0888dH) w5.f4414n) != null && ((Handler) w5.f4413m) != null) {
                    ((Spatializer) w5.f4412l).removeOnSpatializerStateChangedListener(c0888dH);
                    ((Handler) w5.f4413m).removeCallbacksAndMessages(null);
                    w5.f4413m = null;
                    w5.f4414n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13930a = null;
        this.f13931b = null;
    }

    public final void e(C0799bH c0799bH) {
        boolean equals;
        C0843cH c0843cH = new C0843cH(c0799bH);
        synchronized (this.f13932c) {
            equals = this.f.equals(c0843cH);
            this.f = c0843cH;
        }
        if (equals) {
            return;
        }
        if (c0843cH.f12992p && this.f13933d == null) {
            JB.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        C1332nE c1332nE = this.f13930a;
        if (c1332nE != null) {
            c1332nE.f14636r.c(10);
        }
    }

    public final void f() {
        boolean z3;
        C1332nE c1332nE;
        P.W w5;
        synchronized (this.f13932c) {
            try {
                z3 = false;
                if (this.f.f12992p && !this.f13934e && AbstractC1260lo.f14419a >= 32 && (w5 = this.f13935g) != null && w5.f4411k) {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z3 || (c1332nE = this.f13930a) == null) {
            return;
        }
        c1332nE.f14636r.c(10);
    }
}
