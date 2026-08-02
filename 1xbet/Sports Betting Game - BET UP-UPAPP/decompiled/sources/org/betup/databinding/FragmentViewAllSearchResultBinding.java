package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentViewAllSearchResultBinding implements ViewBinding {
    public final TextView backButton;
    public final RecyclerView list;
    public final LinearLayout navigationHeader;
    public final FrameLayout progressBar;
    private final ConstraintLayout rootView;
    public final TextView title;

    private FragmentViewAllSearchResultBinding(ConstraintLayout rootView, TextView backButton, RecyclerView list, LinearLayout navigationHeader, FrameLayout progressBar, TextView title) {
        this.rootView = rootView;
        this.backButton = backButton;
        this.list = list;
        this.navigationHeader = navigationHeader;
        this.progressBar = progressBar;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentViewAllSearchResultBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentViewAllSearchResultBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_view_all_search_result, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentViewAllSearchResultBinding bind(View rootView) {
        int i = R.id.back_button;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.back_button);
        if (textView != null) {
            i = R.id.list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
            if (recyclerView != null) {
                i = R.id.navigation_header;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.navigation_header);
                if (linearLayout != null) {
                    i = R.id.progress_bar;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                    if (frameLayout != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                        if (textView2 != null) {
                            return new FragmentViewAllSearchResultBinding((ConstraintLayout) rootView, textView, recyclerView, linearLayout, frameLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
