package Q1;

import C1.C0095a;
import F1.h;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f5785a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5786b;

    public /* synthetic */ e(long j, int i7, boolean z4) {
        this.f5785a = i7;
        this.f5786b = j;
    }

    public static e b(h hVar, C0095a c0095a) {
        hVar.c((byte[]) c0095a.f1465c, 0, 8, false);
        c0095a.D(0);
        return new e(c0095a.k(), c0095a.g(), false);
    }

    public boolean a() {
        int i7 = this.f5785a;
        return i7 == 0 || i7 == 1;
    }

    public e(int i7, long j) {
        AbstractC1664a.f(j >= 0);
        this.f5785a = i7;
        this.f5786b = j;
    }
}
