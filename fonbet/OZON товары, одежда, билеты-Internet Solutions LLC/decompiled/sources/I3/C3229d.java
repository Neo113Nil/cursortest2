package I3;

import java.util.Comparator;

/* renamed from: I3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3229d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }
}
