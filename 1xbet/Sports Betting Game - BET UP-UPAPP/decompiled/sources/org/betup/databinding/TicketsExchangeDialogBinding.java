package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.controls.ArcTextView;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class TicketsExchangeDialogBinding implements ViewBinding {
    public final GradientTextView betcoins;
    public final LinearLayout betcoinsContainer;
    public final ConstraintLayout dialogContainer;
    public final LinearLayout iconContainer;
    public final ImageView imageView;
    public final ArcTextView label;
    public final LinearLayout ok;
    private final ConstraintLayout rootView;
    public final GradientTextView showSkills;
    public final GradientTextView tickets;
    public final GradientTextView welcomeText;

    private TicketsExchangeDialogBinding(ConstraintLayout rootView, GradientTextView betcoins, LinearLayout betcoinsContainer, ConstraintLayout dialogContainer, LinearLayout iconContainer, ImageView imageView, ArcTextView label, LinearLayout ok, GradientTextView showSkills, GradientTextView tickets, GradientTextView welcomeText) {
        this.rootView = rootView;
        this.betcoins = betcoins;
        this.betcoinsContainer = betcoinsContainer;
        this.dialogContainer = dialogContainer;
        this.iconContainer = iconContainer;
        this.imageView = imageView;
        this.label = label;
        this.ok = ok;
        this.showSkills = showSkills;
        this.tickets = tickets;
        this.welcomeText = welcomeText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static TicketsExchangeDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static TicketsExchangeDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.tickets_exchange_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static TicketsExchangeDialogBinding bind(View rootView) {
        int i = R.id.betcoins;
        GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.betcoins);
        if (gradientTextView != null) {
            i = R.id.betcoinsContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.betcoinsContainer);
            if (linearLayout != null) {
                i = R.id.dialog_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                if (constraintLayout != null) {
                    i = R.id.iconContainer;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.iconContainer);
                    if (linearLayout2 != null) {
                        i = R.id.imageView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                        if (imageView != null) {
                            i = R.id.label;
                            ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.label);
                            if (arcTextView != null) {
                                i = R.id.ok;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ok);
                                if (linearLayout3 != null) {
                                    i = R.id.show_skills;
                                    GradientTextView gradientTextView2 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.show_skills);
                                    if (gradientTextView2 != null) {
                                        i = R.id.tickets;
                                        GradientTextView gradientTextView3 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.tickets);
                                        if (gradientTextView3 != null) {
                                            i = R.id.welcome_text;
                                            GradientTextView gradientTextView4 = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.welcome_text);
                                            if (gradientTextView4 != null) {
                                                return new TicketsExchangeDialogBinding((ConstraintLayout) rootView, gradientTextView, linearLayout, constraintLayout, linearLayout2, imageView, arcTextView, linearLayout3, gradientTextView2, gradientTextView3, gradientTextView4);
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
