package Ve;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.kd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C4384kd extends C7735q implements InterfaceC6511n {

    /* renamed from: a, reason: collision with root package name */
    public static final C4384kd f31437a = new C4384kd(3, Cif.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lspay/sdk/databinding/SpayRvItemOrderAmountBinding;", 0);

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(p02, "p0");
        View inflate = p02.inflate(R.layout.spay_rv_item_order_amount, viewGroup, false);
        if (booleanValue) {
            viewGroup.addView(inflate);
        }
        int i11 = R.id.spay_slo_tv_amount;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView != null) {
            i11 = R.id.spay_slo_tv_old_amount;
            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i11, inflate);
            if (sPayTextView2 != null) {
                return new Cif((ConstraintLayout) inflate, sPayTextView, sPayTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }
}
