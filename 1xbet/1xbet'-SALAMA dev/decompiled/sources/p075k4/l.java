package p075k4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14792b;

    public l(int i7) {
        int i8 = i7 + 1;
        int iFloor = (int) Math.floor(Math.log(i8) / Math.log(2.0d));
        this.f14792b = iFloor;
        this.f14791a = (((long) Math.pow(2.0d, iFloor)) - 1) & ((long) i8);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new k(this);
    }
}
