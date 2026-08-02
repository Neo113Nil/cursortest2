package D3;

import I3.E;
import I3.n;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* loaded from: classes8.dex */
public final /* synthetic */ class h implements E.a {
    public static String b(StringBuilder sb2, String str, int i11, String str2) {
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String c(StringBuilder sb2, String str, List list, String str2) {
        sb2.append(str);
        sb2.append(list);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder e(String str, long j11, String str2, CellDTO cellDTO) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(cellDTO);
        return sb2;
    }

    public static void f(int i11, int i12, TextAtomV2View textAtomV2View) {
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(i11, i12));
    }

    public static void g(int i11, String str, String str2) {
        U40.c.a(str2, str + i11);
    }

    public static void h(StringBuilder sb2, Boolean bool, String str, Boolean bool2, String str2) {
        sb2.append(bool);
        sb2.append(str);
        sb2.append(bool2);
        sb2.append(str2);
    }

    @Override // I3.E.a
    public void a() {
        n.d dVar = i.f5633p;
    }
}
