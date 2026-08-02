package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemMyBetsCompetitionGroupBinding implements ViewBinding {
    public final TextView buttonInPlay;
    public final TextView competitionName;
    public final TextView date;
    public final RelativeLayout itemMyBetsCompetitionGroup;
    private final RelativeLayout rootView;

    private ItemMyBetsCompetitionGroupBinding(RelativeLayout rootView, TextView buttonInPlay, TextView competitionName, TextView date, RelativeLayout itemMyBetsCompetitionGroup) {
        this.rootView = rootView;
        this.buttonInPlay = buttonInPlay;
        this.competitionName = competitionName;
        this.date = date;
        this.itemMyBetsCompetitionGroup = itemMyBetsCompetitionGroup;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemMyBetsCompetitionGroupBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMyBetsCompetitionGroupBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_my_bets_competition_group, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMyBetsCompetitionGroupBinding bind(View rootView) {
        int i = R.id.button_in_play;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_in_play);
        if (textView != null) {
            i = R.id.competition_name;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.competition_name);
            if (textView2 != null) {
                i = R.id.date;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
                if (textView3 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) rootView;
                    return new ItemMyBetsCompetitionGroupBinding(relativeLayout, textView, textView2, textView3, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
