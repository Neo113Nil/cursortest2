package R20;

import Sc.InterfaceC4008j;
import a1.C4912a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.Y1;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import r20.C9164a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LR20/f;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f24508a;

    public static final class a extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return f.this;
        }
    }

    public static final class b extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f24510b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f24510b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f24510b.invoke();
        }
    }

    public static final class c extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f24511b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f24511b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f24511b.getValue()).getViewModelStore();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f24512b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f24512b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f24512b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public static final class e extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f24514c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f24514c = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            z0.b defaultViewModelProviderFactory;
            B0 b02 = (B0) this.f24514c.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            if (interfaceC5431s != null && (defaultViewModelProviderFactory = interfaceC5431s.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            z0.b defaultViewModelProviderFactory2 = f.this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* renamed from: R20.f$f, reason: collision with other inner class name */
    static final class C0485f extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0485f f24515b = new C0485f(0);

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            C9164a c9164a = C9164a.f82858a;
            return C9164a.a().s();
        }
    }

    public f() {
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new b(new a()));
        kotlin.reflect.d b11 = N.b(u.class);
        c cVar = new c(a11);
        d dVar = new d(a11);
        Function0 function0 = C0485f.f24515b;
        this.f24508a = b0.b(this, b11, cVar, dVar, function0 == null ? new e(a11) : function0);
    }

    public static final u t(f fVar) {
        return (u) fVar.f24508a.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(Y1.c.f40794a);
        composeView.a(new C4912a(true, -92474209, new R20.e(this)));
        return composeView;
    }
}
