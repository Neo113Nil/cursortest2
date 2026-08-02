package z;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2703e implements InterfaceC2702d, InterfaceC2704f {

    /* renamed from: a, reason: collision with root package name */
    public final float f21531a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21532b;

    public C2703e(float f) {
        this.f21531a = f;
        this.f21532b = f;
    }

    @Override // z.InterfaceC2702d, z.InterfaceC2704f
    public final float a() {
        return this.f21532b;
    }

    @Override // z.InterfaceC2702d
    public final void b(x0.Q q5, int i, int[] iArr, W0.m mVar, int[] iArr2) {
        int i5;
        int i6;
        if (iArr.length == 0) {
            return;
        }
        int K = q5.K(this.f21531a);
        boolean z3 = mVar == W0.m.f6017l;
        C2700b c2700b = AbstractC2706h.f21534a;
        if (z3) {
            i5 = 0;
            i6 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i7 = iArr[length];
                int min = Math.min(i5, i - i7);
                iArr2[length] = min;
                i6 = Math.min(K, (i - min) - i7);
                i5 = iArr2[length] + i7 + i6;
            }
        } else {
            int length2 = iArr.length;
            int i8 = 0;
            i5 = 0;
            i6 = 0;
            int i9 = 0;
            while (i8 < length2) {
                int i10 = iArr[i8];
                int min2 = Math.min(i5, i - i10);
                iArr2[i9] = min2;
                int min3 = Math.min(K, (i - min2) - i10);
                int i11 = iArr2[i9] + i10 + min3;
                i8++;
                i6 = min3;
                i5 = i11;
                i9++;
            }
        }
        if (i5 - i6 < i) {
            int round = Math.round((1 + (mVar != W0.m.f6016k ? (-1.0f) * (-1) : -1.0f)) * ((i - r5) / 2.0f));
            int length3 = iArr2.length;
            for (int i12 = 0; i12 < length3; i12++) {
                iArr2[i12] = iArr2[i12] + round;
            }
        }
    }

    @Override // z.InterfaceC2704f
    public final void c(int i, x0.Q q5, int[] iArr, int[] iArr2) {
        b(q5, i, iArr, W0.m.f6016k, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2703e)) {
            return false;
        }
        if (!W0.f.a(this.f21531a, ((C2703e) obj).f21531a)) {
            return false;
        }
        Object obj2 = C2705g.f21533l;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C2705g.f21533l.hashCode() + (((Float.floatToIntBits(this.f21531a) * 31) + 1231) * 31);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) W0.f.b(this.f21531a)) + ", " + C2705g.f21533l + ')';
    }
}
