package e2;

import A1.X;
import d6.C0977k;
import u2.C1640q;
import u2.InterfaceC1636m;
import v2.AbstractC1664a;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1004a extends AbstractC1013j {

    /* renamed from: B, reason: collision with root package name */
    public final long f12570B;

    /* renamed from: C, reason: collision with root package name */
    public final long f12571C;

    /* renamed from: D, reason: collision with root package name */
    public C0977k f12572D;

    /* renamed from: E, reason: collision with root package name */
    public int[] f12573E;

    public AbstractC1004a(InterfaceC1636m interfaceC1636m, C1640q c1640q, X x4, int i7, Object obj, long j, long j3, long j7, long j8, long j9) {
        super(interfaceC1636m, c1640q, x4, i7, obj, j, j3, j9);
        this.f12570B = j7;
        this.f12571C = j8;
    }

    public final int c(int i7) {
        int[] iArr = this.f12573E;
        AbstractC1664a.i(iArr);
        return iArr[i7];
    }
}
