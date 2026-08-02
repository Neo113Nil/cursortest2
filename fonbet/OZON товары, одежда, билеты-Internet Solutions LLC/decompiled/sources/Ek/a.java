package Ek;

import D1.InterfaceC2801g;
import He.g;
import S0.F1;
import S0.InterfaceC3967k;
import S7.r;
import T7.C4023e;
import We.B;
import We.G;
import androidx.compose.ui.e;
import c8.C5767f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.F;
import hi.InterfaceC6958a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.composer.compose.widget.scrollable.j;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements B.b, AbstractC5889h.a {
    public static G a(B.a aVar, String str) {
        Intrinsics.checkNotNullParameter(aVar, str);
        G request = aVar.request();
        request.getClass();
        return request;
    }

    public static InterfaceC6958a c(j jVar, String str, Class cls) {
        Intrinsics.checkNotNullParameter(jVar, str);
        return jVar.getWidgetComponentStorage().getComponent(cls);
    }

    public static String d(StringBuilder sb2, int i11, char c11) {
        sb2.append(i11);
        sb2.append(c11);
        return sb2.toString();
    }

    public static void f(int i11, int i12, String str, String str2, StringBuilder sb2) {
        sb2.append(i11);
        sb2.append(str);
        sb2.append(i12);
        sb2.append(str2);
    }

    public static void g(e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        F1.b(interfaceC3967k, eVar, InterfaceC2801g.a.f());
        interfaceC3967k.o(i11);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public F b(g gVar, r rVar) {
        return C5767f.d((b8.g) gVar, rVar);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(g gVar) {
        return i8.j.c((C4023e) gVar);
    }
}
