package E0;

import F0.C2990k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1", f = "TextFieldDecoratorModifier.kt", l = {201}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class O0 extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f7054d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f7055e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ F0 f7056f;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f7057d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ F0 f7058e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x1.F f7059f;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1", f = "TextFieldDecoratorModifier.kt", l = {208}, m = "invokeSuspend")
        /* renamed from: E0.O0$a$a, reason: collision with other inner class name */
        static final class C0149a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f7060d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C2990k f7061e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ x1.F f7062f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0149a(C2990k c2990k, kotlin.coroutines.d dVar, x1.F f7) {
                super(2, dVar);
                this.f7061e = c2990k;
                this.f7062f = f7;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0149a(this.f7061e, dVar, this.f7062f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0149a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f7060d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f7060d = 1;
                    if (this.f7061e.I(this.f7062f, this) == aVar) {
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

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", f = "TextFieldDecoratorModifier.kt", l = {211}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f7063d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ F0 f7064e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C2990k f7065f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ x1.F f7066g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f7067h;

            /* renamed from: E0.O0$a$b$a, reason: collision with other inner class name */
            static final class C0150a extends AbstractC7737t implements Function0<Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ F0 f7068b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0150a(F0 f02) {
                    super(0);
                    this.f7068b = f02;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    xe.B0 b02;
                    F0 f02 = this.f7068b;
                    b02 = f02.f7008t;
                    if (b02 != null) {
                        F0.U1(f02).show();
                    } else {
                        f02.j2(true);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(F0 f02, C2990k c2990k, x1.F f7, Function0<Unit> function0, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f7064e = f02;
                this.f7065f = c2990k;
                this.f7066g = f7;
                this.f7067h = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new b(this.f7064e, this.f7065f, this.f7066g, this.f7067h, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f7063d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    F0 f02 = this.f7064e;
                    t0.q b22 = f02.b2();
                    C0150a c0150a = new C0150a(f02);
                    this.f7063d = 1;
                    if (this.f7065f.H(this.f7066g, b22, this.f7067h, c0150a, this) == aVar) {
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

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3", f = "TextFieldDecoratorModifier.kt", l = {225}, m = "invokeSuspend")
        static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f7069d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C2990k f7070e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ x1.F f7071f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f7072g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C2990k c2990k, x1.F f7, Function0<Unit> function0, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f7070e = c2990k;
                this.f7071f = f7;
                this.f7072g = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new c(this.f7070e, this.f7071f, this.f7072g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f7069d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f7069d = 1;
                    if (this.f7070e.d0(this.f7071f, this.f7072g, this) == aVar) {
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

        static final class d extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2990k f7073b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ F0 f7074c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C2990k c2990k, F0 f02) {
                super(0);
                this.f7073b = c2990k;
                this.f7074c = f02;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                if (!this.f7073b.T()) {
                    j1.u.b(this.f7074c);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(F0 f02, x1.F f7, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f7058e = f02;
            this.f7059f = f7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f7058e, this.f7059f, dVar);
            aVar.f7057d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            xe.M m11 = (xe.M) this.f7057d;
            C2990k e22 = this.f7058e.e2();
            F0 f02 = this.f7058e;
            d dVar = new d(e22, f02);
            xe.O o11 = xe.O.UNDISPATCHED;
            x1.F f7 = this.f7059f;
            C10727i.c(m11, null, o11, new C0149a(e22, null, f7), 1);
            C10727i.c(m11, null, o11, new b(f02, e22, f7, dVar, null), 1);
            C10727i.c(m11, null, o11, new c(e22, f7, dVar, null), 1);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O0(F0 f02, kotlin.coroutines.d<? super O0> dVar) {
        super(2, dVar);
        this.f7056f = f02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        O0 o02 = new O0(this.f7056f, dVar);
        o02.f7055e = obj;
        return o02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
        return ((O0) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f7054d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f7056f, (x1.F) this.f7055e, null);
            this.f7054d = 1;
            if (xe.N.d(aVar2, this) == aVar) {
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
