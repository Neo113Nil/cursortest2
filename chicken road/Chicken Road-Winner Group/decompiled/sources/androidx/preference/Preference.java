package androidx.preference;

import F2.b;
import P0.j;
import R.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.chicken.jump.road.pump.R;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2350a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2351b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f2352c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f2353d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2354e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public j f2355g;

    public Preference(Context context, AttributeSet attributeSet, int i3) {
        this.f2351b = Integer.MAX_VALUE;
        this.f2350a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f, i3, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f2354e = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f2352c = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f2353d = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f2351b = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z3 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.getString(19) == null) {
            obtainStyledAttributes.getString(10);
        }
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z3));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z3));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f = c(obtainStyledAttributes, 11);
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

    public CharSequence a() {
        j jVar = this.f2355g;
        return jVar != null ? jVar.f(this) : this.f2353d;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i3) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i3 = preference2.f2351b;
        int i4 = this.f2351b;
        if (i4 != i3) {
            return i4 - i3;
        }
        CharSequence charSequence = preference2.f2352c;
        CharSequence charSequence2 = this.f2352c;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f2352c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a3 = a();
        if (!TextUtils.isEmpty(a3)) {
            sb.append(a3);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.v(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
