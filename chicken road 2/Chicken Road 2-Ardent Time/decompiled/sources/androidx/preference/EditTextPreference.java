package androidx.preference;

/* loaded from: classes.dex */
public class EditTextPreference extends androidx.preference.DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int l2 = Q1.d.l(context, com.watchfacestudio.huasi_urx110.R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M.a.f1008c, l2, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (m0.j.f8060c == null) {
                m0.j.f8060c = new m0.j(6, false);
            }
            this.f2427g = m0.j.f8060c;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final java.lang.Object c(android.content.res.TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }
}
