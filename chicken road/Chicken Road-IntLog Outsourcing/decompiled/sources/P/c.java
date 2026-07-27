package P;

import f4.v;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class c extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f2270a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m4.h f2272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2272c = (m4.h) interfaceC1445p;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m4.h, t4.p] */
    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        c cVar = new c(this.f2272c, interfaceC1218d);
        cVar.f2271b = obj;
        return cVar;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (InterfaceC1218d) obj2)).invokeSuspend(v.f5689a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [m4.h, t4.p] */
    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f2270a;
        if (i2 == 0) {
            e5.g.y(obj);
            b bVar = (b) this.f2271b;
            this.f2270a = 1;
            obj = this.f2272c.invoke(bVar, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        b bVar2 = (b) obj;
        i.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f2269b.f5783b).set(true);
        return bVar2;
    }
}
