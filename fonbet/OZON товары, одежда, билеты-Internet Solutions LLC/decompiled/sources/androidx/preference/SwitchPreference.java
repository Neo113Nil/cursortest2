package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.content.res.k;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: S, reason: collision with root package name */
    private final a f44545S;

    /* renamed from: X, reason: collision with root package name */
    private String f44546X;

    /* renamed from: Y, reason: collision with root package name */
    private String f44547Y;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            Boolean valueOf = Boolean.valueOf(z11);
            SwitchPreference switchPreference = SwitchPreference.this;
            switchPreference.b(valueOf);
            switchPreference.l0(z11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int a11 = k.a(R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle, context);
        this.f44545S = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G4.f.f9711l, a11, 0);
        String string = obtainStyledAttributes.getString(7);
        o0(string == null ? obtainStyledAttributes.getString(0) : string);
        String string2 = obtainStyledAttributes.getString(6);
        n0(string2 == null ? obtainStyledAttributes.getString(1) : string2);
        String string3 = obtainStyledAttributes.getString(9);
        this.f44546X = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        C();
        String string4 = obtainStyledAttributes.getString(8);
        this.f44547Y = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        C();
        m0(obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false)));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void q0(View view) {
        boolean z11 = view instanceof Switch;
        if (z11) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f44553N);
        }
        if (z11) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f44546X);
            r42.setTextOff(this.f44547Y);
            r42.setOnCheckedChangeListener(this.f44545S);
        }
    }

    @Override // androidx.preference.Preference
    public final void I(h hVar) {
        super.I(hVar);
        q0(hVar.e(android.R.id.switch_widget));
        p0(hVar.e(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected final void R(View view) {
        super.R(view);
        if (((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            q0(view.findViewById(android.R.id.switch_widget));
            p0(view.findViewById(android.R.id.summary));
        }
    }
}
