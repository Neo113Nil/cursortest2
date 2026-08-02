package Bi;

import android.os.Parcel;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import java.util.ArrayList;
import java.util.List;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.presentation.OrderDoneCrossButtonNewWidgetViewHolder;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements NZ.c, D {
    public static int a(Class cls, Parcel parcel, ArrayList arrayList, int i11, int i12) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i11 + i12;
    }

    public static int b(CellAtom.Align align, int i11, int i12) {
        return (align.hashCode() + i11) * i12;
    }

    public static int c(CellDTO cellDTO, int i11, int i12) {
        return (cellDTO.hashCode() + i11) * i12;
    }

    public static ConstraintLayout.b d(TextAtomV2View textAtomV2View, int i11, int i12, int i13) {
        textAtomV2View.setId(i11);
        return new ConstraintLayout.b(i12, i13);
    }

    public static String e(String str, String str2, String str3, String str4, List list) {
        return str + list + str2 + str3 + str4;
    }

    public static String f(StringBuilder sb2, String str, boolean z11, String str2) {
        sb2.append(str);
        sb2.append(z11);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String g(StringBuilder sb2, TextAtom textAtom, String str) {
        sb2.append(textAtom);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder h(String str, long j11, String str2, ButtonV3Atom.LargeButton largeButton) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(largeButton);
        return sb2;
    }

    public static StringBuilder i(String str, String str2, String str3, IconDTO iconDTO, TextDTO textDTO) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(iconDTO);
        sb2.append(str2);
        sb2.append(textDTO);
        sb2.append(str3);
        return sb2;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 onWidgetCreated$lambda$1;
        onWidgetCreated$lambda$1 = OrderDoneCrossButtonNewWidgetViewHolder.onWidgetCreated$lambda$1(view, c5353y0);
        return onWidgetCreated$lambda$1;
    }

    @Override // NZ.c
    public void onTabChanged(int i11) {
        NZ.a.tabChangeListener$lambda$0(i11);
    }
}
