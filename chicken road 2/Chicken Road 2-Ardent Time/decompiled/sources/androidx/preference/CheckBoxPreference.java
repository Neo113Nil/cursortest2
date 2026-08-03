package androidx.preference;

/* loaded from: classes.dex */
public class CheckBoxPreference extends androidx.preference.TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int l2 = Q1.d.l(context, com.watchfacestudio.huasi_urx110.R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M.a.f1006a, l2, 0);
        Q1.d.o(obtainStyledAttributes, 5, 0);
        if (obtainStyledAttributes.getString(4) == null) {
            obtainStyledAttributes.getString(1);
        }
        obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
