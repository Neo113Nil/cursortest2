package P0;

import n.AbstractC2107A;

/* renamed from: P0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f4646a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4647b;

    public C0335e(int i, int i5) {
        this.f4646a = i;
        this.f4647b = i5;
        if (i >= 0 && i5 >= 0) {
            return;
        }
        Q0.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i5 + " respectively.");
    }

    @Override // P0.g
    public final void a(h hVar) {
        int i = hVar.f4652m;
        int i5 = this.f4647b;
        int i6 = i + i5;
        int i7 = (i ^ i6) & (i5 ^ i6);
        M0.e eVar = (M0.e) hVar.f4655p;
        if (i7 < 0) {
            i6 = eVar.c();
        }
        hVar.b(hVar.f4652m, Math.min(i6, eVar.c()));
        int i8 = hVar.f4651l;
        int i9 = this.f4646a;
        int i10 = i8 - i9;
        if (((i8 ^ i10) & (i9 ^ i8)) < 0) {
            i10 = 0;
        }
        hVar.b(Math.max(0, i10), hVar.f4651l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0335e)) {
            return false;
        }
        C0335e c0335e = (C0335e) obj;
        return this.f4646a == c0335e.f4646a && this.f4647b == c0335e.f4647b;
    }

    public final int hashCode() {
        return (this.f4646a * 31) + this.f4647b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f4646a);
        sb.append(", lengthAfterCursor=");
        return AbstractC2107A.t(sb, this.f4647b, ')');
    }
}
