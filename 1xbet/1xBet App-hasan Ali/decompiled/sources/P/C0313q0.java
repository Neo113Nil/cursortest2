package P;

import java.util.ArrayList;
import r.C2343v;

/* renamed from: P.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313q0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4508b;

    /* renamed from: c, reason: collision with root package name */
    public int f4509c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4510d;

    /* renamed from: e, reason: collision with root package name */
    public final C2343v f4511e;
    public final W3.m f;

    public C0313q0(int i, ArrayList arrayList) {
        this.f4507a = arrayList;
        this.f4508b = i;
        if (i < 0) {
            AbstractC0316s0.a("Invalid start index");
        }
        this.f4510d = new ArrayList();
        C2343v c2343v = new C2343v();
        int size = arrayList.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            V v4 = (V) this.f4507a.get(i6);
            int i7 = v4.f4406c;
            int i8 = v4.f4407d;
            c2343v.g(i7, new N(i6, i5, i8));
            i5 += i8;
        }
        this.f4511e = c2343v;
        this.f = G4.d.E(new C0311p0(this));
    }

    public final boolean a(int i, int i5) {
        int i6;
        C2343v c2343v = this.f4511e;
        N n5 = (N) c2343v.b(i);
        if (n5 == null) {
            return false;
        }
        int i7 = n5.f4355b;
        int i8 = i5 - n5.f4356c;
        n5.f4356c = i5;
        if (i8 == 0) {
            return true;
        }
        Object[] objArr = c2343v.f19013c;
        long[] jArr = c2343v.f19011a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i9 = 0;
        while (true) {
            long j5 = jArr[i9];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        N n6 = (N) objArr[(i9 << 3) + i11];
                        if (n6.f4355b >= i7 && !n6.equals(n5) && (i6 = n6.f4355b + i8) >= 0) {
                            n6.f4355b = i6;
                        }
                    }
                    j5 >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i9 == length) {
                return true;
            }
            i9++;
        }
    }
}
