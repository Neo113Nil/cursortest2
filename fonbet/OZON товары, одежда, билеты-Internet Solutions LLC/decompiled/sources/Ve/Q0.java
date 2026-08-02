package Ve;

import Lm0.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.C10720e0;

/* loaded from: classes10.dex */
public final class Q0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4577r4 f29746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Io f29747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U2 f29748g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(C4577r4 c4577r4, Io io2, U2 u22, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29746e = c4577r4;
        this.f29747f = io2;
        this.f29748g = u22;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Q0(this.f29746e, this.f29747f, this.f29748g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Q0) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r1.f(r6, r2, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29745d;
        C4577r4 c4577r4 = this.f29746e;
        if (i11 == 0) {
            Sc.s.b(obj);
            List h11 = ((C4654tn) c4577r4.f30498b).h();
            if (h11 != null && h11.size() == 1) {
                ((C4238fb) c4577r4.f31932f).b(new C4209eb(new C4780y7()));
            }
            this.f29745d = 1;
            obj = C4577r4.f0(c4577r4, this.f29747f, this.f29748g, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        C4395ko c4395ko = (C4395ko) obj;
        if (c4395ko != null) {
            Hn hn = c4577r4.f31934h;
            this.f29745d = 2;
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            hn.getClass();
        } else {
            Y9 y92 = c4577r4.f31932f;
            Intrinsics.checkNotNullParameter(y92, "<this>");
            a.b bVar2 = Lm0.a.f17149a;
            bVar2.b("ELSE BRANCH ERROR");
            bVar2.e("Unpredictable case", new Object[0]);
            ((C4238fb) y92).b(C4360ji.f31372a);
        }
        return Unit.f71690a;
    }
}
