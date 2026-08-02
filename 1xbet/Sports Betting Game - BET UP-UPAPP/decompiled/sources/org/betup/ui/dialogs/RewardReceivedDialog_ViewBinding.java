package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class RewardReceivedDialog_ViewBinding implements Unbinder {
    private RewardReceivedDialog target;
    private View view7f0a0524;

    public RewardReceivedDialog_ViewBinding(RewardReceivedDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public RewardReceivedDialog_ViewBinding(final RewardReceivedDialog target, View source) {
        this.target = target;
        target.multiplyBonusButton = Utils.findRequiredView(source, R.id.multiplyBonus, "field 'multiplyBonusButton'");
        target.desc = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'desc'", TextView.class);
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
        target.betcoins = (TextView) Utils.findRequiredViewAsType(source, R.id.balance, "field 'betcoins'", TextView.class);
        target.getDouble = Utils.findRequiredView(source, R.id.getDouble, "field 'getDouble'");
        target.multiplyBonusTitle = (TextView) Utils.findRequiredViewAsType(source, R.id.multiplyBonusTitle, "field 'multiplyBonusTitle'", TextView.class);
        target.multiplyBonusBetcoins = (TextView) Utils.findRequiredViewAsType(source, R.id.multiplyBetcoinsBonus, "field 'multiplyBonusBetcoins'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.RewardReceivedDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        RewardReceivedDialog rewardReceivedDialog = this.target;
        if (rewardReceivedDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        rewardReceivedDialog.multiplyBonusButton = null;
        rewardReceivedDialog.desc = null;
        rewardReceivedDialog.title = null;
        rewardReceivedDialog.betcoins = null;
        rewardReceivedDialog.getDouble = null;
        rewardReceivedDialog.multiplyBonusTitle = null;
        rewardReceivedDialog.multiplyBonusBetcoins = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
