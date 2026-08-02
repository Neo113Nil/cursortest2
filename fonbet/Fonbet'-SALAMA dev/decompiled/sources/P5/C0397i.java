package P5;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.List;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* renamed from: P5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0397i extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f5655b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397i(List list, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5655b = list;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        C0397i c0397i = new C0397i(this.f5655b, interfaceC1287d);
        c0397i.f5654a = obj;
        return c0397i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C0397i c0397i = (C0397i) create((e0.b) obj, (InterfaceC1287d) obj2);
        C1116i c1116i = C1116i.f13008a;
        c0397i.invokeSuspend(c1116i);
        return c1116i;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        AbstractC0603a.p0(obj);
        e0.b bVar = (e0.b) this.f5654a;
        List<String> list = this.f5655b;
        if (list != null) {
            for (String str : list) {
                t6.h.e(str, "name");
                e0.e eVar = new e0.e(str);
                bVar.b();
                bVar.f12496a.remove(eVar);
            }
        } else {
            bVar.b();
            bVar.f12496a.clear();
        }
        return C1116i.f13008a;
    }
}
