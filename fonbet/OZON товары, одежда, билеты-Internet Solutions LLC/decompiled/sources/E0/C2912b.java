package E0;

import Ae.InterfaceC2397i;
import E0.AbstractC2923g0;
import E0.C2910a;
import E0.C2925h0;
import Sc.C4005g;
import android.view.View;
import androidx.compose.ui.platform.InterfaceC5286t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l1.C7837o0;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {123}, m = "invokeSuspend")
/* renamed from: E0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2912b extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC5286t1, kotlin.coroutines.d<?>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f7147d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f7148e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<C2935m0, Unit> f7149f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2910a f7150g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC2923g0.a f7151h;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {146}, m = "invokeSuspend")
    /* renamed from: E0.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<?>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f7152d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f7153e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5286t1 f7154f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<C2935m0, Unit> f7155g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C2910a f7156h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC2923g0.a f7157i;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {137, 138}, m = "invokeSuspend")
        /* renamed from: E0.b$a$a, reason: collision with other inner class name */
        static final class C0152a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f7158d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C2910a f7159e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C2913b0 f7160f;

            /* renamed from: E0.b$a$a$a, reason: collision with other inner class name */
            static final class C0153a extends AbstractC7737t implements Function1<Long, Unit> {

                /* renamed from: b, reason: collision with root package name */
                public static final C0153a f7161b = new C0153a(1);

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Long l11) {
                    l11.longValue();
                    return Unit.f71690a;
                }
            }

            /* renamed from: E0.b$a$a$b, reason: collision with other inner class name */
            static final class C0154b<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C2913b0 f7162a;

                C0154b(C2913b0 c2913b0) {
                    this.f7162a = c2913b0;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    this.f7162a.e();
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0152a(C2910a c2910a, C2913b0 c2913b0, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f7159e = c2910a;
                this.f7160f = c2913b0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0152a(this.f7159e, this.f7160f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0152a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
            
                if (((Ae.C0) r5).collect(r1, r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
            
                if (S0.C3961h0.a(getContext()).v(new S0.C3958g0(E0.C2912b.a.C0152a.C0153a.f7161b), r4) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                Ae.w0 o11;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f7158d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f7158d = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        throw new C4005g();
                    }
                    Sc.s.b(obj);
                }
                o11 = this.f7159e.o();
                if (o11 == null) {
                    return Unit.f71690a;
                }
                C0154b c0154b = new C0154b(this.f7160f);
                this.f7158d = 2;
            }
        }

        /* renamed from: E0.b$a$b, reason: collision with other inner class name */
        /* synthetic */ class C0155b extends C7735q implements Function1<C7837o0, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC2923g0.a f7163a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0155b(AbstractC2923g0.a aVar) {
                super(1, Intrinsics.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                this.f7163a = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C7837o0 c7837o0) {
                float[] j11 = c7837o0.j();
                B1.B v11 = this.f7163a.v();
                if (v11 != null) {
                    if (!v11.I()) {
                        v11 = null;
                    }
                    if (v11 != null) {
                        v11.S(j11);
                    }
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC5286t1 interfaceC5286t1, Function1<? super C2935m0, Unit> function1, C2910a c2910a, AbstractC2923g0.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f7154f = interfaceC5286t1;
            this.f7155g = function1;
            this.f7156h = c2910a;
            this.f7157i = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f7154f, this.f7155g, this.f7156h, this.f7157i, dVar);
            aVar.f7153e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<?> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f7152d;
            C2910a c2910a = this.f7156h;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    xe.M m11 = (xe.M) this.f7153e;
                    Function1<View, Object> a11 = C2925h0.a();
                    InterfaceC5286t1 interfaceC5286t1 = this.f7154f;
                    View view = interfaceC5286t1.getView();
                    ((C2925h0.a) a11).getClass();
                    C2913b0 c2913b0 = new C2913b0(view);
                    C2935m0 c2935m0 = new C2935m0(interfaceC5286t1.getView(), new C0155b(this.f7157i), c2913b0);
                    if (C0.c.a()) {
                        C10727i.c(m11, null, null, new C0152a(c2910a, c2913b0, null), 3);
                    }
                    Function1<C2935m0, Unit> function1 = this.f7155g;
                    if (function1 != null) {
                        ((C2910a.C0151a) function1).invoke(c2935m0);
                    }
                    c2910a.f7140c = c2935m0;
                    this.f7152d = 1;
                    if (interfaceC5286t1.a(c2935m0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            } catch (Throwable th2) {
                c2910a.f7140c = null;
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C2912b(Function1<? super C2935m0, Unit> function1, C2910a c2910a, AbstractC2923g0.a aVar, kotlin.coroutines.d<? super C2912b> dVar) {
        super(2, dVar);
        this.f7149f = function1;
        this.f7150g = c2910a;
        this.f7151h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C2912b c2912b = new C2912b(this.f7149f, this.f7150g, this.f7151h, dVar);
        c2912b.f7148e = obj;
        return c2912b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC5286t1 interfaceC5286t1, kotlin.coroutines.d<?> dVar) {
        return ((C2912b) create(interfaceC5286t1, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f7147d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a((InterfaceC5286t1) this.f7148e, this.f7149f, this.f7150g, this.f7151h, null);
            this.f7147d = 1;
            if (xe.N.d(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new C4005g();
    }
}
