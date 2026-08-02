package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class LeaderboardInfoDialog_ViewBinding implements Unbinder {
    private LeaderboardInfoDialog target;
    private View view7f0a0524;

    public LeaderboardInfoDialog_ViewBinding(LeaderboardInfoDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public LeaderboardInfoDialog_ViewBinding(final LeaderboardInfoDialog target, View source) {
        this.target = target;
        target.desc = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'desc'", TextView.class);
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
        target.investment = (TextView) Utils.findRequiredViewAsType(source, R.id.investment, "field 'investment'", TextView.class);
        target.theMore = (TextView) Utils.findRequiredViewAsType(source, R.id.theMore, "field 'theMore'", TextView.class);
        target.question = (TextView) Utils.findRequiredViewAsType(source, R.id.question, "field 'question'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.LeaderboardInfoDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick(p0);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        LeaderboardInfoDialog leaderboardInfoDialog = this.target;
        if (leaderboardInfoDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        leaderboardInfoDialog.desc = null;
        leaderboardInfoDialog.title = null;
        leaderboardInfoDialog.investment = null;
        leaderboardInfoDialog.theMore = null;
        leaderboardInfoDialog.question = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
