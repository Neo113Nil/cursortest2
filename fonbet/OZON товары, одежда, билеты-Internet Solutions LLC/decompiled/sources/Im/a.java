package Im;

import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfa;
import r8.c;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes11.dex */
public final /* synthetic */ class a {
    public static LinearLayout.LayoutParams a(TextAtomV2View textAtomV2View, int i11, int i12, int i13) {
        textAtomV2View.setId(i11);
        return new LinearLayout.LayoutParams(i12, i13);
    }

    public static c b(int i11, c.a aVar) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(i11);
        aVar.b(zzfaVar.zzb());
        return aVar.a();
    }

    public static void c(BadgeView badgeView, int i11, int i12, int i13) {
        badgeView.setId(i11);
        badgeView.setLayoutParams(new ConstraintLayout.b(i12, i13));
    }
}
