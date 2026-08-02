package androidx.lifecycle;

import java.util.HashMap;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476e implements InterfaceC0489s {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7051k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7052l;

    public /* synthetic */ C0476e(int i, Object obj) {
        this.f7051k = i;
        this.f7052l = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0489s
    public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
        switch (this.f7051k) {
            case 0:
                new HashMap();
                InterfaceC0481j[] interfaceC0481jArr = (InterfaceC0481j[]) this.f7052l;
                if (interfaceC0481jArr.length > 0) {
                    InterfaceC0481j interfaceC0481j = interfaceC0481jArr[0];
                    throw null;
                }
                if (interfaceC0481jArr.length <= 0) {
                    return;
                }
                InterfaceC0481j interfaceC0481j2 = interfaceC0481jArr[0];
                throw null;
            default:
                if (enumC0486o == EnumC0486o.ON_CREATE) {
                    interfaceC0491u.g().k(this);
                    ((M) this.f7052l).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0486o).toString());
                }
        }
    }
}
