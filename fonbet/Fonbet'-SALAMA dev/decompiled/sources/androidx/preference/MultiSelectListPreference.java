package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.HashSet;
import t0.b;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f16265e, i7, 0);
        if (obtainStyledAttributes.getTextArray(2) == null) {
            obtainStyledAttributes.getTextArray(0);
        }
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i7) {
        CharSequence[] textArray = typedArray.getTextArray(i7);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H.b.a(R.attr.dialogPreferenceStyle, context, android.R.attr.dialogPreferenceStyle));
    }
}
