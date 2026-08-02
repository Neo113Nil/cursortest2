package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;
import org.betup.ui.controls.RoiView;

/* loaded from: classes2.dex */
public final class ItemRankingBinding implements ViewBinding {
    public final FrameLayout avatarContainer;
    public final RelativeLayout container;
    public final ImageView country;
    public final View firstDivider;
    public final RoundedImageView icon;
    public final LinearLayout main;
    public final TextView name;
    public final TextView position;
    public final TextView rankLevel;
    public final ImageView rewardIcon;
    public final RoiView roiView;
    private final RelativeLayout rootView;
    public final View secondDivider;

    private ItemRankingBinding(RelativeLayout rootView, FrameLayout avatarContainer, RelativeLayout container, ImageView country, View firstDivider, RoundedImageView icon, LinearLayout main, TextView name, TextView position, TextView rankLevel, ImageView rewardIcon, RoiView roiView, View secondDivider) {
        this.rootView = rootView;
        this.avatarContainer = avatarContainer;
        this.container = container;
        this.country = country;
        this.firstDivider = firstDivider;
        this.icon = icon;
        this.main = main;
        this.name = name;
        this.position = position;
        this.rankLevel = rankLevel;
        this.rewardIcon = rewardIcon;
        this.roiView = roiView;
        this.secondDivider = secondDivider;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemRankingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemRankingBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_ranking, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemRankingBinding bind(View rootView) {
        int i = R.id.avatarContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.avatarContainer);
        if (frameLayout != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i = R.id.country;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.country);
            if (imageView != null) {
                i = R.id.first_divider;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.first_divider);
                if (findChildViewById != null) {
                    i = R.id.icon;
                    RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                    if (roundedImageView != null) {
                        i = R.id.main;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.main);
                        if (linearLayout != null) {
                            i = R.id.name;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                            if (textView != null) {
                                i = R.id.position;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.position);
                                if (textView2 != null) {
                                    i = R.id.rankLevel;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.rankLevel);
                                    if (textView3 != null) {
                                        i = R.id.rewardIcon;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.rewardIcon);
                                        if (imageView2 != null) {
                                            i = R.id.roiView;
                                            RoiView roiView = (RoiView) ViewBindings.findChildViewById(rootView, R.id.roiView);
                                            if (roiView != null) {
                                                i = R.id.second_divider;
                                                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.second_divider);
                                                if (findChildViewById2 != null) {
                                                    return new ItemRankingBinding(relativeLayout, frameLayout, relativeLayout, imageView, findChildViewById, roundedImageView, linearLayout, textView, textView2, textView3, imageView2, roiView, findChildViewById2);
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
