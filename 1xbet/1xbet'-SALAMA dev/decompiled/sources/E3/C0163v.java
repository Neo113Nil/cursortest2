package E3;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: E3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0163v extends AbstractC0155m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2073b;

    public C0163v(Object obj, List list) {
        this.f2072a = obj;
        this.f2073b = list;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2072a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2073b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
