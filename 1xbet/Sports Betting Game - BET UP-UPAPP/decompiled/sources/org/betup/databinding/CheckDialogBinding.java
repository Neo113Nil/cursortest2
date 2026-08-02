package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class CheckDialogBinding implements ViewBinding {
    public final TextView desc;
    public final RadioGroup group;
    public final TextView ok;
    private final RelativeLayout rootView;
    public final TextView secondButton;
    public final TextView subtitle;

    private CheckDialogBinding(RelativeLayout rootView, TextView desc, RadioGroup group, TextView ok, TextView secondButton, TextView subtitle) {
        this.rootView = rootView;
        this.desc = desc;
        this.group = group;
        this.ok = ok;
        this.secondButton = secondButton;
        this.subtitle = subtitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static CheckDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static CheckDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.check_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static CheckDialogBinding bind(View rootView) {
        int i = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
        if (textView != null) {
            i = R.id.group;
            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(rootView, R.id.group);
            if (radioGroup != null) {
                i = R.id.ok;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                if (textView2 != null) {
                    i = R.id.secondButton;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondButton);
                    if (textView3 != null) {
                        i = R.id.subtitle;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
                        if (textView4 != null) {
                            return new CheckDialogBinding((RelativeLayout) rootView, textView, radioGroup, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
