package a5;

import androidx.annotation.NonNull;
import b5.AbstractC5540a;
import b5.C5557r;
import b5.InterfaceC5552m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: a5.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4947e {
    public static boolean a(@NonNull String str) {
        AbstractC5540a.i iVar = C5557r.f55536a;
        Set<AbstractC5540a> e11 = AbstractC5540a.e();
        HashSet hashSet = new HashSet();
        for (AbstractC5540a abstractC5540a : e11) {
            if (abstractC5540a.c().equals(str)) {
                hashSet.add(abstractC5540a);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((InterfaceC5552m) it.next()).b()) {
                return true;
            }
        }
        return false;
    }
}
