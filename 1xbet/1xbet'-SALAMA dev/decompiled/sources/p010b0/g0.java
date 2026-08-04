package p010b0;

import G6.h;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i implements Function2 {
    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new g0(2, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        g0 g0Var = (g0) create((h) obj, (d) obj2);
        p044f6.i iVar = p044f6.i.f13014a;
        g0Var.invokeSuspend(iVar);
        return iVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        return p044f6.i.f13014a;
    }
}
