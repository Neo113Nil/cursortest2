package D40;

import De.x;
import GZ.j;
import android.os.Parcel;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ze.C11115c;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Wg.a {
    public static int a(j jVar) {
        return jVar.b().getPathSegments().size();
    }

    public static int b(CommonAtomLabelDTO commonAtomLabelDTO, int i11, int i12) {
        return (commonAtomLabelDTO.hashCode() + i11) * i12;
    }

    public static ConstraintLayout.b c(IconButtonV3View iconButtonV3View, int i11, int i12, int i13) {
        iconButtonV3View.setId(i11);
        return new ConstraintLayout.b(i12, i13);
    }

    public static void d(Parcel parcel, int i11, CommonCellSettings.LayoutPadding layoutPadding) {
        parcel.writeInt(i11);
        parcel.writeString(layoutPadding.name());
    }

    public static void e(String str, String str2, StringBuilder sb2, TextDTO textDTO, TextDTO textDTO2) {
        sb2.append(textDTO);
        sb2.append(str);
        sb2.append(textDTO2);
        sb2.append(str2);
    }

    public static /* synthetic */ boolean f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11115c c11115c, x xVar, x xVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c11115c, xVar, xVar2)) {
            if (atomicReferenceFieldUpdater.get(c11115c) != xVar) {
                return false;
            }
        }
        return true;
    }

    @Override // Wg.a
    public RecyclerView get() {
        return null;
    }
}
