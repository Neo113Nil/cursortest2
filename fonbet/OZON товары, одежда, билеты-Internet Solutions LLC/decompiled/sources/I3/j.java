package I3;

import I3.n;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((n.a) Collections.max((List) obj)).compareTo((n.a) Collections.max((List) obj2));
    }
}
