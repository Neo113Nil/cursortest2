package P5;

import android.content.Context;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t6.p f5712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f5715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t6.p f5716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, L l7, t6.p pVar, p065i6.d dVar) {
        super(2, dVar);
        this.f5714c = str;
        this.f5715d = l7;
        this.f5716e = pVar;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new y(this.f5714c, this.f5715d, this.f5716e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((D6.C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        t6.p pVar;
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f5713b;
        if (i7 == 0) {
            p003a.a.p0(obj);
            p030e0.e eVar = new p030e0.e(this.f5714c);
            Context context = this.f5715d.f5627a;
            if (context == null) {
                t6.h.h("context");
                throw null;
            }
            C0403o c0403o = new C0403o(M.a(context).getData(), eVar, 1);
            t6.p pVar2 = this.f5716e;
            this.f5712a = pVar2;
            this.f5713b = 1;
            Object objC = G6.x.c(c0403o, this);
            if (objC == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = objC;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f5712a;
            p003a.a.p0(obj);
        }
        pVar.f16478a = obj;
        return p044f6.i.f13014a;
    }
}
