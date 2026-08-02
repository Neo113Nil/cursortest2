package org.betup.ui.fragment.shop.promo;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public class PromoFragment_ViewBinding implements Unbinder {
    private PromoFragment target;

    public PromoFragment_ViewBinding(PromoFragment target, View source) {
        this.target = target;
        target.list = (RecyclerView) Utils.findRequiredViewAsType(source, R.id.list, "field 'list'", RecyclerView.class);
        target.balance = (TextView) Utils.findRequiredViewAsType(source, R.id.balance, "field 'balance'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PromoFragment promoFragment = this.target;
        if (promoFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        promoFragment.list = null;
        promoFragment.balance = null;
    }
}
