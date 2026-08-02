package B3;

import B3.M;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M.d f2298a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        M.d dVar = this.f2298a;
        return dVar.a(obj2) - dVar.a(obj);
    }
}
