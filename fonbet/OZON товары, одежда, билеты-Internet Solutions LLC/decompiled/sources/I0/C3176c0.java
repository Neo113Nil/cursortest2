package I0;

import B0.InterfaceC2477h1;
import I0.F;
import androidx.compose.foundation.gestures.C5177u;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.c2;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import k1.C7459e;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.C9140t;
import x1.C10638m;
import x1.C10639n;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

/* renamed from: I0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3176c0 {

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", f = "SelectionGestures.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: I0.c0$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f11453d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f11454e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ r f11455f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2477h1 f11456g;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {105, 111, 113}, m = "invokeSuspend")
        /* renamed from: I0.c0$a$a, reason: collision with other inner class name */
        static final class C0228a extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f11457d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f11458e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f11459f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C3193l f11460g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC2477h1 f11461h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0228a(InterfaceC2477h1 interfaceC2477h1, C3193l c3193l, r rVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f11459f = rVar;
                this.f11460g = c3193l;
                this.f11461h = interfaceC2477h1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C0228a c0228a = new C0228a(this.f11461h, this.f11460g, this.f11459f, dVar);
                c0228a.f11458e = obj;
                return c0228a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0228a) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
            
                if (I0.C3176c0.c(r1, r9.f11459f, r9.f11460g, r10, r9) == r0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
            
                if (I0.C3176c0.e(r1, r9.f11461h, r10, r9) == r0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
            
                if (r10 == r0) goto L32;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                InterfaceC10628c interfaceC10628c;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f11457d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    interfaceC10628c = (InterfaceC10628c) this.f11458e;
                    this.f11458e = interfaceC10628c;
                    this.f11457d = 1;
                    obj = C3176c0.a(interfaceC10628c, this);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    interfaceC10628c = (InterfaceC10628c) this.f11458e;
                    Sc.s.b(obj);
                }
                C10638m c10638m = (C10638m) obj;
                if (C3176c0.i(c10638m) && (c10638m.a() & 33) != 0) {
                    List<x1.x> b11 = c10638m.b();
                    int size = b11.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        if (!b11.get(i12).n()) {
                        }
                    }
                    this.f11458e = null;
                    this.f11457d = 2;
                }
                if (!C3176c0.i(c10638m)) {
                    this.f11458e = null;
                    this.f11457d = 3;
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r rVar, InterfaceC2477h1 interfaceC2477h1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f11455f = rVar;
            this.f11456g = interfaceC2477h1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f11455f, this.f11456g, dVar);
            aVar.f11454e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f11453d;
            if (i11 == 0) {
                Sc.s.b(obj);
                x1.F f7 = (x1.F) this.f11454e;
                C0228a c0228a = new C0228a(this.f11456g, new C3193l(f7.b()), this.f11455f, null);
                this.f11453d = 1;
                if (C9140t.b(f7, c0228a, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", f = "SelectionGestures.kt", l = {209, 217, 220, 221}, m = "invokeSuspend")
    /* renamed from: I0.c0$b */
    /* loaded from: classes8.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f11462d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f11463e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3193l f11464f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f11465g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC2477h1 f11466h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2477h1 interfaceC2477h1, C3193l c3193l, r rVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f11464f = c3193l;
            this.f11465g = rVar;
            this.f11466h = interfaceC2477h1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f11466h, this.f11464f, this.f11465g, dVar);
            bVar.f11463e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
        
            if (I0.C3176c0.d(r1, r13.f11465g, r6, r14, r13) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
        
            if (I0.C3176c0.f(r1, r6, r14, r13) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
        
            if (I0.C3176c0.g(r1, r6, r14, r13) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0038, code lost:
        
            if (r14 == r0) goto L37;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC10628c interfaceC10628c;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f11462d;
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC10628c = (InterfaceC10628c) this.f11463e;
                this.f11463e = interfaceC10628c;
                this.f11462d = 1;
                obj = C3176c0.a(interfaceC10628c, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3 && i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                interfaceC10628c = (InterfaceC10628c) this.f11463e;
                Sc.s.b(obj);
            }
            C10638m c10638m = (C10638m) obj;
            C3193l c3193l = this.f11464f;
            c3193l.b(c10638m);
            boolean i12 = C3176c0.i(c10638m);
            if (i12 && (c10638m.a() & 33) != 0) {
                List<x1.x> b11 = c10638m.b();
                int size = b11.size();
                for (int i13 = 0; i13 < size; i13++) {
                    if (!b11.get(i13).n()) {
                    }
                }
                this.f11463e = null;
                this.f11462d = 2;
            }
            if (!i12) {
                int a11 = c3193l.a();
                InterfaceC2477h1 interfaceC2477h1 = this.f11466h;
                if (a11 == 1) {
                    this.f11463e = null;
                    this.f11462d = 3;
                } else {
                    this.f11463e = null;
                    this.f11462d = 4;
                }
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1", f = "SelectionGestures.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: I0.c0$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f11467d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f11468e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f11469f;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {93}, m = "invokeSuspend")
        /* renamed from: I0.c0$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f11470d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f11471e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f11472f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super Boolean, Unit> function1, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f11472f = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f11472f, dVar);
                aVar.f11471e = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                /*
                    r4 = this;
                    Wc.a r0 = Wc.a.COROUTINE_SUSPENDED
                    int r1 = r4.f11470d
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r1 = r4.f11471e
                    x1.c r1 = (x1.InterfaceC10628c) r1
                    Sc.s.b(r5)
                    goto L2e
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    Sc.s.b(r5)
                    java.lang.Object r5 = r4.f11471e
                    x1.c r5 = (x1.InterfaceC10628c) r5
                    r1 = r5
                L21:
                    x1.o r5 = x1.EnumC10640o.Initial
                    r4.f11471e = r1
                    r4.f11470d = r2
                    java.lang.Object r5 = r1.i0(r5, r4)
                    if (r5 != r0) goto L2e
                    return r0
                L2e:
                    x1.m r5 = (x1.C10638m) r5
                    boolean r5 = I0.C3176c0.i(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r4.f11472f
                    r3.invoke(r5)
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: I0.C3176c0.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super Boolean, Unit> function1, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f11469f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f11469f, dVar);
            cVar.f11468e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f11467d;
            if (i11 == 0) {
                Sc.s.b(obj);
                x1.F f7 = (x1.F) this.f11468e;
                a aVar2 = new a(this.f11469f, null);
                this.f11467d = 1;
                if (f7.N0(aVar2, this) == aVar) {
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InterfaceC10628c interfaceC10628c, kotlin.coroutines.jvm.internal.a aVar) {
        X x11;
        int i11;
        int size;
        int i12;
        if (aVar instanceof X) {
            x11 = (X) aVar;
            int i13 = x11.f11417f;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                x11.f11417f = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = x11.f11416e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = x11.f11417f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    EnumC10640o enumC10640o = EnumC10640o.Main;
                    x11.f11415d = interfaceC10628c;
                    x11.f11417f = 1;
                    obj = interfaceC10628c.i0(enumC10640o, x11);
                    if (obj == aVar2) {
                    }
                    C10638m c10638m = (C10638m) obj;
                    List<x1.x> b11 = c10638m.b();
                    size = b11.size();
                    i12 = 0;
                    while (i12 < size) {
                    }
                    return c10638m;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC10628c = x11.f11415d;
                Sc.s.b(obj);
                C10638m c10638m2 = (C10638m) obj;
                List<x1.x> b112 = c10638m2.b();
                size = b112.size();
                i12 = 0;
                while (i12 < size) {
                    if (C10639n.a(b112.get(i12))) {
                        i12++;
                    } else {
                        EnumC10640o enumC10640o2 = EnumC10640o.Main;
                        x11.f11415d = interfaceC10628c;
                        x11.f11417f = 1;
                        obj = interfaceC10628c.i0(enumC10640o2, x11);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        C10638m c10638m22 = (C10638m) obj;
                        List<x1.x> b1122 = c10638m22.b();
                        size = b1122.size();
                        i12 = 0;
                        while (i12 < size) {
                        }
                    }
                }
                return c10638m22;
            }
        }
        x11 = new X(aVar);
        Object obj2 = x11.f11416e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = x11.f11417f;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(InterfaceC10628c interfaceC10628c, r rVar, C3193l c3193l, C10638m c10638m, kotlin.coroutines.jvm.internal.a aVar) {
        Y y11;
        int i11;
        if (aVar instanceof Y) {
            y11 = (Y) aVar;
            int i12 = y11.f11431g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                y11.f11431g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = y11.f11430f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = y11.f11431g;
                int i13 = 0;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c3193l.b(c10638m);
                    x1.x xVar = c10638m.b().get(0);
                    int a11 = c3193l.a();
                    F e11 = a11 != 1 ? a11 != 2 ? F.a.e() : F.a.f() : F.a.d();
                    if (rVar.a(xVar.f(), e11)) {
                        long d11 = xVar.d();
                        Z z11 = new Z(rVar, e11);
                        y11.f11428d = interfaceC10628c;
                        y11.f11429e = rVar;
                        y11.f11431g = 2;
                        obj = C5177u.i(interfaceC10628c, d11, z11, y11);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                        rVar.b();
                    }
                    return Unit.f71690a;
                }
                if (i11 == 1) {
                    r rVar2 = y11.f11429e;
                    InterfaceC10628c interfaceC10628c2 = y11.f11428d;
                    Sc.s.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        List<x1.x> b11 = interfaceC10628c2.b1().b();
                        int size = b11.size();
                        while (i13 < size) {
                            x1.x xVar2 = b11.get(i13);
                            if (C10639n.b(xVar2)) {
                                xVar2.a();
                            }
                            i13++;
                        }
                    }
                    rVar2.b();
                    return Unit.f71690a;
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = y11.f11429e;
                interfaceC10628c = y11.f11428d;
                Sc.s.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    List<x1.x> b12 = interfaceC10628c.b1().b();
                    int size2 = b12.size();
                    while (i13 < size2) {
                        x1.x xVar3 = b12.get(i13);
                        if (C10639n.b(xVar3)) {
                            xVar3.a();
                        }
                        i13++;
                    }
                }
                rVar.b();
                return Unit.f71690a;
            }
        }
        y11 = new Y(aVar);
        Object obj2 = y11.f11430f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = y11.f11431g;
        int i132 = 0;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(7:11|12|13|(3:15|(3:17|(2:19|20)(1:22)|21)|24)|25|26|27)(2:29|30))(7:31|32|33|(3:35|(3:37|(2:39|40)(1:42)|41)|44)|45|26|27))(6:49|(1:(1:52)(1:58))(1:59)|53|(5:55|(1:57)|13|(0)|25)|26|27)|60|61|62))|63|6|7|(0)(0)|60|61|62|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:13:0x00bc, B:15:0x00c4, B:17:0x00d2, B:19:0x00de, B:55:0x00a3), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(InterfaceC10628c interfaceC10628c, r rVar, C3193l c3193l, C10638m c10638m, kotlin.coroutines.jvm.internal.a aVar) {
        C3172a0 c3172a0;
        int i11;
        if (aVar instanceof C3172a0) {
            c3172a0 = (C3172a0) aVar;
            int i12 = c3172a0.f11445g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c3172a0.f11445g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c3172a0.f11444f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c3172a0.f11445g;
                int i13 = 0;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    x1.x xVar = c10638m.b().get(0);
                    int a11 = c3193l.a();
                    F e11 = a11 != 1 ? a11 != 2 ? F.a.e() : F.a.f() : F.a.d();
                    if (rVar.a(xVar.f(), e11)) {
                        xVar.a();
                        long d11 = xVar.d();
                        C3174b0 c3174b0 = new C3174b0(rVar, e11);
                        c3172a0.f11442d = interfaceC10628c;
                        c3172a0.f11443e = rVar;
                        c3172a0.f11445g = 2;
                        obj = C5177u.i(interfaceC10628c, d11, c3174b0, c3172a0);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = c3172a0.f11443e;
                    interfaceC10628c = c3172a0.f11442d;
                    Sc.s.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        List<x1.x> b11 = interfaceC10628c.b1().b();
                        int size = b11.size();
                        while (i13 < size) {
                            x1.x xVar2 = b11.get(i13);
                            if (C10639n.b(xVar2)) {
                                xVar2.a();
                            }
                            i13++;
                        }
                    }
                    return Unit.f71690a;
                }
                r rVar2 = c3172a0.f11443e;
                InterfaceC10628c interfaceC10628c2 = c3172a0.f11442d;
                try {
                    Sc.s.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        List<x1.x> b12 = interfaceC10628c2.b1().b();
                        int size2 = b12.size();
                        while (i13 < size2) {
                            x1.x xVar3 = b12.get(i13);
                            if (C10639n.b(xVar3)) {
                                xVar3.a();
                            }
                            i13++;
                        }
                    }
                    return Unit.f71690a;
                } finally {
                    rVar2.b();
                }
                rVar.b();
            }
        }
        c3172a0 = new C3172a0(aVar);
        Object obj2 = c3172a0.f11444f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3172a0.f11445g;
        int i132 = 0;
        if (i11 != 0) {
        }
        rVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r11 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(InterfaceC10628c interfaceC10628c, InterfaceC2477h1 interfaceC2477h1, C10638m c10638m, kotlin.coroutines.jvm.internal.a aVar) {
        C3178d0 c3178d0;
        Object obj;
        int i11;
        x1.x xVar;
        x1.x xVar2;
        try {
            if (aVar instanceof C3178d0) {
                c3178d0 = (C3178d0) aVar;
                int i12 = c3178d0.f11480h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c3178d0.f11480h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    obj = c3178d0.f11479g;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c3178d0.f11480h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        xVar = (x1.x) C7714v.K(c10638m.b());
                        long d11 = xVar.d();
                        c3178d0.f11476d = interfaceC10628c;
                        c3178d0.f11477e = interfaceC2477h1;
                        c3178d0.f11478f = xVar;
                        c3178d0.f11480h = 1;
                        obj = C5177u.d(interfaceC10628c, d11, c3178d0);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC2477h1 = c3178d0.f11477e;
                            interfaceC10628c = c3178d0.f11476d;
                            Sc.s.b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List<x1.x> b11 = interfaceC10628c.b1().b();
                                int size = b11.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    x1.x xVar3 = b11.get(i13);
                                    if (C10639n.b(xVar3)) {
                                        xVar3.a();
                                    }
                                }
                                interfaceC2477h1.onStop();
                            } else {
                                interfaceC2477h1.onCancel();
                            }
                            return Unit.f71690a;
                        }
                        x1.x xVar4 = c3178d0.f11478f;
                        interfaceC2477h1 = c3178d0.f11477e;
                        InterfaceC10628c interfaceC10628c2 = c3178d0.f11476d;
                        Sc.s.b(obj);
                        xVar = xVar4;
                        interfaceC10628c = interfaceC10628c2;
                    }
                    xVar2 = (x1.x) obj;
                    if (xVar2 != null && h(interfaceC10628c.b(), xVar, xVar2)) {
                        interfaceC2477h1.c(xVar2.f());
                        long d12 = xVar2.d();
                        C3180e0 c3180e0 = new C3180e0(interfaceC2477h1);
                        c3178d0.f11476d = interfaceC10628c;
                        c3178d0.f11477e = interfaceC2477h1;
                        c3178d0.f11478f = null;
                        c3178d0.f11480h = 2;
                        obj = C5177u.i(interfaceC10628c, d12, c3180e0, c3178d0);
                    }
                    return Unit.f71690a;
                }
            }
            if (i11 != 0) {
            }
            xVar2 = (x1.x) obj;
            if (xVar2 != null) {
                interfaceC2477h1.c(xVar2.f());
                long d122 = xVar2.d();
                C3180e0 c3180e02 = new C3180e0(interfaceC2477h1);
                c3178d0.f11476d = interfaceC10628c;
                c3178d0.f11477e = interfaceC2477h1;
                c3178d0.f11478f = null;
                c3178d0.f11480h = 2;
                obj = C5177u.i(interfaceC10628c, d122, c3180e02, c3178d0);
            }
            return Unit.f71690a;
        } catch (CancellationException e11) {
            interfaceC2477h1.onCancel();
            throw e11;
        }
        c3178d0 = new C3178d0(aVar);
        obj = c3178d0.f11479g;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3178d0.f11480h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r11 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(InterfaceC10628c interfaceC10628c, InterfaceC2477h1 interfaceC2477h1, C10638m c10638m, kotlin.coroutines.jvm.internal.a aVar) {
        C3182f0 c3182f0;
        Object obj;
        int i11;
        x1.x xVar;
        x1.x xVar2;
        try {
            if (aVar instanceof C3182f0) {
                c3182f0 = (C3182f0) aVar;
                int i12 = c3182f0.f11513h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c3182f0.f11513h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    obj = c3182f0.f11512g;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c3182f0.f11513h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        xVar = (x1.x) C7714v.K(c10638m.b());
                        long d11 = xVar.d();
                        c3182f0.f11509d = interfaceC10628c;
                        c3182f0.f11510e = interfaceC2477h1;
                        c3182f0.f11511f = xVar;
                        c3182f0.f11513h = 1;
                        obj = C5177u.d(interfaceC10628c, d11, c3182f0);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC2477h1 = c3182f0.f11510e;
                            interfaceC10628c = c3182f0.f11509d;
                            Sc.s.b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List<x1.x> b11 = interfaceC10628c.b1().b();
                                int size = b11.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    x1.x xVar3 = b11.get(i13);
                                    if (C10639n.b(xVar3)) {
                                        xVar3.a();
                                    }
                                }
                                interfaceC2477h1.onStop();
                            } else {
                                interfaceC2477h1.onCancel();
                            }
                            return Unit.f71690a;
                        }
                        x1.x xVar4 = c3182f0.f11511f;
                        interfaceC2477h1 = c3182f0.f11510e;
                        InterfaceC10628c interfaceC10628c2 = c3182f0.f11509d;
                        Sc.s.b(obj);
                        xVar = xVar4;
                        interfaceC10628c = interfaceC10628c2;
                    }
                    xVar2 = (x1.x) obj;
                    if (xVar2 != null && h(interfaceC10628c.b(), xVar, xVar2)) {
                        interfaceC2477h1.c(xVar2.f());
                        long d12 = xVar2.d();
                        C3184g0 c3184g0 = new C3184g0(interfaceC2477h1);
                        c3182f0.f11509d = interfaceC10628c;
                        c3182f0.f11510e = interfaceC2477h1;
                        c3182f0.f11511f = null;
                        c3182f0.f11513h = 2;
                        obj = C5177u.i(interfaceC10628c, d12, c3184g0, c3182f0);
                    }
                    return Unit.f71690a;
                }
            }
            if (i11 != 0) {
            }
            xVar2 = (x1.x) obj;
            if (xVar2 != null) {
                interfaceC2477h1.c(xVar2.f());
                long d122 = xVar2.d();
                C3184g0 c3184g02 = new C3184g0(interfaceC2477h1);
                c3182f0.f11509d = interfaceC10628c;
                c3182f0.f11510e = interfaceC2477h1;
                c3182f0.f11511f = null;
                c3182f0.f11513h = 2;
                obj = C5177u.i(interfaceC10628c, d122, c3184g02, c3182f0);
            }
            return Unit.f71690a;
        } catch (CancellationException e11) {
            interfaceC2477h1.onCancel();
            throw e11;
        }
        c3182f0 = new C3182f0(aVar);
        obj = c3182f0.f11512g;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3182f0.f11513h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        if (r15 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096 A[Catch: CancellationException -> 0x0030, TryCatch #1 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00cf, B:15:0x00d7, B:17:0x00e6, B:19:0x00f2, B:21:0x00f5, B:24:0x00f8, B:28:0x00fc, B:35:0x0092, B:37:0x0096, B:38:0x0098, B:40:0x009c, B:42:0x009f, B:44:0x00aa, B:46:0x00b0, B:48:0x00b4, B:49:0x00b9, B:58:0x0057), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c A[Catch: CancellationException -> 0x0030, TryCatch #1 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00cf, B:15:0x00d7, B:17:0x00e6, B:19:0x00f2, B:21:0x00f5, B:24:0x00f8, B:28:0x00fc, B:35:0x0092, B:37:0x0096, B:38:0x0098, B:40:0x009c, B:42:0x009f, B:44:0x00aa, B:46:0x00b0, B:48:0x00b4, B:49:0x00b9, B:58:0x0057), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: CancellationException -> 0x0030, TryCatch #1 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00cf, B:15:0x00d7, B:17:0x00e6, B:19:0x00f2, B:21:0x00f5, B:24:0x00f8, B:28:0x00fc, B:35:0x0092, B:37:0x0096, B:38:0x0098, B:40:0x009c, B:42:0x009f, B:44:0x00aa, B:46:0x00b0, B:48:0x00b4, B:49:0x00b9, B:58:0x0057), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(InterfaceC10628c interfaceC10628c, InterfaceC2477h1 interfaceC2477h1, C10638m c10638m, kotlin.coroutines.jvm.internal.a aVar) {
        C3186h0 c3186h0;
        int i11;
        x1.x xVar;
        long d11;
        kotlin.jvm.internal.L l11;
        Object J02;
        EnumC3199o enumC3199o;
        try {
            if (aVar instanceof C3186h0) {
                c3186h0 = (C3186h0) aVar;
                int i12 = c3186h0.f11532j;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c3186h0.f11532j = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c3186h0.f11531i;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c3186h0.f11532j;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        xVar = (x1.x) C7714v.K(c10638m.b());
                        d11 = xVar.d();
                        l11 = new kotlin.jvm.internal.L();
                        l11.f71786a = 9205357640488583168L;
                        long e11 = interfaceC10628c.b().e();
                        C3188i0 c3188i0 = new C3188i0(d11, l11, null);
                        c3186h0.f11526d = interfaceC10628c;
                        c3186h0.f11527e = interfaceC2477h1;
                        c3186h0.f11528f = xVar;
                        c3186h0.f11529g = l11;
                        c3186h0.f11530h = d11;
                        c3186h0.f11532j = 1;
                        J02 = interfaceC10628c.J0(e11, c3188i0, c3186h0);
                        if (J02 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC2477h1 = c3186h0.f11527e;
                            interfaceC10628c = c3186h0.f11526d;
                            Sc.s.b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List<x1.x> b11 = interfaceC10628c.b1().b();
                                int size = b11.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    x1.x xVar2 = b11.get(i13);
                                    if (C10639n.b(xVar2)) {
                                        xVar2.a();
                                    }
                                }
                                interfaceC2477h1.onStop();
                            } else {
                                interfaceC2477h1.onCancel();
                            }
                            return Unit.f71690a;
                        }
                        long j11 = c3186h0.f11530h;
                        kotlin.jvm.internal.L l12 = c3186h0.f11529g;
                        xVar = c3186h0.f11528f;
                        InterfaceC2477h1 interfaceC2477h12 = c3186h0.f11527e;
                        InterfaceC10628c interfaceC10628c2 = c3186h0.f11526d;
                        try {
                            Sc.s.b(obj);
                            l11 = l12;
                            J02 = obj;
                            d11 = j11;
                            interfaceC2477h1 = interfaceC2477h12;
                            interfaceC10628c = interfaceC10628c2;
                        } catch (CancellationException e12) {
                            e = e12;
                            interfaceC2477h1 = interfaceC2477h12;
                            interfaceC2477h1.onCancel();
                            throw e;
                        }
                    }
                    enumC3199o = (EnumC3199o) J02;
                    if (enumC3199o == null) {
                        enumC3199o = EnumC3199o.Timeout;
                    }
                    if (enumC3199o != EnumC3199o.Cancel) {
                        return Unit.f71690a;
                    }
                    interfaceC2477h1.c(xVar.f());
                    if (enumC3199o == EnumC3199o.Up) {
                        interfaceC2477h1.onStop();
                        return Unit.f71690a;
                    }
                    if (enumC3199o == EnumC3199o.Drag) {
                        interfaceC2477h1.b(l11.f71786a);
                    }
                    C3190j0 c3190j0 = new C3190j0(interfaceC2477h1);
                    c3186h0.f11526d = interfaceC10628c;
                    c3186h0.f11527e = interfaceC2477h1;
                    c3186h0.f11528f = null;
                    c3186h0.f11529g = null;
                    c3186h0.f11532j = 2;
                    obj = C5177u.i(interfaceC10628c, d11, c3190j0, c3186h0);
                }
            }
            if (i11 != 0) {
            }
            enumC3199o = (EnumC3199o) J02;
            if (enumC3199o == null) {
            }
            if (enumC3199o != EnumC3199o.Cancel) {
            }
        } catch (CancellationException e13) {
            e = e13;
        }
        c3186h0 = new C3186h0(aVar);
        Object obj2 = c3186h0.f11531i;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3186h0.f11532j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(c2 c2Var, x1.x xVar, x1.x xVar2) {
        return C7459e.e(C7459e.j(xVar.f(), xVar2.f())) < C5177u.l(c2Var, xVar.l());
    }

    public static final boolean i(@NotNull C10638m c10638m) {
        List<x1.x> b11 = c10638m.b();
        int size = b11.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (b11.get(i11).l() != 2) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final androidx.compose.ui.e j(@NotNull androidx.compose.ui.e eVar, @NotNull r rVar, @NotNull InterfaceC2477h1 interfaceC2477h1) {
        a aVar = new a(rVar, interfaceC2477h1, null);
        int i11 = x1.L.f104834b;
        return eVar.l0(new SuspendPointerInputElement(rVar, interfaceC2477h1, null, aVar, 4));
    }

    public static final Object k(@NotNull x1.F f7, @NotNull r rVar, @NotNull InterfaceC2477h1 interfaceC2477h1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object b11 = C9140t.b(f7, new b(interfaceC2477h1, new C3193l(f7.b()), rVar, null), dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }

    @NotNull
    public static final androidx.compose.ui.e l(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super Boolean, Unit> function1) {
        return x1.L.b(eVar, 8675309, new c(function1, null));
    }
}
