package androidx.preference;

import T.b;
import a.AbstractC0169a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.chickyneer.roadway.R;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int n6 = AbstractC0169a.n(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f2761j, n6, 0);
        AbstractC0169a.s(obtainStyledAttributes, 7, 0);
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
}
