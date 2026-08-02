package P5;

import a.AbstractC0603a;
import android.content.Context;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class y extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public t6.p f5712a;

    /* renamed from: b, reason: collision with root package name */
    public int f5713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f5715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t6.p f5716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, L l7, t6.p pVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5714c = str;
        this.f5715d = l7;
        this.f5716e = pVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new y(this.f5714c, this.f5715d, this.f5716e, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        t6.p pVar;
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f5713b;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            e0.e eVar = new e0.e(this.f5714c);
            Context context = this.f5715d.f5627a;
            if (context == null) {
                t6.h.h("context");
                throw null;
            }
            C0403o c0403o = new C0403o(M.a(context).getData(), eVar, 1);
            t6.p pVar2 = this.f5716e;
            this.f5712a = pVar2;
            this.f5713b = 1;
            Object c3 = G6.x.c(c0403o, this);
            if (c3 == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = c3;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f5712a;
            AbstractC0603a.p0(obj);
        }
        pVar.f16472a = obj;
        return C1116i.f13008a;
    }
}
