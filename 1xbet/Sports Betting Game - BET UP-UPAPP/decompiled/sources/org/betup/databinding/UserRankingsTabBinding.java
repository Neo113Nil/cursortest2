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
import org.betup.ui.fragment.home.views.MyNestedScrollView;

/* loaded from: classes2.dex */
public final class UserRankingsTabBinding implements ViewBinding {
    public final RelativeLayout container;
    public final LinearLayout daily;
    public final TextView labelDaily;
    public final TextView labelMonthly;
    public final TextView labelWeekly;
    public final LinearLayout monthly;
    public final ProgressBar progress;
    private final MyNestedScrollView rootView;
    public final LinearLayout weekly;

    private UserRankingsTabBinding(MyNestedScrollView rootView, RelativeLayout container, LinearLayout daily, TextView labelDaily, TextView labelMonthly, TextView labelWeekly, LinearLayout monthly, ProgressBar progress, LinearLayout weekly) {
        this.rootView = rootView;
        this.container = container;
        this.daily = daily;
        this.labelDaily = labelDaily;
        this.labelMonthly = labelMonthly;
        this.labelWeekly = labelWeekly;
        this.monthly = monthly;
        this.progress = progress;
        this.weekly = weekly;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MyNestedScrollView getRoot() {
        return this.rootView;
    }

    public static UserRankingsTabBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static UserRankingsTabBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.user_rankings_tab, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static UserRankingsTabBinding bind(View rootView) {
        int i = R.id.container;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.container);
        if (relativeLayout != null) {
            i = R.id.daily;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.daily);
            if (linearLayout != null) {
                i = R.id.labelDaily;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.labelDaily);
                if (textView != null) {
                    i = R.id.labelMonthly;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.labelMonthly);
                    if (textView2 != null) {
                        i = R.id.labelWeekly;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.labelWeekly);
                        if (textView3 != null) {
                            i = R.id.monthly;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.monthly);
                            if (linearLayout2 != null) {
                                i = R.id.progress;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                if (progressBar != null) {
                                    i = R.id.weekly;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.weekly);
                                    if (linearLayout3 != null) {
                                        return new UserRankingsTabBinding((MyNestedScrollView) rootView, relativeLayout, linearLayout, textView, textView2, textView3, linearLayout2, progressBar, linearLayout3);
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
