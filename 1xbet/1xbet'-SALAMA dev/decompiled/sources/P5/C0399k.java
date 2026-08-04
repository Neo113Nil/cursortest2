package P5;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: P5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0399k extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p030e0.e f5660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0399k(p030e0.e eVar, String str, p065i6.d dVar) {
        super(2, dVar);
        this.f5660b = eVar;
        this.f5661c = str;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        C0399k c0399k = new C0399k(this.f5660b, this.f5661c, dVar);
        c0399k.f5659a = obj;
        return c0399k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C0399k c0399k = (C0399k) create((p030e0.b) obj, (p065i6.d) obj2);
        p044f6.i iVar = p044f6.i.f13014a;
        c0399k.invokeSuspend(iVar);
        return iVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        p003a.a.p0(obj);
        ((p030e0.b) this.f5659a).d(this.f5660b, this.f5661c);
        return p044f6.i.f13014a;
    }
}
