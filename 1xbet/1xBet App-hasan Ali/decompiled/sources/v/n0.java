package v;

import a.AbstractC0444a;
import android.widget.Magnifier;
import h0.C1988b;

/* loaded from: classes.dex */
public class n0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Magnifier f20275a;

    public n0(Magnifier magnifier) {
        this.f20275a = magnifier;
    }

    @Override // v.l0
    public void a(long j5, long j6) {
        this.f20275a.show(C1988b.d(j5), C1988b.e(j5));
    }

    public final void b() {
        this.f20275a.dismiss();
    }

    public final long c() {
        return AbstractC0444a.b(this.f20275a.getWidth(), this.f20275a.getHeight());
    }

    public final void d() {
        this.f20275a.update();
    }
}
