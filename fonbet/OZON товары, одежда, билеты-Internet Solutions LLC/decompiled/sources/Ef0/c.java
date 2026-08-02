package Ef0;

import Fj.f;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.network.internal.debugMenu.ONDebugMenuActivity;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements D {
    public static int a(CommonCellSettings.LayoutPadding layoutPadding, int i11, int i12) {
        return (layoutPadding.hashCode() + i11) * i12;
    }

    public static ConstraintLayout.b b(TextAtomView textAtomView, int i11, int i12, int i13) {
        textAtomView.setId(i11);
        return new ConstraintLayout.b(i12, i13);
    }

    public static String c(String str, String str2, String str3, boolean z11, boolean z12) {
        return str + z11 + str2 + z12 + str3;
    }

    public static Pair d(f fVar, String str) {
        return new Pair(str, Integer.valueOf(fVar.b()));
    }

    public static void e(StringBuilder sb2, Integer num, String str, Integer num2, String str2) {
        sb2.append(num);
        sb2.append(str);
        sb2.append(num2);
        sb2.append(str2);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        int i11 = ONDebugMenuActivity.f97613h;
        androidx.core.graphics.d a11 = Ql.c.a(view, "view", c5353y0, "windowInsets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        view.setPadding(a11.f42126a, a11.f42127b, a11.f42128c, a11.f42129d);
        return c5353y0;
    }
}
