package Jc0;

import Kc0.p;
import Sc.r;
import Sc.s;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.InstantLoginImpl$disable$2", f = "InstantLoginImpl.kt", l = {87, 89}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super r<? extends Unit>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f14593d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f14594e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f14595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(c cVar, Map<String, String> map, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f14594e = cVar;
        this.f14595f = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f14594e, this.f14595f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super r<? extends Unit>> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r6.a(r5) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f14593d;
        c cVar = this.f14594e;
        if (i11 == 0) {
            s.b(obj);
            Kc0.d c11 = c.c(cVar);
            this.f14593d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                b11 = ((r) obj).getF26106a();
                return r.a(b11);
            }
            s.b(obj);
        }
        p d11 = c.d(cVar);
        Map<String, String> map = this.f14595f;
        if (map == null) {
            map = U.c();
        }
        this.f14593d = 2;
        b11 = d11.b(true, map, this);
    }
}
