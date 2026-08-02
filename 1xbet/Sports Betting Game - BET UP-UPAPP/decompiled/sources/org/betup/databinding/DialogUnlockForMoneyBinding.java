package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogUnlockForMoneyBinding implements ViewBinding {
    public final TextView cancel;
    public final TextView desc;
    public final TextView ok;
    public final TextView price;
    private final ConstraintLayout rootView;
    public final ImageView smallStar;
    public final TextView title;

    private DialogUnlockForMoneyBinding(ConstraintLayout rootView, TextView cancel, TextView desc, TextView ok, TextView price, ImageView smallStar, TextView title) {
        this.rootView = rootView;
        this.cancel = cancel;
        this.desc = desc;
        this.ok = ok;
        this.price = price;
        this.smallStar = smallStar;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogUnlockForMoneyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogUnlockForMoneyBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_unlock_for_money, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogUnlockForMoneyBinding bind(View rootView) {
        int i = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (textView != null) {
            i = R.id.desc;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
            if (textView2 != null) {
                i = R.id.ok;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                if (textView3 != null) {
                    i = R.id.price;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.price);
                    if (textView4 != null) {
                        i = R.id.smallStar;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.smallStar);
                        if (imageView != null) {
                            i = R.id.title;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                            if (textView5 != null) {
                                return new DialogUnlockForMoneyBinding((ConstraintLayout) rootView, textView, textView2, textView3, textView4, imageView, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
