package c;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0486o;
import androidx.lifecycle.InterfaceC0489s;
import androidx.lifecycle.InterfaceC0491u;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0525d implements InterfaceC0489s {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0519F f7321k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0531j f7322l;

    public /* synthetic */ C0525d(C0519F c0519f, AbstractActivityC0531j abstractActivityC0531j) {
        this.f7321k = c0519f;
        this.f7322l = abstractActivityC0531j;
    }

    @Override // androidx.lifecycle.InterfaceC0489s
    public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (enumC0486o == EnumC0486o.ON_CREATE) {
            onBackInvokedDispatcher = this.f7322l.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.l.e("getOnBackInvokedDispatcher(...)", onBackInvokedDispatcher);
            this.f7321k.b(onBackInvokedDispatcher);
        }
    }
}
