package H6;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3431a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f3433c = fVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        e eVar = new e(this.f3433c, interfaceC1287d);
        eVar.f3432b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F6.p) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f3431a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            F6.p pVar = (F6.p) this.f3432b;
            this.f3431a = 1;
            if (this.f3433c.a(pVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        return C1116i.f13008a;
    }
}
