package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemDailyBonusBinding implements ViewBinding {
    public final TextView betcoins;
    public final ImageView betcoinsIcon;
    public final Group betcoinsInfo;
    public final ImageView bonusIcon;
    public final ConstraintLayout bonusInfoContainer;
    public final ImageView check;
    public final TextView dayLabel;
    private final ConstraintLayout rootView;

    private ItemDailyBonusBinding(ConstraintLayout rootView, TextView betcoins, ImageView betcoinsIcon, Group betcoinsInfo, ImageView bonusIcon, ConstraintLayout bonusInfoContainer, ImageView check, TextView dayLabel) {
        this.rootView = rootView;
        this.betcoins = betcoins;
        this.betcoinsIcon = betcoinsIcon;
        this.betcoinsInfo = betcoinsInfo;
        this.bonusIcon = bonusIcon;
        this.bonusInfoContainer = bonusInfoContainer;
        this.check = check;
        this.dayLabel = dayLabel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemDailyBonusBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemDailyBonusBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_daily_bonus, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemDailyBonusBinding bind(View rootView) {
        int i = R.id.betcoins;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.betcoins);
        if (textView != null) {
            i = R.id.betcoinsIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.betcoinsIcon);
            if (imageView != null) {
                i = R.id.betcoinsInfo;
                Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.betcoinsInfo);
                if (group != null) {
                    i = R.id.bonusIcon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bonusIcon);
                    if (imageView2 != null) {
                        i = R.id.bonusInfoContainer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.bonusInfoContainer);
                        if (constraintLayout != null) {
                            i = R.id.check;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.check);
                            if (imageView3 != null) {
                                i = R.id.day_label;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_label);
                                if (textView2 != null) {
                                    return new ItemDailyBonusBinding((ConstraintLayout) rootView, textView, imageView, group, imageView2, constraintLayout, imageView3, textView2);
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
