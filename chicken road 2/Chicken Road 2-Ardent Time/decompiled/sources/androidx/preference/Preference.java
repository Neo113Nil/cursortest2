package androidx.preference;

/* loaded from: classes.dex */
public class Preference implements java.lang.Comparable<androidx.preference.Preference> {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f2421a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2422b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f2423c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f2424d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f2425e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f2426f;

    /* renamed from: g, reason: collision with root package name */
    public m0.j f2427g;

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        this.f2422b = Integer.MAX_VALUE;
        this.f2421a = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M.a.f1011f, i2, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        java.lang.String string = obtainStyledAttributes.getString(26);
        this.f2425e = string == null ? obtainStyledAttributes.getString(6) : string;
        java.lang.CharSequence text = obtainStyledAttributes.getText(34);
        this.f2423c = text == null ? obtainStyledAttributes.getText(4) : text;
        java.lang.CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f2424d = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f2422b = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, com.watchfacestudio.huasi_urx110.R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z2 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        Q1.d.o(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z2));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z2));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f2426f = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f2426f = c(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public java.lang.CharSequence a() {
        m0.j jVar = this.f2427g;
        return jVar != null ? jVar.n(this) : this.f2424d;
    }

    public void b() {
    }

    public java.lang.Object c(android.content.res.TypedArray typedArray, int i2) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(androidx.preference.Preference preference) {
        androidx.preference.Preference preference2 = preference;
        int i2 = preference2.f2422b;
        int i3 = this.f2422b;
        if (i3 != i2) {
            return i3 - i2;
        }
        java.lang.CharSequence charSequence = preference2.f2423c;
        java.lang.CharSequence charSequence2 = this.f2423c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.CharSequence charSequence = this.f2423c;
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        java.lang.CharSequence a2 = a();
        if (!android.text.TextUtils.isEmpty(a2)) {
            sb.append(a2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, Q1.d.l(context, com.watchfacestudio.huasi_urx110.R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
