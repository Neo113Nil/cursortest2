package HY;

import GZ.j;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.web.TransparentNavbarWebFragment;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements D {
    public static Object a(j jVar, int i11, String str) {
        String str2 = jVar.b().getPathSegments().get(i11);
        Intrinsics.checkNotNullExpressionValue(str2, str);
        return str2;
    }

    public static String b(String str, String str2, Map map) {
        return str + map + str2;
    }

    public static void c(Boolean bool, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(bool);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static void d(String str, String str2, String str3, StringBuilder sb2, AtomActionDTO atomActionDTO) {
        sb2.append(atomActionDTO);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static boolean e(String str, String str2, CellAtom.Align align, String str3, Boolean bool) {
        Intrinsics.g(str, str2);
        Intrinsics.g(align, str3);
        return bool.booleanValue();
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 c5353y02;
        c5353y02 = TransparentNavbarWebFragment.setupWindowInsets$lambda$3(view, c5353y0);
        return c5353y02;
    }
}
