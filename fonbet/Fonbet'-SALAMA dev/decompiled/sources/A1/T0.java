package A1;

import E3.AbstractC0167z;
import E3.C0165x;

/* loaded from: classes.dex */
public final class T0 implements InterfaceC0027k {

    /* renamed from: b, reason: collision with root package name */
    public static final T0 f235b;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0167z f236a;

    static {
        C0165x c0165x = AbstractC0167z.f2083b;
        f235b = new T0(E3.L.f2000e);
    }

    public T0(AbstractC0167z abstractC0167z) {
        this.f236a = AbstractC0167z.E(abstractC0167z);
    }

    public final AbstractC0167z a() {
        return this.f236a;
    }

    public final boolean b(int i7) {
        int i8 = 0;
        while (true) {
            AbstractC0167z abstractC0167z = this.f236a;
            if (i8 >= abstractC0167z.size()) {
                return false;
            }
            S0 s02 = (S0) abstractC0167z.get(i8);
            boolean[] zArr = s02.f231e;
            int length = zArr.length;
            boolean z4 = false;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (zArr[i9]) {
                    z4 = true;
                    break;
                }
                i9++;
            }
            if (z4 && s02.f228b.f10343c == i7) {
                return true;
            }
            i8++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T0.class != obj.getClass()) {
            return false;
        }
        return this.f236a.equals(((T0) obj).f236a);
    }

    public final int hashCode() {
        return this.f236a.hashCode();
    }
}
