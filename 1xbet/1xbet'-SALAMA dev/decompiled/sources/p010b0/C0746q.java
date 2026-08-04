package p010b0;

import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: renamed from: b0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0746q extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f10089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0746q(i0 i0Var, d dVar) {
        super(2, dVar);
        this.f10089b = i0Var;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        C0746q c0746q = new C0746q(this.f10089b, dVar);
        c0746q.f10088a = obj;
        return c0746q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0746q) create((i0) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        i0 i0Var = (i0) this.f10088a;
        return Boolean.valueOf((i0Var instanceof C0733d) && i0Var.f10053a <= this.f10089b.f10053a);
    }
}
