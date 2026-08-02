package Ae;

import Be.C2629a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class Q implements InterfaceC2397i<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f886a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i f887b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {131, 132}, m = "emit")
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        Q f888d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f889e;

        /* renamed from: f, reason: collision with root package name */
        int f890f;

        /* renamed from: h, reason: collision with root package name */
        Object f892h;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f889e = obj;
            this.f890f |= LinearLayoutManager.INVALID_OFFSET;
            return Q.this.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q(InterfaceC2397i interfaceC2397i, Function2 function2) {
        this.f886a = (kotlin.coroutines.jvm.internal.j) function2;
        this.f887b = interfaceC2397i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        boolean z11;
        Object obj2;
        Object obj3;
        Q q11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f890f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f890f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj4 = aVar.f889e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f890f;
                z11 = true;
                if (i11 != 0) {
                    Sc.s.b(obj4);
                    aVar.f888d = this;
                    aVar.f892h = obj;
                    aVar.f890f = 1;
                    Object invoke = this.f886a.invoke(obj, aVar);
                    if (invoke != aVar2) {
                        obj2 = invoke;
                        obj3 = obj;
                        q11 = this;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q11 = aVar.f888d;
                    Sc.s.b(obj4);
                    if (z11) {
                        return Unit.f71690a;
                    }
                    throw new C2629a(q11);
                }
                Object obj5 = aVar.f892h;
                Q q12 = aVar.f888d;
                Sc.s.b(obj4);
                obj3 = obj5;
                q11 = q12;
                obj2 = obj4;
                if (((Boolean) obj2).booleanValue()) {
                    z11 = false;
                } else {
                    InterfaceC2397i interfaceC2397i = q11.f887b;
                    aVar.f888d = q11;
                    aVar.f892h = null;
                    aVar.f890f = 2;
                }
                if (z11) {
                }
            }
        }
        aVar = new a(dVar);
        Object obj42 = aVar.f889e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f890f;
        z11 = true;
        if (i11 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        if (z11) {
        }
    }
}
