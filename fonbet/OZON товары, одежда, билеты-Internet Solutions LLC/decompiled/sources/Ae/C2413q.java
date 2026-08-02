package Ae;

import De.C2857A;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ze.l;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {ModuleDescriptor.MODULE_VERSION, 415}, m = "invokeSuspend")
/* renamed from: Ae.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2413q extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<xe.M, InterfaceC2397i<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.M f1080d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.L f1081e;

    /* renamed from: f, reason: collision with root package name */
    int f1082f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f1083g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f1084h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Long> f1085i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f1086j;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
    /* renamed from: Ae.q$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1087d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<Object> f1088e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<Object> f1089f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar, kotlin.jvm.internal.M m11) {
            super(1, dVar);
            this.f1088e = interfaceC2397i;
            this.f1089f = m11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(this.f1088e, dVar, this.f1089f);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1087d;
            kotlin.jvm.internal.M<Object> m11 = this.f1089f;
            if (i11 == 0) {
                Sc.s.b(obj);
                C2857A c2857a = Be.z.f3696a;
                Object obj2 = m11.f71787a;
                if (obj2 == c2857a) {
                    obj2 = null;
                }
                this.f1087d = 1;
                if (this.f1088e.emit(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            m11.f71787a = null;
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
    /* renamed from: Ae.q$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<ze.l<? extends Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        kotlin.jvm.internal.M f1090d;

        /* renamed from: e, reason: collision with root package name */
        int f1091e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f1092f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<Object> f1093g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<Object> f1094h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar, kotlin.jvm.internal.M m11) {
            super(2, dVar);
            this.f1093g = m11;
            this.f1094h = interfaceC2397i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f1094h, dVar, this.f1093g);
            bVar.f1092f = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ze.l<? extends Object> lVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(ze.l.b(lVar.e()), dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v7, types: [De.A, T] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.M<Object> m11;
            kotlin.jvm.internal.M<Object> m12;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1091e;
            if (i11 == 0) {
                Sc.s.b(obj);
                ?? e11 = ((ze.l) this.f1092f).e();
                boolean z11 = e11 instanceof l.b;
                m11 = this.f1093g;
                if (!z11) {
                    m11.f71787a = e11;
                }
                if (z11) {
                    Throwable c11 = ze.l.c(e11);
                    if (c11 != null) {
                        throw c11;
                    }
                    Object obj2 = m11.f71787a;
                    if (obj2 != null) {
                        if (obj2 == Be.z.f3696a) {
                            obj2 = null;
                        }
                        this.f1092f = e11;
                        this.f1090d = m11;
                        this.f1091e = 1;
                        if (this.f1094h.emit(obj2, this) == aVar) {
                            return aVar;
                        }
                        m12 = m11;
                    }
                    m11.f71787a = Be.z.f3698c;
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m12 = this.f1090d;
            Sc.s.b(obj);
            m11 = m12;
            m11.f71787a = Be.z.f3698c;
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {204}, m = "invokeSuspend")
    /* renamed from: Ae.q$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1095d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f1096e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h<Object> f1097f;

        /* renamed from: Ae.q$c$a */
        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ze.u<Object> f1098a;

            @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {204}, m = "emit")
            /* renamed from: Ae.q$c$a$a, reason: collision with other inner class name */
            static final class C0035a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f1099d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ a<T> f1100e;

                /* renamed from: f, reason: collision with root package name */
                int f1101f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0035a(a<? super T> aVar, kotlin.coroutines.d<? super C0035a> dVar) {
                    super(dVar);
                    this.f1100e = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f1099d = obj;
                    this.f1101f |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f1100e.emit(null, this);
                }
            }

            a(ze.u<Object> uVar) {
                this.f1098a = uVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                C0035a c0035a;
                int i11;
                if (dVar instanceof C0035a) {
                    c0035a = (C0035a) dVar;
                    int i12 = c0035a.f1101f;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0035a.f1101f = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c0035a.f1099d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0035a.f1101f;
                        if (i11 != 0) {
                            Sc.s.b(obj);
                            if (t2 == null) {
                                t2 = (T) Be.z.f3696a;
                            }
                            c0035a.f1101f = 1;
                            if (this.f1098a.n(t2, c0035a) == aVar) {
                                return aVar;
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
                c0035a = new C0035a(this, dVar);
                Object obj2 = c0035a.f1099d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0035a.f1101f;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC2395h<Object> interfaceC2395h, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f1097f = interfaceC2395h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f1097f, dVar);
            cVar.f1096e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ze.u<? super Object> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1095d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a((ze.u) this.f1096e);
                this.f1095d = 1;
                if (this.f1097f.collect(aVar2, this) == aVar) {
                    return aVar;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2413q(Function1<Object, Long> function1, InterfaceC2395h<Object> interfaceC2395h, kotlin.coroutines.d<? super C2413q> dVar) {
        super(3, dVar);
        this.f1085i = function1;
        this.f1086j = interfaceC2395h;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(xe.M m11, InterfaceC2397i<Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        C2413q c2413q = new C2413q(this.f1085i, this.f1086j, dVar);
        c2413q.f1083g = m11;
        c2413q.f1084h = interfaceC2397i;
        return c2413q.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r7.emit(r14, r13) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (r7.i(r13) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d5 -> B:6:0x001a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.M m11;
        ze.w wVar;
        InterfaceC2397i interfaceC2397i;
        kotlin.jvm.internal.L l11;
        kotlin.jvm.internal.M m12;
        ze.w wVar2;
        InterfaceC2397i interfaceC2397i2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1082f;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m13 = (xe.M) this.f1083g;
            InterfaceC2397i interfaceC2397i3 = (InterfaceC2397i) this.f1084h;
            ze.w d11 = ze.s.d(m13, 0, new c(this.f1086j, null), 3);
            m11 = new kotlin.jvm.internal.M();
            wVar = d11;
            interfaceC2397i = interfaceC2397i3;
            if (m11.f71787a != Be.z.f3698c) {
            }
        } else if (i11 == 1) {
            l11 = this.f1081e;
            m11 = this.f1080d;
            wVar = (ze.w) this.f1084h;
            interfaceC2397i = (InterfaceC2397i) this.f1083g;
            Sc.s.b(obj);
            m11.f71787a = null;
            kotlin.jvm.internal.L l12 = l11;
            m12 = m11;
            wVar2 = wVar;
            interfaceC2397i2 = interfaceC2397i;
            Ie.h hVar = new Ie.h(getContext());
            if (m12.f71787a != 0) {
            }
            hVar.m(wVar2.c(), new b(interfaceC2397i2, null, m12));
            this.f1083g = interfaceC2397i2;
            this.f1084h = wVar2;
            this.f1080d = m12;
            this.f1081e = null;
            this.f1082f = 2;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m12 = this.f1080d;
            wVar2 = (ze.w) this.f1084h;
            interfaceC2397i2 = (InterfaceC2397i) this.f1083g;
            Sc.s.b(obj);
            interfaceC2397i = interfaceC2397i2;
            wVar = wVar2;
            m11 = m12;
            if (m11.f71787a != Be.z.f3698c) {
                return Unit.f71690a;
            }
            l11 = new kotlin.jvm.internal.L();
            Object obj2 = m11.f71787a;
            if (obj2 != null) {
                C2857A c2857a = Be.z.f3696a;
                if (obj2 == c2857a) {
                    obj2 = null;
                }
                long longValue = this.f1085i.invoke(obj2).longValue();
                l11.f71786a = longValue;
                if (longValue < 0) {
                    throw new IllegalArgumentException("Debounce timeout should not be negative");
                }
                if (longValue == 0) {
                    Object obj3 = m11.f71787a;
                    if (obj3 == c2857a) {
                        obj3 = null;
                    }
                    this.f1083g = interfaceC2397i;
                    this.f1084h = wVar;
                    this.f1080d = m11;
                    this.f1081e = l11;
                    this.f1082f = 1;
                }
            }
            kotlin.jvm.internal.L l122 = l11;
            m12 = m11;
            wVar2 = wVar;
            interfaceC2397i2 = interfaceC2397i;
            Ie.h hVar2 = new Ie.h(getContext());
            if (m12.f71787a != 0) {
                Ie.d.a(hVar2, l122.f71786a, new a(interfaceC2397i2, null, m12));
            }
            hVar2.m(wVar2.c(), new b(interfaceC2397i2, null, m12));
            this.f1083g = interfaceC2397i2;
            this.f1084h = wVar2;
            this.f1080d = m12;
            this.f1081e = null;
            this.f1082f = 2;
        }
    }
}
