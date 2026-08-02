package org.betup.ui.dialogs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class MatchInfoDialog_ViewBinding implements Unbinder {
    private MatchInfoDialog target;

    public MatchInfoDialog_ViewBinding(MatchInfoDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public MatchInfoDialog_ViewBinding(MatchInfoDialog target, View source) {
        this.target = target;
        target.homeIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.homeIcon, "field 'homeIcon'", ImageView.class);
        target.awayIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.awayicon, "field 'awayIcon'", ImageView.class);
        target.homeTeam = (TextView) Utils.findRequiredViewAsType(source, R.id.homeTeam, "field 'homeTeam'", TextView.class);
        target.awayTeam = (TextView) Utils.findRequiredViewAsType(source, R.id.awayTeam, "field 'awayTeam'", TextView.class);
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.subtitle, "field 'title'", TextView.class);
        target.desc = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'desc'", TextView.class);
        target.firstButton = (TextView) Utils.findRequiredViewAsType(source, R.id.ok, "field 'firstButton'", TextView.class);
        target.secondButton = (TextView) Utils.findRequiredViewAsType(source, R.id.secondButton, "field 'secondButton'", TextView.class);
        target.score = (TextView) Utils.findRequiredViewAsType(source, R.id.score, "field 'score'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        MatchInfoDialog matchInfoDialog = this.target;
        if (matchInfoDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        matchInfoDialog.homeIcon = null;
        matchInfoDialog.awayIcon = null;
        matchInfoDialog.homeTeam = null;
        matchInfoDialog.awayTeam = null;
        matchInfoDialog.title = null;
        matchInfoDialog.desc = null;
        matchInfoDialog.firstButton = null;
        matchInfoDialog.secondButton = null;
        matchInfoDialog.score = null;
    }
}
