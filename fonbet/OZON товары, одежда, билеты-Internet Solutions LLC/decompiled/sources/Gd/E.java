package Gd;

import Gd.F;
import ae.C5002d;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class E implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final F f9941a;

    public E(F f7) {
        this.f9941a = f7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Ld.y> entry : this.f9941a.H0().entrySet()) {
            String key = entry.getKey();
            Ld.y value = entry.getValue();
            C5002d d11 = C5002d.d(key);
            Intrinsics.checkNotNullExpressionValue(d11, "byInternalName(...)");
            Md.a a11 = value.a();
            int i11 = F.a.f9950a[a11.c().ordinal()];
            if (i11 == 1) {
                String e11 = a11.e();
                if (e11 != null) {
                    hashMap.put(d11, C5002d.d(e11));
                }
            } else if (i11 == 2) {
                hashMap.put(d11, d11);
            }
        }
        return hashMap;
    }
}
