package androidx.fragment.app;

import androidx.lifecycle.EnumC0739m;
import androidx.lifecycle.InterfaceC0745t;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720t implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0722v f9493a;

    public C0720t(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        this.f9493a = abstractComponentCallbacksC0722v;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0745t interfaceC0745t, EnumC0739m enumC0739m) {
        if (enumC0739m == EnumC0739m.ON_STOP) {
            this.f9493a.getClass();
        }
    }
}
