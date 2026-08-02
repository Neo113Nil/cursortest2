package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemDrawerUserProfileBinding implements ViewBinding {
    public final TextView available;
    public final LinearLayout balanceBox;
    public final TextView inPlay;
    public final TextView returnText;
    private final RelativeLayout rootView;

    private ItemDrawerUserProfileBinding(RelativeLayout rootView, TextView available, LinearLayout balanceBox, TextView inPlay, TextView returnText) {
        this.rootView = rootView;
        this.available = available;
        this.balanceBox = balanceBox;
        this.inPlay = inPlay;
        this.returnText = returnText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemDrawerUserProfileBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemDrawerUserProfileBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_drawer_user_profile, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemDrawerUserProfileBinding bind(View rootView) {
        int i = R.id.available;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.available);
        if (textView != null) {
            i = R.id.balanceBox;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.balanceBox);
            if (linearLayout != null) {
                i = R.id.inPlay;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inPlay);
                if (textView2 != null) {
                    i = R.id.returnText;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.returnText);
                    if (textView3 != null) {
                        return new ItemDrawerUserProfileBinding((RelativeLayout) rootView, textView, linearLayout, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
