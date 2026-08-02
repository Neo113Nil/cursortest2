package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentStandingsSecondPageBinding implements ViewBinding {
    public final ImageView fragmentStandingsSecondPageAwayTeamIcon;
    public final TextView fragmentStandingsSecondPageAwayTeamName;
    public final ImageView fragmentStandingsSecondPageHomeTeamIcon;
    public final TextView fragmentStandingsSecondPageHomeTeamName;
    public final ListView fragmentStandingsSecondPageListview;
    public final ProgressBar progressBar2;
    private final LinearLayout rootView;

    private FragmentStandingsSecondPageBinding(LinearLayout rootView, ImageView fragmentStandingsSecondPageAwayTeamIcon, TextView fragmentStandingsSecondPageAwayTeamName, ImageView fragmentStandingsSecondPageHomeTeamIcon, TextView fragmentStandingsSecondPageHomeTeamName, ListView fragmentStandingsSecondPageListview, ProgressBar progressBar2) {
        this.rootView = rootView;
        this.fragmentStandingsSecondPageAwayTeamIcon = fragmentStandingsSecondPageAwayTeamIcon;
        this.fragmentStandingsSecondPageAwayTeamName = fragmentStandingsSecondPageAwayTeamName;
        this.fragmentStandingsSecondPageHomeTeamIcon = fragmentStandingsSecondPageHomeTeamIcon;
        this.fragmentStandingsSecondPageHomeTeamName = fragmentStandingsSecondPageHomeTeamName;
        this.fragmentStandingsSecondPageListview = fragmentStandingsSecondPageListview;
        this.progressBar2 = progressBar2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentStandingsSecondPageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentStandingsSecondPageBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_standings_second_page, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentStandingsSecondPageBinding bind(View rootView) {
        int i = R.id.fragmentStandingsSecondPageAwayTeamIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fragmentStandingsSecondPageAwayTeamIcon);
        if (imageView != null) {
            i = R.id.fragmentStandingsSecondPageAwayTeamName;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.fragmentStandingsSecondPageAwayTeamName);
            if (textView != null) {
                i = R.id.fragmentStandingsSecondPageHomeTeamIcon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fragmentStandingsSecondPageHomeTeamIcon);
                if (imageView2 != null) {
                    i = R.id.fragmentStandingsSecondPageHomeTeamName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fragmentStandingsSecondPageHomeTeamName);
                    if (textView2 != null) {
                        i = R.id.fragmentStandingsSecondPageListview;
                        ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.fragmentStandingsSecondPageListview);
                        if (listView != null) {
                            i = R.id.progressBar2;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar2);
                            if (progressBar != null) {
                                return new FragmentStandingsSecondPageBinding((LinearLayout) rootView, imageView, textView, imageView2, textView2, listView, progressBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
