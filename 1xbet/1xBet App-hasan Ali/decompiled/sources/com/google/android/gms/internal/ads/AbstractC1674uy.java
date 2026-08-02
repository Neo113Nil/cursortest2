package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.uy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1674uy {

    /* renamed from: k, reason: collision with root package name */
    public int f15938k;

    /* renamed from: l, reason: collision with root package name */
    public Object f15939l;

    public AbstractC1674uy(int i) {
        this.f15938k = i;
    }

    public static int h(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long i(long j5) {
        return (j5 >>> 1) ^ (-(1 & j5));
    }

    public static C1868zB j(byte[] bArr, int i, int i5) {
        C1868zB c1868zB = new C1868zB(bArr, i, i5);
        try {
            c1868zB.q(i5);
            return c1868zB;
        } catch (XB e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public abstract long A();

    public abstract long B();

    public abstract long C();

    public abstract C1733wB D();

    public abstract String E();

    public abstract String F();

    public abstract void G();

    public abstract void H(int i);

    public abstract n1.k0 c(n1.k0 k0Var, List list);

    public abstract G.v d(n1.O o5, G.v vVar);

    public abstract boolean f();

    public abstract boolean g();

    public abstract double k();

    public abstract int l();

    public abstract float m();

    public abstract int[] n(int[] iArr, int i);

    public abstract int o();

    public ByteBuffer p(int i, byte[] bArr) {
        int[] n5 = n(AbstractC1584sy.d(bArr), i);
        int[] iArr = (int[]) n5.clone();
        AbstractC1584sy.b(iArr);
        for (int i5 = 0; i5 < 16; i5++) {
            n5[i5] = n5[i5] + iArr[i5];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(n5, 0, 16);
        return order;
    }

    public abstract int q(int i);

    public abstract int r();

    public abstract int s();

    public abstract int t();

    public abstract int u();

    public abstract int v();

    public abstract int w();

    public abstract int x();

    public abstract long y();

    public abstract long z();

    public void a(n1.O o5) {
    }

    public void b(n1.O o5) {
    }
}
