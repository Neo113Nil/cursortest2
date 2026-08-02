package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogTestPreventBinding implements ViewBinding {
    public final TextView desc;
    public final TextView ok;
    private final RelativeLayout rootView;

    private DialogTestPreventBinding(RelativeLayout rootView, TextView desc, TextView ok) {
        this.rootView = rootView;
        this.desc = desc;
        this.ok = ok;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogTestPreventBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogTestPreventBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_test_prevent, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogTestPreventBinding bind(View rootView) {
        int i = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
        if (textView != null) {
            i = R.id.ok;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
            if (textView2 != null) {
                return new DialogTestPreventBinding((RelativeLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
