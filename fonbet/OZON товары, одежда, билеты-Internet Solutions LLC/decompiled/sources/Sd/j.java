package Sd;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {
    public static final b a(String str) {
        c d11 = i.d();
        f f7 = f.f(str);
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        return new b(d11, f7);
    }

    public static final b b(String str) {
        c c11 = i.c();
        f f7 = f.f(str);
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        return new b(c11, f7);
    }

    public static final LinkedHashMap c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        int h11 = U.h(C7714v.z(entrySet, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h11);
        for (Map.Entry entry : entrySet) {
            Pair pair = new Pair(entry.getValue(), entry.getKey());
            linkedHashMap2.put(pair.e(), pair.f());
        }
        return linkedHashMap2;
    }

    public static final b d(f fVar) {
        c f7 = i.a().f();
        f f11 = f.f(fVar.d().concat(i.a().h().d()));
        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
        return new b(f7, f11);
    }

    public static final void e(String str) {
        c e11 = i.e();
        f f7 = f.f(str);
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        new b(e11, f7);
    }

    public static final b f(String str) {
        c f7 = i.f();
        f f11 = f.f(str);
        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
        return new b(f7, f11);
    }

    public static final b g(b bVar) {
        c d11 = i.d();
        f f7 = f.f("U".concat(bVar.h().d()));
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        return new b(d11, f7);
    }
}
