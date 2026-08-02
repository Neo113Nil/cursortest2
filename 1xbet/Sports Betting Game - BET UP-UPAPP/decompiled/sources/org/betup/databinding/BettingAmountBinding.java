package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class BettingAmountBinding implements ViewBinding {
    public final ImageView add;
    public final EditText amount;
    public final RelativeLayout amountContainer;
    public final EditText fictive;
    private final RelativeLayout rootView;

    private BettingAmountBinding(RelativeLayout rootView, ImageView add, EditText amount, RelativeLayout amountContainer, EditText fictive) {
        this.rootView = rootView;
        this.add = add;
        this.amount = amount;
        this.amountContainer = amountContainer;
        this.fictive = fictive;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static BettingAmountBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static BettingAmountBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.betting_amount, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static BettingAmountBinding bind(View rootView) {
        int i = R.id.add;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.add);
        if (imageView != null) {
            i = R.id.amount;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.amount);
            if (editText != null) {
                RelativeLayout relativeLayout = (RelativeLayout) rootView;
                i = R.id.fictive;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.fictive);
                if (editText2 != null) {
                    return new BettingAmountBinding(relativeLayout, imageView, editText, relativeLayout, editText2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
