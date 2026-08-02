package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import java.util.Date;
import java.util.GregorianCalendar;
import org.betup.R;

/* loaded from: classes2.dex */
public class DateTimePickerDialog extends BaseDialog {
    private Builder builder;

    @BindView(R.id.date)
    DatePicker datePicker;

    @BindView(R.id.time)
    TimePicker timePicker;

    public interface DateTimePickedListener {
        void onCanceled();

        void onTimestampSelected(long timestamp);
    }

    public enum Mode {
        DATE,
        TIME,
        DATETIME
    }

    public DateTimePickerDialog(Context context, Builder builder) {
        super(R.layout.dialog_picker, context);
        this.builder = builder;
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        if (this.builder.mode != Mode.DATETIME) {
            if (this.builder.mode != Mode.DATE) {
                this.datePicker.setVisibility(8);
            } else {
                this.datePicker.setMaxDate(new Date().getTime());
                this.timePicker.setVisibility(8);
            }
        }
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
        if (this.builder.listener != null) {
            this.builder.listener.onTimestampSelected(new GregorianCalendar(this.datePicker.getYear(), this.datePicker.getMonth(), this.datePicker.getDayOfMonth()).getTimeInMillis());
        }
    }

    @OnClick({R.id.cancel})
    public void onCancelClick() {
        dismiss();
        if (this.builder.listener != null) {
            this.builder.listener.onCanceled();
        }
    }

    public static class Builder {
        private Context context;
        private DateTimePickedListener listener;
        private Mode mode = Mode.DATE;
        private long time;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder mode(Mode mode) {
            this.mode = mode;
            return this;
        }

        public Builder currentTime(long time) {
            this.time = time;
            return this;
        }

        public Builder setListener(DateTimePickedListener listener) {
            this.listener = listener;
            return this;
        }

        public DateTimePickerDialog build() {
            return new DateTimePickerDialog(this.context, this);
        }
    }
}
