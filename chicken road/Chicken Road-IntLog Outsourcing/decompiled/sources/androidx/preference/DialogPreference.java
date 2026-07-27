package androidx.preference;

import T.b;
import a.AbstractC0169a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.chickyneer.roadway.R;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f2753b, i2, 0);
        AbstractC0169a.s(obtainStyledAttributes, 9, 0);
        AbstractC0169a.s(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        AbstractC0169a.s(obtainStyledAttributes, 11, 3);
        AbstractC0169a.s(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0169a.n(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
