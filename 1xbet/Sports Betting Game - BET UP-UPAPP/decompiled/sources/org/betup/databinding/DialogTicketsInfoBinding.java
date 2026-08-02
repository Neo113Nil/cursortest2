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
import org.betup.ui.views.AlphaPressButton;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class DialogTicketsInfoBinding implements ViewBinding {
    public final TextView betCost;
    public final TextView betMegaWin;
    public final TextView betWin;
    public final ConstraintLayout dialogContainer;
    public final TextView introducing;
    public final LinearLayout message;
    public final AlphaPressButton ok;
    public final GradientTextView price;
    private final ConstraintLayout rootView;
    public final ImageView ticketIcon;
    public final GradientTextView wishLabel;

    private DialogTicketsInfoBinding(ConstraintLayout rootView, TextView betCost, TextView betMegaWin, TextView betWin, ConstraintLayout dialogContainer, TextView introducing, LinearLayout message, AlphaPressButton ok, GradientTextView price, ImageView ticketIcon, GradientTextView wishLabel) {
        this.rootView = rootView;
        this.betCost = betCost;
        this.betMegaWin = betMegaWin;
        this.betWin = betWin;
        this.dialogContainer = dialogContainer;
        this.introducing = introducing;
        this.message = message;
        this.ok = ok;
        this.price = price;
        this.ticketIcon = ticketIcon;
        this.wishLabel = wishLabel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogTicketsInfoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogTicketsInfoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_tickets_info, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogTicketsInfoBinding bind(View rootView) {
        int i = R.id.bet_cost;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_cost);
        if (textView != null) {
            i = R.id.bet_mega_win;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_mega_win);
            if (textView2 != null) {
                i = R.id.bet_win;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bet_win);
                if (textView3 != null) {
                    i = R.id.dialog_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                    if (constraintLayout != null) {
                        i = R.id.introducing;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.introducing);
                        if (textView4 != null) {
                            i = R.id.message;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.message);
                            if (linearLayout != null) {
                                i = R.id.ok;
                                AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.ok);
                                if (alphaPressButton != null) {
                                    i = R.id.price;
                                    GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                                    if (gradientTextView != null) {
                                        i = R.id.ticketIcon;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ticketIcon);
                                        if (imageView != null) {
                                            i = R.id.wish_label;
                                            GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.wish_label);
                                            if (gradientTextView2 != null) {
                                                return new DialogTicketsInfoBinding((ConstraintLayout) rootView, textView, textView2, textView3, constraintLayout, textView4, linearLayout, alphaPressButton, gradientTextView, imageView, gradientTextView2);
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
