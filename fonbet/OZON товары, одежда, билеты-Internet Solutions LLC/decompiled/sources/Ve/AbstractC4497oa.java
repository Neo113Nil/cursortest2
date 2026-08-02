package Ve;

import Ve.AbstractC4642tb;
import X4.a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5334o0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.RedirectActivity;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LVe/oa;", "LVe/tb;", "VM", "LX4/a;", "B", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.oa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4497oa<VM extends AbstractC4642tb, B extends X4.a> extends com.google.android.material.bottomsheet.b {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC4642tb f31714a;

    /* renamed from: b, reason: collision with root package name */
    public BottomSheetBehavior f31715b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31716c = 3;

    /* renamed from: d, reason: collision with root package name */
    public X4.a f31717d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4436m7 f31718e;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        v();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.SpayBaseBottomSheetDialog);
        if (getArguments() == null) {
            setArguments(new Bundle());
        }
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type spay.sdk.RedirectActivity");
        if (((RedirectActivity) requireActivity).f98832a == null) {
            C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4120b8(this, null), 3);
            return;
        }
        androidx.fragment.app.r requireActivity2 = requireActivity();
        Intrinsics.g(requireActivity2, "null cannot be cast to non-null type spay.sdk.RedirectActivity");
        Rq rq2 = ((RedirectActivity) requireActivity2).f98832a;
        if (rq2 == null) {
            Intrinsics.n("viewModelFactory");
            throw null;
        }
        AbstractC4642tb abstractC4642tb = (AbstractC4642tb) new androidx.lifecycle.z0(this, rq2).a(C4577r4.class);
        Intrinsics.checkNotNullParameter(abstractC4642tb, "<set-?>");
        this.f31714a = abstractC4642tb;
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        AbstractC4642tb u11 = u();
        E8 action = new E8(this);
        Intrinsics.checkNotNullParameter(action, "action");
        u11.f32097c = action;
        K9 action2 = new K9(this);
        Intrinsics.checkNotNullParameter(action2, "action");
        u11.f32098d = action2;
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        X4.a t2 = t();
        this.f31717d = t2;
        if (t2 == null) {
            throw M7.f29463a;
        }
        ConstraintLayout constraintLayout = ((Zd) t2).f30584a;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        w();
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        com.google.android.material.bottomsheet.a aVar = dialog instanceof com.google.android.material.bottomsheet.a ? (com.google.android.material.bottomsheet.a) dialog : null;
        this.f31715b = aVar != null ? aVar.getBehavior() : null;
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: Ve.ea
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    AbstractC4497oa this$0 = AbstractC4497oa.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    BottomSheetBehavior bottomSheetBehavior = this$0.f31715b;
                    if (bottomSheetBehavior == null) {
                        return;
                    }
                    bottomSheetBehavior.setState(this$0.f31716c);
                }
            });
            Window window = dialog2.getWindow();
            if (window != null) {
                C5334o0.a(window, false);
            }
        }
        x();
    }

    public X4.a t() {
        return null;
    }

    public final AbstractC4642tb u() {
        AbstractC4642tb abstractC4642tb = this.f31714a;
        if (abstractC4642tb != null) {
            return abstractC4642tb;
        }
        Intrinsics.n("viewModel");
        throw null;
    }

    public abstract void v();

    public void w() {
    }

    public void x() {
    }
}
