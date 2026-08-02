package Ve;

import Ve.Yk;
import X4.a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LVe/Bc;", "LVe/Yk;", "VM", "LX4/a;", "B", "Landroidx/fragment/app/m;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class Bc<VM extends Yk, B extends X4.a> extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    public Yk f28692a;

    /* renamed from: b, reason: collision with root package name */
    public X4.a f28693b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC4436m7 f28694c;

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        x();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type spay.sdk.RedirectActivity");
        if (((RedirectActivity) requireActivity).f98832a == null) {
            C10727i.c(androidx.lifecycle.K.a(this), null, null, new Yb(this, null), 3);
            return;
        }
        androidx.fragment.app.r requireActivity2 = requireActivity();
        Intrinsics.g(requireActivity2, "null cannot be cast to non-null type spay.sdk.RedirectActivity");
        Rq rq2 = ((RedirectActivity) requireActivity2).f98832a;
        if (rq2 == null) {
            Intrinsics.n("viewModelFactory");
            throw null;
        }
        Yk yk = (Yk) new androidx.lifecycle.z0(this, rq2).a(getF29732e());
        Intrinsics.checkNotNullParameter(yk, "<set-?>");
        this.f28692a = yk;
        u().d0(C4475nh.f31661a);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        X4.a t2 = t();
        this.f28693b = t2;
        if (t2 == null) {
            throw M7.f29463a;
        }
        View constraintLayout = t2.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        y();
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        if (this.f28692a == null) {
            requireActivity().finish();
        } else {
            u().d0(Ph.f29719a);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        u().d0(C4534pi.f31799a);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        u().d0(Qi.f29790a);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        u().d0(C4650tj.f32117a);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        super.onStop();
        u().d0(Vj.f30206a);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        X4.a aVar = this.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        androidx.core.view.Y.J(aVar.getConstraintLayout(), new TY.a());
        z();
        w();
    }

    public X4.a t() {
        return null;
    }

    public final Yk u() {
        Yk yk = this.f28692a;
        if (yk != null) {
            return yk;
        }
        Intrinsics.n("viewModel");
        throw null;
    }

    /* renamed from: v */
    public abstract Class getF29732e();

    public void w() {
    }

    public abstract void x();

    public void y() {
    }

    public void z() {
    }
}
