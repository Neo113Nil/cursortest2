package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;
import org.betup.ui.controls.RoiView;

/* loaded from: classes2.dex */
public final class ItemFollowerInfoBinding implements ViewBinding {
    public final FrameLayout avatarContainer;
    public final LinearLayout challengeButtonContainer;
    public final ImageView challengeIcon;
    public final TextView challengeTitle;
    public final ImageView iconCountry;
    public final View leftDivider;
    public final TextView participantName;
    public final RoundedImageView playerIcon;
    public final TextView rankLevel;
    public final View rightDivider;
    public final RoiView roiView;
    private final ConstraintLayout rootView;
    public final View userGroupViews;
    public final TextView winnerPlace;

    private ItemFollowerInfoBinding(ConstraintLayout rootView, FrameLayout avatarContainer, LinearLayout challengeButtonContainer, ImageView challengeIcon, TextView challengeTitle, ImageView iconCountry, View leftDivider, TextView participantName, RoundedImageView playerIcon, TextView rankLevel, View rightDivider, RoiView roiView, View userGroupViews, TextView winnerPlace) {
        this.rootView = rootView;
        this.avatarContainer = avatarContainer;
        this.challengeButtonContainer = challengeButtonContainer;
        this.challengeIcon = challengeIcon;
        this.challengeTitle = challengeTitle;
        this.iconCountry = iconCountry;
        this.leftDivider = leftDivider;
        this.participantName = participantName;
        this.playerIcon = playerIcon;
        this.rankLevel = rankLevel;
        this.rightDivider = rightDivider;
        this.roiView = roiView;
        this.userGroupViews = userGroupViews;
        this.winnerPlace = winnerPlace;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemFollowerInfoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemFollowerInfoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_follower_info, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFollowerInfoBinding bind(View rootView) {
        int i = R.id.avatarContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.avatarContainer);
        if (frameLayout != null) {
            i = R.id.challengeButtonContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.challengeButtonContainer);
            if (linearLayout != null) {
                i = R.id.challengeIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.challengeIcon);
                if (imageView != null) {
                    i = R.id.challengeTitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.challengeTitle);
                    if (textView != null) {
                        i = R.id.icon_country;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_country);
                        if (imageView2 != null) {
                            i = R.id.leftDivider;
                            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.leftDivider);
                            if (findChildViewById != null) {
                                i = R.id.participant_name;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.participant_name);
                                if (textView2 != null) {
                                    i = R.id.player_icon;
                                    RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.player_icon);
                                    if (roundedImageView != null) {
                                        i = R.id.rankLevel;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.rankLevel);
                                        if (textView3 != null) {
                                            i = R.id.rightDivider;
                                            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.rightDivider);
                                            if (findChildViewById2 != null) {
                                                i = R.id.roiView;
                                                RoiView roiView = (RoiView) ViewBindings.findChildViewById(rootView, R.id.roiView);
                                                if (roiView != null) {
                                                    i = R.id.userGroupViews;
                                                    View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.userGroupViews);
                                                    if (findChildViewById3 != null) {
                                                        i = R.id.winner_place;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.winner_place);
                                                        if (textView4 != null) {
                                                            return new ItemFollowerInfoBinding((ConstraintLayout) rootView, frameLayout, linearLayout, imageView, textView, imageView2, findChildViewById, textView2, roundedImageView, textView3, findChildViewById2, roiView, findChildViewById3, textView4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
