package p139t2;

import A1.G0;
import A1.T0;
import E4.L;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G0[] f16450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c[] f16451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T0 f16452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L f16453e;

    public w(G0[] g0Arr, c[] cVarArr, T0 t7, L l7) {
        this.f16450b = g0Arr;
        this.f16451c = (c[]) cVarArr.clone();
        this.f16452d = t7;
        this.f16453e = l7;
        this.f16449a = g0Arr.length;
    }

    public final boolean a(w wVar, int i7) {
        return wVar != null && t.a(this.f16450b[i7], wVar.f16450b[i7]) && t.a(this.f16451c[i7], wVar.f16451c[i7]);
    }

    public final boolean b(int i7) {
        return this.f16450b[i7] != null;
    }
}
