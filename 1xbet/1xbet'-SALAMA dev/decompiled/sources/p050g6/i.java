package p050g6;

import Y4.D;
import java.util.List;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends D {
    public static int L0(List list) {
        h.e(list, "<this>");
        return list.size() - 1;
    }

    public static List M0(Object... objArr) {
        h.e(objArr, "elements");
        return objArr.length > 0 ? g.p0(objArr) : p.f13308a;
    }
}
