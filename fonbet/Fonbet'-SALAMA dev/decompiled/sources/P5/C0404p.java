package P5;

import a.AbstractC0603a;
import android.content.Context;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* renamed from: P5.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0404p extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public t6.p f5674a;

    /* renamed from: b, reason: collision with root package name */
    public int f5675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5676c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f5677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t6.p f5678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0404p(String str, L l7, t6.p pVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5676c = str;
        this.f5677d = l7;
        this.f5678e = pVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new C0404p(this.f5676c, this.f5677d, this.f5678e, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0404p) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        t6.p pVar;
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f5675b;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            e0.e eVar = new e0.e(this.f5676c);
            Context context = this.f5677d.f5627a;
            if (context == null) {
                t6.h.h("context");
                throw null;
            }
            C0403o c0403o = new C0403o(M.a(context).getData(), eVar, 0);
            t6.p pVar2 = this.f5678e;
            this.f5674a = pVar2;
            this.f5675b = 1;
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
            pVar = this.f5674a;
            AbstractC0603a.p0(obj);
        }
        pVar.f16472a = obj;
        return C1116i.f13008a;
    }
}
