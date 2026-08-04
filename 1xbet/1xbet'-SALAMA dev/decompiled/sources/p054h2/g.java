package p054h2;

import android.os.SystemClock;
import java.util.List;
import p032e2.k;
import p139t2.c;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13375g;

    @Override // p139t2.c
    public final int e() {
        return this.f13375g;
    }

    @Override // p139t2.c
    public final Object f() {
        return null;
    }

    @Override // p139t2.c
    public final int g() {
        return 0;
    }

    @Override // p139t2.c
    public final void l(long j, long j3, List list, k[] kVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (j(this.f13375g, jElapsedRealtime)) {
            for (int i7 = this.f16303b - 1; i7 >= 0; i7--) {
                if (!j(i7, jElapsedRealtime)) {
                    this.f13375g = i7;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
