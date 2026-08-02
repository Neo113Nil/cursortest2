package androidx.preference;

import M4.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import t0.b;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public EditTextPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f16263c, i7, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (e.f4590a == null) {
                e.f4590a = new e();
            }
            this.f9666x = e.f4590a;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i7) {
        return typedArray.getString(i7);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H.b.a(R.attr.editTextPreferenceStyle, context, android.R.attr.editTextPreferenceStyle));
    }
}
