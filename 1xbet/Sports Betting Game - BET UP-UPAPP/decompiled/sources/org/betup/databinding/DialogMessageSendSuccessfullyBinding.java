package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogMessageSendSuccessfullyBinding implements ViewBinding {
    public final TextView messageSuccessSend;
    public final Button ok;
    private final LinearLayout rootView;

    private DialogMessageSendSuccessfullyBinding(LinearLayout rootView, TextView messageSuccessSend, Button ok) {
        this.rootView = rootView;
        this.messageSuccessSend = messageSuccessSend;
        this.ok = ok;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogMessageSendSuccessfullyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogMessageSendSuccessfullyBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_message_send_successfully, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogMessageSendSuccessfullyBinding bind(View rootView) {
        int i = R.id.message_success_send;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.message_success_send);
        if (textView != null) {
            i = R.id.ok;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.ok);
            if (button != null) {
                return new DialogMessageSendSuccessfullyBinding((LinearLayout) rootView, textView, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
