package Ae;

import Be.C2629a;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {149}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class S extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f900d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f901e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f902f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<InterfaceC2397i<Object>, Object, kotlin.coroutines.d<? super Boolean>, Object> f903g;

    public static final class a implements InterfaceC2397i<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6511n f904a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f905b;

        @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {131}, m = "emit")
        /* renamed from: Ae.S$a$a, reason: collision with other inner class name */
        public static final class C0027a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            a f906d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f907e;

            /* renamed from: f, reason: collision with root package name */
            int f908f;

            public C0027a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f907e = obj;
                this.f908f |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC6511n interfaceC6511n, InterfaceC2397i interfaceC2397i) {
            this.f904a = interfaceC6511n;
            this.f905b = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            C0027a c0027a;
            Object obj2;
            int i11;
            a aVar;
            if (dVar instanceof C0027a) {
                c0027a = (C0027a) dVar;
                int i12 = c0027a.f908f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0027a.f908f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    obj2 = c0027a.f907e;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0027a.f908f;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        c0027a.f906d = this;
                        c0027a.f908f = 1;
                        obj2 = this.f904a.invoke(this.f905b, obj, c0027a);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                        aVar = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = c0027a.f906d;
                        Sc.s.b(obj2);
                    }
                    if (((Boolean) obj2).booleanValue()) {
                        throw new C2629a(aVar);
                    }
                    return Unit.f71690a;
                }
            }
            c0027a = new C0027a(dVar);
            obj2 = c0027a.f907e;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0027a.f908f;
            if (i11 != 0) {
            }
            if (((Boolean) obj2).booleanValue()) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    S(InterfaceC2395h<Object> interfaceC2395h, InterfaceC6511n<? super InterfaceC2397i<Object>, Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> interfaceC6511n, kotlin.coroutines.d<? super S> dVar) {
        super(2, dVar);
        this.f902f = interfaceC2395h;
        this.f903g = interfaceC6511n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        S s11 = new S(this.f902f, this.f903g, dVar);
        s11.f901e = obj;
        return s11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((S) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f900d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.f901e;
            InterfaceC2395h<Object> interfaceC2395h = this.f902f;
            a aVar3 = new a(this.f903g, interfaceC2397i);
            try {
                this.f901e = aVar3;
                this.f900d = 1;
                if (interfaceC2395h.collect(aVar3, this) == aVar2) {
                    return aVar2;
                }
            } catch (C2629a e11) {
                e = e11;
                aVar = aVar3;
                if (e.f3566a != aVar) {
                    throw e;
                }
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) this.f901e;
            try {
                Sc.s.b(obj);
            } catch (C2629a e12) {
                e = e12;
                if (e.f3566a != aVar) {
                }
                return Unit.f71690a;
            }
        }
        return Unit.f71690a;
    }
}
