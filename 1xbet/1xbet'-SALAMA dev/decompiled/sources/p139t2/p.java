package p139t2;

import A1.U;
import A1.X;
import B4.V;
import C1.C0101g;
import D3.j;
import E3.AbstractC0167z;
import E3.C0159q;
import E3.K;
import E4.L;
import G4.C0269b;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import p018c2.e0;
import p018c2.f0;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class p extends s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final K f16390i = new C0159q(new C0269b(17));
    public static final K j = new C0159q(new C0269b(18));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f16392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f16394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f16395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0101g f16396h;

    public p(Context context) {
        V v6 = new V(25);
        int i7 = i.f16347g0;
        i iVar = new i(new h(context));
        this.f16391c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f16392d = v6;
        this.f16394f = iVar;
        this.f16396h = C0101g.f1484x;
        boolean z4 = context != null && t.D(context);
        this.f16393e = z4;
        if (!z4 && context != null && t.f17159a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f16395g = audioManager == null ? null : new j(audioManager.getSpatializer());
        }
        if (iVar.f16357a0 && context == null) {
            Log.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int b(int i7, int i8) {
        return (i7 == 0 || i7 != i8) ? Integer.bitCount(i7 & i8) : f.API_PRIORITY_OTHER;
    }

    public static void c(f0 f0Var, i iVar, HashMap map) {
        for (int i7 = 0; i7 < f0Var.f10347a; i7++) {
        }
    }

    public static int d(X x4, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(x4.f306c)) {
            return 4;
        }
        String strG = g(str);
        String strG2 = g(x4.f306c);
        if (strG2 == null || strG == null) {
            return (z4 && strG2 == null) ? 1 : 0;
        }
        if (strG2.startsWith(strG) || strG.startsWith(strG2)) {
            return 3;
        }
        int i7 = t.f17159a;
        return strG2.split("-", 2)[0].equals(strG.split("-", 2)[0]) ? 2 : 0;
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
        RandomAccess randomAccessI;
        boolean z4;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < l7.f2141a; i8++) {
            if (i7 == ((int[]) l7.f2142b)[i8]) {
                f0 f0Var = ((f0[]) l7.f2143c)[i8];
                for (int i9 = 0; i9 < f0Var.f10347a; i9++) {
                    e0 e0VarA = f0Var.a(i9);
                    E3.L lA = mVar.a(i8, e0VarA, iArr[i8][i9]);
                    int i10 = e0VarA.f10341a;
                    boolean[] zArr = new boolean[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        n nVar = (n) lA.get(i11);
                        int iA = nVar.a();
                        if (!zArr[i11] && iA != 0) {
                            if (iA == 1) {
                                randomAccessI = AbstractC0167z.I(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                for (int i12 = i11 + 1; i12 < i10; i12++) {
                                    n nVar2 = (n) lA.get(i12);
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        z4 = true;
                                        zArr[i12] = true;
                                    } else {
                                        z4 = true;
                                    }
                                }
                                randomAccessI = arrayList2;
                            }
                            arrayList.add(randomAccessI);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            iArr2[i13] = ((n) list.get(i13)).f16374c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(0, nVar3.f16373b, iArr2), Integer.valueOf(nVar3.f16372a));
    }

    @Override // p139t2.s
    public final void a(C0101g c0101g) {
        boolean zEquals;
        synchronized (this.f16391c) {
            zEquals = this.f16396h.equals(c0101g);
            this.f16396h = c0101g;
        }
        if (zEquals) {
            return;
        }
        f();
    }

    public final void f() {
        boolean z4;
        U u4;
        j jVar;
        synchronized (this.f16391c) {
            try {
                z4 = this.f16394f.f16357a0 && !this.f16393e && t.f17159a >= 32 && (jVar = this.f16395g) != null && jVar.f1724c;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z4 || (u4 = this.f16400a) == null) {
            return;
        }
        u4.f275y.c(10);
    }
}
