package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* loaded from: classes.dex */
final class J<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.K f822a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i<T> f823b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {21}, m = "emit")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f824d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ J<T> f825e;

        /* renamed from: f, reason: collision with root package name */
        int f826f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(J<? super T> j11, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f825e = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f824d = obj;
            this.f826f |= LinearLayoutManager.INVALID_OFFSET;
            return this.f825e.emit(null, this);
        }
    }

    J(kotlin.jvm.internal.K k11, InterfaceC2397i interfaceC2397i) {
        this.f822a = k11;
        this.f823b = interfaceC2397i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f826f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f826f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f824d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f826f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.K k11 = this.f822a;
                    int i13 = k11.f71785a;
                    if (i13 < 1) {
                        k11.f71785a = i13 + 1;
                        return Unit.f71690a;
                    }
                    aVar.f826f = 1;
                    if (this.f823b.emit(t2, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(this, dVar);
        Object obj2 = aVar.f824d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f826f;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
