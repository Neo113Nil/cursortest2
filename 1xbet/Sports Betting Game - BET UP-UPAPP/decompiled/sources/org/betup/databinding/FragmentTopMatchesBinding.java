package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentTopMatchesBinding implements ViewBinding {
    public final ImageView expandButton;
    public final FrameLayout expandContainer;
    public final LinearLayout expandRow;
    public final ImageView oneClickBetIv;
    private final RelativeLayout rootView;
    public final ComposeView tabBarCompose;
    public final ViewPager topMatchesPager;

    private FragmentTopMatchesBinding(RelativeLayout rootView, ImageView expandButton, FrameLayout expandContainer, LinearLayout expandRow, ImageView oneClickBetIv, ComposeView tabBarCompose, ViewPager topMatchesPager) {
        this.rootView = rootView;
        this.expandButton = expandButton;
        this.expandContainer = expandContainer;
        this.expandRow = expandRow;
        this.oneClickBetIv = oneClickBetIv;
        this.tabBarCompose = tabBarCompose;
        this.topMatchesPager = topMatchesPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTopMatchesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentTopMatchesBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_top_matches, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTopMatchesBinding bind(View rootView) {
        int i = R.id.expandButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.expandButton);
        if (imageView != null) {
            i = R.id.expandContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.expandContainer);
            if (frameLayout != null) {
                i = R.id.expandRow;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.expandRow);
                if (linearLayout != null) {
                    i = R.id.one_click_bet_iv;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.one_click_bet_iv);
                    if (imageView2 != null) {
                        i = R.id.tabBarCompose;
                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.tabBarCompose);
                        if (composeView != null) {
                            i = R.id.topMatchesPager;
                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.topMatchesPager);
                            if (viewPager != null) {
                                return new FragmentTopMatchesBinding((RelativeLayout) rootView, imageView, frameLayout, linearLayout, imageView2, composeView, viewPager);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
