package androidx.preference;

/* loaded from: classes.dex */
public abstract class DialogPreference extends androidx.preference.Preference {
    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M.a.f1007b, i2, 0);
        Q1.d.o(obtainStyledAttributes, 9, 0);
        Q1.d.o(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        Q1.d.o(obtainStyledAttributes, 11, 3);
        Q1.d.o(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, Q1.d.l(context, com.watchfacestudio.huasi_urx110.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
