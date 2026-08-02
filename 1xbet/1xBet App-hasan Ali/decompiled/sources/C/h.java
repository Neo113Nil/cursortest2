package C;

import A.n;
import G4.l;
import W3.o;
import c4.AbstractC0548i;
import i4.InterfaceC2015a;
import kotlin.jvm.internal.m;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import z0.e0;

/* loaded from: classes.dex */
public final class h extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f792k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f793l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f794m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f795n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f796o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(i iVar, e0 e0Var, InterfaceC2015a interfaceC2015a, n nVar, a4.c cVar) {
        super(2, cVar);
        this.f793l = iVar;
        this.f794m = e0Var;
        this.f795n = (m) interfaceC2015a;
        this.f796o = nVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        ?? r32 = this.f795n;
        n nVar = this.f796o;
        h hVar = new h(this.f793l, this.f794m, r32, nVar, cVar);
        hVar.f792k = obj;
        return hVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        l.N(obj);
        InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f792k;
        e0 e0Var = this.f794m;
        ?? r22 = this.f795n;
        i iVar = this.f793l;
        AbstractC2282w.p(interfaceC2280u, null, new f(iVar, e0Var, r22, null), 3);
        return AbstractC2282w.p(interfaceC2280u, null, new g(iVar, this.f796o, null), 3);
    }
}
