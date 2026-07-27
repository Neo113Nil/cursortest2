package m0;

import F4.q;
import android.app.Activity;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import n0.InterfaceC1296a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class j extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f11113a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1267b f11115c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f11116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C1267b c1267b, Activity activity, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f11115c = c1267b;
        this.f11116d = activity;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        j jVar = new j(this.f11115c, this.f11116d, interfaceC1218d);
        jVar.f11114b = obj;
        return jVar;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((q) obj, (InterfaceC1218d) obj2)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f11113a;
        if (i2 == 0) {
            e5.g.y(obj);
            q qVar = (q) this.f11114b;
            i iVar = new i(0, qVar);
            C1267b c1267b = this.f11115c;
            ((InterfaceC1296a) c1267b.f11097b).b(this.f11116d, new U.d(0), iVar);
            O.b bVar = new O.b(c1267b, 2, iVar);
            this.f11113a = 1;
            if (F4.i.b(qVar, bVar, this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return v.f5689a;
    }
}
