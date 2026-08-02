package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.DigitalTextView;

/* loaded from: classes2.dex */
public final class FragmentHighLowGameBinding implements ViewBinding {
    public final View backgroundDivider;
    public final PlaceBetcoinsAmountContainerBinding betContainer;
    public final DigitalTextView bottomDigitalNumber;
    public final AlphaPressButton buttonEqual;
    public final AlphaPressButton buttonEven;
    public final AlphaPressButton buttonHigher;
    public final AlphaPressButton buttonLower;
    public final AlphaPressButton buttonOdd;
    public final FrameLayout clickedStub;
    public final ContainerResultHighLowBinding containerHighLowerResult;
    public final ConstraintLayout highLowFragmentContainer;
    public final ProgressBar progress;
    public final FrameLayout progressBar;
    private final ConstraintLayout rootView;
    public final ConstraintLayout selectBetTypeContainer;
    public final TextView textButtonEqual;
    public final TextView textButtonEven;
    public final TextView textButtonHigher;
    public final TextView textButtonLower;
    public final TextView textButtonOdd;
    public final View topBackground;
    public final DigitalTextView topDigitalNumber;

    private FragmentHighLowGameBinding(ConstraintLayout rootView, View backgroundDivider, PlaceBetcoinsAmountContainerBinding betContainer, DigitalTextView bottomDigitalNumber, AlphaPressButton buttonEqual, AlphaPressButton buttonEven, AlphaPressButton buttonHigher, AlphaPressButton buttonLower, AlphaPressButton buttonOdd, FrameLayout clickedStub, ContainerResultHighLowBinding containerHighLowerResult, ConstraintLayout highLowFragmentContainer, ProgressBar progress, FrameLayout progressBar, ConstraintLayout selectBetTypeContainer, TextView textButtonEqual, TextView textButtonEven, TextView textButtonHigher, TextView textButtonLower, TextView textButtonOdd, View topBackground, DigitalTextView topDigitalNumber) {
        this.rootView = rootView;
        this.backgroundDivider = backgroundDivider;
        this.betContainer = betContainer;
        this.bottomDigitalNumber = bottomDigitalNumber;
        this.buttonEqual = buttonEqual;
        this.buttonEven = buttonEven;
        this.buttonHigher = buttonHigher;
        this.buttonLower = buttonLower;
        this.buttonOdd = buttonOdd;
        this.clickedStub = clickedStub;
        this.containerHighLowerResult = containerHighLowerResult;
        this.highLowFragmentContainer = highLowFragmentContainer;
        this.progress = progress;
        this.progressBar = progressBar;
        this.selectBetTypeContainer = selectBetTypeContainer;
        this.textButtonEqual = textButtonEqual;
        this.textButtonEven = textButtonEven;
        this.textButtonHigher = textButtonHigher;
        this.textButtonLower = textButtonLower;
        this.textButtonOdd = textButtonOdd;
        this.topBackground = topBackground;
        this.topDigitalNumber = topDigitalNumber;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentHighLowGameBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentHighLowGameBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_high_low_game, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentHighLowGameBinding bind(View rootView) {
        int i = R.id.background_divider;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.background_divider);
        if (findChildViewById != null) {
            i = R.id.bet_container;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bet_container);
            if (findChildViewById2 != null) {
                PlaceBetcoinsAmountContainerBinding bind = PlaceBetcoinsAmountContainerBinding.bind(findChildViewById2);
                i = R.id.bottomDigitalNumber;
                DigitalTextView digitalTextView = (DigitalTextView) ViewBindings.findChildViewById(rootView, R.id.bottomDigitalNumber);
                if (digitalTextView != null) {
                    i = R.id.buttonEqual;
                    AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonEqual);
                    if (alphaPressButton != null) {
                        i = R.id.buttonEven;
                        AlphaPressButton alphaPressButton2 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonEven);
                        if (alphaPressButton2 != null) {
                            i = R.id.buttonHigher;
                            AlphaPressButton alphaPressButton3 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonHigher);
                            if (alphaPressButton3 != null) {
                                i = R.id.buttonLower;
                                AlphaPressButton alphaPressButton4 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonLower);
                                if (alphaPressButton4 != null) {
                                    i = R.id.buttonOdd;
                                    AlphaPressButton alphaPressButton5 = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.buttonOdd);
                                    if (alphaPressButton5 != null) {
                                        i = R.id.clickedStub;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.clickedStub);
                                        if (frameLayout != null) {
                                            i = R.id.containerHighLowerResult;
                                            View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.containerHighLowerResult);
                                            if (findChildViewById3 != null) {
                                                ContainerResultHighLowBinding bind2 = ContainerResultHighLowBinding.bind(findChildViewById3);
                                                ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                                                i = R.id.progress;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                                                if (progressBar != null) {
                                                    i = R.id.progressBar;
                                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                                                    if (frameLayout2 != null) {
                                                        i = R.id.selectBetTypeContainer;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.selectBetTypeContainer);
                                                        if (constraintLayout2 != null) {
                                                            i = R.id.textButtonEqual;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.textButtonEqual);
                                                            if (textView != null) {
                                                                i = R.id.textButtonEven;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textButtonEven);
                                                                if (textView2 != null) {
                                                                    i = R.id.textButtonHigher;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textButtonHigher);
                                                                    if (textView3 != null) {
                                                                        i = R.id.textButtonLower;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textButtonLower);
                                                                        if (textView4 != null) {
                                                                            i = R.id.textButtonOdd;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textButtonOdd);
                                                                            if (textView5 != null) {
                                                                                i = R.id.top_background;
                                                                                View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.top_background);
                                                                                if (findChildViewById4 != null) {
                                                                                    i = R.id.topDigitalNumber;
                                                                                    DigitalTextView digitalTextView2 = (DigitalTextView) ViewBindings.findChildViewById(rootView, R.id.topDigitalNumber);
                                                                                    if (digitalTextView2 != null) {
                                                                                        return new FragmentHighLowGameBinding(constraintLayout, findChildViewById, bind, digitalTextView, alphaPressButton, alphaPressButton2, alphaPressButton3, alphaPressButton4, alphaPressButton5, frameLayout, bind2, constraintLayout, progressBar, frameLayout2, constraintLayout2, textView, textView2, textView3, textView4, textView5, findChildViewById4, digitalTextView2);
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
