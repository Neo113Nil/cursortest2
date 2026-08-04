package p010b0;

import A1.x0;
import j6.a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;
import t6.o;

/* JADX INFO: loaded from: classes.dex */
public final class N extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f9957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f9960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f9961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9962f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f9963x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(o oVar, O o7, Object obj, boolean z4, d dVar) {
        super(2, dVar);
        this.f9960d = oVar;
        this.f9961e = o7;
        this.f9962f = obj;
        this.f9963x = z4;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        N n2 = new N(this.f9960d, this.f9961e, this.f9962f, this.f9963x, dVar);
        n2.f9959c = obj;
        return n2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((Y) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        o oVar;
        Y y4;
        int iHashCode;
        a aVar = a.f14648a;
        int i7 = this.f9958b;
        o oVar2 = this.f9960d;
        Object obj2 = this.f9962f;
        O o7 = this.f9961e;
        if (i7 != 0) {
            if (i7 == 1) {
                oVar = this.f9957a;
                y4 = (Y) this.f9959c;
                p003a.a.p0(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p003a.a.p0(obj);
            }
            if (this.f9963x) {
                x0 x0Var = o7.f9971h;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                x0Var.s(new C0733d(obj2, iHashCode, oVar2.f16477a));
            }
            return p044f6.i.f13014a;
        }
        p003a.a.p0(obj);
        Y y5 = (Y) this.f9959c;
        h0 h0VarG = o7.g();
        this.f9959c = y5;
        this.f9957a = oVar2;
        this.f9958b = 1;
        Integer num = new Integer(((AtomicInteger) h0VarG.f10051b.f17777a).incrementAndGet());
        if (num == aVar) {
            return aVar;
        }
        oVar = oVar2;
        y4 = y5;
        obj = num;
        oVar.f16477a = ((Number) obj).intValue();
        this.f9959c = null;
        this.f9957a = null;
        this.f9958b = 2;
        if (y4.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f9963x) {
            x0 x0Var2 = o7.f9971h;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            x0Var2.s(new C0733d(obj2, iHashCode, oVar2.f16477a));
        }
        return p044f6.i.f13014a;
    }
}
