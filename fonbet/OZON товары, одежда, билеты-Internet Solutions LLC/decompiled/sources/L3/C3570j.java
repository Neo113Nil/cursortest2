package L3;

import L3.L;
import android.view.Surface;
import androidx.media3.exoplayer.j0;
import j3.Q;

/* renamed from: L3.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3570j implements L.a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3571k f16304b;

    C3570j(C3571k c3571k) {
        this.f16304b = c3571k;
    }

    @Override // L3.L.a
    public final void a() {
        j0.a z02;
        z02 = this.f16304b.z0();
        if (z02 != null) {
            z02.b();
        }
    }

    @Override // L3.L.a
    public final void d() {
        Surface surface;
        C3571k c3571k = this.f16304b;
        surface = c3571k.f16342r1;
        if (surface != null) {
            C3571k.p1(c3571k);
        }
    }

    @Override // L3.L.a
    public final void e() {
        Surface surface;
        C3571k c3571k = this.f16304b;
        surface = c3571k.f16342r1;
        if (surface != null) {
            c3571k.H1(0, 1);
        }
    }

    @Override // L3.L.a
    public final void onVideoSizeChanged(Q q11) {
    }
}
