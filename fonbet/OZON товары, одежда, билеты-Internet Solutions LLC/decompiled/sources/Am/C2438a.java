package Am;

import He.g;
import O7.e;
import S7.q;
import T7.C4028j;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.x;
import io.sentry.U1;
import io.sentry.W2;
import io.sentry.util.l;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.N;
import kotlin.reflect.o;
import l3.C7855a;
import m3.r;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import u3.InterfaceC9928b;

/* renamed from: Am.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2438a implements AbstractC5889h.a, x.a, l.a, e, r.a {
    public static StringBuilder a(String str, int i11, String str2, String str3, int i12) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i12);
        sb2.append(str3);
        return sb2;
    }

    public static o c(Class cls, String str, String str2, int i11) {
        return N.h(new E(cls, str, str2, i11));
    }

    public static void e(TextAtomView textAtomView, int i11, int i12, int i13) {
        textAtomView.setId(i11);
        textAtomView.setLayoutParams(new ConstraintLayout.b(i12, i13));
    }

    @Override // O7.e
    public Object apply(Object obj) {
        return Integer.valueOf(((C7855a) obj).f72616r);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public F b(g gVar, S7.r rVar) {
        return U7.e.b((C4028j) gVar, rVar);
    }

    @Override // com.google.crypto.tink.internal.x.a
    public q d(G g10) {
        return Z7.a.b(g10);
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        U1 lambda$new$3;
        lambda$new$3 = W2.lambda$new$3();
        return lambda$new$3;
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
