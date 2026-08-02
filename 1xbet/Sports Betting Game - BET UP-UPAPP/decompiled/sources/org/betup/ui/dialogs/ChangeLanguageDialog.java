package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.util.Arrays;
import java.util.List;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.local.Language;

/* loaded from: classes2.dex */
public class ChangeLanguageDialog extends BaseDialog {
    private OnLanguageSelected onLanguageSelected;

    @BindView(R.id.spinner)
    Spinner spinner;

    public interface OnLanguageSelected {
        void onLanguageSelected(String code);
    }

    public static class LanguageAdapter extends BaseAdapter {
        private Context context;
        private List<Language> items = Arrays.asList(Language.ENGLISH, Language.RUSSIAN, Language.SPANISH, Language.PORTUGEESE, Language.GERMAN, Language.ITALIAN, Language.ROMANIAN, Language.FRENCH, Language.TURKISH, Language.HINDI, Language.ARABIC);
        private LayoutInflater layoutInflater;

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        public class LanguageHolder_ViewBinding implements Unbinder {
            private LanguageHolder target;

            public LanguageHolder_ViewBinding(LanguageHolder target, View source) {
                this.target = target;
                target.name = (TextView) Utils.findRequiredViewAsType(source, R.id.name, "field 'name'", TextView.class);
                target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
            }

            @Override // butterknife.Unbinder
            public void unbind() {
                LanguageHolder languageHolder = this.target;
                if (languageHolder == null) {
                    throw new IllegalStateException("Bindings already cleared.");
                }
                this.target = null;
                languageHolder.name = null;
                languageHolder.icon = null;
            }
        }

        public LanguageAdapter(Context context) {
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.items.size();
        }

        @Override // android.widget.Adapter
        public Language getItem(int position) {
            return this.items.get(position);
        }

        @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return createView(position, convertView, parent, true);
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            return createView(position, convertView, parent, false);
        }

        private View createView(int position, View convertView, ViewGroup parent, boolean colored) {
            if (convertView == null) {
                convertView = this.layoutInflater.inflate(R.layout.item_country, parent, false);
            }
            LanguageHolder languageHolder = (LanguageHolder) convertView.getTag();
            if (languageHolder == null) {
                languageHolder = new LanguageHolder(convertView);
                convertView.setTag(languageHolder);
            }
            Language item = getItem(position);
            languageHolder.name.setText(item.getName());
            languageHolder.icon.setImageResource(item.getIconRes());
            if (colored) {
                convertView.setBackgroundColor(ContextCompat.getColor(this.context, R.color.lightCyan));
            } else {
                convertView.setBackgroundColor(0);
            }
            return convertView;
        }

        public class LanguageHolder {

            @BindView(R.id.icon)
            ImageView icon;

            @BindView(R.id.name)
            TextView name;

            public LanguageHolder(View view) {
                ButterKnife.bind(this, view);
            }
        }
    }

    public ChangeLanguageDialog(Context context, OnLanguageSelected onLanguageSelected) {
        super(R.layout.dialog_change_language, context);
        this.onLanguageSelected = onLanguageSelected;
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getContext().getApplicationContext()).getComponent().inject(this);
        ButterKnife.bind(this);
        LanguageAdapter languageAdapter = new LanguageAdapter(getContext());
        this.spinner.setAdapter((SpinnerAdapter) languageAdapter);
        int indexOf = languageAdapter.items.indexOf(Language.getCurrent());
        if (indexOf < 0) {
            indexOf = 0;
        }
        this.spinner.setSelection(indexOf);
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
        if (this.onLanguageSelected != null) {
            this.spinner.setVisibility(4);
            Language language = (Language) this.spinner.getSelectedItem();
            if (language != null) {
                this.onLanguageSelected.onLanguageSelected(language.getCode());
            }
        }
    }

    @OnClick({R.id.cancel})
    public void onCancelClick() {
        dismiss();
    }
}
