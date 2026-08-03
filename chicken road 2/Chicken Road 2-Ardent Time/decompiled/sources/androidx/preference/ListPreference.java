package androidx.preference;

/* loaded from: classes.dex */
public class ListPreference extends androidx.preference.DialogPreference {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.CharSequence[] f2419h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f2420i;

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M.a.f1009d, i2, 0);
        java.lang.CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f2419h = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (m0.j.f8061d == null) {
                m0.j.f8061d = new m0.j(7, false);
            }
            this.f2427g = m0.j.f8061d;
            b();
        }
        obtainStyledAttributes.recycle();
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, M.a.f1011f, i2, 0);
        this.f2420i = Q1.d.o(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final java.lang.CharSequence a() {
        m0.j jVar = this.f2427g;
        if (jVar != null) {
            return jVar.n(this);
        }
        java.lang.CharSequence a2 = super.a();
        java.lang.String str = this.f2420i;
        if (str == null) {
            return a2;
        }
        java.lang.String format = java.lang.String.format(str, "");
        if (android.text.TextUtils.equals(format, a2)) {
            return a2;
        }
        android.util.Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final java.lang.Object c(android.content.res.TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, Q1.d.l(context, com.watchfacestudio.huasi_urx110.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
