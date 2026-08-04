package I0;

import D6.C;
import G6.s;
import G6.u;
import android.app.Activity;
import kotlin.jvm.functions.Function2;
import p077k6.i;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f3489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f3490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Activity activity, p065i6.d dVar) {
        super(2, dVar);
        this.f3489b = cVar;
        this.f3490c = activity;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new b(this.f3489b, this.f3490c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        G6.g fVar;
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f3488a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            c cVar = this.f3489b;
            V0 v6 = new V0(15, cVar.f3491a.a(this.f3490c), cVar, false);
            if (!(v6 instanceof u)) {
                fVar = v6;
                fVar = new G6.f(v6);
            }
            fVar = v6;
            s sVar = new s(cVar, 1);
            this.f3488a = 1;
            if (fVar.r(sVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return p044f6.i.f13014a;
    }
}
