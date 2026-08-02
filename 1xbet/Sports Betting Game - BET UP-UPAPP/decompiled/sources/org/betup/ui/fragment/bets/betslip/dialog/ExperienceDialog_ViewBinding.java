package org.betup.ui.fragment.bets.betslip.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public class ExperienceDialog_ViewBinding implements Unbinder {
    private ExperienceDialog target;
    private View view7f0a0524;

    public ExperienceDialog_ViewBinding(ExperienceDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public ExperienceDialog_ViewBinding(final ExperienceDialog target, View source) {
        this.target = target;
        target.msg = (TextView) Utils.findRequiredViewAsType(source, R.id.msg, "field 'msg'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.bets.betslip.dialog.ExperienceDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ExperienceDialog experienceDialog = this.target;
        if (experienceDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        experienceDialog.msg = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
