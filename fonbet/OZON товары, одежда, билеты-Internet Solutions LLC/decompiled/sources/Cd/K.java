package Cd;

import Ij.C3261b;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import re.C9257a;

/* loaded from: classes10.dex */
public final class K {
    @NotNull
    public static final List<Sd.f> a(@NotNull Sd.f methodName) {
        Intrinsics.checkNotNullParameter(methodName, "name");
        String name = methodName.b();
        Intrinsics.checkNotNullExpressionValue(name, "asString(...)");
        Sd.c cVar = E.f4688a;
        Intrinsics.checkNotNullParameter(name, "name");
        if (kotlin.text.h.e0(name, "get", false) || kotlin.text.h.e0(name, "is", false)) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Sd.f b11 = b(methodName, "get", null, 12);
            if (b11 == null) {
                b11 = b(methodName, "is", null, 8);
            }
            return C7714v.c0(b11);
        }
        Intrinsics.checkNotNullParameter(name, "name");
        if (!kotlin.text.h.e0(name, "set", false)) {
            return C2748i.b(methodName);
        }
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Sd.f b12 = b(methodName, "set", null, 4);
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Sd.f[] elements = {b12, b(methodName, "set", "is", 4)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.B(elements);
    }

    static Sd.f b(Sd.f fVar, String str, String str2, int i11) {
        char charAt;
        boolean z11 = (i11 & 4) != 0;
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if (!fVar.g()) {
            String d11 = fVar.d();
            Intrinsics.checkNotNullExpressionValue(d11, "getIdentifier(...)");
            if (kotlin.text.h.e0(d11, str, false) && d11.length() != str.length() && ('a' > (charAt = d11.charAt(str.length())) || charAt >= '{')) {
                if (str2 != null) {
                    StringBuilder e11 = C3261b.e(str2);
                    e11.append(kotlin.text.h.S(d11, str));
                    return Sd.f.f(e11.toString());
                }
                if (!z11) {
                    return fVar;
                }
                String b11 = C9257a.b(kotlin.text.h.S(d11, str));
                if (Sd.f.h(b11)) {
                    return Sd.f.f(b11);
                }
            }
        }
        return null;
    }
}
