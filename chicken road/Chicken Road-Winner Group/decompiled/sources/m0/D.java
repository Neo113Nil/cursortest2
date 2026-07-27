package m0;

import Y1.C0081e;
import java.util.ArrayList;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9944b;

    public /* synthetic */ D(int i3, Object obj) {
        this.f9943a = i3;
        this.f9944b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f9943a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ((InterfaceC1127o) this.f9944b).onProductDetailsResponse((C1120h) obj, arrayList);
                break;
            case 1:
                F1.b bVar = (F1.b) this.f9944b;
                ((C0081e) bVar.f378b).a(F2.b.s((C1120h) obj));
                break;
            default:
                ((F1.b) this.f9944b).c((C1120h) obj);
                break;
        }
    }

    public /* synthetic */ D(F1.b bVar, C1121i c1121i) {
        this.f9943a = 1;
        this.f9944b = bVar;
    }
}
