package Ae;

import Be.C2629a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ae.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2384b0 implements InterfaceC2397i<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f953a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M f954b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {131}, m = "emit")
    /* renamed from: Ae.b0$a */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        C2384b0 f955d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f956e;

        /* renamed from: f, reason: collision with root package name */
        int f957f;

        /* renamed from: h, reason: collision with root package name */
        Object f959h;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f956e = obj;
            this.f957f |= LinearLayoutManager.INVALID_OFFSET;
            return C2384b0.this.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2384b0(Function2 function2, kotlin.jvm.internal.M m11) {
        this.f953a = (kotlin.coroutines.jvm.internal.j) function2;
        this.f954b = m11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        Object obj2;
        int i11;
        C2384b0 c2384b0;
        T t2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f957f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f957f = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj2 = aVar.f956e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f957f;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    aVar.f955d = this;
                    aVar.f959h = obj;
                    aVar.f957f = 1;
                    obj2 = this.f953a.invoke(obj, aVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                    c2384b0 = this;
                    t2 = obj;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = aVar.f959h;
                    c2384b0 = aVar.f955d;
                    Sc.s.b(obj2);
                    t2 = obj3;
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Unit.f71690a;
                }
                c2384b0.f954b.f71787a = t2;
                throw new C2629a(c2384b0);
            }
        }
        aVar = new a(dVar);
        obj2 = aVar.f956e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f957f;
        if (i11 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
