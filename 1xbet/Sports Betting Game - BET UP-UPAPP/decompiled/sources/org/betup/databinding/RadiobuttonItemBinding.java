package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.viewbinding.ViewBinding;
import org.betup.R;

/* loaded from: classes2.dex */
public final class RadiobuttonItemBinding implements ViewBinding {
    public final AppCompatRadioButton radio;
    private final AppCompatRadioButton rootView;

    private RadiobuttonItemBinding(AppCompatRadioButton rootView, AppCompatRadioButton radio) {
        this.rootView = rootView;
        this.radio = radio;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AppCompatRadioButton getRoot() {
        return this.rootView;
    }

    public static RadiobuttonItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static RadiobuttonItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.radiobutton_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static RadiobuttonItemBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) rootView;
        return new RadiobuttonItemBinding(appCompatRadioButton, appCompatRadioButton);
    }
}
