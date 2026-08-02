package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import t0.b;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f16270k, i7, 0);
        H.b.b(obtainStyledAttributes, 7, 0);
        if (obtainStyledAttributes.getString(6) == null) {
            obtainStyledAttributes.getString(1);
        }
        if (obtainStyledAttributes.getString(9) == null) {
            obtainStyledAttributes.getString(3);
        }
        if (obtainStyledAttributes.getString(8) == null) {
            obtainStyledAttributes.getString(4);
        }
        obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }
}
