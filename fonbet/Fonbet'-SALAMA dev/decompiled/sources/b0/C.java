package b0;

import a.AbstractC0603a;
import f6.C1111d;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class C extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f9911a;

    /* renamed from: b, reason: collision with root package name */
    public int f9912b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f9913c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f9914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(O o7, int i7, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f9914d = o7;
        this.f9915e = i7;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        C c3 = new C(this.f9914d, this.f9915e, interfaceC1287d);
        c3.f9913c = ((Boolean) obj).booleanValue();
        return c3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C) create(bool, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i7;
        boolean z4;
        i0 i0Var;
        boolean z7;
        j6.a aVar = j6.a.f14642a;
        boolean z8 = this.f9912b;
        O o7 = this.f9914d;
        try {
        } catch (Throwable th2) {
            if (z8 != 0) {
                h0 g3 = o7.g();
                this.f9911a = th2;
                this.f9913c = z8;
                this.f9912b = 2;
                Integer a2 = g3.a();
                if (a2 == aVar) {
                    return aVar;
                }
                z4 = z8;
                th = th2;
                obj = a2;
            } else {
                boolean z9 = z8;
                th = th2;
                i7 = this.f9915e;
                z4 = z9;
            }
        }
        if (z8 == 0) {
            AbstractC0603a.p0(obj);
            boolean z10 = this.f9913c;
            this.f9913c = z10;
            this.f9912b = 1;
            obj = O.f(o7, z10, this);
            z8 = z10;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z8 != 1) {
                if (z8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = this.f9913c;
                th = this.f9911a;
                AbstractC0603a.p0(obj);
                i7 = ((Number) obj).intValue();
                b0 b0Var = new b0(th, i7);
                z7 = z4;
                i0Var = b0Var;
                return new C1111d(i0Var, Boolean.valueOf(z7));
            }
            boolean z11 = this.f9913c;
            AbstractC0603a.p0(obj);
            z8 = z11;
        }
        i0Var = (i0) obj;
        z7 = z8;
        return new C1111d(i0Var, Boolean.valueOf(z7));
    }
}
