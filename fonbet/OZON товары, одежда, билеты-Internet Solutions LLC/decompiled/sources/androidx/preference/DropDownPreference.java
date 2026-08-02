package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: t0, reason: collision with root package name */
    private final ArrayAdapter f44461t0;

    /* renamed from: u0, reason: collision with root package name */
    private Spinner f44462u0;

    /* renamed from: v0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f44463v0;

    final class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
            if (i11 >= 0) {
                DropDownPreference dropDownPreference = DropDownPreference.this;
                String charSequence = dropDownPreference.u0()[i11].toString();
                if (charSequence.equals(dropDownPreference.v0())) {
                    return;
                }
                dropDownPreference.b(charSequence);
                dropDownPreference.w0(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.f44463v0 = new a();
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f44461t0 = arrayAdapter;
        arrayAdapter.clear();
        if (r0() != null) {
            for (CharSequence charSequence : r0()) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    protected final void C() {
        super.C();
        ArrayAdapter arrayAdapter = this.f44461t0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void I(h hVar) {
        int i11;
        Spinner spinner = (Spinner) hVar.itemView.findViewById(R.id.spinner);
        this.f44462u0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f44461t0);
        this.f44462u0.setOnItemSelectedListener(this.f44463v0);
        Spinner spinner2 = this.f44462u0;
        String v02 = v0();
        CharSequence[] u02 = u0();
        if (v02 != null && u02 != null) {
            i11 = u02.length - 1;
            while (i11 >= 0) {
                if (u02[i11].equals(v02)) {
                    break;
                } else {
                    i11--;
                }
            }
        }
        i11 = -1;
        spinner2.setSelection(i11);
        super.I(hVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected final void J() {
        this.f44462u0.performClick();
    }
}
