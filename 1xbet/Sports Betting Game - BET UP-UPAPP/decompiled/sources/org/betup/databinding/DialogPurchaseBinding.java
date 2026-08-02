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
public final class DialogPurchaseBinding implements ViewBinding {
    public final TextView bonus;
    public final Group bonusGroup;
    public final TextView bonusLabel;
    public final TextView desc;
    public final ImageView icon;
    public final ImageView iconBonus;
    public final TextView money;
    public final TextView ok;
    private final ConstraintLayout rootView;
    public final TextView title;

    private DialogPurchaseBinding(ConstraintLayout rootView, TextView bonus, Group bonusGroup, TextView bonusLabel, TextView desc, ImageView icon, ImageView iconBonus, TextView money, TextView ok, TextView title) {
        this.rootView = rootView;
        this.bonus = bonus;
        this.bonusGroup = bonusGroup;
        this.bonusLabel = bonusLabel;
        this.desc = desc;
        this.icon = icon;
        this.iconBonus = iconBonus;
        this.money = money;
        this.ok = ok;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogPurchaseBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogPurchaseBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_purchase, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogPurchaseBinding bind(View rootView) {
        int i = R.id.bonus;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bonus);
        if (textView != null) {
            i = R.id.bonusGroup;
            Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.bonusGroup);
            if (group != null) {
                i = R.id.bonusLabel;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bonusLabel);
                if (textView2 != null) {
                    i = R.id.desc;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
                    if (textView3 != null) {
                        i = R.id.icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                        if (imageView != null) {
                            i = R.id.iconBonus;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iconBonus);
                            if (imageView2 != null) {
                                i = R.id.money;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money);
                                if (textView4 != null) {
                                    i = R.id.ok;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                                    if (textView5 != null) {
                                        i = R.id.title;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                        if (textView6 != null) {
                                            return new DialogPurchaseBinding((ConstraintLayout) rootView, textView, group, textView2, textView3, imageView, imageView2, textView4, textView5, textView6);
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
