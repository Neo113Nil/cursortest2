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
public final class ItemH2hTeamGameBinding implements ViewBinding {
    public final ImageView awayIcon;
    public final TextView awayTitle;
    public final ConstraintLayout container;
    public final TextView date;
    public final ImageView homeIcon;
    public final TextView homeTitle;
    private final ConstraintLayout rootView;
    public final TextView score;

    private ItemH2hTeamGameBinding(ConstraintLayout rootView, ImageView awayIcon, TextView awayTitle, ConstraintLayout container, TextView date, ImageView homeIcon, TextView homeTitle, TextView score) {
        this.rootView = rootView;
        this.awayIcon = awayIcon;
        this.awayTitle = awayTitle;
        this.container = container;
        this.date = date;
        this.homeIcon = homeIcon;
        this.homeTitle = homeTitle;
        this.score = score;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemH2hTeamGameBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemH2hTeamGameBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_h2h_team_game, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemH2hTeamGameBinding bind(View rootView) {
        int i = R.id.awayIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.awayIcon);
        if (imageView != null) {
            i = R.id.awayTitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.awayTitle);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                i = R.id.date;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
                if (textView2 != null) {
                    i = R.id.homeIcon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.homeIcon);
                    if (imageView2 != null) {
                        i = R.id.homeTitle;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.homeTitle);
                        if (textView3 != null) {
                            i = R.id.score;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.score);
                            if (textView4 != null) {
                                return new ItemH2hTeamGameBinding(constraintLayout, imageView, textView, constraintLayout, textView2, imageView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
