package Bj;

import Bj.c;
import Sc.o;
import T7.E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:5:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0081 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final a a(@NotNull c cVar) {
        Throwable cause;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (!(cVar instanceof c.a)) {
            if (!(cVar instanceof c.b)) {
                throw new o();
            }
            List<Object> a11 = ((c.b) cVar).a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : a11) {
                if (obj instanceof d) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((d) it.next()).getClass();
                arrayList2.add(null);
            }
            int size = arrayList2.size();
            if (size != 0) {
                cause = (Throwable) C7714v.K(arrayList2);
                if (size != 1) {
                    cause = new Exception(E.a(size, "Found ", " internal exceptions while processing deeplink query"), cause);
                }
                if (cause != null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(cause, "cause");
                return new a("Error while processing deeplink query", cause);
            }
        }
        cause = null;
        if (cause != null) {
        }
    }
}
