package B1;

import D1.AbstractC2810k0;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface c0 {
    default int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends List<? extends InterfaceC2552v>> list, int i11) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            List list2 = (List) arrayList.get(i12);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList3.add(new r((InterfaceC2552v) list2.get(i13), EnumC2554x.Max, EnumC2555y.Height));
            }
            arrayList2.add(arrayList3);
        }
        AbstractC2810k0 abstractC2810k0 = (AbstractC2810k0) interfaceC2553w;
        return mo3measure3p2s80s(new A(abstractC2810k0, abstractC2810k0.getLayoutDirection()), arrayList2, Z1.c.b(i11, 0, 13)).getHeight();
    }

    default int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends List<? extends InterfaceC2552v>> list, int i11) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            List list2 = (List) arrayList.get(i12);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList3.add(new r((InterfaceC2552v) list2.get(i13), EnumC2554x.Max, EnumC2555y.Width));
            }
            arrayList2.add(arrayList3);
        }
        AbstractC2810k0 abstractC2810k0 = (AbstractC2810k0) interfaceC2553w;
        return mo3measure3p2s80s(new A(abstractC2810k0, abstractC2810k0.getLayoutDirection()), arrayList2, Z1.c.b(0, i11, 7)).getWidth();
    }

    @NotNull
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    W mo3measure3p2s80s(@NotNull Y y11, @NotNull List<? extends List<? extends U>> list, long j11);

    default int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends List<? extends InterfaceC2552v>> list, int i11) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            List list2 = (List) arrayList.get(i12);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList3.add(new r((InterfaceC2552v) list2.get(i13), EnumC2554x.Min, EnumC2555y.Height));
            }
            arrayList2.add(arrayList3);
        }
        AbstractC2810k0 abstractC2810k0 = (AbstractC2810k0) interfaceC2553w;
        return mo3measure3p2s80s(new A(abstractC2810k0, abstractC2810k0.getLayoutDirection()), arrayList2, Z1.c.b(i11, 0, 13)).getHeight();
    }

    default int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends List<? extends InterfaceC2552v>> list, int i11) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            List list2 = (List) arrayList.get(i12);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList3.add(new r((InterfaceC2552v) list2.get(i13), EnumC2554x.Min, EnumC2555y.Width));
            }
            arrayList2.add(arrayList3);
        }
        AbstractC2810k0 abstractC2810k0 = (AbstractC2810k0) interfaceC2553w;
        return mo3measure3p2s80s(new A(abstractC2810k0, abstractC2810k0.getLayoutDirection()), arrayList2, Z1.c.b(0, i11, 7)).getWidth();
    }
}
