package androidx.appcompat.widget;

import android.view.View;

/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0638g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0634e f8623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644j f8624b;

    public RunnableC0638g(C0644j c0644j, C0634e c0634e) {
        this.f8624b = c0644j;
        this.f8623a = c0634e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.i iVar;
        C0644j c0644j = this.f8624b;
        m.k kVar = c0644j.f8653c;
        if (kVar != null && (iVar = kVar.f15142e) != null) {
            iVar.b(kVar);
        }
        View view = (View) c0644j.f8658y;
        if (view != null && view.getWindowToken() != null) {
            C0634e c0634e = this.f8623a;
            if (!c0634e.b()) {
                if (c0634e.f15195e != null) {
                    c0634e.d(0, 0, false, false);
                }
            }
            c0644j.f8646J = c0634e;
        }
        c0644j.f8648L = null;
    }
}
