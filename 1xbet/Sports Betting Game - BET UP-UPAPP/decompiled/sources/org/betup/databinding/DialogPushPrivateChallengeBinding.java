package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogPushPrivateChallengeBinding implements ViewBinding {
    public final LinearLayout amountContainer;
    public final TextView betcoinAmount;
    public final LinearLayout buttonsContainer;
    public final View closeButton;
    public final LinearLayout descriptionContainer;
    public final TextView detailsButton;
    public final TextView header;
    public final FrameLayout progressBar;
    public final TextView rejectButton;
    private final ConstraintLayout rootView;
    public final View topDivider;
    public final TextView type;
    public final RoundedImageView userIcon;
    public final TextView userName;

    private DialogPushPrivateChallengeBinding(ConstraintLayout rootView, LinearLayout amountContainer, TextView betcoinAmount, LinearLayout buttonsContainer, View closeButton, LinearLayout descriptionContainer, TextView detailsButton, TextView header, FrameLayout progressBar, TextView rejectButton, View topDivider, TextView type, RoundedImageView userIcon, TextView userName) {
        this.rootView = rootView;
        this.amountContainer = amountContainer;
        this.betcoinAmount = betcoinAmount;
        this.buttonsContainer = buttonsContainer;
        this.closeButton = closeButton;
        this.descriptionContainer = descriptionContainer;
        this.detailsButton = detailsButton;
        this.header = header;
        this.progressBar = progressBar;
        this.rejectButton = rejectButton;
        this.topDivider = topDivider;
        this.type = type;
        this.userIcon = userIcon;
        this.userName = userName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogPushPrivateChallengeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogPushPrivateChallengeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_push_private_challenge, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogPushPrivateChallengeBinding bind(View rootView) {
        int i = R.id.amountContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.amountContainer);
        if (linearLayout != null) {
            i = R.id.betcoinAmount;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.betcoinAmount);
            if (textView != null) {
                i = R.id.buttonsContainer;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.buttonsContainer);
                if (linearLayout2 != null) {
                    i = R.id.closeButton;
                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.closeButton);
                    if (findChildViewById != null) {
                        i = R.id.descriptionContainer;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.descriptionContainer);
                        if (linearLayout3 != null) {
                            i = R.id.detailsButton;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.detailsButton);
                            if (textView2 != null) {
                                i = R.id.header;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.header);
                                if (textView3 != null) {
                                    i = R.id.progressBar;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.progressBar);
                                    if (frameLayout != null) {
                                        i = R.id.rejectButton;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.rejectButton);
                                        if (textView4 != null) {
                                            i = R.id.topDivider;
                                            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.topDivider);
                                            if (findChildViewById2 != null) {
                                                i = R.id.type;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.type);
                                                if (textView5 != null) {
                                                    i = R.id.userIcon;
                                                    RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.userIcon);
                                                    if (roundedImageView != null) {
                                                        i = R.id.userName;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.userName);
                                                        if (textView6 != null) {
                                                            return new DialogPushPrivateChallengeBinding((ConstraintLayout) rootView, linearLayout, textView, linearLayout2, findChildViewById, linearLayout3, textView2, textView3, frameLayout, textView4, findChildViewById2, textView5, roundedImageView, textView6);
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
