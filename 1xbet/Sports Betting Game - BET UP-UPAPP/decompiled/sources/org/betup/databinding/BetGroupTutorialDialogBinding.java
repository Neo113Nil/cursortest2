package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class BetGroupTutorialDialogBinding implements ViewBinding {
    public final TextView betGroupTutorialHintTv;
    public final RecyclerView betGroupTutorialRv;
    public final TextView betGroupTutorialTitleTv;
    public final ConstraintLayout dialogCl;
    private final ConstraintLayout rootView;
    public final ImageView swipeGestureIv;

    private BetGroupTutorialDialogBinding(ConstraintLayout rootView, TextView betGroupTutorialHintTv, RecyclerView betGroupTutorialRv, TextView betGroupTutorialTitleTv, ConstraintLayout dialogCl, ImageView swipeGestureIv) {
        this.rootView = rootView;
        this.betGroupTutorialHintTv = betGroupTutorialHintTv;
        this.betGroupTutorialRv = betGroupTutorialRv;
        this.betGroupTutorialTitleTv = betGroupTutorialTitleTv;
        this.dialogCl = dialogCl;
        this.swipeGestureIv = swipeGestureIv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static BetGroupTutorialDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static BetGroupTutorialDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.bet_group_tutorial_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static BetGroupTutorialDialogBinding bind(View rootView) {
        int i = R.id.bet_group_tutorial_hint_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_group_tutorial_hint_tv);
        if (textView != null) {
            i = R.id.bet_group_tutorial_rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.bet_group_tutorial_rv);
            if (recyclerView != null) {
                i = R.id.bet_group_tutorial_title_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_group_tutorial_title_tv);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                    i = R.id.swipe_gesture_iv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.swipe_gesture_iv);
                    if (imageView != null) {
                        return new BetGroupTutorialDialogBinding(constraintLayout, textView, recyclerView, textView2, constraintLayout, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
