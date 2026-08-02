package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class U implements InterfaceC2395h<InterfaceC2395h<Object>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f916a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f917b;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f918a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f919b;

        @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", l = {50, 50}, m = "emit")
        /* renamed from: Ae.U$a$a, reason: collision with other inner class name */
        public static final class C0028a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f920d;

            /* renamed from: e, reason: collision with root package name */
            int f921e;

            /* renamed from: f, reason: collision with root package name */
            InterfaceC2397i f922f;

            public C0028a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f920d = obj;
                this.f921e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC2397i interfaceC2397i, Function2 function2) {
            this.f918a = interfaceC2397i;
            this.f919b = (kotlin.coroutines.jvm.internal.j) function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (r7.emit(r8, r0) != r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            C0028a c0028a;
            int i11;
            InterfaceC2397i interfaceC2397i;
            if (dVar instanceof C0028a) {
                c0028a = (C0028a) dVar;
                int i12 = c0028a.f921e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0028a.f921e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0028a.f920d;
                    Object obj3 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0028a.f921e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        InterfaceC2397i interfaceC2397i2 = this.f918a;
                        c0028a.f922f = interfaceC2397i2;
                        c0028a.f921e = 1;
                        Object invoke = this.f919b.invoke(obj, c0028a);
                        if (invoke != obj3) {
                            obj2 = invoke;
                            interfaceC2397i = interfaceC2397i2;
                        }
                        return obj3;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj2);
                        return Unit.f71690a;
                    }
                    InterfaceC2397i interfaceC2397i3 = c0028a.f922f;
                    Sc.s.b(obj2);
                    interfaceC2397i = interfaceC2397i3;
                    c0028a.f922f = null;
                    c0028a.f921e = 2;
                }
            }
            c0028a = new C0028a(dVar);
            Object obj22 = c0028a.f920d;
            Object obj32 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0028a.f921e;
            if (i11 != 0) {
            }
            c0028a.f922f = null;
            c0028a.f921e = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public U(InterfaceC2395h interfaceC2395h, Function2 function2) {
        this.f916a = interfaceC2395h;
        this.f917b = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super InterfaceC2395h<Object>> interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f916a.collect(new a(interfaceC2397i, this.f917b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
