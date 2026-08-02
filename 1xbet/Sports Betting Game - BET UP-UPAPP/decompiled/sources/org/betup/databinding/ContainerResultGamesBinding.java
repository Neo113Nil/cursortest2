package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class ContainerResultGamesBinding implements ViewBinding {
    public final ImageView betcoinLabel;
    public final TextView betcoins;
    public final TextView gameResultTitle;
    public final LinearLayout resultDetailsContainer;
    public final View rightMargin;
    private final ConstraintLayout rootView;
    public final ImageView videoIcon;
    public final AlphaPressButton videoOffer;
    public final TextView videoRewardAmount;
    public final ConstraintLayout wonMoneyAmountContainer;

    private ContainerResultGamesBinding(ConstraintLayout rootView, ImageView betcoinLabel, TextView betcoins, TextView gameResultTitle, LinearLayout resultDetailsContainer, View rightMargin, ImageView videoIcon, AlphaPressButton videoOffer, TextView videoRewardAmount, ConstraintLayout wonMoneyAmountContainer) {
        this.rootView = rootView;
        this.betcoinLabel = betcoinLabel;
        this.betcoins = betcoins;
        this.gameResultTitle = gameResultTitle;
        this.resultDetailsContainer = resultDetailsContainer;
        this.rightMargin = rightMargin;
        this.videoIcon = videoIcon;
        this.videoOffer = videoOffer;
        this.videoRewardAmount = videoRewardAmount;
        this.wonMoneyAmountContainer = wonMoneyAmountContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ContainerResultGamesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ContainerResultGamesBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.container_result_games, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ContainerResultGamesBinding bind(View rootView) {
        int i = R.id.betcoin_label;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.betcoin_label);
        if (imageView != null) {
            i = R.id.betcoins;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.betcoins);
            if (textView != null) {
                i = R.id.gameResultTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.gameResultTitle);
                if (textView2 != null) {
                    i = R.id.resultDetailsContainer;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.resultDetailsContainer);
                    if (linearLayout != null) {
                        i = R.id.rightMargin;
                        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.rightMargin);
                        if (findChildViewById != null) {
                            i = R.id.videoIcon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.videoIcon);
                            if (imageView2 != null) {
                                i = R.id.video_offer;
                                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.video_offer);
                                if (alphaPressButton != null) {
                                    i = R.id.videoRewardAmount;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.videoRewardAmount);
                                    if (textView3 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                                        return new ContainerResultGamesBinding(constraintLayout, imageView, textView, textView2, linearLayout, findChildViewById, imageView2, alphaPressButton, textView3, constraintLayout);
                                    }
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
