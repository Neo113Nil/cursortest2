package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogInviteCodeBinding implements ViewBinding {
    public final EditText code;
    public final TextView desc;
    public final TextView ok;
    private final RelativeLayout rootView;
    public final TextView secondButton;
    public final TextView subtitle;

    private DialogInviteCodeBinding(RelativeLayout rootView, EditText code, TextView desc, TextView ok, TextView secondButton, TextView subtitle) {
        this.rootView = rootView;
        this.code = code;
        this.desc = desc;
        this.ok = ok;
        this.secondButton = secondButton;
        this.subtitle = subtitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogInviteCodeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogInviteCodeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_invite_code, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogInviteCodeBinding bind(View rootView) {
        int i = R.id.code;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.code);
        if (editText != null) {
            i = R.id.desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
            if (textView != null) {
                i = R.id.ok;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                if (textView2 != null) {
                    i = R.id.secondButton;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondButton);
                    if (textView3 != null) {
                        i = R.id.subtitle;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
                        if (textView4 != null) {
                            return new DialogInviteCodeBinding((RelativeLayout) rootView, editText, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
