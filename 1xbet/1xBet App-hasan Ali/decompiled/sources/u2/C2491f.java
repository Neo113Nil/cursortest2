package u2;

import android.graphics.drawable.Drawable;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import k0.C2023c;
import n.C2138i;
import p4.AbstractC2282w;
import p4.D;
import t2.C2417e;
import t2.C2421i;
import x0.C2623i;
import x0.InterfaceC2624j;

/* renamed from: u2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2491f extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19993k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19994l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2497l f19995m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2491f(C2497l c2497l, a4.c cVar) {
        super(2, cVar);
        this.f19995m = c2497l;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2491f c2491f = new C2491f(this.f19995m, cVar);
        c2491f.f19994l = obj;
        return c2491f;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2491f) create((E2.i) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        C2497l c2497l;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19993k;
        if (i == 0) {
            G4.l.N(obj);
            E2.i iVar = (E2.i) this.f19994l;
            C2497l c2497l2 = this.f19995m;
            C2421i c2421i = (C2421i) c2497l2.f20008B.getValue();
            E2.h a5 = E2.i.a(iVar);
            a5.f1425d = new C2138i(11, c2497l2);
            a5.f1434o = null;
            a5.f1435p = null;
            a5.f1436q = null;
            E2.d dVar = iVar.f1459y;
            if (dVar.f1414a == null) {
                a5.f1432m = new C2023c(13, c2497l2);
                a5.f1434o = null;
                a5.f1435p = null;
                a5.f1436q = null;
            }
            if (dVar.f1415b == null) {
                InterfaceC2624j interfaceC2624j = c2497l2.f20017w;
                F2.e eVar = AbstractC2485C.f19986b;
                a5.f1433n = (kotlin.jvm.internal.l.a(interfaceC2624j, C2623i.f21001b) || kotlin.jvm.internal.l.a(interfaceC2624j, C2623i.f21002c)) ? F2.g.f1533l : F2.g.f1532k;
            }
            if (dVar.f1417d != F2.d.f1528k) {
                a5.f1426e = F2.d.f1529l;
            }
            E2.i a6 = a5.a();
            this.f19994l = c2497l2;
            this.f19993k = 1;
            c2421i.getClass();
            w4.e eVar2 = D.f18743a;
            obj = AbstractC2282w.w(u4.m.f20109a.f18897p, new C2417e(c2421i, a6, null), this);
            if (obj == enumC0510a) {
                return enumC0510a;
            }
            c2497l = c2497l2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2497l = (C2497l) this.f19994l;
            G4.l.N(obj);
        }
        E2.j jVar = (E2.j) obj;
        c2497l.getClass();
        if (jVar instanceof E2.o) {
            E2.o oVar = (E2.o) jVar;
            return new C2489d(c2497l.j(oVar.f1477a), oVar);
        }
        if (!(jVar instanceof E2.e)) {
            throw new D2.e();
        }
        E2.e eVar3 = (E2.e) jVar;
        Drawable drawable = eVar3.f1418a;
        return new C2487b(drawable != null ? c2497l.j(drawable) : null, eVar3);
    }
}
