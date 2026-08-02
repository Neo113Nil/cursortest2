package T7;

import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.B;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class Z implements B.b, AbstractC5889h.a, com.google.gson.internal.o {
    public static String a(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String c(StringBuilder sb2, Integer num, String str, Integer num2, String str2) {
        sb2.append(num);
        sb2.append(str);
        sb2.append(num2);
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public com.google.crypto.tink.internal.F b(He.g gVar, S7.r rVar) {
        return U7.j.c((C4036s) gVar, rVar);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(He.g gVar) {
        Y y11 = (Y) gVar;
        return U7.z.d() ? U7.z.c(y11) : i8.w.c(y11);
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        return new ConcurrentHashMap();
    }
}
