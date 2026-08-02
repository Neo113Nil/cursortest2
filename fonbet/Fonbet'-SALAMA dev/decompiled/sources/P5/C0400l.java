package P5;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.List;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* renamed from: P5.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0400l extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f5663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5664c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0400l(L l7, List list, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5663b = l7;
        this.f5664c = list;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new C0400l(this.f5663b, this.f5664c, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0400l) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f5662a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            this.f5662a = 1;
            obj = L.b(this.f5663b, this.f5664c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        return obj;
    }
}
