package NZ;

import GZ.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.activity.J;
import androidx.activity.L;
import androidx.activity.M;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.InterfaceC5431s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010%J)\u0010-\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001b2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.R$\u0010/\u001a\u0004\u0018\u00010\u001f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u001d\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"LNZ/d;", "Landroidx/fragment/app/m;", "LNZ/g;", "<init>", "()V", "LNZ/j;", "findTabPathConfigOwner", "()LNZ/j;", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "containerId", "hostId", "pathConfigOwner", "LNZ/f;", "onCreateNavigator", "(IILNZ/j;)LNZ/f;", "scrollToTop", "", "clearBackStack", "()Z", "getCurrentFragment", "()Landroidx/fragment/app/m;", "canHandleBackStack", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "navigator", "LNZ/f;", "getNavigator", "()LNZ/f;", "setNavigator", "(LNZ/f;)V", "LGZ/g;", "ozonRouter", "LGZ/g;", "LEZ/h;", "navigatorHolder", "LEZ/h;", "getHostId", "()I", "Companion", "a", "compass_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class d extends ComponentCallbacksC5392m implements g {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private f navigator;
    private EZ.h navigatorHolder;
    private GZ.g ozonRouter;

    /* renamed from: NZ.d$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    static final class b extends AbstractC7737t implements Function1<C, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C c11) {
            C addCallback = c11;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            GZ.g gVar = d.this.ozonRouter;
            if (gVar != null) {
                l.a(gVar);
                return Unit.f71690a;
            }
            Intrinsics.n("ozonRouter");
            throw null;
        }
    }

    private final j findTabPathConfigOwner() {
        InterfaceC5431s parentFragment = getParentFragment();
        j jVar = parentFragment instanceof j ? (j) parentFragment : null;
        if (jVar != null) {
            return jVar;
        }
        M requireActivity = requireActivity();
        if (requireActivity instanceof j) {
            return (j) requireActivity;
        }
        return null;
    }

    @Override // NZ.g
    public boolean canHandleBackStack() {
        f fVar = this.navigator;
        if (fVar != null) {
            return fVar.canHandleBackStack();
        }
        return false;
    }

    @Override // NZ.g
    public boolean clearBackStack() {
        f fVar = this.navigator;
        if (fVar != null) {
            return fVar.clearBackStack();
        }
        return false;
    }

    @Override // NZ.g
    public ComponentCallbacksC5392m getCurrentFragment() {
        return getChildFragmentManager().w0();
    }

    @Override // NZ.g
    public int getHostId() {
        String tag = getTag();
        Intrinsics.f(tag);
        return Integer.parseInt(tag);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ComponentCallbacksC5392m w02 = getChildFragmentManager().w0();
        if (w02 != null) {
            w02.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Object obj = C8475a.f76670r.get();
        C8475a c8475a = obj instanceof C8475a ? (C8475a) obj : null;
        if (c8475a == null) {
            throw new IllegalStateException("Can't get OzonCompass. Call 'OzonCompass#init' before 'get'");
        }
        this.navigatorHolder = c8475a.o();
        this.ozonRouter = c8475a.q();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.navigator = onCreateNavigator(R.id.fragmentContainer, getHostId(), findTabPathConfigOwner());
        J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        L.a(onBackPressedDispatcher, this, new b(), 2);
    }

    @NotNull
    public f onCreateNavigator(int containerId, int hostId, j pathConfigOwner) {
        return new f(this, containerId, hostId, pathConfigOwner);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(requireContext);
        fragmentContainerView.setId(R.id.fragmentContainer);
        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EZ.h hVar = this.navigatorHolder;
        if (hVar == null) {
            Intrinsics.n("navigatorHolder");
            throw null;
        }
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        f fVar = this.navigator;
        if (fVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        yZ.h.b(hVar, viewLifecycleOwner, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // NZ.g
    public void scrollToTop() {
        ComponentCallbacksC5392m w02 = getChildFragmentManager().w0();
        if ((w02 instanceof k) && w02.isVisible()) {
            ((k) w02).scrollToTop();
        }
    }
}
