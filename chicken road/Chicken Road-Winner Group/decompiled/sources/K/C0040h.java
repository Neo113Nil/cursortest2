package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: K.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040h extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public Iterator f851e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public int f852g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f853h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f854i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040h(List list, ArrayList arrayList, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f854i = list;
        this.f855j = arrayList;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        C0040h c0040h = new C0040h(this.f854i, this.f855j, interfaceC0319c);
        c0040h.f853h = obj;
        return c0040h;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        Iterator it;
        List list;
        int i3 = this.f852g;
        if (i3 == 0) {
            X0.a.L(obj);
            obj = this.f853h;
            it = this.f854i.iterator();
            list = this.f855j;
        } else if (i3 == 1) {
            Object obj2 = this.f;
            Iterator it2 = this.f851e;
            List list2 = (List) this.f853h;
            X0.a.L(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0039g(1, null));
                this.f853h = list2;
                this.f851e = it2;
                this.f = null;
                this.f852g = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f851e;
            list = (List) this.f853h;
            X0.a.L(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f853h = list;
        this.f851e = it;
        this.f = obj;
        this.f852g = 1;
        throw null;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0040h) b((InterfaceC0319c) obj2, obj)).g(C0279i.f4852a);
    }
}
