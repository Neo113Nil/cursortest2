package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.io.Serializable;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class F extends AbstractC1362i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f9930a;

    /* renamed from: b, reason: collision with root package name */
    public int f9931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6.p f9932c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f9933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t6.o f9934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(t6.p pVar, O o7, t6.o oVar, InterfaceC1287d interfaceC1287d) {
        super(1, interfaceC1287d);
        this.f9932c = pVar;
        this.f9933d = o7;
        this.f9934e = oVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(InterfaceC1287d interfaceC1287d) {
        return new F(this.f9932c, this.f9933d, this.f9934e, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((F) create((InterfaceC1287d) obj)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        t6.p pVar;
        t6.o oVar;
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f9931b;
        t6.o oVar2 = this.f9934e;
        t6.p pVar2 = this.f9932c;
        O o7 = this.f9933d;
        try {
        } catch (C0755c unused) {
            Object obj2 = pVar2.f16472a;
            this.f9930a = oVar2;
            this.f9931b = 3;
            obj = o7.j(obj2, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            this.f9930a = pVar2;
            this.f9931b = 1;
            obj = o7.i(this);
            if (obj == aVar) {
                return aVar;
            }
            pVar = pVar2;
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    oVar = (t6.o) this.f9930a;
                    AbstractC0603a.p0(obj);
                    oVar.f16471a = ((Number) obj).intValue();
                    return C1116i.f13008a;
                }
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar2 = (t6.o) this.f9930a;
                AbstractC0603a.p0(obj);
                oVar2.f16471a = ((Number) obj).intValue();
                return C1116i.f13008a;
            }
            pVar = (t6.p) this.f9930a;
            AbstractC0603a.p0(obj);
        }
        pVar.f16472a = obj;
        h0 g3 = o7.g();
        this.f9930a = oVar2;
        this.f9931b = 2;
        obj = g3.a();
        if (obj == aVar) {
            return aVar;
        }
        oVar = oVar2;
        oVar.f16471a = ((Number) obj).intValue();
        return C1116i.f13008a;
    }
}
