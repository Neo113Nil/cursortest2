package B90;

import android.graphics.ColorSpace;
import androidx.preference.Preference;
import m1.InterfaceC8038i;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2605g implements Preference.d, InterfaceC8038i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3150a;

    @Override // m1.InterfaceC8038i
    public double c(double d11) {
        return ((ColorSpace.Rgb) ((ColorSpace) this.f3150a)).getOetf().applyAsDouble(d11);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.m0((FintechPreferencesFragment) this.f3150a);
        return true;
    }
}
