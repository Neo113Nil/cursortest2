package h2;

import android.os.SystemClock;
import e2.InterfaceC1014k;
import java.util.List;

/* renamed from: h2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1185g extends t2.c {

    /* renamed from: g, reason: collision with root package name */
    public int f13369g;

    @Override // t2.c
    public final int e() {
        return this.f13369g;
    }

    @Override // t2.c
    public final Object f() {
        return null;
    }

    @Override // t2.c
    public final int g() {
        return 0;
    }

    @Override // t2.c
    public final void l(long j, long j3, List list, InterfaceC1014k[] interfaceC1014kArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j(this.f13369g, elapsedRealtime)) {
            for (int i7 = this.f16297b - 1; i7 >= 0; i7--) {
                if (!j(i7, elapsedRealtime)) {
                    this.f13369g = i7;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
