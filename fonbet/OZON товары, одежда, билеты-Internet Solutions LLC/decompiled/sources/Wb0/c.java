package Wb0;

import Ae.B0;
import Ae.C2399j;
import De.C2862e;
import Ib0.h;
import Ib0.i;
import Kb0.K;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Sc.s;
import Wb0.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td0.f;
import xe.C10727i;
import xe.M;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f33432a;

    static final class a extends AbstractC7737t implements Function0<Wb0.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ld0.c f33433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ld0.c cVar) {
            super(0);
            this.f33433b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Wb0.b invoke() {
            return new Wb0.b(this.f33433b);
        }
    }

    @e(c = "ru.ozon.id.log.autoTest.OzonIdEventsLogger$collectEvents$1$1", f = "OzonIdEventsLogger.kt", l = {23}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f33434d;

        @e(c = "ru.ozon.id.log.autoTest.OzonIdEventsLogger$collectEvents$1$1$1", f = "OzonIdEventsLogger.kt", l = {}, m = "invokeSuspend")
        static final class a extends j implements Function2<i, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f33436d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f33437e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f33437e = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f33437e, dVar);
                aVar.f33436d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(i iVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(iVar, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a.InterfaceC0593a interfaceC0593a;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                i iVar = (i) this.f33436d;
                boolean z11 = iVar instanceof i.a;
                if (z11) {
                    interfaceC0593a = new a.InterfaceC0593a.b(0);
                } else {
                    boolean z12 = iVar instanceof i.b;
                    if (z12 && iVar.a() == Gb0.d.FORCE_LOGIN) {
                        interfaceC0593a = new a.InterfaceC0593a.b(0);
                    } else if (z12) {
                        interfaceC0593a = a.InterfaceC0593a.C0594a.f33428a;
                    } else {
                        if (!(iVar instanceof i.c)) {
                            return Unit.f71690a;
                        }
                        interfaceC0593a = a.InterfaceC0593a.c.f33429a;
                    }
                }
                this.f33437e.b(Gb0.b.b(iVar.a()), interfaceC0593a, z11 ? "already signed in" : ((iVar instanceof i.b) && iVar.a() == Gb0.d.FORCE_LOGIN) ? "backend error" : null);
                return Unit.f71690a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f33434d;
            if (i11 == 0) {
                s.b(obj);
                K k11 = Tb0.a.f26975d;
                if (k11 == null) {
                    throw new Lb0.a();
                }
                B0<i> a11 = k11.p().getValue().a();
                a aVar2 = new a(c.this, null);
                this.f33434d = 1;
                if (C2399j.h(a11, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @e(c = "ru.ozon.id.log.autoTest.OzonIdEventsLogger$collectEvents$1$2", f = "OzonIdEventsLogger.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: Wb0.c$c, reason: collision with other inner class name */
    static final class C0595c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f33438d;

        @e(c = "ru.ozon.id.log.autoTest.OzonIdEventsLogger$collectEvents$1$2$1", f = "OzonIdEventsLogger.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Wb0.c$c$a */
        static final class a extends j implements Function2<h, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f33440d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f33441e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f33441e = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f33441e, dVar);
                aVar.f33440d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(h hVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a.InterfaceC0593a interfaceC0593a;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                h hVar = (h) this.f33440d;
                boolean z11 = hVar instanceof h.a;
                if (z11) {
                    interfaceC0593a = new a.InterfaceC0593a.b(0);
                } else if (hVar instanceof h.b) {
                    interfaceC0593a = a.InterfaceC0593a.C0594a.f33428a;
                } else {
                    if (!(hVar instanceof h.c)) {
                        throw new o();
                    }
                    interfaceC0593a = a.InterfaceC0593a.c.f33429a;
                }
                this.f33441e.b(Gb0.b.a(hVar.a()), interfaceC0593a, z11 ? "already logged out" : null);
                return Unit.f71690a;
            }
        }

        C0595c(kotlin.coroutines.d<? super C0595c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new C0595c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0595c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f33438d;
            if (i11 == 0) {
                s.b(obj);
                K k11 = Tb0.a.f26975d;
                if (k11 == null) {
                    throw new Lb0.a();
                }
                B0<h> c11 = k11.p().getValue().c();
                a aVar2 = new a(c.this, null);
                this.f33438d = 1;
                if (C2399j.h(c11, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends Wb0.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f33442a;

        /* renamed from: b, reason: collision with root package name */
        private final a.InterfaceC0593a f33443b;

        /* renamed from: c, reason: collision with root package name */
        private final String f33444c = "ozonidSDK";

        /* renamed from: d, reason: collision with root package name */
        private final String f33445d;

        d(String str, a.InterfaceC0593a interfaceC0593a, String str2) {
            this.f33442a = str;
            this.f33443b = interfaceC0593a;
            this.f33445d = str2;
        }

        public final String a() {
            return this.f33442a;
        }

        public final String b() {
            return this.f33444c;
        }

        public final a.InterfaceC0593a c() {
            return this.f33443b;
        }

        public final String d() {
            return this.f33445d;
        }
    }

    public c(@NotNull Ld0.c limbDiStore) {
        Intrinsics.checkNotNullParameter(limbDiStore, "limbDiStore");
        this.f33432a = k.b(new a(limbDiStore));
    }

    public final void a() {
        C2862e a11 = f.a();
        C10727i.c(a11, null, null, new b(null), 3);
        C10727i.c(a11, null, null, new C0595c(null), 3);
    }

    public final void b(@NotNull String command, @NotNull a.InterfaceC0593a result, String str) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(result, "result");
        ((Wb0.b) this.f33432a.getValue()).a(new d(command, result, str));
    }
}
