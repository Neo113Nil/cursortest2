package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.mF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1288mF extends AbstractC1835yf {
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f14490j;

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.f14490j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer h3 = h(((limit - position) / this.f16441b.f11558d) * this.f16442c.f11558d);
        while (position < limit) {
            for (int i : iArr) {
                h3.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.f16441b.f11558d;
        }
        byteBuffer.position(limit);
        h3.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final C0684Se e(C0684Se c0684Se) {
        int[] iArr = this.i;
        if (iArr == null) {
            return C0684Se.f11554e;
        }
        if (c0684Se.f11557c != 2) {
            throw new C0938ef(c0684Se);
        }
        int length = iArr.length;
        int i = c0684Se.f11556b;
        boolean z3 = i != length;
        int i5 = 0;
        while (true) {
            int length2 = iArr.length;
            if (i5 >= length2) {
                return z3 ? new C0684Se(c0684Se.f11555a, length2, 2) : C0684Se.f11554e;
            }
            int i6 = iArr[i5];
            if (i6 >= i) {
                throw new C0938ef(c0684Se);
            }
            z3 |= i6 != i5;
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final void k() {
        this.f14490j = this.i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final void m() {
        this.f14490j = null;
        this.i = null;
    }
}
