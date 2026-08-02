package t4;

import K0.C0196a;
import S3.L;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import c4.InterfaceC0543d;
import o4.AbstractC2228f;
import p4.AbstractC2282w;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public final class t extends AbstractC0542c implements InterfaceC2369f {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2369f f19630k;

    /* renamed from: l, reason: collision with root package name */
    public final a4.h f19631l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19632m;

    /* renamed from: n, reason: collision with root package name */
    public a4.h f19633n;

    /* renamed from: o, reason: collision with root package name */
    public a4.c f19634o;

    public t(InterfaceC2369f interfaceC2369f, a4.h hVar) {
        super(r.f19628k, a4.i.f6649k);
        this.f19630k = interfaceC2369f;
        this.f19631l = hVar;
        this.f19632m = ((Number) hVar.A(new L(10), 0)).intValue();
    }

    @Override // s4.InterfaceC2369f
    public final Object d(Object obj, a4.c cVar) {
        try {
            Object f = f(cVar, obj);
            return f == EnumC0510a.f7289k ? f : W3.o.f6046a;
        } catch (Throwable th) {
            this.f19633n = new p(cVar.getContext(), th);
            throw th;
        }
    }

    public final Object f(a4.c cVar, Object obj) {
        a4.h context = cVar.getContext();
        AbstractC2282w.g(context);
        a4.h hVar = this.f19633n;
        if (hVar != context) {
            if (hVar instanceof p) {
                throw new IllegalStateException(AbstractC2228f.o0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) hVar).f19627l + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.A(new C0196a(12, this), 0)).intValue() != this.f19632m) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f19631l + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f19633n = context;
        }
        this.f19634o = cVar;
        u uVar = v.f19636a;
        InterfaceC2369f interfaceC2369f = this.f19630k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>", interfaceC2369f);
        uVar.getClass();
        Object d5 = interfaceC2369f.d(obj, this);
        if (!kotlin.jvm.internal.l.a(d5, EnumC0510a.f7289k)) {
            this.f19634o = null;
        }
        return d5;
    }

    @Override // c4.AbstractC0540a, c4.InterfaceC0543d
    public final InterfaceC0543d getCallerFrame() {
        a4.c cVar = this.f19634o;
        if (cVar instanceof InterfaceC0543d) {
            return (InterfaceC0543d) cVar;
        }
        return null;
    }

    @Override // c4.AbstractC0542c, a4.c
    public final a4.h getContext() {
        a4.h hVar = this.f19633n;
        return hVar == null ? a4.i.f6649k : hVar;
    }

    @Override // c4.AbstractC0540a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        Throwable a5 = W3.k.a(obj);
        if (a5 != null) {
            this.f19633n = new p(getContext(), a5);
        }
        a4.c cVar = this.f19634o;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return EnumC0510a.f7289k;
    }
}
