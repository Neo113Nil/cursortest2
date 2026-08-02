package Sb0;

import Kb0.K;
import Sc.s;
import Wb0.a;
import dc0.C6154S;
import dc0.C6170p;
import dc0.C6178x;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.limb.linkHandlers.OzonIdLinkHandlerReset$reset$1", f = "OzonIdLinkHandlerReset.kt", l = {20, 22}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f26086d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f26087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f26087e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f26087e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (dc0.C6170p.e(r6, false, false, r5, 7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C6178x c6178x;
        Wb0.c cVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f26086d;
        e eVar = this.f26087e;
        if (i11 == 0) {
            s.b(obj);
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            C6170p value = k11.t().f().getValue();
            this.f26086d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                a.InterfaceC0593a bVar = ((C6154S) obj).i() ? a.InterfaceC0593a.c.f33429a : new a.InterfaceC0593a.b();
                cVar = eVar.f26088a;
                Gb0.b.c(Gb0.a.RESET);
                cVar.b("reset", bVar, null);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        c6178x = eVar.f26089b;
        this.f26086d = 2;
        obj = c6178x.a(this);
    }
}
