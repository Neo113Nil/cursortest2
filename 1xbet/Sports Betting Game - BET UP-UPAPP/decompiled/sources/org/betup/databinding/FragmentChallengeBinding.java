package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentChallengeBinding implements ViewBinding {
    public final ComposeView composeTabBar;
    public final ViewPager pager;
    private final ConstraintLayout rootView;

    private FragmentChallengeBinding(ConstraintLayout rootView, ComposeView composeTabBar, ViewPager pager) {
        this.rootView = rootView;
        this.composeTabBar = composeTabBar;
        this.pager = pager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChallengeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentChallengeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_challenge, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentChallengeBinding bind(View rootView) {
        int i = R.id.compose_tab_bar;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.compose_tab_bar);
        if (composeView != null) {
            i = R.id.pager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
            if (viewPager != null) {
                return new FragmentChallengeBinding((ConstraintLayout) rootView, composeView, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
