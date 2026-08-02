package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AdvancedRadioGroup;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.BetUpLabelView;
import org.betup.ui.views.CheckableAlphaPressButton;

/* loaded from: classes2.dex */
public final class FragmentDiceBinding implements ViewBinding {
    public final View bottomArc;
    public final Group bottomHideGroup;
    public final CheckableAlphaPressButton buttonEqual;
    public final CheckableAlphaPressButton buttonLess;
    public final CheckableAlphaPressButton buttonMore;
    public final TextView coefEquals;
    public final TextView coefLess;
    public final TextView coefMore;
    public final View constraintContainerView;
    public final LinearLayout containerDialogResult;
    public final View curve;
    public final PlaceBetcoinsAmountContainerBinding diceContainerButtons;
    public final AdvancedRadioGroup diceResultSelectRadioGroup;
    public final View firstDice;
    public final ConstraintLayout fragmentDiceContainer;
    public final BetUpLabelView labelView;
    public final AlphaPressButton okButton;
    public final FrameLayout progress;
    public final ProgressBar progressBar;
    public final TextView resultScore;
    private final ConstraintLayout rootView;
    public final RelativeLayout schene;
    public final View secondDice;
    public final ContainerResultGamesBinding wonContainer;

    private FragmentDiceBinding(ConstraintLayout rootView, View bottomArc, Group bottomHideGroup, CheckableAlphaPressButton buttonEqual, CheckableAlphaPressButton buttonLess, CheckableAlphaPressButton buttonMore, TextView coefEquals, TextView coefLess, TextView coefMore, View constraintContainerView, LinearLayout containerDialogResult, View curve, PlaceBetcoinsAmountContainerBinding diceContainerButtons, AdvancedRadioGroup diceResultSelectRadioGroup, View firstDice, ConstraintLayout fragmentDiceContainer, BetUpLabelView labelView, AlphaPressButton okButton, FrameLayout progress, ProgressBar progressBar, TextView resultScore, RelativeLayout schene, View secondDice, ContainerResultGamesBinding wonContainer) {
        this.rootView = rootView;
        this.bottomArc = bottomArc;
        this.bottomHideGroup = bottomHideGroup;
        this.buttonEqual = buttonEqual;
        this.buttonLess = buttonLess;
        this.buttonMore = buttonMore;
        this.coefEquals = coefEquals;
        this.coefLess = coefLess;
        this.coefMore = coefMore;
        this.constraintContainerView = constraintContainerView;
        this.containerDialogResult = containerDialogResult;
        this.curve = curve;
        this.diceContainerButtons = diceContainerButtons;
        this.diceResultSelectRadioGroup = diceResultSelectRadioGroup;
        this.firstDice = firstDice;
        this.fragmentDiceContainer = fragmentDiceContainer;
        this.labelView = labelView;
        this.okButton = okButton;
        this.progress = progress;
        this.progressBar = progressBar;
        this.resultScore = resultScore;
        this.schene = schene;
        this.secondDice = secondDice;
        this.wonContainer = wonContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDiceBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentDiceBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_dice, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentDiceBinding bind(View rootView) {
        int i = R.id.bottom_arc;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_arc);
        if (findChildViewById != null) {
            i = R.id.bottomHideGroup;
            Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.bottomHideGroup);
            if (group != null) {
                i = R.id.buttonEqual;
                CheckableAlphaPressButton checkableAlphaPressButton = (CheckableAlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonEqual);
                if (checkableAlphaPressButton != null) {
                    i = R.id.buttonLess;
                    CheckableAlphaPressButton checkableAlphaPressButton2 = (CheckableAlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonLess);
                    if (checkableAlphaPressButton2 != null) {
                        i = R.id.buttonMore;
                        CheckableAlphaPressButton checkableAlphaPressButton3 = (CheckableAlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonMore);
                        if (checkableAlphaPressButton3 != null) {
                            i = R.id.coefEquals;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.coefEquals);
                            if (textView != null) {
                                i = R.id.coefLess;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.coefLess);
                                if (textView2 != null) {
                                    i = R.id.coefMore;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.coefMore);
                                    if (textView3 != null) {
                                        i = R.id.constraintContainerView;
                                        View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.constraintContainerView);
                                        if (findChildViewById2 != null) {
                                            i = R.id.containerDialogResult;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.containerDialogResult);
                                            if (linearLayout != null) {
                                                i = R.id.curve;
                                                View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.curve);
                                                if (findChildViewById3 != null) {
                                                    i = R.id.diceContainerButtons;
                                                    View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.diceContainerButtons);
                                                    if (findChildViewById4 != null) {
                                                        PlaceBetcoinsAmountContainerBinding bind = PlaceBetcoinsAmountContainerBinding.bind(findChildViewById4);
                                                        i = R.id.diceResultSelectRadioGroup;
                                                        AdvancedRadioGroup advancedRadioGroup = (AdvancedRadioGroup) ViewBindings.findChildViewById(rootView, R.id.diceResultSelectRadioGroup);
                                                        if (advancedRadioGroup != null) {
                                                            i = R.id.firstDice;
                                                            View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.firstDice);
                                                            if (findChildViewById5 != null) {
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                                                                i = R.id.labelView;
                                                                BetUpLabelView betUpLabelView = (BetUpLabelView) ViewBindings.findChildViewById(rootView, R.id.labelView);
                                                                if (betUpLabelView != null) {
                                                                    i = R.id.okButton;
                                                                    AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.okButton);
                                                                    if (alphaPressButton != null) {
                                                                        i = R.id.progress;
                                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                                        if (frameLayout != null) {
                                                                            i = R.id.progressBar;
                                                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                                                                            if (progressBar != null) {
                                                                                i = R.id.resultScore;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.resultScore);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.schene;
                                                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.schene);
                                                                                    if (relativeLayout != null) {
                                                                                        i = R.id.secondDice;
                                                                                        View findChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.secondDice);
                                                                                        if (findChildViewById6 != null) {
                                                                                            i = R.id.won_container;
                                                                                            View findChildViewById7 = ViewBindings.findChildViewById(rootView, R.id.won_container);
                                                                                            if (findChildViewById7 != null) {
                                                                                                return new FragmentDiceBinding(constraintLayout, findChildViewById, group, checkableAlphaPressButton, checkableAlphaPressButton2, checkableAlphaPressButton3, textView, textView2, textView3, findChildViewById2, linearLayout, findChildViewById3, bind, advancedRadioGroup, findChildViewById5, constraintLayout, betUpLabelView, alphaPressButton, frameLayout, progressBar, textView4, relativeLayout, findChildViewById6, ContainerResultGamesBinding.bind(findChildViewById7));
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
