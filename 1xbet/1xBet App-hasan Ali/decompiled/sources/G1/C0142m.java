package G1;

import androidx.lifecycle.EnumC0486o;
import androidx.lifecycle.InterfaceC0489s;
import androidx.lifecycle.InterfaceC0491u;
import java.util.ArrayList;

/* renamed from: G1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0142m implements InterfaceC0489s {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1914k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1915l;

    public /* synthetic */ C0142m(int i, Object obj) {
        this.f1914k = i;
        this.f1915l = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0489s
    public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
        switch (this.f1914k) {
            case 0:
                E e3 = (E) this.f1915l;
                kotlin.jvm.internal.l.f("this$0", e3);
                e3.f1842r = enumC0486o.a();
                if (e3.f1829c != null) {
                    ArrayList n02 = X3.m.n0(e3.f1832g);
                    int size = n02.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = n02.get(i);
                        i++;
                        C0140k c0140k = (C0140k) obj;
                        c0140k.getClass();
                        c0140k.f1901n = enumC0486o.a();
                        c0140k.i();
                    }
                    break;
                }
                break;
            default:
                EnumC0486o enumC0486o2 = EnumC0486o.ON_START;
                W1.a aVar = (W1.a) this.f1915l;
                if (enumC0486o != enumC0486o2) {
                    if (enumC0486o == EnumC0486o.ON_STOP) {
                        aVar.f6031h = false;
                        break;
                    }
                } else {
                    aVar.f6031h = true;
                    break;
                }
                break;
        }
    }
}
