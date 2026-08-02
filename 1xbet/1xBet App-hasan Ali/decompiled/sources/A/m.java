package A;

import G1.C0140k;
import P.InterfaceC0289e0;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f63l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f64m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, InterfaceC0289e0 interfaceC0289e0) {
        super(0);
        this.f63l = i;
        this.f64m = interfaceC0289e0;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f63l) {
            case 0:
                return new C0008h((i4.c) this.f64m.getValue());
            case 1:
                return (k) ((InterfaceC2015a) this.f64m.getValue()).invoke();
            case 2:
                Boolean bool = (Boolean) this.f64m.getValue();
                bool.booleanValue();
                return bool;
            case 3:
                List list = (List) this.f64m.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (kotlin.jvm.internal.l.a(((C0140k) obj).f1899l.f1964k, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                return (L.h) this.f64m.getValue();
        }
    }
}
