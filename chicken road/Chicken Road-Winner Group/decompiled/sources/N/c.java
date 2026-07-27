package N;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import o2.p;

/* loaded from: classes.dex */
public final class c extends i2.g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f981e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i2.g f982g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f982g = (i2.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i2.g, o2.p] */
    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        c cVar = new c(this.f982g, interfaceC0319c);
        cVar.f = obj;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [i2.g, o2.p] */
    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f981e;
        if (i3 == 0) {
            X0.a.L(obj);
            b bVar = (b) this.f;
            this.f981e = 1;
            obj = this.f982g.invoke(bVar, this);
            if (obj == enumC0326a) {
                return enumC0326a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
        }
        b bVar2 = (b) obj;
        j.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f980b.f2461b).set(true);
        return bVar2;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) b((InterfaceC0319c) obj2, (b) obj)).g(C0279i.f4852a);
    }
}
