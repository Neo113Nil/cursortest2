package P5;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p030e0.e f5606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f5607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(p030e0.e eVar, double d7, p065i6.d dVar) {
        super(2, dVar);
        this.f5606b = eVar;
        this.f5607c = d7;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        F f7 = new F(this.f5606b, this.f5607c, dVar);
        f7.f5605a = obj;
        return f7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        F f7 = (F) create((p030e0.b) obj, (p065i6.d) obj2);
        p044f6.i iVar = p044f6.i.f13014a;
        f7.invokeSuspend(iVar);
        return iVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        p003a.a.p0(obj);
        ((p030e0.b) this.f5605a).d(this.f5606b, new Double(this.f5607c));
        return p044f6.i.f13014a;
    }
}
