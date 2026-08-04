package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.salamadev.nabilalawadi.kisaskoran.R;
import p137t0.b;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f9667y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f9668z;

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f16275i, i7, 0);
        int i8 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i9 = typedArrayObtainStyledAttributes.getInt(1, 100);
        i9 = i9 < i8 ? i8 : i9;
        if (i9 != this.f9667y) {
            this.f9667y = i9;
        }
        int i10 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i10 != this.f9668z) {
            this.f9668z = Math.min(this.f9667y - i8, Math.abs(i10));
        }
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i7) {
        return Integer.valueOf(typedArray.getInt(i7, 0));
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarPreferenceStyle);
    }
}
