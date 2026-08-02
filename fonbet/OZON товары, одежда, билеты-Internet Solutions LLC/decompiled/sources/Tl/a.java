package Tl;

import Q90.c;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.internal.gtm.zzto;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.travel.molecules.view.travelBadge.v1.TravelBadgeView;
import ru.ozon.uni.atoms.data.text.TextDTO;
import y7.InterfaceC10852c;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements InterfaceC10852c {
    public static int b(int i11, int i12, int i13, int i14) {
        return zzto.zzD(i11) + i12 + i13 + i14;
    }

    public static int c(CommonAtomLabelDTO commonAtomLabelDTO, int i11, int i12) {
        return (commonAtomLabelDTO.hashCode() + i11) * i12;
    }

    public static d d(ConstraintLayout constraintLayout, String str, ConstraintLayout constraintLayout2) {
        Intrinsics.checkNotNullExpressionValue(constraintLayout, str);
        d dVar = new d();
        dVar.p(constraintLayout2);
        return dVar;
    }

    public static void e(StringBuilder sb2, TextDTO textDTO, String str, List list, String str2) {
        sb2.append(textDTO);
        sb2.append(str);
        sb2.append(list);
        sb2.append(str2);
    }

    public static boolean f(c cVar, S90.c cVar2) {
        return cVar.q(cVar2).b().isEnabled();
    }

    @Override // y7.InterfaceC10852c
    public float a(RectF rectF) {
        float newRoundedImageView$lambda$4$lambda$3;
        newRoundedImageView$lambda$4$lambda$3 = TravelBadgeView.newRoundedImageView$lambda$4$lambda$3(rectF);
        return newRoundedImageView$lambda$4$lambda$3;
    }
}
