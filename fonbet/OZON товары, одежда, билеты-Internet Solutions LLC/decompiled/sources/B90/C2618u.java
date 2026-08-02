package B90;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.Preference;
import b4.C5531g;
import java.util.ArrayList;
import java.util.List;
import m3.r;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import u3.InterfaceC9928b;

/* renamed from: B90.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2618u implements Preference.d, Rm0.d, C5531g.a, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3196a;

    public static int b(ArrayList arrayList, int i11, int i12) {
        return (arrayList.hashCode() + i11) * i12;
    }

    public static int c(ButtonV3Atom.SmallButton smallButton, int i11, int i12) {
        return (smallButton.hashCode() + i11) * i12;
    }

    public static ConstraintLayout.b e(ButtonV3View buttonV3View, int i11, int i12, int i13) {
        buttonV3View.setId(i11);
        return new ConstraintLayout.b(i12, i13);
    }

    public static String f(int i11, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + i11 + str4;
    }

    public static String g(String str, String str2, boolean z11) {
        return str + z11 + str2;
    }

    public static String h(StringBuilder sb2, List list, String str) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // b4.C5531g.a
    public boolean a(int i11, int i12, int i13, int i14, int i15) {
        return false;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        throw new RuntimeException("Preference crash event");
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        InterfaceC9928b interfaceC9928b = (InterfaceC9928b) obj;
        switch (this.f3196a) {
            case 8:
                interfaceC9928b.getClass();
                break;
            default:
                interfaceC9928b.getClass();
                break;
        }
    }
}
