package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.compose.ui.platform.l2;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import xe.C10727i;
import xe.C10749t0;

/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final AtomicReference<l2> f40938a = new AtomicReference<>(l2.a.a());

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ xe.B0 f40939a;

        a(xe.B0 b02) {
            this.f40939a = b02;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@NotNull View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@NotNull View view) {
            view.removeOnAttachStateChangeListener(this);
            ((xe.H0) this.f40939a).j(null);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {235}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40940d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S0.L0 f40941e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f40942f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(S0.L0 l02, View view, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f40941e = l02;
            this.f40942f = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f40941e, this.f40942f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40940d;
            View view = this.f40942f;
            S0.L0 l02 = this.f40941e;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f40940d = 1;
                    if (l02.a0(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                if (r2.b(view) == l02) {
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                }
                return Unit.f71690a;
            } finally {
                if (r2.b(view) == l02) {
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                }
            }
        }
    }

    @NotNull
    public static S0.L0 a(@NotNull View view) {
        S0.L0 a11 = f40938a.get().a(view);
        int i11 = r2.f41010b;
        view.setTag(R.id.androidx_compose_ui_view_composition_context, a11);
        C10749t0 c10749t0 = C10749t0.f105499a;
        Handler handler = view.getHandler();
        int i12 = ye.j.f106590a;
        view.addOnAttachStateChangeListener(new a(C10727i.c(c10749t0, new ye.f(handler, "windowRecomposer cleanup").H0(), null, new b(a11, view, null), 2)));
        return a11;
    }
}
