package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1631u {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15746a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15747b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15748c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15749d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15750e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15751g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15752h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15753j;

    /* renamed from: k, reason: collision with root package name */
    public final float f15754k;

    /* renamed from: l, reason: collision with root package name */
    public final String f15755l;

    public C1631u(ArrayList arrayList, int i, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, String str) {
        this.f15746a = arrayList;
        this.f15747b = i;
        this.f15748c = i5;
        this.f15749d = i6;
        this.f15750e = i7;
        this.f = i8;
        this.f15751g = i9;
        this.f15752h = i10;
        this.i = i11;
        this.f15753j = i12;
        this.f15754k = f;
        this.f15755l = str;
    }

    public static C1631u a(C1617tm c1617tm) {
        String str;
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        int i10;
        int i11;
        try {
            c1617tm.k(4);
            int v4 = c1617tm.v() & 3;
            int i12 = v4 + 1;
            if (i12 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int v5 = c1617tm.v() & 31;
            for (int i13 = 0; i13 < v5; i13++) {
                int z3 = c1617tm.z();
                int i14 = c1617tm.f15725b;
                c1617tm.k(z3);
                byte[] bArr = c1617tm.f15724a;
                byte[] bArr2 = AbstractC1120ii.f13966a;
                byte[] bArr3 = new byte[z3 + 4];
                System.arraycopy(AbstractC1120ii.f13966a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i14, bArr3, 4, z3);
                arrayList.add(bArr3);
            }
            int v6 = c1617tm.v();
            for (int i15 = 0; i15 < v6; i15++) {
                int z5 = c1617tm.z();
                int i16 = c1617tm.f15725b;
                c1617tm.k(z5);
                byte[] bArr4 = c1617tm.f15724a;
                byte[] bArr5 = AbstractC1120ii.f13966a;
                byte[] bArr6 = new byte[z5 + 4];
                System.arraycopy(AbstractC1120ii.f13966a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i16, bArr6, 4, z5);
                arrayList.add(bArr6);
            }
            if (v5 > 0) {
                C0996fs Y4 = AbstractC1668us.Y((byte[]) arrayList.get(0), v4 + 2, ((byte[]) arrayList.get(0)).length);
                int i17 = Y4.f13515e;
                int i18 = Y4.f;
                int i19 = Y4.f13517h + 8;
                int i20 = Y4.i + 8;
                int i21 = Y4.f13518j;
                int i22 = Y4.f13519k;
                int i23 = Y4.f13520l;
                int i24 = Y4.f13521m;
                float f5 = Y4.f13516g;
                int i25 = Y4.f13511a;
                int i26 = Y4.f13512b;
                int i27 = Y4.f13513c;
                byte[] bArr7 = AbstractC1120ii.f13966a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i25), Integer.valueOf(i26), Integer.valueOf(i27));
                i7 = i22;
                i8 = i23;
                i9 = i24;
                f = f5;
                i5 = i18;
                i6 = i19;
                i10 = i20;
                i11 = i21;
                i = i17;
            } else {
                str = null;
                i = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = 16;
                f = 1.0f;
                i10 = -1;
                i11 = -1;
            }
            return new C1631u(arrayList, i12, i, i5, i6, i10, i11, i7, i8, i9, f, str);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw B7.a(e3, "Error parsing AVC config");
        }
    }
}
