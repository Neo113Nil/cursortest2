package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Unit;

/* renamed from: Ae.p0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C2412p0<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Object> f1072a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<Object, T, kotlin.coroutines.d<Object>, Object> f1073b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i<Object> f1074c;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", l = {105, 106}, m = "emit")
    /* renamed from: Ae.p0$a */
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        Object f1075d;

        /* renamed from: e, reason: collision with root package name */
        kotlin.jvm.internal.M f1076e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f1077f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C2412p0<T> f1078g;

        /* renamed from: h, reason: collision with root package name */
        int f1079h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C2412p0<? super T> c2412p0, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f1078g = c2412p0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1077f = obj;
            this.f1079h |= LinearLayoutManager.INVALID_OFFSET;
            return this.f1078g.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    C2412p0(kotlin.jvm.internal.M<Object> m11, InterfaceC6511n<Object, ? super T, ? super kotlin.coroutines.d<Object>, ? extends Object> interfaceC6511n, InterfaceC2397i<Object> interfaceC2397i) {
        this.f1072a = m11;
        this.f1073b = interfaceC6511n;
        this.f1074c = interfaceC2397i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r6.emit(r7, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        kotlin.jvm.internal.M<Object> m11;
        C2412p0<T> c2412p0;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f1079h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f1079h = i12 - LinearLayoutManager.INVALID_OFFSET;
                T t11 = (T) aVar.f1077f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f1079h;
                if (i11 != 0) {
                    Sc.s.b(t11);
                    kotlin.jvm.internal.M<Object> m12 = this.f1072a;
                    Object obj = m12.f71787a;
                    aVar.f1075d = this;
                    aVar.f1076e = m12;
                    aVar.f1079h = 1;
                    Object invoke = this.f1073b.invoke(obj, t2, aVar);
                    if (invoke != aVar2) {
                        t11 = (T) invoke;
                        m11 = m12;
                        c2412p0 = this;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(t11);
                    return Unit.f71690a;
                }
                m11 = aVar.f1076e;
                c2412p0 = (C2412p0) aVar.f1075d;
                Sc.s.b(t11);
                m11.f71787a = t11;
                InterfaceC2397i<Object> interfaceC2397i = c2412p0.f1074c;
                Object obj2 = c2412p0.f1072a.f71787a;
                aVar.f1075d = null;
                aVar.f1076e = null;
                aVar.f1079h = 2;
            }
        }
        aVar = new a(this, dVar);
        T t112 = (T) aVar.f1077f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f1079h;
        if (i11 != 0) {
        }
        m11.f71787a = t112;
        InterfaceC2397i<Object> interfaceC2397i2 = c2412p0.f1074c;
        Object obj22 = c2412p0.f1072a.f71787a;
        aVar.f1075d = null;
        aVar.f1076e = null;
        aVar.f1079h = 2;
    }
}
