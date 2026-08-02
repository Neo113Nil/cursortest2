package Co;

import GZ.j;
import Ql.c;
import S7.q;
import android.view.View;
import androidx.core.graphics.d;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.x;
import h8.C6874b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements x.a, D {
    public static String a(String str, TextAtom textAtom, String str2, TextAtom textAtom2, String str3) {
        return str + textAtom + str2 + textAtom2 + str3;
    }

    public static StringBuilder b(String str, TextDTO textDTO, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(textDTO);
        sb2.append(str4);
        return sb2;
    }

    public static /* synthetic */ void c(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
        }
    }

    public static boolean e(j jVar, int i11, String str) {
        return Intrinsics.d(jVar.b().getPathSegments().get(i11), str);
    }

    @Override // com.google.crypto.tink.internal.x.a
    public q d(G g10) {
        return C6874b.c(g10);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        d a11 = c.a(view, "root", c5353y0, "insets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        d f7 = c5353y0.f(8);
        Intrinsics.checkNotNullExpressionValue(f7, "getInsets(...)");
        s.g(view, 0, 0, 0, c5353y0.p(8) ? f7.f42129d - a11.f42129d : f7.f42129d, 7);
        return C5353y0.f42353b;
    }
}
