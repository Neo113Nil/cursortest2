package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import e6.C1054c;
import t0.InterfaceC1603a;
import t0.b;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence[] f9658y;

    /* renamed from: z, reason: collision with root package name */
    public final String f9659z;

    public ListPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f16264d, i7, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f9658y = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (C1054c.f12738c == null) {
                C1054c.f12738c = new C1054c(24);
            }
            this.f9666x = C1054c.f12738c;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.f16266f, i7, 0);
        this.f9659z = H.b.b(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        InterfaceC1603a interfaceC1603a = this.f9666x;
        if (interfaceC1603a != null) {
            return interfaceC1603a.f(this);
        }
        CharSequence a2 = super.a();
        String str = this.f9659z;
        if (str == null) {
            return a2;
        }
        String format = String.format(str, "");
        if (TextUtils.equals(format, a2)) {
            return a2;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i7) {
        return typedArray.getString(i7);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H.b.a(R.attr.dialogPreferenceStyle, context, android.R.attr.dialogPreferenceStyle));
    }
}
