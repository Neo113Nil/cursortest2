package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemCompetitionHistoryBinding implements ViewBinding {
    public final TextView buttonInPlay;
    public final TextView competitionName;
    public final TextView date;
    public final ConstraintLayout itemMyBetsCompetitionGroup;
    public final ImageView jackpotIcon;
    private final ConstraintLayout rootView;
    public final TextView time;

    private ItemCompetitionHistoryBinding(ConstraintLayout rootView, TextView buttonInPlay, TextView competitionName, TextView date, ConstraintLayout itemMyBetsCompetitionGroup, ImageView jackpotIcon, TextView time) {
        this.rootView = rootView;
        this.buttonInPlay = buttonInPlay;
        this.competitionName = competitionName;
        this.date = date;
        this.itemMyBetsCompetitionGroup = itemMyBetsCompetitionGroup;
        this.jackpotIcon = jackpotIcon;
        this.time = time;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCompetitionHistoryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCompetitionHistoryBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_competition_history, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCompetitionHistoryBinding bind(View rootView) {
        int i = R.id.button_in_play;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.button_in_play);
        if (textView != null) {
            i = R.id.competition_name;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.competition_name);
            if (textView2 != null) {
                i = R.id.date;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
                if (textView3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                    i = R.id.jackpotIcon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.jackpotIcon);
                    if (imageView != null) {
                        i = R.id.time;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.time);
                        if (textView4 != null) {
                            return new ItemCompetitionHistoryBinding(constraintLayout, textView, textView2, textView3, constraintLayout, imageView, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
