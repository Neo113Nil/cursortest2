package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.res.k;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: S, reason: collision with root package name */
    private final a f44453S;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            Boolean valueOf = Boolean.valueOf(z11);
            CheckBoxPreference checkBoxPreference = CheckBoxPreference.this;
            checkBoxPreference.b(valueOf);
            checkBoxPreference.l0(z11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int a11 = k.a(R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle, context);
        this.f44453S = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G4.f.f9701b, a11, 0);
        String string = obtainStyledAttributes.getString(5);
        o0(string == null ? obtainStyledAttributes.getString(0) : string);
        String string2 = obtainStyledAttributes.getString(4);
        n0(string2 == null ? obtainStyledAttributes.getString(1) : string2);
        m0(obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false)));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void q0(View view) {
        boolean z11 = view instanceof CompoundButton;
        if (z11) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f44553N);
        }
        if (z11) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f44453S);
        }
    }

    @Override // androidx.preference.Preference
    public final void I(h hVar) {
        super.I(hVar);
        q0(hVar.e(android.R.id.checkbox));
        p0(hVar.e(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected final void R(View view) {
        super.R(view);
        if (((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            q0(view.findViewById(android.R.id.checkbox));
            p0(view.findViewById(android.R.id.summary));
        }
    }
}
