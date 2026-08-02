package Aj;

import Bj.c;
import Bj.e;
import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;

/* renamed from: Aj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2435b {
    @NotNull
    public static String a(@NotNull c result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof c.a) {
            return "Fatal error - query processing aborted";
        }
        if (!(result instanceof c.b)) {
            throw new o();
        }
        List<Object> a11 = ((c.b) result).a();
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a11) {
            if (obj instanceof e) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            sb2.append("Unable to parse value for " + size + " keys: " + C7714v.V(arrayList, null, "[", "]", null, 57));
        }
        d b11 = N.b(Bj.d.class);
        int i11 = 0;
        if (!a11.isEmpty()) {
            Iterator<T> it = a11.iterator();
            while (it.hasNext()) {
                if (b11.A(it.next()) && (i11 = i11 + 1) < 0) {
                    C7714v.N0();
                    throw null;
                }
            }
        }
        if (i11 != 0) {
            sb2.append("Internal errors count: " + i11);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
