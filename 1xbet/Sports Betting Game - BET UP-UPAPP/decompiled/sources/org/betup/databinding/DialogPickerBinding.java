package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogPickerBinding implements ViewBinding {
    public final TextView cancel;
    public final DatePicker date;
    public final TextView ok;
    private final LinearLayout rootView;
    public final TimePicker time;

    private DialogPickerBinding(LinearLayout rootView, TextView cancel, DatePicker date, TextView ok, TimePicker time) {
        this.rootView = rootView;
        this.cancel = cancel;
        this.date = date;
        this.ok = ok;
        this.time = time;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogPickerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogPickerBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_picker, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogPickerBinding bind(View rootView) {
        int i = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (textView != null) {
            i = R.id.date;
            DatePicker datePicker = (DatePicker) ViewBindings.findChildViewById(rootView, R.id.date);
            if (datePicker != null) {
                i = R.id.ok;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                if (textView2 != null) {
                    i = R.id.time;
                    TimePicker timePicker = (TimePicker) ViewBindings.findChildViewById(rootView, R.id.time);
                    if (timePicker != null) {
                        return new DialogPickerBinding((LinearLayout) rootView, textView, datePicker, textView2, timePicker);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
