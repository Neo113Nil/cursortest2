package B90;

import a7.b;
import androidx.preference.Preference;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2602d implements Preference.d, b.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3141a;

    public /* synthetic */ C2602d(Object obj) {
        this.f3141a = obj;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.S((FintechPreferencesFragment) this.f3141a);
        return true;
    }

    @Override // a7.b.a
    public Object execute() {
        Y6.o.a((Y6.o) this.f3141a);
        return null;
    }
}
