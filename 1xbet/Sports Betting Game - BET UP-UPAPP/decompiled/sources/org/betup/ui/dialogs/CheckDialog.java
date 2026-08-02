package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.betup.R;

/* loaded from: classes2.dex */
public class CheckDialog<T> extends BaseDialog implements View.OnClickListener {
    private Builder<T> builder;

    @BindView(R.id.group)
    RadioGroup group;

    @BindView(R.id.ok)
    TextView ok;
    private SparseArray<String> options;

    @BindView(R.id.secondButton)
    TextView secondButton;
    private Set<T> selected;

    @BindView(R.id.desc)
    TextView subtitle;

    @BindView(R.id.subtitle)
    TextView title;

    public interface OnCheckDialogButtonClickListener<T> {
        void onClick(Collection<T> taskTypeList);
    }

    private CheckDialog(Context context, Builder<T> builder) {
        super(context);
        this.builder = builder;
        this.layout = R.layout.check_dialog;
        this.options = new SparseArray<>();
        this.selected = new HashSet();
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ButterKnife.bind(this);
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService("layout_inflater");
        int i = 0;
        for (String str : ((Builder) this.builder).items.keySet()) {
            CheckBox checkBox = (CheckBox) layoutInflater.inflate(R.layout.checkbox_item, this.group).findViewById(R.id.box);
            if (((Builder) this.builder).checked != null && ((Builder) this.builder).items.get(str).equals(((Builder) this.builder).checked)) {
                checkBox.setChecked(true);
            }
            checkBox.setText(" " + str);
            int i2 = i + 1;
            checkBox.setId(i + 1000);
            checkBox.setOnClickListener(this);
            if (((Builder) this.builder).checked.contains(((Builder) this.builder).items.get(str))) {
                checkBox.setChecked(true);
                this.selected.add(((Builder) this.builder).items.get(str));
            }
            this.options.append(checkBox.getId(), str);
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
            this.ok.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.dialogs.CheckDialog.1
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    if (CheckDialog.this.builder.autoDismiss) {
                        CheckDialog.this.dismiss();
                    }
                    CheckDialog.this.builder.onFirstButtonClickListener.onClick(CheckDialog.this.selected);
                }
            });
        }
        if (((Builder) this.builder).onSecondButtonClickListener != null) {
            this.secondButton.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.dialogs.CheckDialog.2
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    if (CheckDialog.this.builder.autoDismiss) {
                        CheckDialog.this.dismiss();
                    }
                    CheckDialog.this.builder.onSecondButtonClickListener.onClick(CheckDialog.this.selected);
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Log.d("RADIODEV", "CLICKED!");
        if (((CheckBox) view).isChecked()) {
            this.selected.add(((Builder) this.builder).items.get(this.options.get(view.getId())));
        } else {
            this.selected.remove(((Builder) this.builder).items.get(this.options.get(view.getId())));
        }
    }

    public static class Builder<T> {
        private boolean autoDismiss;
        private Context context;
        private boolean firstButtonEnabled;
        private String firstButtonTitle;
        private OnCheckDialogButtonClickListener<T> onFirstButtonClickListener;
        private OnCheckDialogButtonClickListener<T> onSecondButtonClickListener;
        private boolean secondButtonEnabled;
        private String secondButtonTitle;
        private String subtitle;
        private String title;
        private Map<String, T> items = new LinkedHashMap();
        private Set<T> checked = new HashSet();

        public Builder<T> setOnFirstButtonClickListener(OnCheckDialogButtonClickListener<T> onFirstButtonClickListener) {
            this.onFirstButtonClickListener = onFirstButtonClickListener;
            return this;
        }

        public Builder<T> setOnSecondButtonClickListener(OnCheckDialogButtonClickListener<T> onSecondButtonClickListener) {
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

        public Builder<T> currentChecked(Collection<T> checked) {
            this.checked.addAll(checked);
            return this;
        }

        public Builder<T> setAutoDismiss(boolean autoDismiss) {
            this.autoDismiss = autoDismiss;
            return this;
        }

        public CheckDialog<T> build() {
            return new CheckDialog<>(this.context, this);
        }
    }
}
