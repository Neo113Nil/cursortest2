package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class ItemAchievementsBinding implements ViewBinding {
    public final TextView achievementItemDescription;
    public final ImageView achievementItemIcon;
    public final TextView achievementItemName;
    public final GradientTextView achievementItemValue;
    public final LinearLayout header;
    public final ProgressBar progressBar;
    private final LinearLayout rootView;
    public final ImageView tick;
    public final AlphaPressButton valueContainer;

    private ItemAchievementsBinding(LinearLayout rootView, TextView achievementItemDescription, ImageView achievementItemIcon, TextView achievementItemName, GradientTextView achievementItemValue, LinearLayout header, ProgressBar progressBar, ImageView tick, AlphaPressButton valueContainer) {
        this.rootView = rootView;
        this.achievementItemDescription = achievementItemDescription;
        this.achievementItemIcon = achievementItemIcon;
        this.achievementItemName = achievementItemName;
        this.achievementItemValue = achievementItemValue;
        this.header = header;
        this.progressBar = progressBar;
        this.tick = tick;
        this.valueContainer = valueContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemAchievementsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemAchievementsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_achievements, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemAchievementsBinding bind(View rootView) {
        int i = R.id.achievementItemDescription;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.achievementItemDescription);
        if (textView != null) {
            i = R.id.achievementItemIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.achievementItemIcon);
            if (imageView != null) {
                i = R.id.achievementItemName;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.achievementItemName);
                if (textView2 != null) {
                    i = R.id.achievementItemValue;
                    GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.achievementItemValue);
                    if (gradientTextView != null) {
                        i = R.id.header;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                        if (linearLayout != null) {
                            i = R.id.progressBar;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                            if (progressBar != null) {
                                i = R.id.tick;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tick);
                                if (imageView2 != null) {
                                    i = R.id.valueContainer;
                                    AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.valueContainer);
                                    if (alphaPressButton != null) {
                                        return new ItemAchievementsBinding((LinearLayout) rootView, textView, imageView, textView2, gradientTextView, linearLayout, progressBar, imageView2, alphaPressButton);
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
