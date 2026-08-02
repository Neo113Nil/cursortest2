package De;

import ed.InterfaceC6346b;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: De.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2868k<E> {
    @NotNull
    public static final Object a(Object obj, E e11) {
        if (obj == null) {
            return e11;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e11);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e11);
        return arrayList;
    }
}
