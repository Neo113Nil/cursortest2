package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogSignUpBinding implements ViewBinding {
    public final Button cancelButton;
    public final EditText email;
    public final EditText name;
    public final EditText password;
    public final EditText retypePass;
    private final LinearLayout rootView;
    public final Button signInButton;

    private DialogSignUpBinding(LinearLayout rootView, Button cancelButton, EditText email, EditText name, EditText password, EditText retypePass, Button signInButton) {
        this.rootView = rootView;
        this.cancelButton = cancelButton;
        this.email = email;
        this.name = name;
        this.password = password;
        this.retypePass = retypePass;
        this.signInButton = signInButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogSignUpBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogSignUpBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_sign_up, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSignUpBinding bind(View rootView) {
        int i = R.id.cancelButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.cancelButton);
        if (button != null) {
            i = R.id.email;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.email);
            if (editText != null) {
                i = R.id.name;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.name);
                if (editText2 != null) {
                    i = R.id.password;
                    EditText editText3 = (EditText) ViewBindings.findChildViewById(rootView, R.id.password);
                    if (editText3 != null) {
                        i = R.id.retypePass;
                        EditText editText4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.retypePass);
                        if (editText4 != null) {
                            i = R.id.signInButton;
                            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.signInButton);
                            if (button2 != null) {
                                return new DialogSignUpBinding((LinearLayout) rootView, button, editText, editText2, editText3, editText4, button2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
