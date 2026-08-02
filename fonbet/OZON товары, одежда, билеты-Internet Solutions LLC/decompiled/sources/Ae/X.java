package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* loaded from: classes10.dex */
final class X<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i<T> f933a;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", l = {79}, m = "emit")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f934d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ X<T> f935e;

        /* renamed from: f, reason: collision with root package name */
        int f936f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(X<? super T> x11, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f935e = x11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f934d = obj;
            this.f936f |= LinearLayoutManager.INVALID_OFFSET;
            return this.f935e.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    X(InterfaceC2397i<? super T> interfaceC2397i) {
        this.f933a = interfaceC2397i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(InterfaceC2395h<? extends T> interfaceC2395h, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f936f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f936f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f934d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f936f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    aVar.f936f = 1;
                    if (C2399j.r(this.f933a, interfaceC2395h, aVar) == aVar2) {
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
        Object obj2 = aVar.f934d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f936f;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
