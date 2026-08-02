package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* renamed from: b0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760h extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f10044a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10045b;

    /* renamed from: c, reason: collision with root package name */
    public int f10046c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f10048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0760h(List list, ArrayList arrayList, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f10048e = list;
        this.f10049f = arrayList;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        C0760h c0760h = new C0760h(this.f10048e, this.f10049f, interfaceC1287d);
        c0760h.f10047d = obj;
        return c0760h;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0760h) create(obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f10046c;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            obj = this.f10047d;
            it = this.f10048e.iterator();
            list = this.f10049f;
        } else if (i7 == 1) {
            Object obj2 = this.f10045b;
            Iterator it2 = this.f10044a;
            List list2 = (List) this.f10047d;
            AbstractC0603a.p0(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0759g(1, null));
                this.f10047d = list2;
                this.f10044a = it2;
                this.f10045b = null;
                this.f10046c = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f10044a;
            list = (List) this.f10047d;
            AbstractC0603a.p0(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f10047d = list;
        this.f10044a = it;
        this.f10045b = obj;
        this.f10046c = 1;
        throw null;
    }
}
