package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* loaded from: classes10.dex */
final class O<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.K f870a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f871b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i<T> f872c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f873d;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {58, 60}, m = "emit")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f874d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ O<T> f875e;

        /* renamed from: f, reason: collision with root package name */
        int f876f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(O<? super T> o11, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f875e = o11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f874d = obj;
            this.f876f |= LinearLayoutManager.INVALID_OFFSET;
            return this.f875e.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    O(kotlin.jvm.internal.K k11, int i11, InterfaceC2397i<? super T> interfaceC2397i, Object obj) {
        this.f870a = k11;
        this.f871b = i11;
        this.f872c = interfaceC2397i;
        this.f873d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r5.emit(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (Ae.T.a(r5, r7, r6.f873d, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f876f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f876f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f874d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f876f;
                if (i11 == 0) {
                    if (i11 == 1) {
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
                kotlin.jvm.internal.K k11 = this.f870a;
                int i13 = k11.f71785a + 1;
                k11.f71785a = i13;
                int i14 = this.f871b;
                InterfaceC2397i<T> interfaceC2397i = this.f872c;
                if (i13 < i14) {
                    aVar.f876f = 1;
                } else {
                    aVar.f876f = 2;
                }
                return aVar2;
            }
        }
        aVar = new a(this, dVar);
        Object obj2 = aVar.f874d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f876f;
        if (i11 == 0) {
        }
    }
}
