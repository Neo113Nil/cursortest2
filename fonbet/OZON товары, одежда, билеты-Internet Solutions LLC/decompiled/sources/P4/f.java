package P4;

import S7.q;
import U7.w;
import c8.C5767f;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.x;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import u3.InterfaceC9928b;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements B.b, x.a, r.a {
    public static String a(long j11, String str, StringBuilder sb2) {
        sb2.append(j11);
        sb2.append(str);
        return sb2.toString();
    }

    public static String b(String str) {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, str);
        return uuid;
    }

    public static String c(String str, int i11, char c11) {
        return str + i11 + c11;
    }

    public static StringBuilder f(int i11, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i11);
        sb2.append(str2);
        return sb2;
    }

    @Override // com.google.crypto.tink.internal.x.a
    public q d(G g10) {
        return C5767f.b(g10);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(He.g gVar) {
        return w.d((C5891j) gVar);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
