package androidx.preference;

import H.b;
import android.content.Context;
import android.util.AttributeSet;
import com.salamadev.nabilalawadi.kisaskoran.R;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, b.a(R.attr.preferenceScreenStyle, context, android.R.attr.preferenceScreenStyle));
    }
}
