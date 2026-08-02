package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.preference.c;
import androidx.preference.g;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: X, reason: collision with root package name */
    private boolean f44527X;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle, context));
        this.f44527X = true;
    }

    @Override // androidx.preference.Preference
    protected final void J() {
        g.a e11;
        if (i() != null || g() != null || o0() == 0 || (e11 = r().e()) == null) {
            return;
        }
        c cVar = (c) e11;
        if (cVar.getActivity() instanceof c.f) {
            ((c.f) cVar.getActivity()).a();
        }
    }

    public final boolean r0() {
        return this.f44527X;
    }
}
