package P5;

import android.content.Context;
import kotlin.jvm.functions.Function2;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t6.p f5682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f5685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t6.p f5686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, L l7, t6.p pVar, p065i6.d dVar) {
        super(2, dVar);
        this.f5684c = str;
        this.f5685d = l7;
        this.f5686e = pVar;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new r(this.f5684c, this.f5685d, this.f5686e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((D6.C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        t6.p pVar;
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f5683b;
        if (i7 == 0) {
            p003a.a.p0(obj);
            p030e0.e eVar = new p030e0.e(this.f5684c);
            L l7 = this.f5685d;
            Context context = l7.f5627a;
            if (context == null) {
                t6.h.h("context");
                throw null;
            }
            C1017n0 c1017n0 = new C1017n0(M.a(context).getData(), eVar, l7, 10);
            t6.p pVar2 = this.f5686e;
            this.f5682a = pVar2;
            this.f5683b = 1;
            Object objC = G6.x.c(c1017n0, this);
            if (objC == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = objC;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f5682a;
            p003a.a.p0(obj);
        }
        pVar.f16478a = obj;
        return p044f6.i.f13014a;
    }
}
