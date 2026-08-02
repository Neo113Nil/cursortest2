package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* loaded from: classes10.dex */
public final class T3 extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f30010a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f30011b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f30012c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f30013d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f30014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f30010a = (AppCompatImageView) itemView.findViewById(R.id.spay_aciv_bullet_background);
        this.f30011b = (AppCompatImageView) itemView.findViewById(R.id.spay_aciv_bullet);
        this.f30012c = (AppCompatTextView) itemView.findViewById(R.id.spay_actv_write_off_date);
        this.f30013d = (AppCompatTextView) itemView.findViewById(R.id.spay_actv_amount);
        this.f30014e = (AppCompatImageView) itemView.findViewById(R.id.spay_incl_bottom_divider);
        itemView.getResources();
    }
}
