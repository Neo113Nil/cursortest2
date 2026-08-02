package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentMatchDetailsBinding implements ViewBinding {
    public final LinearLayout container;
    public final RecyclerView matchDetailsList;
    public final TextView noBets;
    public final ProgressBar progressBar3;
    private final LinearLayout rootView;

    private FragmentMatchDetailsBinding(LinearLayout rootView, LinearLayout container, RecyclerView matchDetailsList, TextView noBets, ProgressBar progressBar3) {
        this.rootView = rootView;
        this.container = container;
        this.matchDetailsList = matchDetailsList;
        this.noBets = noBets;
        this.progressBar3 = progressBar3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchDetailsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentMatchDetailsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_match_details, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMatchDetailsBinding bind(View rootView) {
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container);
        if (linearLayout != null) {
            i = R.id.matchDetailsList;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.matchDetailsList);
            if (recyclerView != null) {
                i = R.id.no_bets;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.no_bets);
                if (textView != null) {
                    i = R.id.progressBar3;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar3);
                    if (progressBar != null) {
                        return new FragmentMatchDetailsBinding((LinearLayout) rootView, linearLayout, recyclerView, textView, progressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
