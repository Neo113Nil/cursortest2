package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0617g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0613e f8623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0623j f8624b;

    public RunnableC0617g(C0623j c0623j, C0613e c0613e) {
        this.f8624b = c0623j;
        this.f8623a = c0613e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p086m.i iVar;
        C0623j c0623j = this.f8624b;
        p086m.k kVar = c0623j.f8653c;
        if (kVar != null && (iVar = kVar.f15148e) != null) {
            iVar.b(kVar);
        }
        View view = (View) c0623j.f8658y;
        if (view != null && view.getWindowToken() != null) {
            C0613e c0613e = this.f8623a;
            if (c0613e.b()) {
                c0623j.f8646J = c0613e;
            } else if (c0613e.f15201e != null) {
                c0613e.d(0, 0, false, false);
                c0623j.f8646J = c0613e;
            }
        }
        c0623j.f8648L = null;
    }
}
