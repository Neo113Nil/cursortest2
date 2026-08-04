package p010b0;

import j6.a;
import kotlin.jvm.functions.Function1;
import p065i6.d;
import p077k6.i;

/* JADX INFO: renamed from: b0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0736g extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10043a;

    @Override // p077k6.a
    public final d create(d dVar) {
        return new C0736g(1, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0736g c0736g = (C0736g) create((d) obj);
        p044f6.i iVar = p044f6.i.f13014a;
        c0736g.invokeSuspend(iVar);
        return iVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.f10043a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            this.f10043a = 1;
            throw null;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p003a.a.p0(obj);
        return p044f6.i.f13014a;
    }
}
