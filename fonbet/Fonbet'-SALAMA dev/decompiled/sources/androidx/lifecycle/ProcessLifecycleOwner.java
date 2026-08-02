package androidx.lifecycle;

import A1.K0;
import android.os.Handler;
import w1.C1761y0;

/* loaded from: classes.dex */
public final class ProcessLifecycleOwner implements InterfaceC0745t {

    /* renamed from: z, reason: collision with root package name */
    public static final ProcessLifecycleOwner f9594z = new ProcessLifecycleOwner();

    /* renamed from: a, reason: collision with root package name */
    public int f9595a;

    /* renamed from: b, reason: collision with root package name */
    public int f9596b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f9599e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9597c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9598d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C0747v f9600f = new C0747v(this);

    /* renamed from: x, reason: collision with root package name */
    public final K0 f9601x = new K0(this, 22);

    /* renamed from: y, reason: collision with root package name */
    public final C1761y0 f9602y = new C1761y0(this, 13);

    private ProcessLifecycleOwner() {
    }

    public final void a() {
        int i7 = this.f9596b + 1;
        this.f9596b = i7;
        if (i7 == 1) {
            if (this.f9597c) {
                this.f9600f.e(EnumC0739m.ON_RESUME);
                this.f9597c = false;
            } else {
                Handler handler = this.f9599e;
                t6.h.b(handler);
                handler.removeCallbacks(this.f9601x);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0745t
    public final AbstractC0741o getLifecycle() {
        return this.f9600f;
    }
}
