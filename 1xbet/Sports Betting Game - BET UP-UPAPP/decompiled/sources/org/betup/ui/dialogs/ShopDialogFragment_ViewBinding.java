package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class ShopDialogFragment_ViewBinding implements Unbinder {
    private ShopDialogFragment target;
    private View view7f0a01ac;

    public ShopDialogFragment_ViewBinding(final ShopDialogFragment target, View source) {
        this.target = target;
        target.pager = (ViewPager) Utils.findRequiredViewAsType(source, R.id.pager, "field 'pager'", ViewPager.class);
        target.betcoins = (TextView) Utils.findRequiredViewAsType(source, R.id.betcoins, "field 'betcoins'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.close, "method 'onBackClick'");
        this.view7f0a01ac = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.ShopDialogFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onBackClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ShopDialogFragment shopDialogFragment = this.target;
        if (shopDialogFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        shopDialogFragment.pager = null;
        shopDialogFragment.betcoins = null;
        this.view7f0a01ac.setOnClickListener(null);
        this.view7f0a01ac = null;
    }
}
