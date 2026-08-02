package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.betup.R;

/* loaded from: classes2.dex */
public class RadioDialog<T> extends BaseDialog implements View.OnClickListener {
    private Builder<T> builder;

    @BindView(R.id.group)
    RadioGroup group;

    @BindView(R.id.ok)
    TextView ok;
    private SparseArray<String> options;

    @BindView(R.id.secondButton)
    TextView secondButton;
    private T selected;

    @BindView(R.id.desc)
    TextView subtitle;

    @BindView(R.id.subtitle)
    TextView title;

    public interface OnButtonClickListener<T> {
        void onButtonClick(Dialog dialog, T tag);
    }

    public interface OnSelectedDialogOptionListener<T> {
        void onOptionSelected(T tag);
    }

    private RadioDialog(Context context, Builder<T> builder) {
        super(context);
        this.builder = builder;
        this.layout = R.layout.check_dialog;
        this.options = new SparseArray<>();
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ButterKnife.bind(this);
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService("layout_inflater");
        int i = 0;
        for (String str : ((Builder) this.builder).items.keySet()) {
            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) layoutInflater.inflate(R.layout.radiobutton_item, (ViewGroup) this.group, false);
            Log.d("RADIOTEST", "INSERTED");
            this.selected = (T) ((Builder) this.builder).checked;
            if (((Builder) this.builder).checked != null && ((Builder) this.builder).items.get(str).equals(((Builder) this.builder).checked)) {
                appCompatRadioButton.setChecked(true);
            }
            appCompatRadioButton.setTextColor(ContextCompat.getColor(getContext(), R.color.white));
            appCompatRadioButton.setText(String.format(Locale.getDefault(), " %s", str));
            int i2 = i + 1;
            int i3 = i + 1000;
            appCompatRadioButton.setId(i3);
            this.options.put(i3, str);
            appCompatRadioButton.setOnClickListener(this);
            this.group.addView(appCompatRadioButton);
            i = i2;
        }
        if (!((Builder) this.builder).firstButtonEnabled) {
            this.ok.setVisibility(8);
        } else if (((Builder) this.builder).firstButtonTitle != null) {
            this.ok.setText(((Builder) this.builder).firstButtonTitle);
        }
        if (!((Builder) this.builder).secondButtonEnabled) {
            this.secondButton.setVisibility(8);
        } else if (((Builder) this.builder).secondButtonTitle != null) {
            this.secondButton.setText(((Builder) this.builder).secondButtonTitle);
        }
        if (((Builder) this.builder).onFirstButtonClickListener != null) {
            this.ok.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.dialogs.RadioDialog.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    if (RadioDialog.this.builder.autoDismiss) {
                        RadioDialog.this.dismiss();
                    }
                    OnButtonClickListener onButtonClickListener = RadioDialog.this.builder.onFirstButtonClickListener;
                    RadioDialog radioDialog = RadioDialog.this;
                    onButtonClickListener.onButtonClick(radioDialog, radioDialog.selected);
                }
            });
        }
        if (((Builder) this.builder).onSecondButtonClickListener != null) {
            this.secondButton.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.dialogs.RadioDialog.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    if (RadioDialog.this.builder.autoDismiss) {
                        RadioDialog.this.dismiss();
                    }
                    OnButtonClickListener onButtonClickListener = RadioDialog.this.builder.onSecondButtonClickListener;
                    RadioDialog radioDialog = RadioDialog.this;
                    onButtonClickListener.onButtonClick(radioDialog, radioDialog.selected);
                }
            });
        }
        if (((Builder) this.builder).subtitle != null) {
            this.subtitle.setText(((Builder) this.builder).subtitle);
        } else {
            this.subtitle.setVisibility(8);
        }
        if (((Builder) this.builder).title != null) {
            this.title.setText(((Builder) this.builder).title);
        } else {
            this.subtitle.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Log.d("RADIOTEST", "CLICKED!");
        if (((Builder) this.builder).onSelectedDialogOptionListener != null) {
            ((Builder) this.builder).onSelectedDialogOptionListener.onOptionSelected(((Builder) this.builder).items.get(this.options.get(view.getId())));
        }
        this.selected = (T) ((Builder) this.builder).items.get(this.options.get(view.getId()));
        Log.d("RADIOTEST", "SELECTED " + this.selected);
        if (((Builder) this.builder).autoDismiss) {
            dismiss();
        }
    }

    public static class Builder<T> {
        private boolean autoDismiss;
        private T checked;
        private Context context;
        private boolean firstButtonEnabled;
        private String firstButtonTitle;
        private Map<String, T> items = new LinkedHashMap();
        private OnButtonClickListener<T> onFirstButtonClickListener;
        private OnButtonClickListener<T> onSecondButtonClickListener;
        private OnSelectedDialogOptionListener<T> onSelectedDialogOptionListener;
        private boolean secondButtonEnabled;
        private String secondButtonTitle;
        private String subtitle;
        private String title;

        public Builder<T> setOnFirstButtonClickListener(OnButtonClickListener<T> onFirstButtonClickListener) {
            this.onFirstButtonClickListener = onFirstButtonClickListener;
            return this;
        }

        public Builder<T> setOnSecondButtonClickListener(OnButtonClickListener<T> onSecondButtonClickListener) {
            this.onSecondButtonClickListener = onSecondButtonClickListener;
            return this;
        }

        public Builder(Context context) {
            this.context = context;
        }

        public Builder<T> title(String title) {
            this.title = title;
            return this;
        }

        public Builder<T> subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public Builder<T> setOnSelectedDialogOptionListener(OnSelectedDialogOptionListener<T> listener) {
            this.onSelectedDialogOptionListener = listener;
            return this;
        }

        public Builder<T> addItem(T tag, String title) {
            this.items.put(title, tag);
            return this;
        }

        public Builder<T> firstButtonTitle(String firstButtonTitle) {
            this.firstButtonTitle = firstButtonTitle;
            return this;
        }

        public Builder<T> secondButtonTitle(String secondButtonTitle) {
            this.secondButtonTitle = secondButtonTitle;
            return this;
        }

        public Builder<T> firstButtonEnabled(boolean firstButtonEnabled) {
            this.firstButtonEnabled = firstButtonEnabled;
            return this;
        }

        public Builder<T> secondButtonEnabled(boolean secondButtonEnabled) {
            this.secondButtonEnabled = secondButtonEnabled;
            return this;
        }

        public Builder<T> currentChecked(T checked) {
            this.checked = checked;
            return this;
        }

        public Builder<T> setAutoDismiss(boolean autoDismiss) {
            this.autoDismiss = autoDismiss;
            return this;
        }

        public RadioDialog<T> build() {
            return new RadioDialog<>(this.context, this);
        }
    }
}
