package Ve;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.CardLogoCompositeView;

/* loaded from: classes10.dex */
public final /* synthetic */ class L9 extends C7735q implements InterfaceC6511n {

    /* renamed from: a, reason: collision with root package name */
    public static final L9 f29395a = new L9(3, C4097ae.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lspay/sdk/databinding/SpayRvItemHelperBinding;", 0);

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(p02, "p0");
        View inflate = p02.inflate(R.layout.spay_rv_item_helper, viewGroup, false);
        if (booleanValue) {
            viewGroup.addView(inflate);
        }
        int i11 = R.id.spay_srih_aciv_helper_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, inflate);
        if (appCompatImageView != null) {
            i11 = R.id.spay_srih_actv_helper_content;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, inflate);
            if (appCompatTextView != null) {
                i11 = R.id.spay_srih_actv_helper_header;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, inflate);
                if (appCompatTextView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    i11 = R.id.spay_srih_clcv_helper_icon;
                    if (((CardLogoCompositeView) C2548q.d(i11, inflate)) != null) {
                        return new C4097ae(constraintLayout, appCompatImageView, appCompatTextView, appCompatTextView2, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }
}
