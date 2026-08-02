package F0;

import com.google.android.gms.wallet.WalletConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.C9140t;
import xe.B0;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class E extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super B0>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f8171d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2990k f8172e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ x1.F f8173f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f8174g;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", l = {391}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f8175d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2990k f8176e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x1.F f8177f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2990k c2990k, kotlin.coroutines.d dVar, x1.F f7) {
            super(2, dVar);
            this.f8176e = c2990k;
            this.f8177f = f7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f8176e, dVar, this.f8177f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f8175d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f8175d = 1;
                if (this.f8176e.I(this.f8177f, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", l = {394}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f8178d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ x1.F f8179e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2990k f8180f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f8181g;

        static final class a implements InterfaceC2982c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2990k f8182a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f8183b;

            a(C2990k c2990k, boolean z11) {
                this.f8182a = c2990k;
                this.f8183b = z11;
            }
        }

        /* renamed from: F0.E$b$b, reason: collision with other inner class name */
        static final class C0181b extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2990k f8184b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0181b(C2990k c2990k) {
                super(0);
                this.f8184b = c2990k;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f8184b.A();
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2990k c2990k, kotlin.coroutines.d dVar, x1.F f7, boolean z11) {
            super(2, dVar);
            this.f8179e = f7;
            this.f8180f = c2990k;
            this.f8181g = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            boolean z11 = this.f8181g;
            return new b(this.f8180f, dVar, this.f8179e, z11);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Object obj2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f8178d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C2990k c2990k = this.f8180f;
                a aVar = new a(c2990k, this.f8181g);
                C0181b c0181b = new C0181b(c2990k);
                this.f8178d = 1;
                Object b11 = C9140t.b(this.f8179e, new C2981b(aVar, c0181b, null), this);
                if (b11 != obj2) {
                    b11 = Unit.f71690a;
                }
                if (b11 == obj2) {
                    return obj2;
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", f = "TextFieldSelectionState.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f8185d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2990k f8186e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x1.F f8187f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f8188g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C2990k c2990k, kotlin.coroutines.d dVar, x1.F f7, boolean z11) {
            super(2, dVar);
            this.f8186e = c2990k;
            this.f8187f = f7;
            this.f8188g = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new c(this.f8186e, dVar, this.f8187f, this.f8188g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f8185d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f8185d = 1;
                if (C2990k.c(this.f8186e, this.f8187f, this.f8188g, this) == aVar) {
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
    E(C2990k c2990k, kotlin.coroutines.d dVar, x1.F f7, boolean z11) {
        super(2, dVar);
        this.f8172e = c2990k;
        this.f8173f = f7;
        this.f8174g = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        E e11 = new E(this.f8172e, dVar, this.f8173f, this.f8174g);
        e11.f8171d = obj;
        return e11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super B0> dVar) {
        return ((E) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        xe.M m11 = (xe.M) this.f8171d;
        xe.O o11 = xe.O.UNDISPATCHED;
        C2990k c2990k = this.f8172e;
        x1.F f7 = this.f8173f;
        C10727i.c(m11, null, o11, new a(c2990k, null, f7), 1);
        boolean z11 = this.f8174g;
        C10727i.c(m11, null, o11, new b(c2990k, null, f7, z11), 1);
        return C10727i.c(m11, null, o11, new c(c2990k, null, f7, z11), 1);
    }
}
