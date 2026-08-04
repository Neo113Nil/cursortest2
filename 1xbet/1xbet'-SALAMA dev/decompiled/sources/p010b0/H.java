package p010b0;

import D6.C;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class H extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f9938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0733d f9939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(Function2 function2, C0733d c0733d, d dVar) {
        super(2, dVar);
        this.f9938b = (i) function2;
        this.f9939c = c0733d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new H(this.f9938b, this.f9939c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.f9937a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            Object obj2 = this.f9939c.f10021b;
            this.f9937a = 1;
            obj = this.f9938b.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return obj;
    }
}
