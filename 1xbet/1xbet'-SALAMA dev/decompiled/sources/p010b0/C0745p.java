package p010b0;

import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: renamed from: b0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0745p extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10087a;

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        C0745p c0745p = new C0745p(2, dVar);
        c0745p.f10087a = obj;
        return c0745p;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0745p) create((i0) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        return Boolean.valueOf(!(((i0) this.f10087a) instanceof Z));
    }
}
