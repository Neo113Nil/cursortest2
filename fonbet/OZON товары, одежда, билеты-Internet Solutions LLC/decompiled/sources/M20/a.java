package M20;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {
    public static final D20.b a(@NotNull List<D20.b> list) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<D20.b> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((D20.b) obj2).a(), "default")) {
                break;
            }
        }
        D20.b bVar = (D20.b) obj2;
        if (bVar == null) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (Intrinsics.d(((D20.b) obj3).a(), "ru")) {
                    break;
                }
            }
            bVar = (D20.b) obj3;
            if (bVar == null) {
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it3.next();
                    if (Intrinsics.d(((D20.b) obj4).a(), "en")) {
                        break;
                    }
                }
                bVar = (D20.b) obj4;
                if (bVar == null) {
                    Iterator<T> it4 = list2.iterator();
                    if (it4.hasNext()) {
                        obj = it4.next();
                        if (it4.hasNext()) {
                            int size = ((D20.b) obj).b().size();
                            do {
                                Object next = it4.next();
                                int size2 = ((D20.b) next).b().size();
                                if (size < size2) {
                                    obj = next;
                                    size = size2;
                                }
                            } while (it4.hasNext());
                        }
                    }
                    return (D20.b) obj;
                }
            }
        }
        return bVar;
    }
}
