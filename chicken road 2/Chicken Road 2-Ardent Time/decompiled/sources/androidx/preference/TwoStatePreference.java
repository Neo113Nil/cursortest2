package androidx.preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends androidx.preference.Preference {
    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final java.lang.Object c(android.content.res.TypedArray typedArray, int i2) {
        return java.lang.Boolean.valueOf(typedArray.getBoolean(i2, false));
    }
}
