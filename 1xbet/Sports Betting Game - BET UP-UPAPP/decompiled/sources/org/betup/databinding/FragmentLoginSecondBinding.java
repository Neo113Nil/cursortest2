package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class FragmentLoginSecondBinding implements ViewBinding {
    public final AlphaPressButton back;
    public final TextView backButton;
    public final TextView bottomDivider;
    public final ConstraintLayout container;
    public final View divider;
    public final Button fbButton;
    public final TextView forgotPassword;
    public final Button googlePlusButton;
    public final ImageView imageView;
    public final TextView loginRegOption;
    public final TextView loginTitle;
    public final TextView playAsGuest;
    public final TextView privacyButton;
    private final ConstraintLayout rootView;
    public final Button signInButton;
    public final Button vkButton;

    private FragmentLoginSecondBinding(ConstraintLayout rootView, AlphaPressButton back, TextView backButton, TextView bottomDivider, ConstraintLayout container, View divider, Button fbButton, TextView forgotPassword, Button googlePlusButton, ImageView imageView, TextView loginRegOption, TextView loginTitle, TextView playAsGuest, TextView privacyButton, Button signInButton, Button vkButton) {
        this.rootView = rootView;
        this.back = back;
        this.backButton = backButton;
        this.bottomDivider = bottomDivider;
        this.container = container;
        this.divider = divider;
        this.fbButton = fbButton;
        this.forgotPassword = forgotPassword;
        this.googlePlusButton = googlePlusButton;
        this.imageView = imageView;
        this.loginRegOption = loginRegOption;
        this.loginTitle = loginTitle;
        this.playAsGuest = playAsGuest;
        this.privacyButton = privacyButton;
        this.signInButton = signInButton;
        this.vkButton = vkButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLoginSecondBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentLoginSecondBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_login_second, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLoginSecondBinding bind(View rootView) {
        int i = R.id.back;
        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.back);
        if (alphaPressButton != null) {
            i = R.id.back_button;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.back_button);
            if (textView != null) {
                i = R.id.bottomDivider;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bottomDivider);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                    i = R.id.divider;
                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
                    if (findChildViewById != null) {
                        i = R.id.fbButton;
                        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.fbButton);
                        if (button != null) {
                            i = R.id.forgot_password;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.forgot_password);
                            if (textView3 != null) {
                                i = R.id.googlePlusButton;
                                Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.googlePlusButton);
                                if (button2 != null) {
                                    i = R.id.imageView;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                                    if (imageView != null) {
                                        i = R.id.loginRegOption;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.loginRegOption);
                                        if (textView4 != null) {
                                            i = R.id.loginTitle;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.loginTitle);
                                            if (textView5 != null) {
                                                i = R.id.play_as_guest;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.play_as_guest);
                                                if (textView6 != null) {
                                                    i = R.id.privacyButton;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.privacyButton);
                                                    if (textView7 != null) {
                                                        i = R.id.signInButton;
                                                        Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.signInButton);
                                                        if (button3 != null) {
                                                            i = R.id.vkButton;
                                                            Button button4 = (Button) ViewBindings.findChildViewById(rootView, R.id.vkButton);
                                                            if (button4 != null) {
                                                                return new FragmentLoginSecondBinding(constraintLayout, alphaPressButton, textView, textView2, constraintLayout, findChildViewById, button, textView3, button2, imageView, textView4, textView5, textView6, textView7, button3, button4);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
