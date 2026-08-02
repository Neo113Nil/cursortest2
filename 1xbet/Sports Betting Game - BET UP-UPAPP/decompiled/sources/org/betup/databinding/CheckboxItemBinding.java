package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class CheckboxItemBinding implements ViewBinding {
    public final CheckBox box;
    private final LinearLayout rootView;

    private CheckboxItemBinding(LinearLayout rootView, CheckBox box) {
        this.rootView = rootView;
        this.box = box;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CheckboxItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static CheckboxItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.checkbox_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static CheckboxItemBinding bind(View rootView) {
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.box);
        if (checkBox != null) {
            return new CheckboxItemBinding((LinearLayout) rootView, checkBox);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.box)));
    }
}
