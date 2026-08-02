package androidx.preference;

import H.b;
import android.content.Context;
import android.util.AttributeSet;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a(R.attr.preferenceCategoryStyle, context, android.R.attr.preferenceCategoryStyle));
    }
}
