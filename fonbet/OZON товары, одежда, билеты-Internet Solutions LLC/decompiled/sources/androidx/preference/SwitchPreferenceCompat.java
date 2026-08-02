package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: S, reason: collision with root package name */
    private final a f44549S;

    /* renamed from: X, reason: collision with root package name */
    private String f44550X;

    /* renamed from: Y, reason: collision with root package name */
    private String f44551Y;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            Boolean valueOf = Boolean.valueOf(z11);
            SwitchPreferenceCompat switchPreferenceCompat = SwitchPreferenceCompat.this;
            switchPreferenceCompat.b(valueOf);
            switchPreferenceCompat.l0(z11);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.f44549S = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G4.f.f9712m, R.attr.switchPreferenceCompatStyle, 0);
        String string = obtainStyledAttributes.getString(7);
        o0(string == null ? obtainStyledAttributes.getString(0) : string);
        String string2 = obtainStyledAttributes.getString(6);
        n0(string2 == null ? obtainStyledAttributes.getString(1) : string2);
        String string3 = obtainStyledAttributes.getString(9);
        this.f44550X = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        C();
        String string4 = obtainStyledAttributes.getString(8);
        this.f44551Y = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        C();
        m0(obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false)));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void q0(View view) {
        boolean z11 = view instanceof SwitchCompat;
        if (z11) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f44553N);
        }
        if (z11) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.l(this.f44550X);
            switchCompat.j(this.f44551Y);
            switchCompat.setOnCheckedChangeListener(this.f44549S);
        }
    }

    @Override // androidx.preference.Preference
    public final void I(h hVar) {
        super.I(hVar);
        q0(hVar.e(R.id.switchWidget));
        p0(hVar.e(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected final void R(View view) {
        super.R(view);
        if (((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            q0(view.findViewById(R.id.switchWidget));
            p0(view.findViewById(android.R.id.summary));
        }
    }
}
