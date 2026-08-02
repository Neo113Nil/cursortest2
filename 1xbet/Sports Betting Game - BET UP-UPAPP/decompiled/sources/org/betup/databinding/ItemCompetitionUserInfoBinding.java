package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemCompetitionUserInfoBinding implements ViewBinding {
    public final FrameLayout avatarContainer;
    public final TextView coefContainer;
    public final ImageView iconCountry;
    public final TextView participantName;
    public final RoundedImageView playerIcon;
    public final TextView rankLevel;
    private final ConstraintLayout rootView;
    public final TextView winnerPlace;

    private ItemCompetitionUserInfoBinding(ConstraintLayout rootView, FrameLayout avatarContainer, TextView coefContainer, ImageView iconCountry, TextView participantName, RoundedImageView playerIcon, TextView rankLevel, TextView winnerPlace) {
        this.rootView = rootView;
        this.avatarContainer = avatarContainer;
        this.coefContainer = coefContainer;
        this.iconCountry = iconCountry;
        this.participantName = participantName;
        this.playerIcon = playerIcon;
        this.rankLevel = rankLevel;
        this.winnerPlace = winnerPlace;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCompetitionUserInfoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCompetitionUserInfoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_competition_user_info, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCompetitionUserInfoBinding bind(View rootView) {
        int i = R.id.avatarContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.avatarContainer);
        if (frameLayout != null) {
            i = R.id.coef_container;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.coef_container);
            if (textView != null) {
                i = R.id.icon_country;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_country);
                if (imageView != null) {
                    i = R.id.participant_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.participant_name);
                    if (textView2 != null) {
                        i = R.id.player_icon;
                        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.player_icon);
                        if (roundedImageView != null) {
                            i = R.id.rankLevel;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.rankLevel);
                            if (textView3 != null) {
                                i = R.id.winner_place;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.winner_place);
                                if (textView4 != null) {
                                    return new ItemCompetitionUserInfoBinding((ConstraintLayout) rootView, frameLayout, textView, imageView, textView2, roundedImageView, textView3, textView4);
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
