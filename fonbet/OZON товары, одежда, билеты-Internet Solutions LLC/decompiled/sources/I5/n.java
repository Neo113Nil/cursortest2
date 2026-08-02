package I5;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n<V, O> implements m<V, O> {

    /* renamed from: a, reason: collision with root package name */
    final List<P5.a<V>> f11990a;

    n(List<P5.a<V>> list) {
        this.f11990a = list;
    }

    @Override // I5.m
    public boolean g() {
        List<P5.a<V>> list = this.f11990a;
        return list.isEmpty() || (list.size() == 1 && list.get(0).h());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        List<P5.a<V>> list = this.f11990a;
        if (!list.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(list.toArray()));
        }
        return sb2.toString();
    }
}
