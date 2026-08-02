package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class BetViewBinding implements ViewBinding {
    public final TextView betCoef;
    public final TextView betName;
    public final View divider;
    public final ProgressBar loadingIndicator;
    public final View loadingOverlay;
    public final ImageView lockIcon;
    private final ConstraintLayout rootView;

    private BetViewBinding(ConstraintLayout rootView, TextView betCoef, TextView betName, View divider, ProgressBar loadingIndicator, View loadingOverlay, ImageView lockIcon) {
        this.rootView = rootView;
        this.betCoef = betCoef;
        this.betName = betName;
        this.divider = divider;
        this.loadingIndicator = loadingIndicator;
        this.loadingOverlay = loadingOverlay;
        this.lockIcon = lockIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static BetViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static BetViewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.bet_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static BetViewBinding bind(View rootView) {
        int i = R.id.bet_coef;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_coef);
        if (textView != null) {
            i = R.id.bet_name;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_name);
            if (textView2 != null) {
                i = R.id.divider;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
                if (findChildViewById != null) {
                    i = R.id.loading_indicator;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.loading_indicator);
                    if (progressBar != null) {
                        i = R.id.loading_overlay;
                        View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.loading_overlay);
                        if (findChildViewById2 != null) {
                            i = R.id.lock_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lock_icon);
                            if (imageView != null) {
                                return new BetViewBinding((ConstraintLayout) rootView, textView, textView2, findChildViewById, progressBar, findChildViewById2, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
