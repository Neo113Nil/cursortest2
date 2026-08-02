package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;
import org.betup.ui.controls.SpriteImageButton;

/* loaded from: classes2.dex */
public class UnlockBetAmountDialog_ViewBinding implements Unbinder {
    private UnlockBetAmountDialog target;
    private View view7f0a01ac;
    private View view7f0a0283;

    public UnlockBetAmountDialog_ViewBinding(UnlockBetAmountDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public UnlockBetAmountDialog_ViewBinding(final UnlockBetAmountDialog target, View source) {
        this.target = target;
        target.bonusText = (TextView) Utils.findRequiredViewAsType(source, R.id.bonusText, "field 'bonusText'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.exchange, "field 'exchange' and method 'onOkClick'");
        target.exchange = (SpriteImageButton) Utils.castView(findRequiredView, R.id.exchange, "field 'exchange'", SpriteImageButton.class);
        this.view7f0a0283 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.UnlockBetAmountDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.close, "method 'onCloseButtonClick'");
        this.view7f0a01ac = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.UnlockBetAmountDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onCloseButtonClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        UnlockBetAmountDialog unlockBetAmountDialog = this.target;
        if (unlockBetAmountDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        unlockBetAmountDialog.bonusText = null;
        unlockBetAmountDialog.exchange = null;
        this.view7f0a0283.setOnClickListener(null);
        this.view7f0a0283 = null;
        this.view7f0a01ac.setOnClickListener(null);
        this.view7f0a01ac = null;
    }
}
