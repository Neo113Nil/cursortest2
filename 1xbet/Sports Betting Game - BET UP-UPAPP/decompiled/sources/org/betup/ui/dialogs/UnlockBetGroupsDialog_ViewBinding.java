package org.betup.ui.dialogs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class UnlockBetGroupsDialog_ViewBinding implements Unbinder {
    private UnlockBetGroupsDialog target;
    private View view7f0a01ac;
    private View view7f0a0283;
    private View view7f0a07d5;

    public UnlockBetGroupsDialog_ViewBinding(UnlockBetGroupsDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public UnlockBetGroupsDialog_ViewBinding(final UnlockBetGroupsDialog target, View source) {
        this.target = target;
        target.bonusText = (TextView) Utils.findRequiredViewAsType(source, R.id.bonusText, "field 'bonusText'", TextView.class);
        target.tickets = (TextView) Utils.findRequiredViewAsType(source, R.id.price, "field 'tickets'", TextView.class);
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.watchVideo, "field 'watchVideoButton' and method 'onWatchVideoClicked'");
        target.watchVideoButton = findRequiredView;
        this.view7f0a07d5 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.UnlockBetGroupsDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onWatchVideoClicked();
            }
        });
        target.videoIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.videoIcon, "field 'videoIcon'", ImageView.class);
        target.or = Utils.findRequiredView(source, R.id.or, "field 'or'");
        View findRequiredView2 = Utils.findRequiredView(source, R.id.exchange, "method 'onOkClick'");
        this.view7f0a0283 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.UnlockBetGroupsDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(source, R.id.close, "method 'onCloseButtonClick'");
        this.view7f0a01ac = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.UnlockBetGroupsDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onCloseButtonClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        UnlockBetGroupsDialog unlockBetGroupsDialog = this.target;
        if (unlockBetGroupsDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        unlockBetGroupsDialog.bonusText = null;
        unlockBetGroupsDialog.tickets = null;
        unlockBetGroupsDialog.title = null;
        unlockBetGroupsDialog.watchVideoButton = null;
        unlockBetGroupsDialog.videoIcon = null;
        unlockBetGroupsDialog.or = null;
        this.view7f0a07d5.setOnClickListener(null);
        this.view7f0a07d5 = null;
        this.view7f0a0283.setOnClickListener(null);
        this.view7f0a0283 = null;
        this.view7f0a01ac.setOnClickListener(null);
        this.view7f0a01ac = null;
    }
}
