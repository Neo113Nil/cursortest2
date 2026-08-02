package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import t0.b;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f16262b, i7, 0);
        H.b.b(obtainStyledAttributes, 9, 0);
        H.b.b(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        H.b.b(obtainStyledAttributes, 11, 3);
        H.b.b(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H.b.a(R.attr.dialogPreferenceStyle, context, android.R.attr.dialogPreferenceStyle));
    }
}
