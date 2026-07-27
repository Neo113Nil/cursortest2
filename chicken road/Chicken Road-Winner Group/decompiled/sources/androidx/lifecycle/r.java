package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class r implements k {

    /* renamed from: i, reason: collision with root package name */
    public static final r f2324i = new r();

    /* renamed from: a, reason: collision with root package name */
    public int f2325a;

    /* renamed from: b, reason: collision with root package name */
    public int f2326b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f2329e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2327c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2328d = true;
    public final m f = new m(this);

    /* renamed from: g, reason: collision with root package name */
    public final G0.m f2330g = new G0.m(3, this);

    /* renamed from: h, reason: collision with root package name */
    public final b0.i f2331h = new b0.i(29, this);

    public final void c() {
        int i3 = this.f2326b + 1;
        this.f2326b = i3;
        if (i3 == 1) {
            if (this.f2327c) {
                this.f.e(e.ON_RESUME);
                this.f2327c = false;
            } else {
                Handler handler = this.f2329e;
                kotlin.jvm.internal.j.b(handler);
                handler.removeCallbacks(this.f2330g);
            }
        }
    }

    @Override // androidx.lifecycle.k
    public final m e() {
        return this.f;
    }
}
