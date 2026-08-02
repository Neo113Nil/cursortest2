package B1;

import D1.AbstractC2810k0;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface V {
    default int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new r(list.get(i12), EnumC2554x.Max, EnumC2555y.Height));
        }
        AbstractC2810k0 abstractC2810k0 = (AbstractC2810k0) interfaceC2553w;
        return mo2measure3p2s80s(new A(abstractC2810k0, abstractC2810k0.getLayoutDirection()), arrayList, Z1.c.b(i11, 0, 13)).getHeight();
    }

    default int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new r(list.get(i12), EnumC2554x.Max, EnumC2555y.Width));
        }
        AbstractC2810k0 abstractC2810k0 = (AbstractC2810k0) interfaceC2553w;
        return mo2measure3p2s80s(new A(abstractC2810k0, abstractC2810k0.getLayoutDirection()), arrayList, Z1.c.b(0, i11, 7)).getWidth();
    }

    @NotNull
    /* renamed from: measure-3p2s80s */
    W mo2measure3p2s80s(@NotNull Y y11, @NotNull List<? extends U> list, long j11);

    default int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new r(list.get(i12), EnumC2554x.Min, EnumC2555y.Height));
        }
        AbstractC2810k0 abstractC2810k0 = (AbstractC2810k0) interfaceC2553w;
        return mo2measure3p2s80s(new A(abstractC2810k0, abstractC2810k0.getLayoutDirection()), arrayList, Z1.c.b(i11, 0, 13)).getHeight();
    }

    default int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new r(list.get(i12), EnumC2554x.Min, EnumC2555y.Width));
        }
        AbstractC2810k0 abstractC2810k0 = (AbstractC2810k0) interfaceC2553w;
        return mo2measure3p2s80s(new A(abstractC2810k0, abstractC2810k0.getLayoutDirection()), arrayList, Z1.c.b(0, i11, 7)).getWidth();
    }
}
