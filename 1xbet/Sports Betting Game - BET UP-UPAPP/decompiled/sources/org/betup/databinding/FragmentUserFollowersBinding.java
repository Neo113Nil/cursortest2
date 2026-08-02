package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentUserFollowersBinding implements ViewBinding {
    public final RecyclerView followersList;
    public final TextView noFollowersMessage;
    public final FrameLayout progress;
    private final ConstraintLayout rootView;

    private FragmentUserFollowersBinding(ConstraintLayout rootView, RecyclerView followersList, TextView noFollowersMessage, FrameLayout progress) {
        this.rootView = rootView;
        this.followersList = followersList;
        this.noFollowersMessage = noFollowersMessage;
        this.progress = progress;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUserFollowersBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentUserFollowersBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_user_followers, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentUserFollowersBinding bind(View rootView) {
        int i = R.id.followersList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.followersList);
        if (recyclerView != null) {
            i = R.id.noFollowersMessage;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.noFollowersMessage);
            if (textView != null) {
                i = R.id.progress;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progress);
                if (frameLayout != null) {
                    return new FragmentUserFollowersBinding((ConstraintLayout) rootView, recyclerView, textView, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
