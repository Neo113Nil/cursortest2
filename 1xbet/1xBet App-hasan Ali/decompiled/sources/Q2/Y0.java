package Q2;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class Y0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = J2.p.f2724b;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
