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

/* loaded from: classes2.dex */
public final class SlideCompetitionMatchBinding implements ViewBinding {
    public final LinearLayout awayButtons;
    public final LinearLayout awayContainer;
    public final ImageView awayImage;
    public final TextView awayTeamName;
    public final TextView date;
    public final LinearLayout homeButtons;
    public final LinearLayout homeContainer;
    public final ImageView homeImage;
    public final TextView homeTeamName;
    public final TextView kickOff;
    private final ConstraintLayout rootView;
    public final LinearLayout scoreView;
    public final TextView time;

    private SlideCompetitionMatchBinding(ConstraintLayout rootView, LinearLayout awayButtons, LinearLayout awayContainer, ImageView awayImage, TextView awayTeamName, TextView date, LinearLayout homeButtons, LinearLayout homeContainer, ImageView homeImage, TextView homeTeamName, TextView kickOff, LinearLayout scoreView, TextView time) {
        this.rootView = rootView;
        this.awayButtons = awayButtons;
        this.awayContainer = awayContainer;
        this.awayImage = awayImage;
        this.awayTeamName = awayTeamName;
        this.date = date;
        this.homeButtons = homeButtons;
        this.homeContainer = homeContainer;
        this.homeImage = homeImage;
        this.homeTeamName = homeTeamName;
        this.kickOff = kickOff;
        this.scoreView = scoreView;
        this.time = time;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SlideCompetitionMatchBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SlideCompetitionMatchBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.slide_competition_match, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static SlideCompetitionMatchBinding bind(View rootView) {
        int i = R.id.awayButtons;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.awayButtons);
        if (linearLayout != null) {
            i = R.id.awayContainer;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.awayContainer);
            if (linearLayout2 != null) {
                i = R.id.awayImage;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.awayImage);
                if (imageView != null) {
                    i = R.id.awayTeamName;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.awayTeamName);
                    if (textView != null) {
                        i = R.id.date;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
                        if (textView2 != null) {
                            i = R.id.homeButtons;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.homeButtons);
                            if (linearLayout3 != null) {
                                i = R.id.homeContainer;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.homeContainer);
                                if (linearLayout4 != null) {
                                    i = R.id.homeImage;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.homeImage);
                                    if (imageView2 != null) {
                                        i = R.id.homeTeamName;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.homeTeamName);
                                        if (textView3 != null) {
                                            i = R.id.kickOff;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.kickOff);
                                            if (textView4 != null) {
                                                i = R.id.scoreView;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.scoreView);
                                                if (linearLayout5 != null) {
                                                    i = R.id.time;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.time);
                                                    if (textView5 != null) {
                                                        return new SlideCompetitionMatchBinding((ConstraintLayout) rootView, linearLayout, linearLayout2, imageView, textView, textView2, linearLayout3, linearLayout4, imageView2, textView3, textView4, linearLayout5, textView5);
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
