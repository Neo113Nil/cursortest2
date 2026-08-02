package B0;

import S0.InterfaceC3978p0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import r0.InterfaceC9143w;
import t0.s;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class G1 extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f1375d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f1376e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ xe.M f1377f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<s.b> f1378g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ t0.q f1379h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f1380i;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC9143w, C7459e, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1381d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC9143w f1382e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ long f1383f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ xe.M f1384g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<s.b> f1385h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ t0.q f1386i;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
        /* renamed from: B0.G1$a$a, reason: collision with other inner class name */
        static final class C0042a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            Object f1387d;

            /* renamed from: e, reason: collision with root package name */
            int f1388e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC3978p0<s.b> f1389f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f1390g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ t0.q f1391h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0042a(InterfaceC3978p0<s.b> interfaceC3978p0, long j11, t0.q qVar, kotlin.coroutines.d<? super C0042a> dVar) {
                super(2, dVar);
                this.f1389f = interfaceC3978p0;
                this.f1390g = j11;
                this.f1391h = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0042a(this.f1389f, this.f1390g, this.f1391h, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0042a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
            
                if (r2.emit(r1, r8) == r0) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                InterfaceC3978p0<s.b> interfaceC3978p0;
                s.b bVar;
                s.b bVar2;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f1388e;
                t0.q qVar = this.f1391h;
                InterfaceC3978p0<s.b> interfaceC3978p02 = this.f1389f;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    s.b value = interfaceC3978p02.getValue();
                    if (value != null) {
                        s.a aVar2 = new s.a(value);
                        if (qVar != null) {
                            this.f1387d = interfaceC3978p02;
                            this.f1388e = 1;
                        }
                        interfaceC3978p0 = interfaceC3978p02;
                    }
                    bVar = new s.b(this.f1390g);
                    if (qVar != null) {
                        this.f1387d = bVar;
                        this.f1388e = 2;
                        if (qVar.emit(bVar, this) != aVar) {
                            bVar2 = bVar;
                            bVar = bVar2;
                        }
                        return aVar;
                    }
                    interfaceC3978p02.setValue(bVar);
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (s.b) this.f1387d;
                    Sc.s.b(obj);
                    bVar = bVar2;
                    interfaceC3978p02.setValue(bVar);
                    return Unit.f71690a;
                }
                interfaceC3978p0 = (InterfaceC3978p0) this.f1387d;
                Sc.s.b(obj);
                interfaceC3978p0.setValue(null);
                bVar = new s.b(this.f1390g);
                if (qVar != null) {
                }
                interfaceC3978p02.setValue(bVar);
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            InterfaceC3978p0 f1392d;

            /* renamed from: e, reason: collision with root package name */
            int f1393e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC3978p0<s.b> f1394f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f1395g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ t0.q f1396h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC3978p0<s.b> interfaceC3978p0, boolean z11, t0.q qVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f1394f = interfaceC3978p0;
                this.f1395g = z11;
                this.f1396h = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new b(this.f1394f, this.f1395g, this.f1396h, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                InterfaceC3978p0<s.b> interfaceC3978p0;
                InterfaceC3978p0<s.b> interfaceC3978p02;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f1393e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    interfaceC3978p0 = this.f1394f;
                    s.b value = interfaceC3978p0.getValue();
                    if (value != null) {
                        t0.n cVar = this.f1395g ? new s.c(value) : new s.a(value);
                        t0.q qVar = this.f1396h;
                        if (qVar != null) {
                            this.f1392d = interfaceC3978p0;
                            this.f1393e = 1;
                            if (qVar.emit(cVar, this) == aVar) {
                                return aVar;
                            }
                            interfaceC3978p02 = interfaceC3978p0;
                        }
                        interfaceC3978p0.setValue(null);
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3978p02 = this.f1392d;
                Sc.s.b(obj);
                interfaceC3978p0 = interfaceC3978p02;
                interfaceC3978p0.setValue(null);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xe.M m11, InterfaceC3978p0<s.b> interfaceC3978p0, t0.q qVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f1384g = m11;
            this.f1385h = interfaceC3978p0;
            this.f1386i = qVar;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC9143w interfaceC9143w, C7459e c7459e, kotlin.coroutines.d<? super Unit> dVar) {
            long n11 = c7459e.n();
            a aVar = new a(this.f1384g, this.f1385h, this.f1386i, dVar);
            aVar.f1382e = interfaceC9143w;
            aVar.f1383f = n11;
            return aVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1381d;
            xe.M m11 = this.f1384g;
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC9143w interfaceC9143w = this.f1382e;
                C10727i.c(m11, null, null, new C0042a(this.f1385h, this.f1383f, this.f1386i, null), 3);
                this.f1381d = 1;
                obj = interfaceC9143w.M0(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            C10727i.c(m11, null, null, new b(this.f1385h, ((Boolean) obj).booleanValue(), this.f1386i, null), 3);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<C7459e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f1397b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3978p0 interfaceC3978p0) {
            super(1);
            this.f1397b = interfaceC3978p0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7459e c7459e) {
            ((Function1) this.f1397b.getValue()).invoke(C7459e.a(c7459e.n()));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G1(xe.M m11, InterfaceC3978p0 interfaceC3978p0, t0.q qVar, InterfaceC3978p0 interfaceC3978p02, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f1377f = m11;
        this.f1378g = interfaceC3978p0;
        this.f1379h = qVar;
        this.f1380i = interfaceC3978p02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        G1 g12 = new G1(this.f1377f, this.f1378g, this.f1379h, this.f1380i, dVar);
        g12.f1376e = obj;
        return g12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
        return ((G1) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1375d;
        if (i11 == 0) {
            Sc.s.b(obj);
            x1.F f7 = (x1.F) this.f1376e;
            a aVar2 = new a(this.f1377f, this.f1378g, this.f1379h, null);
            b bVar = new b(this.f1380i);
            this.f1375d = 1;
            if (C9115P.e(f7, aVar2, bVar, this) == aVar) {
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
