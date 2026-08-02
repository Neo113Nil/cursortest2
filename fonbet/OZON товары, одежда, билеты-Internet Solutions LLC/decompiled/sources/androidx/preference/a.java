package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
final class a extends Preference {

    /* renamed from: N, reason: collision with root package name */
    private long f44559N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(Context context, ArrayList arrayList, long j11) {
        super(context, null);
        CharSequence charSequence = null;
        a0();
        Y(R.drawable.ic_arrow_down_24dp);
        h0();
        e0(999);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence u11 = preference.u();
            boolean z11 = preference instanceof PreferenceGroup;
            if (z11 && !TextUtils.isEmpty(u11)) {
                arrayList2.add((PreferenceGroup) preference);
            }
            if (arrayList2.contains(preference.m())) {
                if (z11) {
                    arrayList2.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(u11)) {
                charSequence = charSequence == null ? u11 : e().getString(R.string.summary_collapsed_preference_list, charSequence, u11);
            }
        }
        f0(charSequence);
        this.f44559N = j11 + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void I(h hVar) {
        super.I(hVar);
        hVar.h(false);
    }

    @Override // androidx.preference.Preference
    final long h() {
        return this.f44559N;
    }
}
