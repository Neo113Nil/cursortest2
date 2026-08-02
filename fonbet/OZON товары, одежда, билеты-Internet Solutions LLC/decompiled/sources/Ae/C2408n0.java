package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ae.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2408n0 implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f1051a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f1052b;

    /* renamed from: Ae.n0$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f1053a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f1054b;

        @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, 51}, m = "emit")
        /* renamed from: Ae.n0$a$a, reason: collision with other inner class name */
        public static final class C0034a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f1055d;

            /* renamed from: e, reason: collision with root package name */
            int f1056e;

            /* renamed from: g, reason: collision with root package name */
            Object f1058g;

            /* renamed from: h, reason: collision with root package name */
            InterfaceC2397i f1059h;

            public C0034a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f1055d = obj;
                this.f1056e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, Function2 function2) {
            this.f1053a = interfaceC2397i;
            this.f1054b = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            if (r6.emit(r2, r0) != r1) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            C0034a c0034a;
            int i11;
            Object obj;
            InterfaceC2397i interfaceC2397i;
            if (dVar instanceof C0034a) {
                c0034a = (C0034a) dVar;
                int i12 = c0034a.f1056e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0034a.f1056e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0034a.f1055d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0034a.f1056e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        c0034a.f1058g = t2;
                        InterfaceC2397i interfaceC2397i2 = this.f1053a;
                        c0034a.f1059h = interfaceC2397i2;
                        c0034a.f1056e = 1;
                        if (this.f1054b.invoke(t2, c0034a) != aVar) {
                            obj = t2;
                            interfaceC2397i = interfaceC2397i2;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj2);
                        return Unit.f71690a;
                    }
                    InterfaceC2397i interfaceC2397i3 = c0034a.f1059h;
                    obj = c0034a.f1058g;
                    Sc.s.b(obj2);
                    interfaceC2397i = interfaceC2397i3;
                    c0034a.f1058g = null;
                    c0034a.f1059h = null;
                    c0034a.f1056e = 2;
                }
            }
            c0034a = new C0034a(dVar);
            Object obj22 = c0034a.f1055d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0034a.f1056e;
            if (i11 != 0) {
            }
            c0034a.f1058g = null;
            c0034a.f1059h = null;
            c0034a.f1056e = 2;
        }
    }

    public C2408n0(InterfaceC2395h interfaceC2395h, Function2 function2) {
        this.f1051a = interfaceC2395h;
        this.f1052b = function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f1051a.collect(new a(interfaceC2397i, this.f1052b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
