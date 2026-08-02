package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class FragmentChallengesListBinding implements ViewBinding {
    public final AlphaPressButton createBattleButton;
    public final RecyclerView list;
    public final TextView noChallenges;
    public final ProgressBar progress;
    public final RelativeLayout progressBar;
    private final ConstraintLayout rootView;
    public final SwipeRefreshLayout swipeRefreshLayout;
    public final LinearLayout tutorButton;

    private FragmentChallengesListBinding(ConstraintLayout rootView, AlphaPressButton createBattleButton, RecyclerView list, TextView noChallenges, ProgressBar progress, RelativeLayout progressBar, SwipeRefreshLayout swipeRefreshLayout, LinearLayout tutorButton) {
        this.rootView = rootView;
        this.createBattleButton = createBattleButton;
        this.list = list;
        this.noChallenges = noChallenges;
        this.progress = progress;
        this.progressBar = progressBar;
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.tutorButton = tutorButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChallengesListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentChallengesListBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_challenges_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentChallengesListBinding bind(View rootView) {
        int i = R.id.create_battle_button;
        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.create_battle_button);
        if (alphaPressButton != null) {
            i = R.id.list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
            if (recyclerView != null) {
                i = R.id.no_challenges;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.no_challenges);
                if (textView != null) {
                    i = R.id.progress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                    if (progressBar != null) {
                        i = R.id.progressBar;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                        if (relativeLayout != null) {
                            i = R.id.swipeRefreshLayout;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipeRefreshLayout);
                            if (swipeRefreshLayout != null) {
                                i = R.id.tutor_button;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.tutor_button);
                                if (linearLayout != null) {
                                    return new FragmentChallengesListBinding((ConstraintLayout) rootView, alphaPressButton, recyclerView, textView, progressBar, relativeLayout, swipeRefreshLayout, linearLayout);
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
