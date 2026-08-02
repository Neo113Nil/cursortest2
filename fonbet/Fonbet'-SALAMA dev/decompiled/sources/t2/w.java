package t2;

import A1.G0;
import A1.T0;
import E4.L;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f16443a;

    /* renamed from: b, reason: collision with root package name */
    public final G0[] f16444b;

    /* renamed from: c, reason: collision with root package name */
    public final c[] f16445c;

    /* renamed from: d, reason: collision with root package name */
    public final T0 f16446d;

    /* renamed from: e, reason: collision with root package name */
    public final L f16447e;

    public w(G0[] g0Arr, c[] cVarArr, T0 t02, L l7) {
        this.f16444b = g0Arr;
        this.f16445c = (c[]) cVarArr.clone();
        this.f16446d = t02;
        this.f16447e = l7;
        this.f16443a = g0Arr.length;
    }

    public final boolean a(w wVar, int i7) {
        return wVar != null && v2.t.a(this.f16444b[i7], wVar.f16444b[i7]) && v2.t.a(this.f16445c[i7], wVar.f16445c[i7]);
    }

    public final boolean b(int i7) {
        return this.f16444b[i7] != null;
    }
}
