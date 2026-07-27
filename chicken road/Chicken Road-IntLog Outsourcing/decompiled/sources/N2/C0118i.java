package N2;

import D4.InterfaceC0022w;
import android.content.Context;
import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: N2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118i extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f2090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f2091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f2092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0118i(H h3, List list, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2091b = h3;
        this.f2092c = list;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new C0118i(this.f2091b, this.f2092c, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0118i) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f2090a;
        if (i2 == 0) {
            e5.g.y(obj);
            Context context = this.f2091b.f2062a;
            if (context == null) {
                kotlin.jvm.internal.i.l("context");
                throw null;
            }
            B1.g a6 = I.a(context);
            C0117h c0117h = new C0117h(this.f2092c, null);
            this.f2090a = 1;
            obj = a6.c(new P.h(c0117h, null), this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return obj;
    }
}
