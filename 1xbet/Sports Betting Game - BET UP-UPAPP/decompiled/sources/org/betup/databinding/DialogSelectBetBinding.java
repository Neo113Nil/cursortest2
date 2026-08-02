package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;
import org.betup.ui.views.PagerSlidingTabStrip;

/* loaded from: classes2.dex */
public final class DialogSelectBetBinding implements ViewBinding {
    public final ImageView closeButton;
    public final TextView confirm;
    public final TextView datetime;
    public final RoundedImageView firstUser;
    public final TextView firstUserName;
    public final TextView header;
    public final TextView itemBetslipTeamNames;
    public final TextView league;
    public final ViewPager pager;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final RoundedImageView secondUser;
    public final TextView secondUserName;
    public final ImageView sportIcon;
    public final PagerSlidingTabStrip tabs;

    private DialogSelectBetBinding(ConstraintLayout rootView, ImageView closeButton, TextView confirm, TextView datetime, RoundedImageView firstUser, TextView firstUserName, TextView header, TextView itemBetslipTeamNames, TextView league, ViewPager pager, ProgressBar progress, RoundedImageView secondUser, TextView secondUserName, ImageView sportIcon, PagerSlidingTabStrip tabs) {
        this.rootView = rootView;
        this.closeButton = closeButton;
        this.confirm = confirm;
        this.datetime = datetime;
        this.firstUser = firstUser;
        this.firstUserName = firstUserName;
        this.header = header;
        this.itemBetslipTeamNames = itemBetslipTeamNames;
        this.league = league;
        this.pager = pager;
        this.progress = progress;
        this.secondUser = secondUser;
        this.secondUserName = secondUserName;
        this.sportIcon = sportIcon;
        this.tabs = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogSelectBetBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogSelectBetBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_select_bet, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSelectBetBinding bind(View rootView) {
        int i = R.id.closeButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.closeButton);
        if (imageView != null) {
            i = R.id.confirm;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.confirm);
            if (textView != null) {
                i = R.id.datetime;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.datetime);
                if (textView2 != null) {
                    i = R.id.firstUser;
                    RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.firstUser);
                    if (roundedImageView != null) {
                        i = R.id.firstUserName;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.firstUserName);
                        if (textView3 != null) {
                            i = R.id.header;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.header);
                            if (textView4 != null) {
                                i = R.id.itemBetslipTeamNames;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.itemBetslipTeamNames);
                                if (textView5 != null) {
                                    i = R.id.league;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.league);
                                    if (textView6 != null) {
                                        i = R.id.pager;
                                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
                                        if (viewPager != null) {
                                            i = R.id.progress;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                            if (progressBar != null) {
                                                i = R.id.secondUser;
                                                RoundedImageView roundedImageView2 = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.secondUser);
                                                if (roundedImageView2 != null) {
                                                    i = R.id.secondUserName;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondUserName);
                                                    if (textView7 != null) {
                                                        i = R.id.sportIcon;
                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportIcon);
                                                        if (imageView2 != null) {
                                                            i = R.id.tabs;
                                                            PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) ViewBindings.findChildViewById(rootView, R.id.tabs);
                                                            if (pagerSlidingTabStrip != null) {
                                                                return new DialogSelectBetBinding((ConstraintLayout) rootView, imageView, textView, textView2, roundedImageView, textView3, textView4, textView5, textView6, viewPager, progressBar, roundedImageView2, textView7, imageView2, pagerSlidingTabStrip);
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
