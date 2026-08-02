package org.betup.ui.fragment.home.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public class SignInDialog_ViewBinding implements Unbinder {
    private SignInDialog target;
    private View view7f0a0176;
    private View view7f0a05dc;
    private View view7f0a05e6;
    private View view7f0a0695;

    public SignInDialog_ViewBinding(SignInDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public SignInDialog_ViewBinding(final SignInDialog target, View source) {
        this.target = target;
        target.emailEditText = (EditText) Utils.findRequiredViewAsType(source, R.id.email, "field 'emailEditText'", EditText.class);
        target.passEditText = (EditText) Utils.findRequiredViewAsType(source, R.id.password, "field 'passEditText'", EditText.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.registerButton, "field 'registerButton' and method 'regClick'");
        target.registerButton = (Button) Utils.castView(findRequiredView, R.id.registerButton, "field 'registerButton'", Button.class);
        this.view7f0a05dc = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.home.dialog.SignInDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.regClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.resetPass, "field 'resetPass' and method 'resetPassClick'");
        target.resetPass = (TextView) Utils.castView(findRequiredView2, R.id.resetPass, "field 'resetPass'", TextView.class);
        this.view7f0a05e6 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.home.dialog.SignInDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.resetPassClick();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(source, R.id.cancelButton, "method 'cancelClick'");
        this.view7f0a0176 = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.home.dialog.SignInDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.cancelClick();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(source, R.id.signInButton, "method 'signInClick'");
        this.view7f0a0695 = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.home.dialog.SignInDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.signInClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SignInDialog signInDialog = this.target;
        if (signInDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        signInDialog.emailEditText = null;
        signInDialog.passEditText = null;
        signInDialog.registerButton = null;
        signInDialog.resetPass = null;
        this.view7f0a05dc.setOnClickListener(null);
        this.view7f0a05dc = null;
        this.view7f0a05e6.setOnClickListener(null);
        this.view7f0a05e6 = null;
        this.view7f0a0176.setOnClickListener(null);
        this.view7f0a0176 = null;
        this.view7f0a0695.setOnClickListener(null);
        this.view7f0a0695 = null;
    }
}
