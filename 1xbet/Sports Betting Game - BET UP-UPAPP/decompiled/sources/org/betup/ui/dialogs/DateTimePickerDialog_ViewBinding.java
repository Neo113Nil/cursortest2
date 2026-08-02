package org.betup.ui.dialogs;

import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class DateTimePickerDialog_ViewBinding implements Unbinder {
    private DateTimePickerDialog target;
    private View view7f0a0175;
    private View view7f0a0524;

    public DateTimePickerDialog_ViewBinding(DateTimePickerDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public DateTimePickerDialog_ViewBinding(final DateTimePickerDialog target, View source) {
        this.target = target;
        target.datePicker = (DatePicker) Utils.findRequiredViewAsType(source, R.id.date, "field 'datePicker'", DatePicker.class);
        target.timePicker = (TimePicker) Utils.findRequiredViewAsType(source, R.id.time, "field 'timePicker'", TimePicker.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.DateTimePickerDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.cancel, "method 'onCancelClick'");
        this.view7f0a0175 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.DateTimePickerDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onCancelClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DateTimePickerDialog dateTimePickerDialog = this.target;
        if (dateTimePickerDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        dateTimePickerDialog.datePicker = null;
        dateTimePickerDialog.timePicker = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
        this.view7f0a0175.setOnClickListener(null);
        this.view7f0a0175 = null;
    }
}
