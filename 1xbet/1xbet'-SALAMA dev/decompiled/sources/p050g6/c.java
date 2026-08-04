package p050g6;

import P6.b;
import W5.AbstractC0486a1;
import java.util.RandomAccess;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends d implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f13298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13300c;

    public c(d dVar, int i7, int i8) {
        h.e(dVar, "list");
        this.f13298a = dVar;
        this.f13299b = i7;
        b.b(i7, i8, dVar.l());
        this.f13300c = i8 - i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i8 = this.f13300c;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "index: ", ", size: "));
        }
        return this.f13298a.get(this.f13299b + i7);
    }

    @Override // p050g6.d
    public final int l() {
        return this.f13300c;
    }
}
