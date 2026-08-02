package org.betup.ui.fragment.login;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public class LoginFragment_ViewBinding implements Unbinder {
    private LoginFragment target;
    private View view7f0a00c1;
    private View view7f0a0312;
    private View view7f0a040d;
    private View view7f0a056a;
    private View view7f0a0580;
    private View view7f0a07d0;

    public LoginFragment_ViewBinding(final LoginFragment target, View source) {
        this.target = target;
        target.constraintLayout = (ConstraintLayout) Utils.findRequiredViewAsType(source, R.id.container, "field 'constraintLayout'", ConstraintLayout.class);
        target.enterByFB = (Button) Utils.findRequiredViewAsType(source, R.id.fbButton, "field 'enterByFB'", Button.class);
        target.googleSignInButton = (Button) Utils.findRequiredViewAsType(source, R.id.googlePlusButton, "field 'googleSignInButton'", Button.class);
        target.signInButton = (Button) Utils.findRequiredViewAsType(source, R.id.signInButton, "field 'signInButton'", Button.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.vkButton, "field 'vkButton' and method 'vkClick'");
        target.vkButton = (Button) Utils.castView(findRequiredView, R.id.vkButton, "field 'vkButton'", Button.class);
        this.view7f0a07d0 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.login.LoginFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.vkClick();
            }
        });
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.loginTitle, "field 'title'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(source, R.id.loginRegOption, "field 'loginRegOption' and method 'onLogRegClick'");
        target.loginRegOption = (TextView) Utils.castView(findRequiredView2, R.id.loginRegOption, "field 'loginRegOption'", TextView.class);
        this.view7f0a040d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.login.LoginFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onLogRegClick();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(source, R.id.forgot_password, "field 'forgotPassword' and method 'forgotPasswordClick'");
        target.forgotPassword = (TextView) Utils.castView(findRequiredView3, R.id.forgot_password, "field 'forgotPassword'", TextView.class);
        this.view7f0a0312 = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.login.LoginFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.forgotPasswordClick();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(source, R.id.play_as_guest, "field 'playAsGuest' and method 'onPlayAsGuestClick'");
        target.playAsGuest = (TextView) Utils.castView(findRequiredView4, R.id.play_as_guest, "field 'playAsGuest'", TextView.class);
        this.view7f0a056a = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.login.LoginFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onPlayAsGuestClick();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(source, R.id.back, "field 'back' and method 'onBackClick'");
        target.back = findRequiredView5;
        this.view7f0a00c1 = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.login.LoginFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onBackClick();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(source, R.id.privacyButton, "field 'privacyButton' and method 'onPrivacyButtonClick'");
        target.privacyButton = (TextView) Utils.castView(findRequiredView6, R.id.privacyButton, "field 'privacyButton'", TextView.class);
        this.view7f0a0580 = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.login.LoginFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onPrivacyButtonClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        LoginFragment loginFragment = this.target;
        if (loginFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        loginFragment.constraintLayout = null;
        loginFragment.enterByFB = null;
        loginFragment.googleSignInButton = null;
        loginFragment.signInButton = null;
        loginFragment.vkButton = null;
        loginFragment.title = null;
        loginFragment.loginRegOption = null;
        loginFragment.forgotPassword = null;
        loginFragment.playAsGuest = null;
        loginFragment.back = null;
        loginFragment.privacyButton = null;
        this.view7f0a07d0.setOnClickListener(null);
        this.view7f0a07d0 = null;
        this.view7f0a040d.setOnClickListener(null);
        this.view7f0a040d = null;
        this.view7f0a0312.setOnClickListener(null);
        this.view7f0a0312 = null;
        this.view7f0a056a.setOnClickListener(null);
        this.view7f0a056a = null;
        this.view7f0a00c1.setOnClickListener(null);
        this.view7f0a00c1 = null;
        this.view7f0a0580.setOnClickListener(null);
        this.view7f0a0580 = null;
    }
}
