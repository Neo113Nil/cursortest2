package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class HeaderTipsBinding implements ViewBinding {
    public final View canceledDivider;
    public final TextView canceledLabel;
    public final TextView canceledNumber;
    public final RoundedImageView expertIcon;
    public final TextView expertName;
    public final TextView hintsDesc;
    public final TextView hintsNumber;
    public final TextView lossesLabel;
    public final TextView lossesNumber;
    public final View ratioDivider;
    public final TextView ratioNumber;
    private final ConstraintLayout rootView;
    public final TextView textView4;
    public final View winningsDivider;
    public final TextView winningsLabel;
    public final TextView winsNumber;

    private HeaderTipsBinding(ConstraintLayout rootView, View canceledDivider, TextView canceledLabel, TextView canceledNumber, RoundedImageView expertIcon, TextView expertName, TextView hintsDesc, TextView hintsNumber, TextView lossesLabel, TextView lossesNumber, View ratioDivider, TextView ratioNumber, TextView textView4, View winningsDivider, TextView winningsLabel, TextView winsNumber) {
        this.rootView = rootView;
        this.canceledDivider = canceledDivider;
        this.canceledLabel = canceledLabel;
        this.canceledNumber = canceledNumber;
        this.expertIcon = expertIcon;
        this.expertName = expertName;
        this.hintsDesc = hintsDesc;
        this.hintsNumber = hintsNumber;
        this.lossesLabel = lossesLabel;
        this.lossesNumber = lossesNumber;
        this.ratioDivider = ratioDivider;
        this.ratioNumber = ratioNumber;
        this.textView4 = textView4;
        this.winningsDivider = winningsDivider;
        this.winningsLabel = winningsLabel;
        this.winsNumber = winsNumber;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static HeaderTipsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static HeaderTipsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.header_tips, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static HeaderTipsBinding bind(View rootView) {
        int i = R.id.canceled_divider;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.canceled_divider);
        if (findChildViewById != null) {
            i = R.id.canceled_label;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.canceled_label);
            if (textView != null) {
                i = R.id.canceled_number;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.canceled_number);
                if (textView2 != null) {
                    i = R.id.expertIcon;
                    RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.expertIcon);
                    if (roundedImageView != null) {
                        i = R.id.expertName;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.expertName);
                        if (textView3 != null) {
                            i = R.id.hints_desc;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.hints_desc);
                            if (textView4 != null) {
                                i = R.id.hints_number;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.hints_number);
                                if (textView5 != null) {
                                    i = R.id.losses_label;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.losses_label);
                                    if (textView6 != null) {
                                        i = R.id.losses_number;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.losses_number);
                                        if (textView7 != null) {
                                            i = R.id.ratio_divider;
                                            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.ratio_divider);
                                            if (findChildViewById2 != null) {
                                                i = R.id.ratio_number;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ratio_number);
                                                if (textView8 != null) {
                                                    i = R.id.textView4;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView4);
                                                    if (textView9 != null) {
                                                        i = R.id.winnings_divider;
                                                        View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.winnings_divider);
                                                        if (findChildViewById3 != null) {
                                                            i = R.id.winnings_label;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.winnings_label);
                                                            if (textView10 != null) {
                                                                i = R.id.wins_number;
                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wins_number);
                                                                if (textView11 != null) {
                                                                    return new HeaderTipsBinding((ConstraintLayout) rootView, findChildViewById, textView, textView2, roundedImageView, textView3, textView4, textView5, textView6, textView7, findChildViewById2, textView8, textView9, findChildViewById3, textView10, textView11);
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
