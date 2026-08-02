package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.FontText;
import org.betup.ui.views.GradientTextView;

/* loaded from: classes2.dex */
public final class ItemTicketBinding implements ViewBinding {
    public final LinearLayout amountContainer;
    public final FontText betcoins;
    public final TextView bonus;
    public final LinearLayout bonusContainer;
    public final ImageView bonusIcon;
    public final ConstraintLayout container;
    public final TextView discount;
    public final ImageView icon;
    public final TextView label;
    public final GradientTextView price;
    private final RelativeLayout rootView;
    public final FontText tickets;

    private ItemTicketBinding(RelativeLayout rootView, LinearLayout amountContainer, FontText betcoins, TextView bonus, LinearLayout bonusContainer, ImageView bonusIcon, ConstraintLayout container, TextView discount, ImageView icon, TextView label, GradientTextView price, FontText tickets) {
        this.rootView = rootView;
        this.amountContainer = amountContainer;
        this.betcoins = betcoins;
        this.bonus = bonus;
        this.bonusContainer = bonusContainer;
        this.bonusIcon = bonusIcon;
        this.container = container;
        this.discount = discount;
        this.icon = icon;
        this.label = label;
        this.price = price;
        this.tickets = tickets;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemTicketBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemTicketBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_ticket, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTicketBinding bind(View rootView) {
        int i = R.id.amountContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.amountContainer);
        if (linearLayout != null) {
            i = R.id.betcoins;
            FontText fontText = (FontText) ViewBindings.findChildViewById(rootView, R.id.betcoins);
            if (fontText != null) {
                i = R.id.bonus;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bonus);
                if (textView != null) {
                    i = R.id.bonus_container;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.bonus_container);
                    if (linearLayout2 != null) {
                        i = R.id.bonus_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bonus_icon);
                        if (imageView != null) {
                            i = R.id.container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                            if (constraintLayout != null) {
                                i = R.id.discount;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.discount);
                                if (textView2 != null) {
                                    i = R.id.icon;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                                    if (imageView2 != null) {
                                        i = R.id.label;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.label);
                                        if (textView3 != null) {
                                            i = R.id.price;
                                            GradientTextView gradientTextView = (GradientTextView) ViewBindings.findChildViewById(rootView, R.id.price);
                                            if (gradientTextView != null) {
                                                i = R.id.tickets;
                                                FontText fontText2 = (FontText) ViewBindings.findChildViewById(rootView, R.id.tickets);
                                                if (fontText2 != null) {
                                                    return new ItemTicketBinding((RelativeLayout) rootView, linearLayout, fontText, textView, linearLayout2, imageView, constraintLayout, textView2, imageView2, textView3, gradientTextView, fontText2);
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
