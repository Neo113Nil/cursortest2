package N9;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class m implements Comparable<m> {

    /* renamed from: a, reason: collision with root package name */
    public final int f18815a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18816b;

    public m(int i11, int i12) {
        this.f18815a = i11;
        this.f18816b = i12;
    }

    public final m a(m mVar) {
        int i11 = mVar.f18816b;
        int i12 = this.f18815a;
        int i13 = i12 * i11;
        int i14 = mVar.f18815a;
        int i15 = this.f18816b;
        return i13 <= i14 * i15 ? new m(i14, (i15 * i14) / i12) : new m((i12 * i11) / i15, i11);
    }

    public final m b(m mVar) {
        int i11 = mVar.f18816b;
        int i12 = this.f18815a;
        int i13 = i12 * i11;
        int i14 = mVar.f18815a;
        int i15 = this.f18816b;
        return i13 >= i14 * i15 ? new m(i14, (i15 * i14) / i12) : new m((i12 * i11) / i15, i11);
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull m mVar) {
        m mVar2 = mVar;
        int i11 = this.f18816b * this.f18815a;
        int i12 = mVar2.f18816b * mVar2.f18815a;
        if (i12 < i11) {
            return 1;
        }
        return i12 > i11 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f18815a == mVar.f18815a && this.f18816b == mVar.f18816b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18815a * 31) + this.f18816b;
    }

    public final String toString() {
        return this.f18815a + "x" + this.f18816b;
    }
}
