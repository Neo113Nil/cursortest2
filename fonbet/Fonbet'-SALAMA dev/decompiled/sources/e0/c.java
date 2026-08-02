package e0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12498a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1362i f12500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f12500c = (AbstractC1362i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        c cVar = new c(this.f12500c, interfaceC1287d);
        cVar.f12499b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f12498a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            b bVar = (b) this.f12499b;
            this.f12498a = 1;
            obj = this.f12500c.invoke(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        b bVar2 = (b) obj;
        t6.h.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f12497b.f17771a).set(true);
        return bVar2;
    }
}
