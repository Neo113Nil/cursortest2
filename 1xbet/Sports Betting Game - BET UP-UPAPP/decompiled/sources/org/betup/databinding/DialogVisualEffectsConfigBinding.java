package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogVisualEffectsConfigBinding implements ViewBinding {
    public final RadioGroup betSuggestionRadioGroup;
    public final TextView cancelButton;
    public final CheckBox disable;
    public final CheckBox enable;
    public final TextView okButton;
    private final LinearLayout rootView;

    private DialogVisualEffectsConfigBinding(LinearLayout rootView, RadioGroup betSuggestionRadioGroup, TextView cancelButton, CheckBox disable, CheckBox enable, TextView okButton) {
        this.rootView = rootView;
        this.betSuggestionRadioGroup = betSuggestionRadioGroup;
        this.cancelButton = cancelButton;
        this.disable = disable;
        this.enable = enable;
        this.okButton = okButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogVisualEffectsConfigBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogVisualEffectsConfigBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_visual_effects_config, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogVisualEffectsConfigBinding bind(View rootView) {
        int i = R.id.bet_suggestion_radio_group;
        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(rootView, R.id.bet_suggestion_radio_group);
        if (radioGroup != null) {
            i = R.id.cancel_button;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel_button);
            if (textView != null) {
                i = R.id.disable;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.disable);
                if (checkBox != null) {
                    i = R.id.enable;
                    CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.enable);
                    if (checkBox2 != null) {
                        i = R.id.ok_button;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok_button);
                        if (textView2 != null) {
                            return new DialogVisualEffectsConfigBinding((LinearLayout) rootView, radioGroup, textView, checkBox, checkBox2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
