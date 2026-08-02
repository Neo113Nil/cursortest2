package C;

import c8.C5765d;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.B;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements AbstractC5887f.a, B.b {
    public static Integer a(com.squareup.moshi.n nVar, String str, int i11) {
        Intrinsics.checkNotNullParameter(nVar, str);
        Integer valueOf = Integer.valueOf(i11);
        nVar.beginObject();
        return valueOf;
    }

    public static Object b(int i11, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i11);
    }

    public static String c(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public He.g d(com.google.crypto.tink.internal.F f7, S7.r rVar) {
        return U7.A.c(f7, rVar);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(He.g gVar) {
        return new C5765d();
    }
}
