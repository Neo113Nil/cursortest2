package R2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class C extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super g0<Object>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f24262d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(C3922p c3922p, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f24263e = c3922p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C(this.f24263e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super g0<Object>> dVar) {
        return ((C) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object r11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f24262d;
        C3922p<Object> c3922p = this.f24263e;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                if (((C3922p) c3922p).f24418h.a() instanceof S) {
                    return ((C3922p) c3922p).f24418h.a();
                }
                this.f24262d = 1;
                r11 = c3922p.r(this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return (g0) obj;
                }
                Sc.s.b(obj);
            }
            this.f24262d = 2;
            obj = C3922p.l(c3922p, false, this);
        } catch (Throwable th2) {
            return new W(-1, th2);
        }
    }
}
