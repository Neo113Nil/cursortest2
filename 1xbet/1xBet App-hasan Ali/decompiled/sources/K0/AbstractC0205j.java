package K0;

import a.AbstractC0444a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: K0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0205j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0203h f2833a = new C0203h("");

    public static final List a(C0203h c0203h, int i, int i5, C0204i c0204i) {
        List list;
        if (i == i5 || (list = c0203h.f2828k) == null) {
            return null;
        }
        if (i != 0 || i5 < c0203h.f2829l.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0201f c0201f = (C0201f) list.get(i6);
                if ((c0204i != null ? ((Boolean) c0204i.c(c0201f.f2823a)).booleanValue() : true) && b(i, i5, c0201f.f2824b, c0201f.f2825c)) {
                    arrayList.add(new C0201f((InterfaceC0198c) c0201f.f2823a, AbstractC0444a.t(c0201f.f2824b, i, i5) - i, AbstractC0444a.t(c0201f.f2825c, i, i5) - i, c0201f.f2826d));
                }
            }
            return arrayList;
        }
        if (c0204i == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            Object obj = list.get(i7);
            if (((Boolean) c0204i.c(((C0201f) obj).f2823a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i5, int i6, int i7) {
        return ((i < i7) & (i6 < i5)) | (((i == i5) | (i6 == i7)) & (i == i6));
    }
}
