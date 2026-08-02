package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class I extends AbstractC1362i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f9940a;

    /* renamed from: b, reason: collision with root package name */
    public int f9941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f9942c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1292i f9943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC1362i f9944e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(O o7, InterfaceC1292i interfaceC1292i, Function2 function2, InterfaceC1287d interfaceC1287d) {
        super(1, interfaceC1287d);
        this.f9942c = o7;
        this.f9943d = interfaceC1292i;
        this.f9944e = (AbstractC1362i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(InterfaceC1287d interfaceC1287d) {
        return new I(this.f9942c, this.f9943d, this.f9944e, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((I) create((InterfaceC1287d) obj)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Type inference failed for: r6v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // k6.AbstractC1354a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0756d c0756d;
        Object obj2;
        Object obj3;
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f9941b;
        O o7 = this.f9942c;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            this.f9941b = 1;
            obj = O.f(o7, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.f9940a;
                    AbstractC0603a.p0(obj);
                    return obj3;
                }
                c0756d = (C0756d) this.f9940a;
                AbstractC0603a.p0(obj);
                obj2 = c0756d.f10021b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0756d.f10022c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (t6.h.a(c0756d.f10021b, obj)) {
                    return obj;
                }
                this.f9940a = obj;
                this.f9941b = 3;
                if (o7.j(obj, true, this) == aVar) {
                    return aVar;
                }
                obj3 = obj;
                return obj3;
            }
            AbstractC0603a.p0(obj);
        }
        c0756d = (C0756d) obj;
        H h6 = new H(this.f9944e, c0756d, null);
        this.f9940a = c0756d;
        this.f9941b = 2;
        obj = D6.E.x(this.f9943d, h6, this);
        if (obj == aVar) {
            return aVar;
        }
        obj2 = c0756d.f10021b;
        if ((obj2 == null ? obj2.hashCode() : 0) == c0756d.f10022c) {
        }
    }
}
