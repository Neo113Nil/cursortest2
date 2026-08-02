package org.betup.ui.fragment.matches.dialog;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import java.util.ArrayList;
import java.util.Scanner;
import org.betup.R;
import org.betup.ui.fragment.home.dialog.BaseDialog;
import org.betup.ui.fragment.matches.dialog.adapter.ChooseTimeAdapter;

/* loaded from: classes4.dex */
public class ChooseTimeDialog extends BaseDialog {
    private static final boolean DAYS = false;
    private static final boolean HOURS = true;

    @BindView(R.id.timeCancelButton)
    Button cancelButton;
    private Context context;

    @BindView(R.id.timeOkButton)
    Button okButton;
    private OnTimeDialogClickListener onTimeDialogClickListener;

    @BindView(R.id.timeSpinner)
    Spinner timeOptions;

    public interface OnTimeDialogClickListener {
        void timeChosenClick(int time, boolean isHours);
    }

    public ChooseTimeDialog(Context context) {
        super(context);
        this.context = context;
    }

    @Override // org.betup.ui.fragment.home.dialog.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_choose_time);
        ButterKnife.bind(this);
        fillSpinner();
        resizeDialog();
    }

    private void fillSpinner() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("3 hours");
        arrayList.add("6 hours");
        arrayList.add("12 hours");
        arrayList.add("24 hours");
        arrayList.add("3 days");
        arrayList.add("7 days");
        this.timeOptions.setAdapter((SpinnerAdapter) new ChooseTimeAdapter(this.context, arrayList));
    }

    @OnClick({R.id.timeOkButton})
    void okButtonClicked() {
        int nextInt = new Scanner(this.timeOptions.getSelectedItem().toString()).useDelimiter("[^0-9]+").nextInt();
        if (this.timeOptions.getSelectedItem().toString().contains("days")) {
            Log.e("SPINNER", "days");
            Log.e("SPINNER", String.valueOf(nextInt));
            this.onTimeDialogClickListener.timeChosenClick(nextInt, false);
        } else {
            Log.e("SPINNER", "hours");
            Log.e("SPINNER", String.valueOf(nextInt));
            this.onTimeDialogClickListener.timeChosenClick(nextInt, true);
        }
        dismiss();
    }

    @OnClick({R.id.timeCancelButton})
    void cancelButtonClicked() {
        dismiss();
    }

    public ChooseTimeDialog setOnTimeDialogClickListener(OnTimeDialogClickListener onTimeDialogClickListener) {
        this.onTimeDialogClickListener = onTimeDialogClickListener;
        return this;
    }
}
