package Si;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class j<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f26321a;

    public j(Map map) {
        this.f26321a = map;
    }

    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        Long valueOf = Long.valueOf(((Hi.k) t2).getId());
        Map map = this.f26321a;
        return Vc.a.b((Integer) map.get(valueOf), (Integer) map.get(Long.valueOf(((Hi.k) t11).getId())));
    }
}
