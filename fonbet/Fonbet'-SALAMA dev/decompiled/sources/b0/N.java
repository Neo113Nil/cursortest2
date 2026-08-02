package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.concurrent.atomic.AtomicInteger;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class N extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public t6.o f9957a;

    /* renamed from: b, reason: collision with root package name */
    public int f9958b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9959c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t6.o f9960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f9961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9962f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f9963x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(t6.o oVar, O o7, Object obj, boolean z4, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f9960d = oVar;
        this.f9961e = o7;
        this.f9962f = obj;
        this.f9963x = z4;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        N n2 = new N(this.f9960d, this.f9961e, this.f9962f, this.f9963x, interfaceC1287d);
        n2.f9959c = obj;
        return n2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((Y) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // k6.AbstractC1354a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t6.o oVar;
        Y y4;
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f9958b;
        t6.o oVar2 = this.f9960d;
        Object obj2 = this.f9962f;
        O o7 = this.f9961e;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            Y y5 = (Y) this.f9959c;
            h0 g3 = o7.g();
            this.f9959c = y5;
            this.f9957a = oVar2;
            this.f9958b = 1;
            Integer num = new Integer(((AtomicInteger) g3.f10051b.f17771a).incrementAndGet());
            if (num == aVar) {
                return aVar;
            }
            oVar = oVar2;
            y4 = y5;
            obj = num;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0603a.p0(obj);
                if (this.f9963x) {
                    o7.f9971h.s(new C0756d(obj2, obj2 != null ? obj2.hashCode() : 0, oVar2.f16471a));
                }
                return C1116i.f13008a;
            }
            oVar = this.f9957a;
            y4 = (Y) this.f9959c;
            AbstractC0603a.p0(obj);
        }
        oVar.f16471a = ((Number) obj).intValue();
        this.f9959c = null;
        this.f9957a = null;
        this.f9958b = 2;
        if (y4.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f9963x) {
        }
        return C1116i.f13008a;
    }
}
