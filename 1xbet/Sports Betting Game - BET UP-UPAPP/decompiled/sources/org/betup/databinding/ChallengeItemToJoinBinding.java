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
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ChallengeItemToJoinBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final ImageView country;
    public final ImageView firstTeamIcon;
    public final TextView firstTeamName;
    public final LinearLayout header;
    public final ImageView imageView18;
    public final LinearLayout matchContainer;
    public final TextView matchDate;
    public final TextView matchTime;
    public final TextView name;
    public final TextView prize;
    private final ConstraintLayout rootView;
    public final ImageView secondTeamIcon;
    public final TextView secondTeamName;
    public final TextView textView28;
    public final RoundedImageView userIcon;

    private ChallengeItemToJoinBinding(ConstraintLayout rootView, ConstraintLayout container, ImageView country, ImageView firstTeamIcon, TextView firstTeamName, LinearLayout header, ImageView imageView18, LinearLayout matchContainer, TextView matchDate, TextView matchTime, TextView name, TextView prize, ImageView secondTeamIcon, TextView secondTeamName, TextView textView28, RoundedImageView userIcon) {
        this.rootView = rootView;
        this.container = container;
        this.country = country;
        this.firstTeamIcon = firstTeamIcon;
        this.firstTeamName = firstTeamName;
        this.header = header;
        this.imageView18 = imageView18;
        this.matchContainer = matchContainer;
        this.matchDate = matchDate;
        this.matchTime = matchTime;
        this.name = name;
        this.prize = prize;
        this.secondTeamIcon = secondTeamIcon;
        this.secondTeamName = secondTeamName;
        this.textView28 = textView28;
        this.userIcon = userIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ChallengeItemToJoinBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ChallengeItemToJoinBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.challenge_item_to_join, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChallengeItemToJoinBinding bind(View rootView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i = R.id.country;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.country);
        if (imageView != null) {
            i = R.id.firstTeamIcon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.firstTeamIcon);
            if (imageView2 != null) {
                i = R.id.firstTeamName;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.firstTeamName);
                if (textView != null) {
                    i = R.id.header;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                    if (linearLayout != null) {
                        i = R.id.imageView18;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView18);
                        if (imageView3 != null) {
                            i = R.id.match_container;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.match_container);
                            if (linearLayout2 != null) {
                                i = R.id.matchDate;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchDate);
                                if (textView2 != null) {
                                    i = R.id.matchTime;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchTime);
                                    if (textView3 != null) {
                                        i = R.id.name;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                                        if (textView4 != null) {
                                            i = R.id.prize;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.prize);
                                            if (textView5 != null) {
                                                i = R.id.secondTeamIcon;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.secondTeamIcon);
                                                if (imageView4 != null) {
                                                    i = R.id.secondTeamName;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondTeamName);
                                                    if (textView6 != null) {
                                                        i = R.id.textView28;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView28);
                                                        if (textView7 != null) {
                                                            i = R.id.userIcon;
                                                            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.userIcon);
                                                            if (roundedImageView != null) {
                                                                return new ChallengeItemToJoinBinding(constraintLayout, constraintLayout, imageView, imageView2, textView, linearLayout, imageView3, linearLayout2, textView2, textView3, textView4, textView5, imageView4, textView6, textView7, roundedImageView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
