package p010b0;

import j6.a;
import kotlin.jvm.functions.Function1;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class B extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f9908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f9910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(O o7, d dVar) {
        super(1, dVar);
        this.f9910c = o7;
    }

    @Override // p077k6.a
    public final d create(d dVar) {
        return new B(this.f9910c, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((B) create((d) obj)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        i0 b0Var;
        a aVar = a.f14648a;
        int i7 = this.f9909b;
        O o7 = this.f9910c;
        try {
            if (i7 == 0) {
                p003a.a.p0(obj);
                this.f9909b = 1;
                obj = O.f(o7, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = this.f9908a;
                    p003a.a.p0(obj);
                    b0Var = new b0(th, ((Number) obj).intValue());
                    return new p044f6.d(b0Var, Boolean.TRUE);
                }
                p003a.a.p0(obj);
            }
            b0Var = (i0) obj;
        } catch (Throwable th2) {
            h0 h0VarG = o7.g();
            this.f9908a = th2;
            this.f9909b = 2;
            Integer numA = h0VarG.a();
            if (numA == aVar) {
                return aVar;
            }
            th = th2;
            obj = numA;
        }
        return new p044f6.d(b0Var, Boolean.TRUE);
    }
}
