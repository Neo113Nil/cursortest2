package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.OvalFloatingButton;

/* loaded from: classes2.dex */
public final class FragmentScoresBinding implements ViewBinding {
    public final ImageView cancel;
    public final OvalFloatingButton fabNew;
    public final RecyclerView listView;
    public final FrameLayout progressBar;
    private final RelativeLayout rootView;
    public final EditText search;
    public final RelativeLayout searchContainer;

    private FragmentScoresBinding(RelativeLayout rootView, ImageView cancel, OvalFloatingButton fabNew, RecyclerView listView, FrameLayout progressBar, EditText search, RelativeLayout searchContainer) {
        this.rootView = rootView;
        this.cancel = cancel;
        this.fabNew = fabNew;
        this.listView = listView;
        this.progressBar = progressBar;
        this.search = search;
        this.searchContainer = searchContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentScoresBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentScoresBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_scores, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentScoresBinding bind(View rootView) {
        int i = R.id.cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (imageView != null) {
            i = R.id.fab_new;
            OvalFloatingButton ovalFloatingButton = (OvalFloatingButton) ViewBindings.findChildViewById(rootView, R.id.fab_new);
            if (ovalFloatingButton != null) {
                i = R.id.listView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.listView);
                if (recyclerView != null) {
                    i = R.id.progressBar;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                    if (frameLayout != null) {
                        i = R.id.search;
                        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.search);
                        if (editText != null) {
                            i = R.id.searchContainer;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.searchContainer);
                            if (relativeLayout != null) {
                                return new FragmentScoresBinding((RelativeLayout) rootView, imageView, ovalFloatingButton, recyclerView, frameLayout, editText, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
