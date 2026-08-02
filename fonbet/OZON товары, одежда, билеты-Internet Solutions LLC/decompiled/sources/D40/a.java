package D40;

import He.g;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.D;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.crypto.tink.internal.B;
import g8.C6659a;
import i8.C7019a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements B.b {
    public static ConstraintLayout.b a(Guideline guideline, int i11, int i12, int i13) {
        guideline.setId(i11);
        return new ConstraintLayout.b(i12, i13);
    }

    public static D b(CameraFragment cameraFragment, String str) {
        J viewLifecycleOwner = cameraFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, str);
        return K.a(viewLifecycleOwner);
    }

    public static String c(String str, String str2, Throwable th2) {
        return str + th2 + str2;
    }

    public static String d(StringBuilder sb2, AtomActionDTO atomActionDTO, String str, Map map, String str2) {
        sb2.append(atomActionDTO);
        sb2.append(str);
        sb2.append(map);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder f(String str, CbottomElement2 cbottomElement2, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(cbottomElement2);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static void g(String str, String str2, String str3, StringBuilder sb2, boolean z11) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(z11);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(g gVar) {
        return C7019a.q((C6659a) gVar);
    }
}
