package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class BaseItemCompetitionBetBinding implements ViewBinding {
    public final LinearLayout containerWinners;
    public final RelativeLayout firstPlace;
    public final TextView firstWinnerCoefView;
    public final ImageView firstWinnerIcon;
    public final TextView firstWinnerName;
    public final TextView firstWinnerPlace;
    public final TextView infoButton;
    private final LinearLayout rootView;
    public final RelativeLayout secondPlace;
    public final TextView secondWinnerCoefView;
    public final ImageView secondWinnerIcon;
    public final TextView secondWinnerName;
    public final TextView secondWinnerPlace;
    public final RelativeLayout thirdPlace;
    public final TextView thirdWinnerCoefView;
    public final ImageView thirdWinnerIcon;
    public final TextView thirdWinnerName;
    public final TextView thirdWinnerPlace;

    private BaseItemCompetitionBetBinding(LinearLayout rootView, LinearLayout containerWinners, RelativeLayout firstPlace, TextView firstWinnerCoefView, ImageView firstWinnerIcon, TextView firstWinnerName, TextView firstWinnerPlace, TextView infoButton, RelativeLayout secondPlace, TextView secondWinnerCoefView, ImageView secondWinnerIcon, TextView secondWinnerName, TextView secondWinnerPlace, RelativeLayout thirdPlace, TextView thirdWinnerCoefView, ImageView thirdWinnerIcon, TextView thirdWinnerName, TextView thirdWinnerPlace) {
        this.rootView = rootView;
        this.containerWinners = containerWinners;
        this.firstPlace = firstPlace;
        this.firstWinnerCoefView = firstWinnerCoefView;
        this.firstWinnerIcon = firstWinnerIcon;
        this.firstWinnerName = firstWinnerName;
        this.firstWinnerPlace = firstWinnerPlace;
        this.infoButton = infoButton;
        this.secondPlace = secondPlace;
        this.secondWinnerCoefView = secondWinnerCoefView;
        this.secondWinnerIcon = secondWinnerIcon;
        this.secondWinnerName = secondWinnerName;
        this.secondWinnerPlace = secondWinnerPlace;
        this.thirdPlace = thirdPlace;
        this.thirdWinnerCoefView = thirdWinnerCoefView;
        this.thirdWinnerIcon = thirdWinnerIcon;
        this.thirdWinnerName = thirdWinnerName;
        this.thirdWinnerPlace = thirdWinnerPlace;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static BaseItemCompetitionBetBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static BaseItemCompetitionBetBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.base_item_competition_bet, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static BaseItemCompetitionBetBinding bind(View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.first_place;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.first_place);
        if (relativeLayout != null) {
            i = R.id.first_winner_coef_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.first_winner_coef_view);
            if (textView != null) {
                i = R.id.first_winner_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.first_winner_icon);
                if (imageView != null) {
                    i = R.id.first_winner_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.first_winner_name);
                    if (textView2 != null) {
                        i = R.id.first_winner_place;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.first_winner_place);
                        if (textView3 != null) {
                            i = R.id.info_button;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.info_button);
                            if (textView4 != null) {
                                i = R.id.second_place;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.second_place);
                                if (relativeLayout2 != null) {
                                    i = R.id.second_winner_coef_view;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.second_winner_coef_view);
                                    if (textView5 != null) {
                                        i = R.id.second_winner_icon;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.second_winner_icon);
                                        if (imageView2 != null) {
                                            i = R.id.second_winner_name;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.second_winner_name);
                                            if (textView6 != null) {
                                                i = R.id.second_winner_place;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.second_winner_place);
                                                if (textView7 != null) {
                                                    i = R.id.third_place;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.third_place);
                                                    if (relativeLayout3 != null) {
                                                        i = R.id.third_winner_coef_view;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.third_winner_coef_view);
                                                        if (textView8 != null) {
                                                            i = R.id.third_winner_icon;
                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.third_winner_icon);
                                                            if (imageView3 != null) {
                                                                i = R.id.third_winner_name;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.third_winner_name);
                                                                if (textView9 != null) {
                                                                    i = R.id.third_winner_place;
                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.third_winner_place);
                                                                    if (textView10 != null) {
                                                                        return new BaseItemCompetitionBetBinding(linearLayout, linearLayout, relativeLayout, textView, imageView, textView2, textView3, textView4, relativeLayout2, textView5, imageView2, textView6, textView7, relativeLayout3, textView8, imageView3, textView9, textView10);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
