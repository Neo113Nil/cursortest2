package androidx.preference;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends androidx.preference.TwoStatePreference {
    public SwitchPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.watchfacestudio.huasi_urx110.R.attr.switchPreferenceCompatStyle);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M.a.f1016k, com.watchfacestudio.huasi_urx110.R.attr.switchPreferenceCompatStyle, 0);
        Q1.d.o(obtainStyledAttributes, 7, 0);
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
