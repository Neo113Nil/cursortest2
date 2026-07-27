package androidx.preference;

import T.b;
import a.AbstractC0169a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.chickyneer.roadway.R;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int n6 = AbstractC0169a.n(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f2752a, n6, 0);
        AbstractC0169a.s(obtainStyledAttributes, 5, 0);
        if (obtainStyledAttributes.getString(4) == null) {
            obtainStyledAttributes.getString(1);
        }
        obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
