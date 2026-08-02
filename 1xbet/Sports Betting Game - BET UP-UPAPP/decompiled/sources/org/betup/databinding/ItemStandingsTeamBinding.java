package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemStandingsTeamBinding implements ViewBinding {
    public final TextView draw;
    public final TextView fA;
    public final ImageView icon;
    public final TextView lost;
    public final TextView played;
    public final TextView position;
    public final TextView pts;
    private final LinearLayout rootView;
    public final TextView team;
    public final TextView won;

    private ItemStandingsTeamBinding(LinearLayout rootView, TextView draw, TextView fA, ImageView icon, TextView lost, TextView played, TextView position, TextView pts, TextView team, TextView won) {
        this.rootView = rootView;
        this.draw = draw;
        this.fA = fA;
        this.icon = icon;
        this.lost = lost;
        this.played = played;
        this.position = position;
        this.pts = pts;
        this.team = team;
        this.won = won;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemStandingsTeamBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemStandingsTeamBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_standings_team, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemStandingsTeamBinding bind(View rootView) {
        int i = R.id.draw;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.draw);
        if (textView != null) {
            i = R.id.f_a;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.f_a);
            if (textView2 != null) {
                i = R.id.icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                if (imageView != null) {
                    i = R.id.lost;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.lost);
                    if (textView3 != null) {
                        i = R.id.played;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.played);
                        if (textView4 != null) {
                            i = R.id.position;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.position);
                            if (textView5 != null) {
                                i = R.id.pts;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pts);
                                if (textView6 != null) {
                                    i = R.id.team;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.team);
                                    if (textView7 != null) {
                                        i = R.id.won;
                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.won);
                                        if (textView8 != null) {
                                            return new ItemStandingsTeamBinding((LinearLayout) rootView, textView, textView2, imageView, textView3, textView4, textView5, textView6, textView7, textView8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
