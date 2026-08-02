package Ve;

import B1.C2548q;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.u5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4665u5 extends AbstractC4724w7 {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC7737t f32181b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4665u5(Jd hintsItemDiffUtilCallback, Function1 hintCloseActionListener) {
        super(hintCloseActionListener, hintsItemDiffUtilCallback);
        Intrinsics.checkNotNullParameter(hintsItemDiffUtilCallback, "hintsItemDiffUtilCallback");
        Intrinsics.checkNotNullParameter(hintCloseActionListener, "hintCloseActionListener");
        this.f32181b = (AbstractC7737t) hintCloseActionListener;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i11) {
        View inflate = C4636t5.a(viewGroup, "parent").inflate(R.layout.spay_rv_item_hint_helper, viewGroup, false);
        int i12 = R.id.spay_srihh_aciv_dismiss_hint;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i12, inflate);
        if (appCompatImageView != null) {
            i12 = R.id.spay_srihh_actv_dash;
            if (((SPayTextView) C2548q.d(i12, inflate)) != null) {
                i12 = R.id.spay_srihh_actv_hint;
                SPayTextView sPayTextView = (SPayTextView) C2548q.d(i12, inflate);
                if (sPayTextView != null) {
                    Ee ee2 = new Ee((ConstraintLayout) inflate, appCompatImageView, sPayTextView);
                    Intrinsics.checkNotNullExpressionValue(ee2, "inflate(LayoutInflater.f….context), parent, false)");
                    return new C4240fd(ee2, this.f32181b);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
    }
}
