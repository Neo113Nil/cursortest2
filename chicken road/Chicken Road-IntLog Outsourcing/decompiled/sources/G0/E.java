package G0;

import M2.C0105i;
import java.util.ArrayList;
import java.util.function.Consumer;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f751b;

    public /* synthetic */ E(int i2, Object obj) {
        this.f750a = i2;
        this.f751b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f750a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ((InterfaceC0067q) this.f751b).onProductDetailsResponse((C0060j) obj, arrayList);
                break;
            case 1:
                D3.g gVar = (D3.g) this.f751b;
                ((C0105i) gVar.f448b).a(AbstractC1341c.j((C0060j) obj));
                break;
            default:
                ((D3.g) this.f751b).f((C0060j) obj);
                break;
        }
    }

    public /* synthetic */ E(D3.g gVar, C0061k c0061k) {
        this.f750a = 1;
        this.f751b = gVar;
    }
}
