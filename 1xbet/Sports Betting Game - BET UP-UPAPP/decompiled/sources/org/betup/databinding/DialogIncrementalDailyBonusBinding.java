package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.controls.SpriteImageButton;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogIncrementalDailyBonusBinding implements ViewBinding {
    public final Group betcoinBalance;
    public final TextView betcoins;
    public final ImageView betcoinsIcon;
    public final AlphaPressButton close;
    public final TextView dayLabel;
    public final ConstraintLayout dialogContainer;
    public final RecyclerView list;
    public final TextView multiplyBetcoinsBonus;
    public final AlphaPressButton multiplyBonus;
    public final AppCompatTextView multiplyBonusTitle;
    public final GradientTextView nextAvailable;
    public final SpriteImageButton ok;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final ImageView specialCheck;
    public final ConstraintLayout specialDay;
    public final ImageView specialDayIcon;
    public final GradientTextView thanksLabel;
    public final ImageView videoRewardIcon;
    public final TextView yourPurchaseLabel;

    private DialogIncrementalDailyBonusBinding(ConstraintLayout rootView, Group betcoinBalance, TextView betcoins, ImageView betcoinsIcon, AlphaPressButton close, TextView dayLabel, ConstraintLayout dialogContainer, RecyclerView list, TextView multiplyBetcoinsBonus, AlphaPressButton multiplyBonus, AppCompatTextView multiplyBonusTitle, GradientTextView nextAvailable, SpriteImageButton ok, ProgressBar progress, ImageView specialCheck, ConstraintLayout specialDay, ImageView specialDayIcon, GradientTextView thanksLabel, ImageView videoRewardIcon, TextView yourPurchaseLabel) {
        this.rootView = rootView;
        this.betcoinBalance = betcoinBalance;
        this.betcoins = betcoins;
        this.betcoinsIcon = betcoinsIcon;
        this.close = close;
        this.dayLabel = dayLabel;
        this.dialogContainer = dialogContainer;
        this.list = list;
        this.multiplyBetcoinsBonus = multiplyBetcoinsBonus;
        this.multiplyBonus = multiplyBonus;
        this.multiplyBonusTitle = multiplyBonusTitle;
        this.nextAvailable = nextAvailable;
        this.ok = ok;
        this.progress = progress;
        this.specialCheck = specialCheck;
        this.specialDay = specialDay;
        this.specialDayIcon = specialDayIcon;
        this.thanksLabel = thanksLabel;
        this.videoRewardIcon = videoRewardIcon;
        this.yourPurchaseLabel = yourPurchaseLabel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogIncrementalDailyBonusBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogIncrementalDailyBonusBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_incremental_daily_bonus, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogIncrementalDailyBonusBinding bind(View rootView) {
        int i = R.id.betcoinBalance;
        Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.betcoinBalance);
        if (group != null) {
            i = R.id.betcoins;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.betcoins);
            if (textView != null) {
                i = R.id.betcoinsIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.betcoinsIcon);
                if (imageView != null) {
                    i = R.id.close;
                    AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.close);
                    if (alphaPressButton != null) {
                        i = R.id.day_label;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_label);
                        if (textView2 != null) {
                            i = R.id.dialog_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                            if (constraintLayout != null) {
                                i = R.id.list;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
                                if (recyclerView != null) {
                                    i = R.id.multiplyBetcoinsBonus;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.multiplyBetcoinsBonus);
                                    if (textView3 != null) {
                                        i = R.id.multiplyBonus;
                                        AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.multiplyBonus);
                                        if (alphaPressButton2 != null) {
                                            i = R.id.multiplyBonusTitle;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.multiplyBonusTitle);
                                            if (appCompatTextView != null) {
                                                i = R.id.nextAvailable;
                                                GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.nextAvailable);
                                                if (gradientTextView != null) {
                                                    i = R.id.ok;
                                                    SpriteImageButton spriteImageButton = (SpriteImageButton) ViewBindings.findChildViewById(rootView, R.id.ok);
                                                    if (spriteImageButton != null) {
                                                        i = R.id.progress;
                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                        if (progressBar != null) {
                                                            i = R.id.specialCheck;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.specialCheck);
                                                            if (imageView2 != null) {
                                                                i = R.id.specialDay;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.specialDay);
                                                                if (constraintLayout2 != null) {
                                                                    i = R.id.specialDayIcon;
                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.specialDayIcon);
                                                                    if (imageView3 != null) {
                                                                        i = R.id.thanks_label;
                                                                        GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.thanks_label);
                                                                        if (gradientTextView2 != null) {
                                                                            i = R.id.videoRewardIcon;
                                                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.videoRewardIcon);
                                                                            if (imageView4 != null) {
                                                                                i = R.id.your_purchase_label;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.your_purchase_label);
                                                                                if (textView4 != null) {
                                                                                    return new DialogIncrementalDailyBonusBinding((ConstraintLayout) rootView, group, textView, imageView, alphaPressButton, textView2, constraintLayout, recyclerView, textView3, alphaPressButton2, appCompatTextView, gradientTextView, spriteImageButton, progressBar, imageView2, constraintLayout2, imageView3, gradientTextView2, imageView4, textView4);
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
