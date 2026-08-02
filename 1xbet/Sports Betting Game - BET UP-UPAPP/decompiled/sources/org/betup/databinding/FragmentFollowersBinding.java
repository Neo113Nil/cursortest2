package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import org.betup.R;
import org.betup.ui.views.PagerSlidingTabStrip;

/* loaded from: classes2.dex */
public final class FragmentFollowersBinding implements ViewBinding {
    public final View cleanButton;
    public final ViewPager pager;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final EditText search;
    public final PagerSlidingTabStrip tabs;
    public final RecyclerView userList;

    private FragmentFollowersBinding(ConstraintLayout rootView, View cleanButton, ViewPager pager, ProgressBar progress, EditText search, PagerSlidingTabStrip tabs, RecyclerView userList) {
        this.rootView = rootView;
        this.cleanButton = cleanButton;
        this.pager = pager;
        this.progress = progress;
        this.search = search;
        this.tabs = tabs;
        this.userList = userList;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFollowersBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentFollowersBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_followers, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFollowersBinding bind(View rootView) {
        int i = R.id.cleanButton;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.cleanButton);
        if (findChildViewById != null) {
            i = R.id.pager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
            if (viewPager != null) {
                i = R.id.progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                if (progressBar != null) {
                    i = R.id.search;
                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.search);
                    if (editText != null) {
                        i = R.id.tabs;
                        PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) ViewBindings.findChildViewById(rootView, R.id.tabs);
                        if (pagerSlidingTabStrip != null) {
                            i = R.id.userList;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.userList);
                            if (recyclerView != null) {
                                return new FragmentFollowersBinding((ConstraintLayout) rootView, findChildViewById, viewPager, progressBar, editText, pagerSlidingTabStrip, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
