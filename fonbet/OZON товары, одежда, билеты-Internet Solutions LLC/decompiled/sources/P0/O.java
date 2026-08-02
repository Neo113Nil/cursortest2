package P0;

import Bl0.C2652m;
import S0.AbstractC3984t;
import S0.C3969l;
import S0.C3991w0;
import S0.InterfaceC3967k;
import a1.C4912a;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.ui.platform.AbstractC5228a;
import com.google.android.gms.wallet.WalletConstants;
import d2.InterfaceC6031H;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C7980b;
import m0.C8008p;
import m0.C8025y;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* loaded from: classes8.dex */
final class O extends AbstractC5228a implements InterfaceC6031H {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Window f20714a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20715b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f20716c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C7980b<Float, C8008p> f20717d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xe.M f20718e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3991w0 f20719f;

    /* renamed from: g, reason: collision with root package name */
    private Object f20720g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20721h;

    private static final class a {
        @NotNull
        public static final OnBackInvokedCallback a(@NotNull final Function0<Unit> function0) {
            return new OnBackInvokedCallback() { // from class: P0.N
                public final void onBackInvoked() {
                    Function0.this.invoke();
                }
            };
        }

        public static final void b(@NotNull View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj);
        }

        public static final void c(@NotNull View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    private static final class b {

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ xe.M f20722a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7980b<Float, C8008p> f20723b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f20724c;

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1", f = "ModalBottomSheet.android.kt", l = {419}, m = "invokeSuspend")
            /* renamed from: P0.O$b$a$a, reason: collision with other inner class name */
            static final class C0420a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f20725d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C7980b<Float, C8008p> f20726e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0420a(C7980b<Float, C8008p> c7980b, kotlin.coroutines.d<? super C0420a> dVar) {
                    super(2, dVar);
                    this.f20726e = c7980b;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new C0420a(this.f20726e, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0420a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f20725d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        Float f7 = new Float(0.0f);
                        this.f20725d = 1;
                        if (C7980b.f(this.f20726e, f7, null, null, this, 14) == aVar) {
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

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1", f = "ModalBottomSheet.android.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "invokeSuspend")
            /* renamed from: P0.O$b$a$b, reason: collision with other inner class name */
            static final class C0421b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f20727d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C7980b<Float, C8008p> f20728e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ BackEvent f20729f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0421b(C7980b<Float, C8008p> c7980b, BackEvent backEvent, kotlin.coroutines.d<? super C0421b> dVar) {
                    super(2, dVar);
                    this.f20728e = c7980b;
                    this.f20729f = backEvent;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new C0421b(this.f20728e, this.f20729f, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0421b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    C8025y c8025y;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f20727d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        float progress = this.f20729f.getProgress();
                        c8025y = Q0.h.f22760a;
                        Float f7 = new Float(c8025y.a(progress));
                        this.f20727d = 1;
                        if (this.f20728e.m(f7, this) == aVar) {
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

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1", f = "ModalBottomSheet.android.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "invokeSuspend")
            static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f20730d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C7980b<Float, C8008p> f20731e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ BackEvent f20732f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C7980b<Float, C8008p> c7980b, BackEvent backEvent, kotlin.coroutines.d<? super c> dVar) {
                    super(2, dVar);
                    this.f20731e = c7980b;
                    this.f20732f = backEvent;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new c(this.f20731e, this.f20732f, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    C8025y c8025y;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f20730d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        float progress = this.f20732f.getProgress();
                        c8025y = Q0.h.f22760a;
                        Float f7 = new Float(c8025y.a(progress));
                        this.f20730d = 1;
                        if (this.f20731e.m(f7, this) == aVar) {
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

            a(Function0 function0, C7980b c7980b, xe.M m11) {
                this.f20722a = m11;
                this.f20723b = c7980b;
                this.f20724c = function0;
            }

            public final void onBackCancelled() {
                C10727i.c(this.f20722a, null, null, new C0420a(this.f20723b, null), 3);
            }

            public final void onBackInvoked() {
                this.f20724c.invoke();
            }

            public final void onBackProgressed(@NotNull BackEvent backEvent) {
                C10727i.c(this.f20722a, null, null, new C0421b(this.f20723b, backEvent, null), 3);
            }

            public final void onBackStarted(@NotNull BackEvent backEvent) {
                C10727i.c(this.f20722a, null, null, new c(this.f20723b, backEvent, null), 3);
            }
        }

        @NotNull
        public static final OnBackAnimationCallback a(@NotNull Function0<Unit> function0, @NotNull C7980b<Float, C8008p> c7980b, @NotNull xe.M m11) {
            return new a(function0, c7980b, m11);
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f20734c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super(2);
            this.f20734c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f20734c | 1);
            O.this.Content(interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public O(@NotNull Context context, @NotNull Window window, boolean z11, @NotNull Function0<Unit> function0, @NotNull C7980b<Float, C8008p> c7980b, @NotNull xe.M m11) {
        super(context, null, 0, 6, null);
        C3991w0 f7;
        this.f20714a = window;
        this.f20715b = z11;
        this.f20716c = function0;
        this.f20717d = c7980b;
        this.f20718e = m11;
        f7 = S0.n1.f(C3765q.f21304a, S0.D1.f25195a);
        this.f20719f = f7;
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    public final void Content(InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(576708319);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            ((Function2) this.f20719f.getValue()).invoke(u11, 0);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(i11));
        }
    }

    public final void a(@NotNull AbstractC3984t abstractC3984t, @NotNull C4912a c4912a) {
        setParentCompositionContext(abstractC3984t);
        this.f20719f.setValue(c4912a);
        this.f20721h = true;
        createComposition();
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    protected final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f20721h;
    }

    @Override // d2.InterfaceC6031H
    @NotNull
    public final Window getWindow() {
        return this.f20714a;
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        int i11;
        super.onAttachedToWindow();
        if (!this.f20715b || (i11 = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.f20720g == null) {
            Function0<Unit> function0 = this.f20716c;
            this.f20720g = i11 >= 34 ? androidx.appcompat.app.q.a(b.a(function0, this.f20717d, this.f20718e)) : a.a(function0);
        }
        a.b(this, this.f20720g);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            a.c(this, this.f20720g);
        }
        this.f20720g = null;
    }
}
