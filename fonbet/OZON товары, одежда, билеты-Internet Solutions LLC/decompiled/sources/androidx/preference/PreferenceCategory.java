package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import ru.ozon.app.android.R;
import y2.q;

/* loaded from: classes8.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle, context));
    }

    @Override // androidx.preference.Preference
    public final void I(h hVar) {
        super.I(hVar);
        if (Build.VERSION.SDK_INT >= 28) {
            hVar.itemView.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    @Deprecated
    public final void M(q qVar) {
        q.f m11;
        if (Build.VERSION.SDK_INT >= 28 || (m11 = qVar.m()) == null) {
            return;
        }
        qVar.N(q.f.f(m11.c(), m11.d(), m11.a(), m11.b(), true, m11.e()));
    }

    @Override // androidx.preference.Preference
    public final boolean i0() {
        return !super.z();
    }

    @Override // androidx.preference.Preference
    public final boolean z() {
        return false;
    }
}
