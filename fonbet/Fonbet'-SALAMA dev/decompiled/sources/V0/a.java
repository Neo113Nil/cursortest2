package V0;

import D6.C;
import G6.g;
import G6.s;
import X0.i;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f6635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f6636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, i iVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f6635b = gVar;
        this.f6636c = iVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new a(this.f6635b, this.f6636c, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f6634a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            s sVar = new s(this.f6636c, 2);
            this.f6634a = 1;
            if (this.f6635b.r(sVar, this) == aVar) {
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
