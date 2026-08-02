package t2;

import A1.U;
import A1.X;
import B4.V;
import C1.C0101g;
import E3.AbstractC0167z;
import E3.C0159q;
import E3.K;
import E4.L;
import G4.C0269b;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import c2.e0;
import c2.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class p extends s {

    /* renamed from: i, reason: collision with root package name */
    public static final K f16384i = new C0159q(new C0269b(17));
    public static final K j = new C0159q(new C0269b(18));

    /* renamed from: c, reason: collision with root package name */
    public final Object f16385c;

    /* renamed from: d, reason: collision with root package name */
    public final V f16386d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16387e;

    /* renamed from: f, reason: collision with root package name */
    public final i f16388f;

    /* renamed from: g, reason: collision with root package name */
    public final D3.j f16389g;

    /* renamed from: h, reason: collision with root package name */
    public C0101g f16390h;

    public p(Context context) {
        Spatializer spatializer;
        D3.j jVar;
        V v6 = new V(25);
        int i7 = i.f16341g0;
        i iVar = new i(new h(context));
        this.f16385c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f16386d = v6;
        this.f16388f = iVar;
        this.f16390h = C0101g.f1484x;
        boolean z4 = context != null && v2.t.D(context);
        this.f16387e = z4;
        if (!z4 && context != null && v2.t.f17153a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                jVar = null;
            } else {
                spatializer = audioManager.getSpatializer();
                jVar = new D3.j(spatializer);
            }
            this.f16389g = jVar;
        }
        if (iVar.f16351a0 && context == null) {
            Log.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int b(int i7, int i8) {
        return (i7 == 0 || i7 != i8) ? Integer.bitCount(i7 & i8) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static void c(f0 f0Var, i iVar, HashMap hashMap) {
        for (int i7 = 0; i7 < f0Var.f10347a; i7++) {
        }
    }

    public static int d(X x4, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(x4.f306c)) {
            return 4;
        }
        String g3 = g(str);
        String g7 = g(x4.f306c);
        if (g7 == null || g3 == null) {
            return (z4 && g7 == null) ? 1 : 0;
        }
        if (g7.startsWith(g3) || g3.startsWith(g7)) {
            return 3;
        }
        int i7 = v2.t.f17153a;
        return g7.split("-", 2)[0].equals(g3.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean e(int i7, boolean z4) {
        int i8 = i7 & 7;
        return i8 == 4 || (z4 && i8 == 3);
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair h(int i7, L l7, int[][][] iArr, m mVar, Comparator comparator) {
        RandomAccess randomAccess;
        boolean z4;
        L l8 = l7;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < l8.f2141a) {
            if (i7 == ((int[]) l8.f2142b)[i8]) {
                f0 f0Var = ((f0[]) l8.f2143c)[i8];
                for (int i9 = 0; i9 < f0Var.f10347a; i9++) {
                    e0 a2 = f0Var.a(i9);
                    E3.L a4 = mVar.a(i8, a2, iArr[i8][i9]);
                    int i10 = a2.f10341a;
                    boolean[] zArr = new boolean[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        n nVar = (n) a4.get(i11);
                        int a7 = nVar.a();
                        if (!zArr[i11] && a7 != 0) {
                            if (a7 == 1) {
                                randomAccess = AbstractC0167z.I(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                for (int i12 = i11 + 1; i12 < i10; i12++) {
                                    n nVar2 = (n) a4.get(i12);
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        z4 = true;
                                        zArr[i12] = true;
                                    } else {
                                        z4 = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i8++;
            l8 = l7;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            iArr2[i13] = ((n) list.get(i13)).f16368c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(0, nVar3.f16367b, iArr2), Integer.valueOf(nVar3.f16366a));
    }

    @Override // t2.s
    public final void a(C0101g c0101g) {
        boolean equals;
        synchronized (this.f16385c) {
            equals = this.f16390h.equals(c0101g);
            this.f16390h = c0101g;
        }
        if (equals) {
            return;
        }
        f();
    }

    public final void f() {
        boolean z4;
        U u4;
        D3.j jVar;
        synchronized (this.f16385c) {
            try {
                z4 = this.f16388f.f16351a0 && !this.f16387e && v2.t.f17153a >= 32 && (jVar = this.f16389g) != null && jVar.f1724c;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z4 || (u4 = this.f16394a) == null) {
            return;
        }
        u4.f275y.c(10);
    }
}
