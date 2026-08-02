package H3;

import L4.e;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import r8.c;
import ru.ozon.app.android.web.uidelegate.WebFragmentUiDelegate;

/* loaded from: classes8.dex */
public final /* synthetic */ class c implements O7.e, D {
    public static String a(String str, String str2, List list) {
        return str + list + str2;
    }

    public static HashSet b(HashMap hashMap, String str, e.a aVar, int i11) {
        hashMap.put(str, aVar);
        return new HashSet(i11);
    }

    public static void c(int i11, c.a aVar) {
        zzct zzctVar = new zzct();
        zzctVar.zza(i11);
        aVar.b(zzctVar.zzb());
        aVar.a();
    }

    @Override // O7.e
    public Object apply(Object obj) {
        return Long.valueOf(((k4.c) obj).f70453c);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 applyUi$lambda$0;
        applyUi$lambda$0 = WebFragmentUiDelegate.Ai.applyUi$lambda$0(view, c5353y0);
        return applyUi$lambda$0;
    }
}
