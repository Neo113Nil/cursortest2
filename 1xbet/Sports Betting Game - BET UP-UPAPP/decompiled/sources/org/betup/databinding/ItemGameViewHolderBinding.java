package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class ItemGameViewHolderBinding implements ViewBinding {
    public final AppCompatImageView gameCover;
    public final AlphaPressButton gameIcon;
    public final TextView gameTitle;
    public final View gameTitleScrim;
    private final FrameLayout rootView;

    private ItemGameViewHolderBinding(FrameLayout rootView, AppCompatImageView gameCover, AlphaPressButton gameIcon, TextView gameTitle, View gameTitleScrim) {
        this.rootView = rootView;
        this.gameCover = gameCover;
        this.gameIcon = gameIcon;
        this.gameTitle = gameTitle;
        this.gameTitleScrim = gameTitleScrim;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemGameViewHolderBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemGameViewHolderBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_game_view_holder, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGameViewHolderBinding bind(View rootView) {
        int i = R.id.gameCover;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.gameCover);
        if (appCompatImageView != null) {
            i = R.id.gameIcon;
            AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.gameIcon);
            if (alphaPressButton != null) {
                i = R.id.gameTitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.gameTitle);
                if (textView != null) {
                    i = R.id.gameTitleScrim;
                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.gameTitleScrim);
                    if (findChildViewById != null) {
                        return new ItemGameViewHolderBinding((FrameLayout) rootView, appCompatImageView, alphaPressButton, textView, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
