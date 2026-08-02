package Sh;

import He.g;
import Q6.i;
import T7.C4033o;
import com.google.crypto.tink.internal.B;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Map;
import n8.InterfaceC8452b;
import n8.e;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements B.b, e {
    public static String b(long j11, String str, String str2) {
        return str + j11 + str2;
    }

    public static String c(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static void d(O4.b bVar, String str, String str2, String str3, String str4) {
        bVar.O0(str);
        bVar.O0(str2);
        bVar.O0(str3);
        bVar.O0(str4);
    }

    public static void f(StringBuilder sb2, AtomActionDTO atomActionDTO, String str, Map map, String str2) {
        sb2.append(atomActionDTO);
        sb2.append(str);
        sb2.append(map);
        sb2.append(str2);
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        i lambda$getComponents$1;
        lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(interfaceC8452b);
        return lambda$getComponents$1;
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(g gVar) {
        return i8.e.c((C4033o) gVar);
    }
}
