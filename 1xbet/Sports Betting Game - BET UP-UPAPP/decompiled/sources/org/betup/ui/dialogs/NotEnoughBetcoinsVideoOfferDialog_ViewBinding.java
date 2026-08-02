package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class NotEnoughBetcoinsVideoOfferDialog_ViewBinding implements Unbinder {
    private NotEnoughBetcoinsVideoOfferDialog target;
    private View view7f0a01ac;
    private View view7f0a0524;

    public NotEnoughBetcoinsVideoOfferDialog_ViewBinding(NotEnoughBetcoinsVideoOfferDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public NotEnoughBetcoinsVideoOfferDialog_ViewBinding(final NotEnoughBetcoinsVideoOfferDialog target, View source) {
        this.target = target;
        target.videoRewardAmount = (TextView) Utils.findRequiredViewAsType(source, R.id.videoRewardAmount, "field 'videoRewardAmount'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.close, "method 'onCloseClick'");
        this.view7f0a01ac = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onCloseClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        NotEnoughBetcoinsVideoOfferDialog notEnoughBetcoinsVideoOfferDialog = this.target;
        if (notEnoughBetcoinsVideoOfferDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        notEnoughBetcoinsVideoOfferDialog.videoRewardAmount = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
        this.view7f0a01ac.setOnClickListener(null);
        this.view7f0a01ac = null;
    }
}
