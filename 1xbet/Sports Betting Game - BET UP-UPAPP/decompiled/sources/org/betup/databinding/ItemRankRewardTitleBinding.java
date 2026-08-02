package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import org.betup.R;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class ItemRankRewardTitleBinding implements ViewBinding {
    private final GradientTextView rootView;
    public final GradientTextView title;

    private ItemRankRewardTitleBinding(GradientTextView rootView, GradientTextView title) {
        this.rootView = rootView;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public GradientTextView getRoot() {
        return this.rootView;
    }

    public static ItemRankRewardTitleBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemRankRewardTitleBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_rank_reward_title, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemRankRewardTitleBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        GradientTextView gradientTextView = (GradientTextView) rootView;
        return new ItemRankRewardTitleBinding(gradientTextView, gradientTextView);
    }
}
