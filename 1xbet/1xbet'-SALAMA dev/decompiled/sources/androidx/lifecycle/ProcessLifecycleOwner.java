package androidx.lifecycle;

import A1.K0;
import android.os.Handler;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleOwner implements InterfaceC0724t {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ProcessLifecycleOwner f9594z = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9596b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f9599e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9597c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9598d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0726v f9600f = new C0726v(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final K0 f9601x = new K0(this, 22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1052y0 f9602y = new C1052y0(this, 13);

    private ProcessLifecycleOwner() {
    }

    public final void a() {
        int i7 = this.f9596b + 1;
        this.f9596b = i7;
        if (i7 == 1) {
            if (this.f9597c) {
                this.f9600f.e(EnumC0718m.ON_RESUME);
                this.f9597c = false;
            } else {
                Handler handler = this.f9599e;
                t6.h.b(handler);
                handler.removeCallbacks(this.f9601x);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0724t
    public final AbstractC0720o getLifecycle() {
        return this.f9600f;
    }
}
