package I1;

import T7.C4040w;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC7724f;
import kotlin.jvm.internal.N;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements AbstractC5889h.a {
    public static int a(int i11, int i12, int i13, int i14) {
        return ((i11 / i12) * i13) + i14;
    }

    public static kotlin.reflect.k c(Class cls, String str, String str2, int i11) {
        return N.f(new kotlin.jvm.internal.y(AbstractC7724f.NO_RECEIVER, cls, str, str2, i11));
    }

    public static void d(String str, String str2, String str3, StringBuilder sb2, List list) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(list);
        sb2.append(str3);
    }

    public static void e(HashMap hashMap, String str, C7212v0 c7212v0, String str2, ILogger iLogger) {
        Object obj = hashMap.get(str);
        c7212v0.g(str2);
        c7212v0.m(iLogger, obj);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public F b(He.g gVar, S7.r rVar) {
        return U7.n.a((C4040w) gVar, rVar);
    }
}
