package P0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f4648a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4649b;

    public f(int i, int i5) {
        this.f4648a = i;
        this.f4649b = i5;
        if (i >= 0 && i5 >= 0) {
            return;
        }
        Q0.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i5 + " respectively.");
    }

    @Override // P0.g
    public final void a(h hVar) {
        int i = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 < this.f4648a) {
                int i7 = i6 + 1;
                int i8 = hVar.f4651l;
                if (i8 <= i7) {
                    i6 = i8;
                    break;
                } else {
                    i6 = (Character.isHighSurrogate(hVar.c((i8 - i7) + (-1))) && Character.isLowSurrogate(hVar.c(hVar.f4651l - i7))) ? i6 + 2 : i7;
                    i5++;
                }
            } else {
                break;
            }
        }
        int i9 = 0;
        while (true) {
            if (i >= this.f4649b) {
                break;
            }
            int i10 = i9 + 1;
            int i11 = hVar.f4652m + i10;
            M0.e eVar = (M0.e) hVar.f4655p;
            if (i11 >= eVar.c()) {
                i9 = eVar.c() - hVar.f4652m;
                break;
            } else {
                i9 = (Character.isHighSurrogate(hVar.c((hVar.f4652m + i10) + (-1))) && Character.isLowSurrogate(hVar.c(hVar.f4652m + i10))) ? i9 + 2 : i10;
                i++;
            }
        }
        int i12 = hVar.f4652m;
        hVar.b(i12, i9 + i12);
        int i13 = hVar.f4651l;
        hVar.b(i13 - i6, i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4648a == fVar.f4648a && this.f4649b == fVar.f4649b;
    }

    public final int hashCode() {
        return (this.f4648a * 31) + this.f4649b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f4648a);
        sb.append(", lengthAfterCursor=");
        return AbstractC2107A.t(sb, this.f4649b, ')');
    }
}
