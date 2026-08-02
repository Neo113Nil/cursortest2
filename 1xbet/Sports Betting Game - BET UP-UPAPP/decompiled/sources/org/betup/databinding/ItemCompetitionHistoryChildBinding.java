package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemCompetitionHistoryChildBinding implements ViewBinding {
    public final LinearLayout containerCompetitionInfo;
    public final View middleDivider;
    public final TextView playersAmount;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final TextView slotNumber;

    private ItemCompetitionHistoryChildBinding(RelativeLayout rootView, LinearLayout containerCompetitionInfo, View middleDivider, TextView playersAmount, ProgressBar progressBar, TextView slotNumber) {
        this.rootView = rootView;
        this.containerCompetitionInfo = containerCompetitionInfo;
        this.middleDivider = middleDivider;
        this.playersAmount = playersAmount;
        this.progressBar = progressBar;
        this.slotNumber = slotNumber;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemCompetitionHistoryChildBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCompetitionHistoryChildBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_competition_history_child, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCompetitionHistoryChildBinding bind(View rootView) {
        int i = R.id.container_competition_info;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container_competition_info);
        if (linearLayout != null) {
            i = R.id.middle_divider;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.middle_divider);
            if (findChildViewById != null) {
                i = R.id.players_amount;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_amount);
                if (textView != null) {
                    i = R.id.progress_bar;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                    if (progressBar != null) {
                        i = R.id.slot_number;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.slot_number);
                        if (textView2 != null) {
                            return new ItemCompetitionHistoryChildBinding((RelativeLayout) rootView, linearLayout, findChildViewById, textView, progressBar, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
