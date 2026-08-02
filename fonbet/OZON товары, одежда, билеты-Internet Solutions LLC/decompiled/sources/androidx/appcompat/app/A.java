package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes8.dex */
final class A {
    static androidx.core.os.i a(androidx.core.os.i iVar, androidx.core.os.i iVar2) {
        if (iVar.f()) {
            return androidx.core.os.i.e();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i11 = 0;
        while (i11 < iVar2.g() + iVar.g()) {
            Locale c11 = i11 < iVar.g() ? iVar.c(i11) : iVar2.c(i11 - iVar.g());
            if (c11 != null) {
                linkedHashSet.add(c11);
            }
            i11++;
        }
        return androidx.core.os.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }
}
