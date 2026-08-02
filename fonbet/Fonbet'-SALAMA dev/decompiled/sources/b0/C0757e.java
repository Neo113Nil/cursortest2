package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.List;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* renamed from: b0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757e extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10026a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f10028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0757e(List list, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f10028c = list;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        C0757e c0757e = new C0757e(this.f10028c, interfaceC1287d);
        c0757e.f10027b = obj;
        return c0757e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0757e) create((C0764l) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f10026a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            C0764l c0764l = (C0764l) this.f10027b;
            this.f10026a = 1;
            if (Y4.D.a(this.f10028c, c0764l, this) == aVar) {
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
