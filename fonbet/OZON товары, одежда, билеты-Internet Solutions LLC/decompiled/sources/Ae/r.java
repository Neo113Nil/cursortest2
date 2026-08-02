package Ae;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", l = {307, 309, 310}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class r extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super Unit>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f1108d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f1109e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f1110f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(long j11, kotlin.coroutines.d<? super r> dVar) {
        super(2, dVar);
        this.f1110f = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        r rVar = new r(this.f1110f, dVar);
        rVar.f1109e = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ze.u<? super Unit> uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((r) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (xe.Y.b(r2, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (((ze.i) r8).n(r6, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (xe.Y.b(r2, r7) == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0058 -> B:12:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ze.u uVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1108d;
        long j11 = this.f1110f;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    uVar = (ze.u) this.f1109e;
                    Sc.s.b(obj);
                    this.f1109e = uVar;
                    this.f1108d = 3;
                } else if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            uVar = (ze.u) this.f1109e;
            Sc.s.b(obj);
        } else {
            Sc.s.b(obj);
            uVar = (ze.u) this.f1109e;
            this.f1109e = uVar;
            this.f1108d = 1;
        }
        ze.x k11 = uVar.k();
        Unit unit = Unit.f71690a;
        this.f1109e = uVar;
        this.f1108d = 2;
    }
}
