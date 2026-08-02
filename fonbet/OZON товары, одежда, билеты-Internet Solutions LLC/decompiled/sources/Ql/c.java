package Ql;

import He.g;
import T7.C4036s;
import android.view.View;
import androidx.core.view.C5353y0;
import com.google.crypto.tink.internal.B;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements B.b {
    public static androidx.core.graphics.d a(View view, String str, C5353y0 c5353y0, String str2, int i11) {
        Intrinsics.checkNotNullParameter(view, str);
        Intrinsics.checkNotNullParameter(c5353y0, str2);
        return c5353y0.f(i11);
    }

    public static StringBuilder b(long j11, String str, int i11, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(i11);
        return sb2;
    }

    public static StringBuilder c(String str, String str2, String str3, AtomActionDTO atomActionDTO, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(atomActionDTO);
        sb2.append(str4);
        return sb2;
    }

    public static void d(StringBuilder sb2, int i11, String str, boolean z11, String str2) {
        sb2.append(i11);
        sb2.append(str);
        sb2.append(z11);
        sb2.append(str2);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(g gVar) {
        return V7.a.d((C4036s) gVar);
    }
}
