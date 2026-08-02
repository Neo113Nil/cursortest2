package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentLineupsTabBinding implements ViewBinding {
    public final LinearLayout field;
    public final LinearLayout lineupMissing;
    public final LinearLayout lineupStarting;
    public final LinearLayout lineupSubstitutions;
    public final ProgressBar progress;
    private final NestedScrollView rootView;

    private FragmentLineupsTabBinding(NestedScrollView rootView, LinearLayout field, LinearLayout lineupMissing, LinearLayout lineupStarting, LinearLayout lineupSubstitutions, ProgressBar progress) {
        this.rootView = rootView;
        this.field = field;
        this.lineupMissing = lineupMissing;
        this.lineupStarting = lineupStarting;
        this.lineupSubstitutions = lineupSubstitutions;
        this.progress = progress;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentLineupsTabBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentLineupsTabBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_lineups_tab, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLineupsTabBinding bind(View rootView) {
        int i = R.id.field;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.field);
        if (linearLayout != null) {
            i = R.id.lineup_missing;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lineup_missing);
            if (linearLayout2 != null) {
                i = R.id.lineup_starting;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lineup_starting);
                if (linearLayout3 != null) {
                    i = R.id.lineup_substitutions;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lineup_substitutions);
                    if (linearLayout4 != null) {
                        i = R.id.progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                        if (progressBar != null) {
                            return new FragmentLineupsTabBinding((NestedScrollView) rootView, linearLayout, linearLayout2, linearLayout3, linearLayout4, progressBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
