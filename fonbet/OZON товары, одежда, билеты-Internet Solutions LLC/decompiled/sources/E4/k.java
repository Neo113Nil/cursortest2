package E4;

import B4.P;
import B4.a0;
import B4.d0;
import B4.g0;
import M4.c;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.A0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LE4/k;", "Landroidx/fragment/app/m;", "", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class k extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f7467a = Sc.k.b(new a());

    /* renamed from: b, reason: collision with root package name */
    private View f7468b;

    /* renamed from: c, reason: collision with root package name */
    private int f7469c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7470d;

    static final class a extends AbstractC7737t implements Function0<P> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final P invoke() {
            final k kVar = k.this;
            Context context = kVar.getContext();
            if (context == null) {
                throw new IllegalStateException("NavController cannot be created before the fragment is attached");
            }
            Intrinsics.checkNotNullExpressionValue(context, "checkNotNull(context) {\n…s attached\"\n            }");
            Intrinsics.checkNotNullParameter(context, "context");
            final P navController = new P(context);
            navController.Y(kVar);
            A0 viewModelStore = kVar.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            navController.Z(viewModelStore);
            Intrinsics.checkNotNullParameter(navController, "navHostController");
            Intrinsics.checkNotNullParameter(navController, "navController");
            d0 D11 = navController.D();
            Context requireContext = kVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            G childFragmentManager = kVar.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            D11.b(new b(requireContext, childFragmentManager));
            d0 D12 = navController.D();
            Context requireContext2 = kVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
            G childFragmentManager2 = kVar.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "childFragmentManager");
            int id2 = kVar.getId();
            if (id2 == 0 || id2 == -1) {
                id2 = R.id.nav_host_fragment_container;
            }
            D12.b(new e(requireContext2, childFragmentManager2, id2));
            Bundle b11 = kVar.getSavedStateRegistry().b("android-support-nav:fragment:navControllerState");
            if (b11 != null) {
                navController.U(b11);
            }
            kVar.getSavedStateRegistry().g("android-support-nav:fragment:navControllerState", new c.b() { // from class: E4.i
                @Override // M4.c.b
                public final Bundle saveState() {
                    P this_apply = P.this;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    Bundle W11 = this_apply.W();
                    if (W11 != null) {
                        return W11;
                    }
                    Bundle EMPTY = Bundle.EMPTY;
                    Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                    return EMPTY;
                }
            });
            Bundle b12 = kVar.getSavedStateRegistry().b("android-support-nav:fragment:graphId");
            if (b12 != null) {
                kVar.f7469c = b12.getInt("android-support-nav:fragment:graphId");
            }
            kVar.getSavedStateRegistry().g("android-support-nav:fragment:graphId", new c.b() { // from class: E4.j
                @Override // M4.c.b
                public final Bundle saveState() {
                    k this$0 = k.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (this$0.f7469c != 0) {
                        return androidx.core.os.d.b(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(this$0.f7469c)));
                    }
                    Bundle bundle = Bundle.EMPTY;
                    Intrinsics.checkNotNullExpressionValue(bundle, "{\n                    Bu…e.EMPTY\n                }");
                    return bundle;
                }
            });
            if (kVar.f7469c != 0) {
                navController.X(navController.C().b(kVar.f7469c), null);
                return navController;
            }
            Bundle arguments = kVar.getArguments();
            int i11 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i11 != 0) {
                navController.X(navController.C().b(i11), bundle);
            }
            return navController;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.f7470d) {
            Q p11 = getParentFragmentManager().p();
            p11.v(this);
            p11.i();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        v();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f7470d = true;
            Q p11 = getParentFragmentManager().p();
            p11.v(this);
            p11.i();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            id2 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id2);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f7468b;
        if (view != null && a0.a(view) == v()) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f7468b = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onInflate(@NotNull Context context, @NotNull AttributeSet attrs, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, g0.f2633b);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f7469c = resourceId;
        }
        Unit unit = Unit.f71690a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, l.f7474c);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f7470d = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f7470d) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        P v11 = v();
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(R.id.nav_controller_view_tag, v11);
        if (view.getParent() != null) {
            Object parent = view.getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f7468b = view2;
            if (view2.getId() == getId()) {
                View view3 = this.f7468b;
                Intrinsics.f(view3);
                P v12 = v();
                Intrinsics.checkNotNullParameter(view3, "view");
                view3.setTag(R.id.nav_controller_view_tag, v12);
            }
        }
    }

    @NotNull
    public final P v() {
        return (P) this.f7467a.getValue();
    }
}
