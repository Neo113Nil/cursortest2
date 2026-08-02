package Ve;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* renamed from: Ve.y4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4777y4 extends RecyclerView.g {

    /* renamed from: a, reason: collision with root package name */
    public final List f32534a;

    public C4777y4(List payments) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.f32534a = payments;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public final int getCardsCount() {
        return this.f32534a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C c11, int i11) {
        T3 holder = (T3) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C4287h2 c4287h2 = (C4287h2) this.f32534a.get(i11);
        AppCompatTextView appCompatTextView = holder.f30012c;
        Sr sr = c4287h2.f31134a;
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
        appCompatTextView.setText(E.f(sr, context));
        AppCompatTextView actvAmount = holder.f30013d;
        Intrinsics.checkNotNullExpressionValue(actvAmount, "actvAmount");
        int i12 = R.string.spay_rub_amount_template;
        Intrinsics.checkNotNullParameter(actvAmount, "<this>");
        Context context2 = actvAmount.getContext();
        String c12 = AbstractC4656tp.c(c4287h2.f31135b);
        String str = c4287h2.f31136c;
        if (str == null) {
            str = "";
        }
        actvAmount.setText(context2.getString(i12, c12, str));
        boolean z11 = c4287h2.f31137d;
        boolean z12 = c4287h2.f31138e;
        if (z11) {
            AppCompatTextView actvWriteOffDate = holder.f30012c;
            Intrinsics.checkNotNullExpressionValue(actvWriteOffDate, "actvWriteOffDate");
            actvWriteOffDate.setTextAppearance(R.style.SpayMainTextStyle);
            actvWriteOffDate.setTextSize(0, actvWriteOffDate.getResources().getDimension(R.dimen.spay_bnpl_graph_bold_text_size));
            actvWriteOffDate.setTypeface(actvWriteOffDate.getTypeface(), 1);
            Intrinsics.checkNotNullExpressionValue(actvAmount, "actvAmount");
            actvAmount.setTextAppearance(R.style.SpayMainTextStyle);
            actvAmount.setTextSize(0, actvAmount.getResources().getDimension(R.dimen.spay_bnpl_graph_bold_text_size));
            actvAmount.setTypeface(actvAmount.getTypeface(), 1);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            int i13 = R.color.spay_main_bank_green_color;
            Intrinsics.checkNotNullParameter(itemView, "<this>");
            holder.f30011b.setImageTintList(ColorStateList.valueOf(androidx.core.content.res.g.b(itemView.getResources(), i13, null)));
            AppCompatImageView acivBulletBackground = holder.f30010a;
            Intrinsics.checkNotNullExpressionValue(acivBulletBackground, "acivBulletBackground");
            acivBulletBackground.setVisibility(!z12 ? 0 : 8);
        }
        AppCompatImageView divider = holder.f30014e;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        divider.setVisibility(z12 ? 4 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.spay_payment_in_installments_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context)\n   …ents_item, parent, false)");
        return new T3(inflate);
    }
}
