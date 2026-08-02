package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* renamed from: Ae.l0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2404l0 implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f1032a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.reflect.d f1033b;

    /* renamed from: Ae.l0$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f1034a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.d f1035b;

        @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", l = {50}, m = "emit")
        /* renamed from: Ae.l0$a$a, reason: collision with other inner class name */
        public static final class C0032a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f1036d;

            /* renamed from: e, reason: collision with root package name */
            int f1037e;

            public C0032a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f1036d = obj;
                this.f1037e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, kotlin.reflect.d dVar) {
            this.f1034a = interfaceC2397i;
            this.f1035b = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            C0032a c0032a;
            int i11;
            if (dVar instanceof C0032a) {
                c0032a = (C0032a) dVar;
                int i12 = c0032a.f1037e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0032a.f1037e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0032a.f1036d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0032a.f1037e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        if (this.f1035b.A(obj)) {
                            c0032a.f1037e = 1;
                            if (this.f1034a.emit(obj, c0032a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c0032a = new C0032a(dVar);
            Object obj22 = c0032a.f1036d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0032a.f1037e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public C2404l0(InterfaceC2395h interfaceC2395h, kotlin.reflect.d dVar) {
        this.f1032a = interfaceC2395h;
        this.f1033b = dVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f1032a.collect(new a(interfaceC2397i, this.f1033b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
