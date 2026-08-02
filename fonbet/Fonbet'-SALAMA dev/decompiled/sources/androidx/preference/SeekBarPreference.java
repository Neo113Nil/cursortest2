package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import t0.b;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: y, reason: collision with root package name */
    public final int f9667y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9668z;

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f16269i, i7, 0);
        int i8 = obtainStyledAttributes.getInt(3, 0);
        int i9 = obtainStyledAttributes.getInt(1, 100);
        i9 = i9 < i8 ? i8 : i9;
        if (i9 != this.f9667y) {
            this.f9667y = i9;
        }
        int i10 = obtainStyledAttributes.getInt(4, 0);
        if (i10 != this.f9668z) {
            this.f9668z = Math.min(this.f9667y - i8, Math.abs(i10));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i7) {
        return Integer.valueOf(typedArray.getInt(i7, 0));
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarPreferenceStyle);
    }
}
