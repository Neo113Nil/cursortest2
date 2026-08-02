package P5;

import a.AbstractC0603a;
import android.content.Context;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class r extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public t6.p f5682a;

    /* renamed from: b, reason: collision with root package name */
    public int f5683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5684c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f5685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t6.p f5686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, L l7, t6.p pVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5684c = str;
        this.f5685d = l7;
        this.f5686e = pVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new r(this.f5684c, this.f5685d, this.f5686e, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        t6.p pVar;
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f5683b;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            e0.e eVar = new e0.e(this.f5684c);
            L l7 = this.f5685d;
            Context context = l7.f5627a;
            if (context == null) {
                t6.h.h("context");
                throw null;
            }
            C1726n0 c1726n0 = new C1726n0(M.a(context).getData(), eVar, l7, 10);
            t6.p pVar2 = this.f5686e;
            this.f5682a = pVar2;
            this.f5683b = 1;
            Object c3 = G6.x.c(c1726n0, this);
            if (c3 == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = c3;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f5682a;
            AbstractC0603a.p0(obj);
        }
        pVar.f16472a = obj;
        return C1116i.f13008a;
    }
}
