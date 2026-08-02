package androidx.preference;

import androidx.preference.Preference;

/* loaded from: classes8.dex */
final class e implements Preference.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PreferenceGroup f44592a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f44593b;

    e(d dVar, PreferenceGroup preferenceGroup) {
        this.f44593b = dVar;
        this.f44592a = preferenceGroup;
    }

    @Override // androidx.preference.Preference.d
    public final boolean d(Preference preference) {
        this.f44592a.p0(Integer.MAX_VALUE);
        this.f44593b.k();
        return true;
    }
}
