package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogOneTimeOfferAcceptedBinding implements ViewBinding {
    public final TextView desc;
    public final TextView ok;
    private final ConstraintLayout rootView;
    public final TextView title;
    public final TextView what;

    private DialogOneTimeOfferAcceptedBinding(ConstraintLayout rootView, TextView desc, TextView ok, TextView title, TextView what) {
        this.rootView = rootView;
        this.desc = desc;
        this.ok = ok;
        this.title = title;
        this.what = what;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogOneTimeOfferAcceptedBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogOneTimeOfferAcceptedBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_one_time_offer_accepted, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogOneTimeOfferAcceptedBinding bind(View rootView) {
        int i = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
        if (textView != null) {
            i = R.id.ok;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
            if (textView2 != null) {
                i = R.id.title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                if (textView3 != null) {
                    i = R.id.what;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.what);
                    if (textView4 != null) {
                        return new DialogOneTimeOfferAcceptedBinding((ConstraintLayout) rootView, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
