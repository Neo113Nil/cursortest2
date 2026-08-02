package e0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.LinkedHashMap;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12505a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1362i f12507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Function2 function2, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f12507c = (AbstractC1362i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        i iVar = new i(this.f12507c, interfaceC1287d);
        iVar.f12506b = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f12505a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f12506b;
            AbstractC0603a.p0(obj);
            return bVar;
        }
        AbstractC0603a.p0(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f12506b).a()), false);
        this.f12506b = bVar2;
        this.f12505a = 1;
        return this.f12507c.invoke(bVar2, this) == aVar ? aVar : bVar2;
    }
}
