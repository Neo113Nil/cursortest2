package R2;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import R2.C3922p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
/* renamed from: R2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3926u extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f24470d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24471e;

    /* renamed from: R2.u$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3922p<T> f24472a;

        a(C3922p<T> c3922p) {
            this.f24472a = c3922p;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            Object l11;
            C3922p<T> c3922p = this.f24472a;
            return ((((C3922p) c3922p).f24418h.a() instanceof S) || (l11 = C3922p.l(c3922p, true, dVar)) != Wc.a.COROUTINE_SUSPENDED) ? Unit.f71690a : l11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3926u(C3922p<Object> c3922p, kotlin.coroutines.d<? super C3926u> dVar) {
        super(2, dVar);
        this.f24471e = c3922p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3926u(this.f24471e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3926u) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r6.collect(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r6.a(r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        C3922p.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f24470d;
        C3922p<Object> c3922p = this.f24471e;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = ((C3922p) c3922p).f24419i;
            this.f24470d = 1;
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
        InterfaceC2395h d11 = C2399j.d(c3922p.p().a(), -1, 2);
        a aVar3 = new a(c3922p);
        this.f24470d = 2;
    }
}
