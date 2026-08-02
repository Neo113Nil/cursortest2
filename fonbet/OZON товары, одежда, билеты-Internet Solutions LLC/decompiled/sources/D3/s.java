package D3;

import D3.r;
import J3.k;
import android.net.Uri;
import j3.C7251G;
import java.io.IOException;
import java.util.List;
import p3.C8848h;

/* loaded from: classes8.dex */
public final class s<T extends r<T>> implements k.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final k.a<? extends T> f5722a;

    /* renamed from: b, reason: collision with root package name */
    private final List<C7251G> f5723b;

    public s(k.a<? extends T> aVar, List<C7251G> list) {
        this.f5722a = aVar;
        this.f5723b = list;
    }

    @Override // J3.k.a
    public final Object a(Uri uri, C8848h c8848h) throws IOException {
        r rVar = (r) this.f5722a.a(uri, c8848h);
        List<C7251G> list = this.f5723b;
        return (list == null || list.isEmpty()) ? rVar : (r) rVar.a(list);
    }
}
