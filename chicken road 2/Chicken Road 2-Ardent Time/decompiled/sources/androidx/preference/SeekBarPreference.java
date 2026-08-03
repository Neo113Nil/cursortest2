package androidx.preference;

/* loaded from: classes.dex */
public class SeekBarPreference extends androidx.preference.Preference {

    /* renamed from: h, reason: collision with root package name */
    public final int f2428h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2429i;

    public SeekBarPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.watchfacestudio.huasi_urx110.R.attr.seekBarPreferenceStyle);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M.a.f1014i, com.watchfacestudio.huasi_urx110.R.attr.seekBarPreferenceStyle, 0);
        int i2 = obtainStyledAttributes.getInt(3, 0);
        int i3 = obtainStyledAttributes.getInt(1, 100);
        i3 = i3 < i2 ? i2 : i3;
        if (i3 != this.f2428h) {
            this.f2428h = i3;
        }
        int i4 = obtainStyledAttributes.getInt(4, 0);
        if (i4 != this.f2429i) {
            this.f2429i = java.lang.Math.min(this.f2428h - i2, java.lang.Math.abs(i4));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final java.lang.Object c(android.content.res.TypedArray typedArray, int i2) {
        return java.lang.Integer.valueOf(typedArray.getInt(i2, 0));
    }
}
