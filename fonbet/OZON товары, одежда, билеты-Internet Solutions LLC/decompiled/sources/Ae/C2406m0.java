package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* renamed from: Ae.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2406m0 implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f1040a;

    /* renamed from: Ae.m0$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f1041a;

        @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50}, m = "emit")
        /* renamed from: Ae.m0$a$a, reason: collision with other inner class name */
        public static final class C0033a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f1042d;

            /* renamed from: e, reason: collision with root package name */
            int f1043e;

            public C0033a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f1042d = obj;
                this.f1043e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f1041a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            C0033a c0033a;
            int i11;
            if (dVar instanceof C0033a) {
                c0033a = (C0033a) dVar;
                int i12 = c0033a.f1043e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0033a.f1043e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c0033a.f1042d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0033a.f1043e;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        if (t2 != null) {
                            c0033a.f1043e = 1;
                            if (this.f1041a.emit(t2, c0033a) == aVar) {
                                return aVar;
                            }
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
            c0033a = new C0033a(dVar);
            Object obj2 = c0033a.f1042d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0033a.f1043e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public C2406m0(InterfaceC2395h interfaceC2395h) {
        this.f1040a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f1040a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
