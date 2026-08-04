package p010b0;

import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class L extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f9952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O o7, d dVar) {
        super(2, dVar);
        this.f9952c = o7;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        L l7 = new L(this.f9952c, dVar);
        l7.f9951b = obj;
        return l7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((a0) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.f9950a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            a0 a0Var = (a0) this.f9951b;
            this.f9950a = 1;
            if (O.c(this.f9952c, a0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return p044f6.i.f13014a;
    }
}
