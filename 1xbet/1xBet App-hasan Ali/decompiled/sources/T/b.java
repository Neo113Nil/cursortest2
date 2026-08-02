package T;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5575k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Collection f5576l;

    public /* synthetic */ b(int i, Collection collection) {
        this.f5575k = i;
        this.f5576l = collection;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f5575k) {
            case 0:
                return Boolean.valueOf(this.f5576l.contains(obj));
            case 1:
                return Boolean.valueOf(this.f5576l.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f5576l));
        }
    }
}
