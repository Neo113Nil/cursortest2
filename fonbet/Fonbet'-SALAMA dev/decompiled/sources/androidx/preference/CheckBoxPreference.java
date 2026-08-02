package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import t0.b;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f16261a, i7, 0);
        H.b.b(obtainStyledAttributes, 5, 0);
        if (obtainStyledAttributes.getString(4) == null) {
            obtainStyledAttributes.getString(1);
        }
        obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H.b.a(R.attr.checkBoxPreferenceStyle, context, android.R.attr.checkBoxPreferenceStyle));
    }
}
