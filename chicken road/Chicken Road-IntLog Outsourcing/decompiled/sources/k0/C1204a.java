package k0;

import D4.InterfaceC0022w;
import G4.d;
import G4.q;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m0.i;
import m4.h;
import t4.InterfaceC1445p;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1204a extends h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f10667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f10668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f10669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204a(d dVar, i iVar, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f10668b = dVar;
        this.f10669c = iVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new C1204a(this.f10668b, this.f10669c, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1204a) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f10667a;
        if (i2 == 0) {
            g.y(obj);
            q qVar = new q(2, this.f10669c);
            this.f10667a = 1;
            if (this.f10668b.i(qVar, this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return v.f5689a;
    }
}
