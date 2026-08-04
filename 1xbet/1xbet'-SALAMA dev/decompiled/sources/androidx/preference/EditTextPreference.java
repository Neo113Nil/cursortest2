package androidx.preference;

import M4.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.salamadev.nabilalawadi.kisaskoran.R;
import p137t0.b;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public EditTextPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f16269c, i7, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (e.f4590a == null) {
                e.f4590a = new e();
            }
            this.f9666x = e.f4590a;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i7) {
        return typedArray.getString(i7);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H.b.a(R.attr.editTextPreferenceStyle, context, android.R.attr.editTextPreferenceStyle));
    }
}
