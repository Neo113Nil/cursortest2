package androidx.preference;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends androidx.preference.DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int l2 = Q1.d.l(context, com.watchfacestudio.huasi_urx110.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        new java.util.HashSet();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M.a.f1010e, l2, 0);
        if (obtainStyledAttributes.getTextArray(2) == null) {
            obtainStyledAttributes.getTextArray(0);
        }
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final java.lang.Object c(android.content.res.TypedArray typedArray, int i2) {
        java.lang.CharSequence[] textArray = typedArray.getTextArray(i2);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
