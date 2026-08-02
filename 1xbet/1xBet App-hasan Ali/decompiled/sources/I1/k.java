package I1;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class k extends f {

    /* renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f2591c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2592d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f2593e;
    public boolean f;

    public k(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f2591c = onBackInvokedDispatcher;
        this.f2592d = i;
        this.f2593e = Build.VERSION.SDK_INT == 33 ? new l(0, this) : new m(this);
    }

    @Override // I1.f
    public final void b(boolean z3) {
        if (z3 && !this.f) {
            this.f2591c.registerOnBackInvokedCallback(this.f2592d, this.f2593e);
            this.f = true;
        } else {
            if (z3 || !this.f) {
                return;
            }
            this.f2591c.unregisterOnBackInvokedCallback(this.f2593e);
            this.f = false;
        }
    }
}
