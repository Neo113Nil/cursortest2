package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.PagerSlidingTabStrip;

/* loaded from: classes2.dex */
public final class FragmentUserDetailsBinding implements ViewBinding {
    public final RoundedImageView avatar;
    public final TextView balance;
    public final TextView balanceLabel;
    public final AlphaPressButton chat;
    public final ImageView coin;
    public final View countDivider;
    public final ImageView countryLogo;
    public final TextView countryName;
    public final AlphaPressButton createChallengeButton;
    public final ImageView followersButton;
    public final TextView followersCount;
    public final Group followersGroup;
    public final TextView followersTitle;
    public final LinearLayout linearLayout5;
    public final ViewPager pager;
    public final PagerSlidingTabStrip pages;
    public final ImageView profileBackground;
    public final ConstraintLayout profileContainer;
    public final ProgressBar progress;
    public final RelativeLayout relativeLayout;
    private final ConstraintLayout rootView;
    public final TextView userName;

    private FragmentUserDetailsBinding(ConstraintLayout rootView, RoundedImageView avatar, TextView balance, TextView balanceLabel, AlphaPressButton chat, ImageView coin, View countDivider, ImageView countryLogo, TextView countryName, AlphaPressButton createChallengeButton, ImageView followersButton, TextView followersCount, Group followersGroup, TextView followersTitle, LinearLayout linearLayout5, ViewPager pager, PagerSlidingTabStrip pages, ImageView profileBackground, ConstraintLayout profileContainer, ProgressBar progress, RelativeLayout relativeLayout, TextView userName) {
        this.rootView = rootView;
        this.avatar = avatar;
        this.balance = balance;
        this.balanceLabel = balanceLabel;
        this.chat = chat;
        this.coin = coin;
        this.countDivider = countDivider;
        this.countryLogo = countryLogo;
        this.countryName = countryName;
        this.createChallengeButton = createChallengeButton;
        this.followersButton = followersButton;
        this.followersCount = followersCount;
        this.followersGroup = followersGroup;
        this.followersTitle = followersTitle;
        this.linearLayout5 = linearLayout5;
        this.pager = pager;
        this.pages = pages;
        this.profileBackground = profileBackground;
        this.profileContainer = profileContainer;
        this.progress = progress;
        this.relativeLayout = relativeLayout;
        this.userName = userName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUserDetailsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentUserDetailsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_user_details, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentUserDetailsBinding bind(View rootView) {
        int i = R.id.avatar;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.avatar);
        if (roundedImageView != null) {
            i = R.id.balance;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.balance);
            if (textView != null) {
                i = R.id.balanceLabel;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.balanceLabel);
                if (textView2 != null) {
                    i = R.id.chat;
                    AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.chat);
                    if (alphaPressButton != null) {
                        i = R.id.coin;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.coin);
                        if (imageView != null) {
                            i = R.id.countDivider;
                            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.countDivider);
                            if (findChildViewById != null) {
                                i = R.id.countryLogo;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.countryLogo);
                                if (imageView2 != null) {
                                    i = R.id.countryName;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.countryName);
                                    if (textView3 != null) {
                                        i = R.id.createChallengeButton;
                                        AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.createChallengeButton);
                                        if (alphaPressButton2 != null) {
                                            i = R.id.followersButton;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.followersButton);
                                            if (imageView3 != null) {
                                                i = R.id.followersCount;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.followersCount);
                                                if (textView4 != null) {
                                                    i = R.id.followersGroup;
                                                    Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.followersGroup);
                                                    if (group != null) {
                                                        i = R.id.followersTitle;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.followersTitle);
                                                        if (textView5 != null) {
                                                            i = R.id.linearLayout5;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linearLayout5);
                                                            if (linearLayout != null) {
                                                                i = R.id.pager;
                                                                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.pager);
                                                                if (viewPager != null) {
                                                                    i = R.id.pages;
                                                                    PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) ViewBindings.findChildViewById(rootView, R.id.pages);
                                                                    if (pagerSlidingTabStrip != null) {
                                                                        i = R.id.profileBackground;
                                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.profileBackground);
                                                                        if (imageView4 != null) {
                                                                            i = R.id.profileContainer;
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.profileContainer);
                                                                            if (constraintLayout != null) {
                                                                                i = R.id.progress;
                                                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                                                if (progressBar != null) {
                                                                                    i = R.id.relativeLayout;
                                                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.relativeLayout);
                                                                                    if (relativeLayout != null) {
                                                                                        i = R.id.userName;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.userName);
                                                                                        if (textView6 != null) {
                                                                                            return new FragmentUserDetailsBinding((ConstraintLayout) rootView, roundedImageView, textView, textView2, alphaPressButton, imageView, findChildViewById, imageView2, textView3, alphaPressButton2, imageView3, textView4, group, textView5, linearLayout, viewPager, pagerSlidingTabStrip, imageView4, constraintLayout, progressBar, relativeLayout, textView6);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
