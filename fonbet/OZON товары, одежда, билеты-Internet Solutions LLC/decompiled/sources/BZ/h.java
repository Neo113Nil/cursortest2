package BZ;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;
import qZ.InterfaceC9013e;
import qZ.InterfaceC9014f;
import ru.ozon.app.android.R;
import sZ.c;
import wZ.InterfaceC10463e;
import xZ.l;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00018B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010$\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00106¨\u00069"}, d2 = {"LBZ/h;", "Landroidx/fragment/app/m;", "LqZ/e;", "LxZ/l;", "LwZ/e;", "<init>", "()V", "", "miniApp", "deeplink", "createRootFragment", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "LqZ/f;", "getScreenFlowTag", "()LqZ/f;", "miniAppName", "()Ljava/lang/String;", "fragmentContainerId", "I", "LEZ/h;", "holder", "LEZ/h;", "LGZ/g;", "router", "LGZ/g;", "LBZ/i;", "navigator", "LBZ/i;", "Ljava/lang/String;", "Companion", "a", "compass_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class h extends ComponentCallbacksC5392m implements InterfaceC9013e, l, InterfaceC10463e {
    private EZ.h holder;
    private i navigator;
    private GZ.g router;
    private final int fragmentContainerId = R.id.miniAppFragmentContainer;

    @NotNull
    private String miniAppName = "";

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentCallbacksC5392m onCreate$lambda$0(h hVar, String str) {
        return hVar.createRootFragment(hVar.miniAppName, str);
    }

    @NotNull
    public abstract ComponentCallbacksC5392m createRootFragment(@NotNull String miniApp, String deeplink);

    @Override // qZ.InterfaceC9013e
    @NotNull
    public InterfaceC9014f getScreenFlowTag() {
        InterfaceC9014f screenFlowTag;
        ComponentCallbacksC5392m w02 = getChildFragmentManager().w0();
        C9011c c9011c = w02 instanceof C9011c ? (C9011c) w02 : null;
        if (c9011c != null && (screenFlowTag = c9011c.getScreenFlowTag()) != null) {
            return screenFlowTag;
        }
        InterfaceC9014f.f81797k0.getClass();
        return InterfaceC9014f.a.a();
    }

    @NotNull
    public final String miniAppName() {
        if (this.miniAppName.length() > 0) {
            return this.miniAppName;
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("mini_app_param") : null;
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("value for mini_app_param not found in arguments");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if ((requestCode >> 16) != 0) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        ComponentCallbacksC5392m w02 = getChildFragmentManager().w0();
        if (w02 != null) {
            w02.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = C8475a.f76670r.get();
        C8475a c8475a = obj instanceof C8475a ? (C8475a) obj : null;
        if (c8475a == null) {
            throw new IllegalStateException("Can't get OzonCompass. Call 'OzonCompass#init' before 'get'");
        }
        this.holder = c8475a.o();
        this.router = c8475a.q();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.miniAppName = miniAppName();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("ru.ozon.compass.ARG_REDIRECT_DEEPLINK") : null;
        G fragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager, "getChildFragmentManager(...)");
        int i11 = this.fragmentContainerId;
        String miniApp = this.miniAppName;
        g rootFactory = new g(this, string);
        c.b transitionAnimations = new c.b(0, 0, R.anim.pop_exit_mini_app_animation, 7, 0);
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(miniApp, "miniApp");
        Intrinsics.checkNotNullParameter(rootFactory, "rootFactory");
        Intrinsics.checkNotNullParameter(transitionAnimations, "transitionAnimations");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.navigator = new i(requireActivity, fragmentManager, this, i11, miniApp, rootFactory, transitionAnimations);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(requireContext);
        fragmentContainerView.setId(this.fragmentContainerId);
        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EZ.h hVar = this.holder;
        if (hVar == null) {
            Intrinsics.n("holder");
            throw null;
        }
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        i iVar = this.navigator;
        if (iVar != null) {
            yZ.h.b(hVar, viewLifecycleOwner, iVar);
        } else {
            Intrinsics.n("navigator");
            throw null;
        }
    }
}
