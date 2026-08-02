package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC5434v;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f36923a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7704k<C> f36924b;

    /* renamed from: c, reason: collision with root package name */
    private C f36925c;

    /* renamed from: d, reason: collision with root package name */
    private OnBackInvokedCallback f36926d;

    /* renamed from: e, reason: collision with root package name */
    private OnBackInvokedDispatcher f36927e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f36928f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36929g;

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f36930a = new a();

        @NotNull
        public final OnBackInvokedCallback a(@NotNull final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.I
                public final void onBackInvoked() {
                    Function0 onBackInvoked2 = Function0.this;
                    Intrinsics.checkNotNullParameter(onBackInvoked2, "$onBackInvoked");
                    onBackInvoked2.invoke();
                }
            };
        }

        public final void b(@NotNull Object dispatcher, int i11, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i11, (OnBackInvokedCallback) callback);
        }

        public final void c(@NotNull Object dispatcher, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* loaded from: classes8.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f36931a = new b();

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<C5035b, Unit> f36932a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<C5035b, Unit> f36933b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f36934c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f36935d;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super C5035b, Unit> function1, Function1<? super C5035b, Unit> function12, Function0<Unit> function0, Function0<Unit> function02) {
                this.f36932a = function1;
                this.f36933b = function12;
                this.f36934c = function0;
                this.f36935d = function02;
            }

            public final void onBackCancelled() {
                this.f36935d.invoke();
            }

            public final void onBackInvoked() {
                this.f36934c.invoke();
            }

            public final void onBackProgressed(@NotNull BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f36933b.invoke(new C5035b(backEvent));
            }

            public final void onBackStarted(@NotNull BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f36932a.invoke(new C5035b(backEvent));
            }
        }

        @NotNull
        public final OnBackInvokedCallback a(@NotNull Function1<? super C5035b, Unit> onBackStarted, @NotNull Function1<? super C5035b, Unit> onBackProgressed, @NotNull Function0<Unit> onBackInvoked, @NotNull Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    private final class c implements androidx.lifecycle.G, InterfaceC5036c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractC5434v f36936a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C f36937b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC5036c f36938c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ J f36939d;

        public c(@NotNull J j11, @NotNull AbstractC5434v lifecycle, C onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f36939d = j11;
            this.f36936a = lifecycle;
            this.f36937b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.InterfaceC5036c
        public final void cancel() {
            this.f36936a.e(this);
            this.f36937b.removeCancellable(this);
            InterfaceC5036c interfaceC5036c = this.f36938c;
            if (interfaceC5036c != null) {
                interfaceC5036c.cancel();
            }
            this.f36938c = null;
        }

        @Override // androidx.lifecycle.G
        public final void onStateChanged(@NotNull androidx.lifecycle.J source, @NotNull AbstractC5434v.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC5434v.a.ON_START) {
                this.f36938c = this.f36939d.i(this.f36937b);
                return;
            }
            if (event != AbstractC5434v.a.ON_STOP) {
                if (event == AbstractC5434v.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC5036c interfaceC5036c = this.f36938c;
                if (interfaceC5036c != null) {
                    ((d) interfaceC5036c).cancel();
                }
            }
        }
    }

    private final class d implements InterfaceC5036c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C f36940a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f36941b;

        public d(@NotNull J j11, C onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f36941b = j11;
            this.f36940a = onBackPressedCallback;
        }

        @Override // androidx.activity.InterfaceC5036c
        public final void cancel() {
            J j11 = this.f36941b;
            C7704k c7704k = j11.f36924b;
            C c11 = this.f36940a;
            c7704k.remove(c11);
            if (Intrinsics.d(j11.f36925c, c11)) {
                c11.handleOnBackCancelled();
                j11.f36925c = null;
            }
            c11.removeCancellable(this);
            Function0<Unit> enabledChangedCallback$activity_release = c11.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            c11.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* synthetic */ class e extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((J) this.receiver).o();
            return Unit.f71690a;
        }
    }

    /* synthetic */ class f extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((J) this.receiver).o();
            return Unit.f71690a;
        }
    }

    public J(Runnable runnable) {
        this.f36923a = runnable;
        this.f36924b = new C7704k<>();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.f36926d = i11 >= 34 ? b.f36931a.a(new D(this), new E(this), new F(this), new G(this)) : a.f36930a.a(new H(this));
        }
    }

    public static final void d(J j11, C5035b c5035b) {
        C c11;
        C c12 = j11.f36925c;
        if (c12 == null) {
            C7704k<C> c7704k = j11.f36924b;
            ListIterator<C> listIterator = c7704k.listIterator(c7704k.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c11 = null;
                    break;
                } else {
                    c11 = listIterator.previous();
                    if (c11.getIsEnabled()) {
                        break;
                    }
                }
            }
            c12 = c11;
        }
        if (c12 != null) {
            c12.handleOnBackProgressed(c5035b);
        }
    }

    public static final void e(J j11, C5035b c5035b) {
        C c11;
        C7704k<C> c7704k = j11.f36924b;
        ListIterator<C> listIterator = c7704k.listIterator(c7704k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c11 = null;
                break;
            } else {
                c11 = listIterator.previous();
                if (c11.getIsEnabled()) {
                    break;
                }
            }
        }
        C c12 = c11;
        if (j11.f36925c != null) {
            j11.k();
        }
        j11.f36925c = c12;
        if (c12 != null) {
            c12.handleOnBackStarted(c5035b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        C c11;
        C c12 = this.f36925c;
        if (c12 == null) {
            C7704k<C> c7704k = this.f36924b;
            ListIterator<C> listIterator = c7704k.listIterator(c7704k.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c11 = null;
                    break;
                } else {
                    c11 = listIterator.previous();
                    if (c11.getIsEnabled()) {
                        break;
                    }
                }
            }
            c12 = c11;
        }
        this.f36925c = null;
        if (c12 != null) {
            c12.handleOnBackCancelled();
        }
    }

    private final void n(boolean z11) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f36927e;
        OnBackInvokedCallback onBackInvokedCallback = this.f36926d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        a aVar = a.f36930a;
        if (z11 && !this.f36928f) {
            aVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f36928f = true;
        } else {
            if (z11 || !this.f36928f) {
                return;
            }
            aVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f36928f = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        boolean z11 = this.f36929g;
        boolean z12 = false;
        C7704k<C> c7704k = this.f36924b;
        if (c7704k == null || !c7704k.isEmpty()) {
            Iterator<C> it = c7704k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().getIsEnabled()) {
                    z12 = true;
                    break;
                }
            }
        }
        this.f36929g = z12;
        if (z12 == z11 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        n(z12);
    }

    public final void h(@NotNull androidx.lifecycle.J owner, @NotNull C onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC5434v lifecycle = owner.getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new c(this, lifecycle, onBackPressedCallback));
        o();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new e(0, this, J.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0));
    }

    @NotNull
    public final InterfaceC5036c i(@NotNull C onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f36924b.addLast(onBackPressedCallback);
        d dVar = new d(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(dVar);
        o();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new f(0, this, J.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0));
        return dVar;
    }

    public final boolean j() {
        return this.f36929g;
    }

    public final void l() {
        C c11;
        C c12 = this.f36925c;
        if (c12 == null) {
            C7704k<C> c7704k = this.f36924b;
            ListIterator<C> listIterator = c7704k.listIterator(c7704k.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c11 = null;
                    break;
                } else {
                    c11 = listIterator.previous();
                    if (c11.getIsEnabled()) {
                        break;
                    }
                }
            }
            c12 = c11;
        }
        this.f36925c = null;
        if (c12 != null) {
            c12.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f36923a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void m(@NotNull OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f36927e = invoker;
        n(this.f36929g);
    }

    public J() {
        this(null);
    }
}
