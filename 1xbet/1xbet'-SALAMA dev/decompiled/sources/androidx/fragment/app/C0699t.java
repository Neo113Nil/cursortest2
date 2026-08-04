package androidx.fragment.app;

import androidx.lifecycle.EnumC0718m;
import androidx.lifecycle.InterfaceC0724t;

/* JADX INFO: renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0699t implements androidx.lifecycle.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0701v f9493a;

    public C0699t(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        this.f9493a = abstractComponentCallbacksC0701v;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0724t interfaceC0724t, EnumC0718m enumC0718m) {
        if (enumC0718m == EnumC0718m.ON_STOP) {
            this.f9493a.getClass();
        }
    }
}
