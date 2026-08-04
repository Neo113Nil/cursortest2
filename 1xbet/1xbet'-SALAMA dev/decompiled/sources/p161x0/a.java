package p161x0;

import D6.C;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;
import p170z0.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f18087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p170z0.a f18088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, p170z0.a aVar, d dVar) {
        super(2, dVar);
        this.f18087b = bVar;
        this.f18088c = aVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new a(this.f18087b, this.f18088c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f18086a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            f fVar = this.f18087b.f18089a;
            this.f18086a = 1;
            obj = fVar.b(this.f18088c, this);
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
