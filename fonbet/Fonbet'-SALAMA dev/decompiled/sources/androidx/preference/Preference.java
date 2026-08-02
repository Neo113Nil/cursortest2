package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.f;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import t0.InterfaceC1603a;
import t0.b;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9660a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9661b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f9662c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f9663d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9664e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9665f;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1603a f9666x;

    public Preference(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f9661b = f.API_PRIORITY_OTHER;
        this.f9660a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f16266f, i7, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f9664e = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f9662c = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f9663d = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f9661b = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, f.API_PRIORITY_OTHER));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z4 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        H.b.b(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z4));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z4));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f9665f = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f9665f = c(obtainStyledAttributes, 11);
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
        InterfaceC1603a interfaceC1603a = this.f9666x;
        return interfaceC1603a != null ? interfaceC1603a.f(this) : this.f9663d;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i7) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i7 = preference2.f9661b;
        int i8 = this.f9661b;
        if (i8 != i7) {
            return i8 - i7;
        }
        CharSequence charSequence = preference2.f9662c;
        CharSequence charSequence2 = this.f9662c;
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
        CharSequence charSequence = this.f9662c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            sb.append(a2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H.b.a(R.attr.preferenceStyle, context, android.R.attr.preferenceStyle));
    }
}
