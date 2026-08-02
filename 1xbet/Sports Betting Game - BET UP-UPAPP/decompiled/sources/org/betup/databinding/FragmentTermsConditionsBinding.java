package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentTermsConditionsBinding implements ViewBinding {
    public final AppCompatCheckBox check;
    public final LinearLayout containerDescription;
    public final ImageView icon;
    private final ConstraintLayout rootView;
    public final TextView subtitle;
    public final TextView title;

    private FragmentTermsConditionsBinding(ConstraintLayout rootView, AppCompatCheckBox check, LinearLayout containerDescription, ImageView icon, TextView subtitle, TextView title) {
        this.rootView = rootView;
        this.check = check;
        this.containerDescription = containerDescription;
        this.icon = icon;
        this.subtitle = subtitle;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTermsConditionsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentTermsConditionsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_terms_conditions, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTermsConditionsBinding bind(View rootView) {
        int i = R.id.check;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check);
        if (appCompatCheckBox != null) {
            i = R.id.container_description;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container_description);
            if (linearLayout != null) {
                i = R.id.icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                if (imageView != null) {
                    i = R.id.subtitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
                    if (textView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                        if (textView2 != null) {
                            return new FragmentTermsConditionsBinding((ConstraintLayout) rootView, appCompatCheckBox, linearLayout, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
