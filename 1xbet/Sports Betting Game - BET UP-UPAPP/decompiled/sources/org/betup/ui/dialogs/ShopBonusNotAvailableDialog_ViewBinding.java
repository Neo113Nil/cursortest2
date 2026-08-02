package org.betup.ui.dialogs;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class ShopBonusNotAvailableDialog_ViewBinding implements Unbinder {
    private ShopBonusNotAvailableDialog target;
    private View view7f0a0524;

    public ShopBonusNotAvailableDialog_ViewBinding(ShopBonusNotAvailableDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public ShopBonusNotAvailableDialog_ViewBinding(final ShopBonusNotAvailableDialog target, View source) {
        this.target = target;
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.ShopBonusNotAvailableDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        if (this.target == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
