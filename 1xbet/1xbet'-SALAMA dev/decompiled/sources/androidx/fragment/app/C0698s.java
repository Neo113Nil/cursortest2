package androidx.fragment.app;

import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0698s extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0701v f9492a;

    public C0698s(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        this.f9492a = abstractComponentCallbacksC0701v;
    }

    @Override // androidx.fragment.app.C
    public final View b(int i7) {
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9492a;
        abstractComponentCallbacksC0701v.getClass();
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0701v + " does not have a view");
    }

    @Override // androidx.fragment.app.C
    public final boolean c() {
        this.f9492a.getClass();
        return false;
    }
}
