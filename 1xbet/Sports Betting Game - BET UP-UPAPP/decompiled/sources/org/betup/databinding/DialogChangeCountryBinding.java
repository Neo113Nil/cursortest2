package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogChangeCountryBinding implements ViewBinding {
    public final TextView cancel;
    public final TextView ok;
    public final ProgressBar progress;
    private final LinearLayout rootView;
    public final Spinner spinner;

    private DialogChangeCountryBinding(LinearLayout rootView, TextView cancel, TextView ok, ProgressBar progress, Spinner spinner) {
        this.rootView = rootView;
        this.cancel = cancel;
        this.ok = ok;
        this.progress = progress;
        this.spinner = spinner;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogChangeCountryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogChangeCountryBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_change_country, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogChangeCountryBinding bind(View rootView) {
        int i = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (textView != null) {
            i = R.id.ok;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
            if (textView2 != null) {
                i = R.id.progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                if (progressBar != null) {
                    i = R.id.spinner;
                    Spinner spinner = (Spinner) ViewBindings.findChildViewById(rootView, R.id.spinner);
                    if (spinner != null) {
                        return new DialogChangeCountryBinding((LinearLayout) rootView, textView, textView2, progressBar, spinner);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
