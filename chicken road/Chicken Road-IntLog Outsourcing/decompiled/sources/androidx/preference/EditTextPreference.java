package androidx.preference;

import T.b;
import a.AbstractC0169a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.chickyneer.roadway.R;
import l1.j;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int n6 = AbstractC0169a.n(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f2754c, n6, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (j.f11017c == null) {
                j.f11017c = new j(13);
            }
            this.f4612g = j.f11017c;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }
}
