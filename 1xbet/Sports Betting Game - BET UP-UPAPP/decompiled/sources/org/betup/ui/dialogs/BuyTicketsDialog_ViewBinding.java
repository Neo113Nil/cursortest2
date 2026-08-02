package org.betup.ui.dialogs;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class BuyTicketsDialog_ViewBinding implements Unbinder {
    private BuyTicketsDialog target;
    private View view7f0a01ac;
    private View view7f0a0524;

    public BuyTicketsDialog_ViewBinding(BuyTicketsDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public BuyTicketsDialog_ViewBinding(final BuyTicketsDialog target, View source) {
        this.target = target;
        View findRequiredView = Utils.findRequiredView(source, R.id.close, "method 'onCloseClick'");
        this.view7f0a01ac = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.BuyTicketsDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onCloseClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.BuyTicketsDialog_ViewBinding.2
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
        this.view7f0a01ac.setOnClickListener(null);
        this.view7f0a01ac = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
