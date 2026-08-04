package P5;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class I extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p030e0.e f5617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(p030e0.e eVar, long j, p065i6.d dVar) {
        super(2, dVar);
        this.f5617b = eVar;
        this.f5618c = j;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        I i7 = new I(this.f5617b, this.f5618c, dVar);
        i7.f5616a = obj;
        return i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        I i7 = (I) create((p030e0.b) obj, (p065i6.d) obj2);
        p044f6.i iVar = p044f6.i.f13014a;
        i7.invokeSuspend(iVar);
        return iVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        p003a.a.p0(obj);
        ((p030e0.b) this.f5616a).d(this.f5617b, new Long(this.f5618c));
        return p044f6.i.f13014a;
    }
}
