package p032e2;

import A1.X;
import p028d6.k;
import p146u2.C0958q;
import p146u2.InterfaceC0954m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends j {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f12576B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f12577C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public k f12578D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int[] f12579E;

    public a(InterfaceC0954m interfaceC0954m, C0958q c0958q, X x4, int i7, Object obj, long j, long j3, long j7, long j8, long j9) {
        super(interfaceC0954m, c0958q, x4, i7, obj, j, j3, j9);
        this.f12576B = j7;
        this.f12577C = j8;
    }

    public final int c(int i7) {
        int[] iArr = this.f12579E;
        p151v2.a.i(iArr);
        return iArr[i7];
    }
}
