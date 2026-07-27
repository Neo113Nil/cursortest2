package N2;

import D4.InterfaceC0022w;
import android.content.Context;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class F extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f2054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f2056c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String str, H h3, long j2, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2055b = str;
        this.f2056c = h3;
        this.f2057d = j2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new F(this.f2055b, this.f2056c, this.f2057d, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f2054a;
        if (i2 == 0) {
            e5.g.y(obj);
            P.d dVar = new P.d(this.f2055b);
            Context context = this.f2056c.f2062a;
            if (context == null) {
                kotlin.jvm.internal.i.l("context");
                throw null;
            }
            B1.g a6 = I.a(context);
            E e3 = new E(dVar, this.f2057d, null);
            this.f2054a = 1;
            if (a6.c(new P.h(e3, null), this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return f4.v.f5689a;
    }
}
