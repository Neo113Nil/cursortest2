package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogBetBinding implements ViewBinding {
    public final ImageView backButton;
    public final View closeButton;
    public final TextView header;
    public final RecyclerView leagueList;
    public final RecyclerView matchList;
    public final FrameLayout progressBar;
    private final ConstraintLayout rootView;
    public final RecyclerView sportList;

    private DialogBetBinding(ConstraintLayout rootView, ImageView backButton, View closeButton, TextView header, RecyclerView leagueList, RecyclerView matchList, FrameLayout progressBar, RecyclerView sportList) {
        this.rootView = rootView;
        this.backButton = backButton;
        this.closeButton = closeButton;
        this.header = header;
        this.leagueList = leagueList;
        this.matchList = matchList;
        this.progressBar = progressBar;
        this.sportList = sportList;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogBetBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogBetBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_bet, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBetBinding bind(View rootView) {
        int i = R.id.backButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.backButton);
        if (imageView != null) {
            i = R.id.closeButton;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.closeButton);
            if (findChildViewById != null) {
                i = R.id.header;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.header);
                if (textView != null) {
                    i = R.id.leagueList;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.leagueList);
                    if (recyclerView != null) {
                        i = R.id.matchList;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.matchList);
                        if (recyclerView2 != null) {
                            i = R.id.progressBar;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                            if (frameLayout != null) {
                                i = R.id.sportList;
                                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.sportList);
                                if (recyclerView3 != null) {
                                    return new DialogBetBinding((ConstraintLayout) rootView, imageView, findChildViewById, textView, recyclerView, recyclerView2, frameLayout, recyclerView3);
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
