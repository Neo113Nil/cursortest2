package org.betup.ui.dialogs.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class MissionCompletedDialog_ViewBinding implements Unbinder {
    private MissionCompletedDialog target;
    private View view7f0a0524;

    public MissionCompletedDialog_ViewBinding(MissionCompletedDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public MissionCompletedDialog_ViewBinding(final MissionCompletedDialog target, View source) {
        this.target = target;
        target.betcoins = (TextView) Utils.findRequiredViewAsType(source, R.id.balance, "field 'betcoins'", TextView.class);
        target.betcoinIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.betcoin, "field 'betcoinIcon'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.adapter.MissionCompletedDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        MissionCompletedDialog missionCompletedDialog = this.target;
        if (missionCompletedDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        missionCompletedDialog.betcoins = null;
        missionCompletedDialog.betcoinIcon = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
