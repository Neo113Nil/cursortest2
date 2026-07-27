package N2;

import D4.InterfaceC0022w;
import M.InterfaceC0080i;
import android.content.Context;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class p extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.s f2113a;

    /* renamed from: b, reason: collision with root package name */
    public int f2114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2115c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f2116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f2117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, H h3, kotlin.jvm.internal.s sVar, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2115c = str;
        this.f2116d = h3;
        this.f2117e = sVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new p(this.f2115c, this.f2116d, this.f2117e, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.s sVar;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f2114b;
        if (i2 == 0) {
            e5.g.y(obj);
            P.d dVar = new P.d(this.f2115c);
            H h3 = this.f2116d;
            Context context = h3.f2062a;
            if (context == null) {
                kotlin.jvm.internal.i.l("context");
                throw null;
            }
            B4.i iVar = new B4.i(((InterfaceC0080i) I.a(context).f215b).getData(), dVar, h3, 7);
            kotlin.jvm.internal.s sVar2 = this.f2117e;
            this.f2113a = sVar2;
            this.f2114b = 1;
            Object d6 = G4.x.d(iVar, this);
            if (d6 == enumC1260a) {
                return enumC1260a;
            }
            sVar = sVar2;
            obj = d6;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = this.f2113a;
            e5.g.y(obj);
        }
        sVar.f10741a = obj;
        return f4.v.f5689a;
    }
}
