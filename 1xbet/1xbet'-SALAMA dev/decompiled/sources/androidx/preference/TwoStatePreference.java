package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public TwoStatePreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i7) {
        return Boolean.valueOf(typedArray.getBoolean(i7, false));
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
