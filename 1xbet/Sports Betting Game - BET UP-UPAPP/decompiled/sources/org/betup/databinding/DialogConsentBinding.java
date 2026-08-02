package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogConsentBinding implements ViewBinding {
    public final TextView desc;
    public final TextView no;
    private final LinearLayout rootView;
    public final TextView title;
    public final TextView yes;

    private DialogConsentBinding(LinearLayout rootView, TextView desc, TextView no, TextView title, TextView yes) {
        this.rootView = rootView;
        this.desc = desc;
        this.no = no;
        this.title = title;
        this.yes = yes;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogConsentBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogConsentBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_consent, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogConsentBinding bind(View rootView) {
        int i = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
        if (textView != null) {
            i = R.id.no;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.no);
            if (textView2 != null) {
                i = R.id.title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                if (textView3 != null) {
                    i = R.id.yes;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.yes);
                    if (textView4 != null) {
                        return new DialogConsentBinding((LinearLayout) rootView, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
