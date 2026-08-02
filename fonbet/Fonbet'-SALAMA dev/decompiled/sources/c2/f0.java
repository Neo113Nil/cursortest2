package c2;

import A1.InterfaceC0027k;
import E3.AbstractC0167z;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class f0 implements InterfaceC0027k {

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f10346d = new f0(new e0[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f10347a;

    /* renamed from: b, reason: collision with root package name */
    public final E3.L f10348b;

    /* renamed from: c, reason: collision with root package name */
    public int f10349c;

    public f0(e0... e0VarArr) {
        this.f10348b = AbstractC0167z.F(e0VarArr);
        this.f10347a = e0VarArr.length;
        int i7 = 0;
        while (true) {
            E3.L l7 = this.f10348b;
            if (i7 >= l7.size()) {
                return;
            }
            int i8 = i7 + 1;
            for (int i9 = i8; i9 < l7.size(); i9++) {
                if (((e0) l7.get(i7)).equals(l7.get(i9))) {
                    AbstractC1664a.l("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i8;
        }
    }

    public final e0 a(int i7) {
        return (e0) this.f10348b.get(i7);
    }

    public final int b(e0 e0Var) {
        int indexOf = this.f10348b.indexOf(e0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f10347a == f0Var.f10347a && this.f10348b.equals(f0Var.f10348b);
    }

    public final int hashCode() {
        if (this.f10349c == 0) {
            this.f10349c = this.f10348b.hashCode();
        }
        return this.f10349c;
    }
}
