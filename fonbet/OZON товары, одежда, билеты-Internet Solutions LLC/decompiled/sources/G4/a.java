package G4;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.preference.EditTextPreference;

/* loaded from: classes8.dex */
public class a extends androidx.preference.b {

    /* renamed from: i, reason: collision with root package name */
    private EditText f9685i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f9686j;

    @Override // androidx.preference.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f9686j = ((EditTextPreference) t()).q0();
        } else {
            this.f9686j = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f9686j);
    }

    @Override // androidx.preference.b
    protected final void u(View view) {
        super.u(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f9685i = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f9685i.setText(this.f9686j);
        EditText editText2 = this.f9685i;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) t()).getClass();
    }

    @Override // androidx.preference.b
    public final void v(boolean z11) {
        if (z11) {
            String obj = this.f9685i.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) t();
            editTextPreference.b(obj);
            editTextPreference.r0(obj);
        }
    }
}
