package U5;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class U implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((T) obj).c() - ((T) obj2).c();
    }
}
