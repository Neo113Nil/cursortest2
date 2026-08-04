package P5;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p030e0.e f5595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(p030e0.e eVar, boolean z4, p065i6.d dVar) {
        super(2, dVar);
        this.f5595b = eVar;
        this.f5596c = z4;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        C c3 = new C(this.f5595b, this.f5596c, dVar);
        c3.f5594a = obj;
        return c3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C c3 = (C) create((p030e0.b) obj, (p065i6.d) obj2);
        p044f6.i iVar = p044f6.i.f13014a;
        c3.invokeSuspend(iVar);
        return iVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        p003a.a.p0(obj);
        ((p030e0.b) this.f5594a).d(this.f5595b, Boolean.valueOf(this.f5596c));
        return p044f6.i.f13014a;
    }
}
