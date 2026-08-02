package P10;

import java.util.HashMap;
import java.util.LinkedList;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<Integer, LinkedList<ru.ozon.composer.ui.widget.k<l20.c>>> f21630a = new HashMap<>();

    public final ru.ozon.composer.ui.widget.k<l20.c> a(int i11) {
        LinkedList<ru.ozon.composer.ui.widget.k<l20.c>> linkedList = this.f21630a.get(Integer.valueOf(i11));
        if (linkedList != null) {
            return (ru.ozon.composer.ui.widget.k) C7714v.v0(linkedList);
        }
        return null;
    }

    public final void b(int i11, @NotNull ru.ozon.composer.ui.widget.k<l20.c> vh2) {
        Intrinsics.checkNotNullParameter(vh2, "vh");
        HashMap<Integer, LinkedList<ru.ozon.composer.ui.widget.k<l20.c>>> hashMap = this.f21630a;
        LinkedList<ru.ozon.composer.ui.widget.k<l20.c>> linkedList = hashMap.get(Integer.valueOf(i11));
        if ((linkedList != null ? linkedList.size() : 0) < 5) {
            Integer valueOf = Integer.valueOf(i11);
            LinkedList<ru.ozon.composer.ui.widget.k<l20.c>> linkedList2 = hashMap.get(valueOf);
            if (linkedList2 == null) {
                linkedList2 = new LinkedList<>();
                hashMap.put(valueOf, linkedList2);
            }
            linkedList2.addFirst(vh2);
        }
    }
}
