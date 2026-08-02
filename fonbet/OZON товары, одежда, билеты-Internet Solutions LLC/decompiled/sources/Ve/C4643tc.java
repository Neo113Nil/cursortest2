package Ve;

import B1.C2548q;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* renamed from: Ve.tc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4643tc extends AbstractC4724w7 {
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i11) {
        View inflate = C4636t5.a(viewGroup, "parent").inflate(R.layout.spay_rv_item_bnpl_graph_section, viewGroup, false);
        int i12 = R.id.spay_sribgs_section;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i12, inflate);
        if (appCompatImageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
        }
        C4325ib c4325ib = new C4325ib((FrameLayout) inflate, appCompatImageView);
        Intrinsics.checkNotNullExpressionValue(c4325ib, "inflate(\n            Lay…          false\n        )");
        return new C4212ee(c4325ib);
    }
}
