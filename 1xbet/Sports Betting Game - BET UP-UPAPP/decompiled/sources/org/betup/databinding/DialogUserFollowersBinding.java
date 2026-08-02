package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogUserFollowersBinding implements ViewBinding {
    public final View closeButton;
    public final FrameLayout container;
    public final TextView header;
    private final ConstraintLayout rootView;

    private DialogUserFollowersBinding(ConstraintLayout rootView, View closeButton, FrameLayout container, TextView header) {
        this.rootView = rootView;
        this.closeButton = closeButton;
        this.container = container;
        this.header = header;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogUserFollowersBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogUserFollowersBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_user_followers, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogUserFollowersBinding bind(View rootView) {
        int i = R.id.closeButton;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.closeButton);
        if (findChildViewById != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.container);
            if (frameLayout != null) {
                i = R.id.header;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.header);
                if (textView != null) {
                    return new DialogUserFollowersBinding((ConstraintLayout) rootView, findChildViewById, frameLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
