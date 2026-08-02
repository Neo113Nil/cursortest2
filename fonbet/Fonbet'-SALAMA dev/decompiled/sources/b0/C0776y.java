package b0;

import D6.C0136t;
import a.AbstractC0603a;
import f6.C1116i;
import i6.C1293j;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* renamed from: b0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776y extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f10119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0776y(O o7, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f10119b = o7;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new C0776y(this.f10119b, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0776y) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f10118a;
        C1116i c1116i = C1116i.f13008a;
        O o7 = this.f10119b;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            this.f10118a = 1;
            Object j = ((C0136t) o7.f9972i.f17374c).j(this);
            if (j != aVar) {
                j = c1116i;
            }
            if (j == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractC0603a.p0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        G6.g gVar = o7.g().f10052c;
        G6.g a2 = gVar instanceof H6.j ? H6.l.a((H6.j) gVar, null, 0, 2, 1) : new H6.h(gVar, C1293j.f14068a, 0, 2);
        G6.s sVar = new G6.s(o7, 3);
        this.f10118a = 2;
        return a2.r(sVar, this) == aVar ? aVar : c1116i;
    }
}
