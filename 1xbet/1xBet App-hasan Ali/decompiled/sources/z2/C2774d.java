package z2;

import G4.l;
import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import kotlin.jvm.internal.w;
import p4.InterfaceC2280u;
import t2.C2414b;
import t2.C2415c;
import y2.m;

/* renamed from: z2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2774d extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f21931k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f21932l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f21933m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f21934n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E2.i f21935o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f21936p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w f21937q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2415c f21938r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2774d(h hVar, w wVar, w wVar2, E2.i iVar, Object obj, w wVar3, C2415c c2415c, a4.c cVar) {
        super(2, cVar);
        this.f21932l = hVar;
        this.f21933m = wVar;
        this.f21934n = wVar2;
        this.f21935o = iVar;
        this.f21936p = obj;
        this.f21937q = wVar3;
        this.f21938r = c2415c;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2774d(this.f21932l, this.f21933m, this.f21934n, this.f21935o, this.f21936p, this.f21937q, this.f21938r, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2774d) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f21931k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
            return obj;
        }
        l.N(obj);
        m mVar = (m) this.f21933m.f17624k;
        C2414b c2414b = (C2414b) this.f21934n.f17624k;
        E2.m mVar2 = (E2.m) this.f21937q.f17624k;
        this.f21931k = 1;
        Object a5 = h.a(this.f21932l, mVar, c2414b, this.f21935o, this.f21936p, mVar2, this.f21938r, this);
        return a5 == enumC0510a ? enumC0510a : a5;
    }
}
