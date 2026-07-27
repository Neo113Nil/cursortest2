package androidx.preference;

import T.a;
import T.b;
import W1.e;
import a.AbstractC0169a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.chickyneer.roadway.R;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence[] f4604h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4605i;

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f2755d, i2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f4604h = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (e.f3403a == null) {
                e.f3403a = new e();
            }
            this.f4612g = e.f3403a;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.f2757f, i2, 0);
        this.f4605i = AbstractC0169a.s(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        a aVar = this.f4612g;
        if (aVar != null) {
            return aVar.f(this);
        }
        CharSequence a6 = super.a();
        String str = this.f4605i;
        if (str == null) {
            return a6;
        }
        String format = String.format(str, "");
        if (TextUtils.equals(format, a6)) {
            return a6;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0169a.n(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
