package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719s extends C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0722v f9492a;

    public C0719s(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        this.f9492a = abstractComponentCallbacksC0722v;
    }

    @Override // androidx.fragment.app.C
    public final View b(int i7) {
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9492a;
        abstractComponentCallbacksC0722v.getClass();
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0722v + " does not have a view");
    }

    @Override // androidx.fragment.app.C
    public final boolean c() {
        this.f9492a.getClass();
        return false;
    }
}
