package Ve;

import Ae.C2399j;
import W2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class R7 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4180da f29834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7(C4180da c4180da, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29834e = c4180da;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new R7(this.f29834e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new R7(this.f29834e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r10 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r10 == r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29833d;
        ?? r22 = 0;
        r22 = 0;
        C4180da c4180da = this.f29834e;
        if (i11 == 0) {
            Sc.s.b(obj);
            Ma ma2 = c4180da.f30861a;
            Ma.f29467a.getClass();
            f.a key = C4381ka.f31431b;
            this.f29833d = 1;
            Le le2 = (Le) ma2;
            le2.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            obj = C2399j.w(new Ae.C(new C4729wc(AbstractC4445mg.f31590b.getValue(le2.f29422b, AbstractC4445mg.f31589a[0]).getData(), key), new C4727wa(3, 1, r22)), this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return (String) obj;
            }
            Sc.s.b(obj);
        }
        if (((String) obj) != null && (!kotlin.text.h.K(r1))) {
            r22 = obj;
        }
        String str = (String) r22;
        if (str != null) {
            return str;
        }
        this.f29833d = 2;
        obj = C4180da.a(c4180da, this);
    }
}
