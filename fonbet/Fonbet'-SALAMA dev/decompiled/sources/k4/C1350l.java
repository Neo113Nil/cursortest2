package k4;

import java.util.Iterator;

/* renamed from: k4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1350l implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final long f14785a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14786b;

    public C1350l(int i7) {
        int i8 = i7 + 1;
        int floor = (int) Math.floor(Math.log(i8) / Math.log(2.0d));
        this.f14786b = floor;
        this.f14785a = (((long) Math.pow(2.0d, floor)) - 1) & i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1349k(this);
    }
}
