package org.betup.ui.dialogs;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class SpecialOfferDialog_ViewBinding implements Unbinder {
    private SpecialOfferDialog target;
    private View view7f0a01e7;
    private View view7f0a0368;

    public SpecialOfferDialog_ViewBinding(SpecialOfferDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public SpecialOfferDialog_ViewBinding(final SpecialOfferDialog target, View source) {
        this.target = target;
        View findRequiredView = Utils.findRequiredView(source, R.id.icon, "field 'icon' and method 'onIconClick'");
        target.icon = (ImageView) Utils.castView(findRequiredView, R.id.icon, "field 'icon'", ImageView.class);
        this.view7f0a0368 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.SpecialOfferDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onIconClick();
            }
        });
        target.progress = Utils.findRequiredView(source, R.id.progress, "field 'progress'");
        View findRequiredView2 = Utils.findRequiredView(source, R.id.container, "method 'onContainerClick'");
        this.view7f0a01e7 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.SpecialOfferDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onContainerClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SpecialOfferDialog specialOfferDialog = this.target;
        if (specialOfferDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        specialOfferDialog.icon = null;
        specialOfferDialog.progress = null;
        this.view7f0a0368.setOnClickListener(null);
        this.view7f0a0368 = null;
        this.view7f0a01e7.setOnClickListener(null);
        this.view7f0a01e7 = null;
    }
}
