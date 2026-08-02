package Ae;

import Be.C2629a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ae.f0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2392f0 implements InterfaceC2397i<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function2 f983a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M f984b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", l = {131}, m = "emit")
    /* renamed from: Ae.f0$a */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        C2392f0 f985d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f986e;

        /* renamed from: f, reason: collision with root package name */
        int f987f;

        /* renamed from: h, reason: collision with root package name */
        Object f989h;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f986e = obj;
            this.f987f |= LinearLayoutManager.INVALID_OFFSET;
            return C2392f0.this.emit(null, this);
        }
    }

    public C2392f0(Function2 function2, kotlin.jvm.internal.M m11) {
        this.f983a = function2;
        this.f984b = m11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        Object obj2;
        int i11;
        C2392f0 c2392f0;
        T t2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f987f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f987f = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj2 = aVar.f986e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f987f;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    aVar.f985d = this;
                    aVar.f989h = obj;
                    aVar.f987f = 1;
                    obj2 = this.f983a.invoke(obj, aVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                    c2392f0 = this;
                    t2 = obj;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = aVar.f989h;
                    c2392f0 = aVar.f985d;
                    Sc.s.b(obj2);
                    t2 = obj3;
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Unit.f71690a;
                }
                c2392f0.f984b.f71787a = t2;
                throw new C2629a(c2392f0);
            }
        }
        aVar = new a(dVar);
        obj2 = aVar.f986e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f987f;
        if (i11 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
