package Ve;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.m6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C4435m6 extends C7735q implements InterfaceC6511n {

    /* renamed from: a, reason: collision with root package name */
    public static final C4435m6 f31567a = new C4435m6(3, C4730wd.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lspay/sdk/databinding/SpayRvItemCardSelectionHeaderBinding;", 0);

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(p02, "p0");
        View inflate = p02.inflate(R.layout.spay_rv_item_card_selection_header, viewGroup, false);
        if (booleanValue) {
            viewGroup.addView(inflate);
        }
        int i11 = R.id.spay_sricsh_actv_header_not_enough_money;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i11, inflate);
        if (sPayTextView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate;
        return new C4730wd(linearLayoutCompat, sPayTextView, linearLayoutCompat);
    }
}
