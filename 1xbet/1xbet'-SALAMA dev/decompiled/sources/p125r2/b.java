package p125r2;

import java.util.Collections;
import java.util.List;
import p068j2.f;
import p151v2.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f16027b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16028a;

    public b(p068j2.b bVar) {
        this.f16028a = Collections.singletonList(bVar);
    }

    @Override // p068j2.f
    public final int d(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p068j2.f
    public final long h(int i7) {
        a.f(i7 == 0);
        return 0L;
    }

    @Override // p068j2.f
    public final List m(long j) {
        return j >= 0 ? this.f16028a : Collections.emptyList();
    }

    @Override // p068j2.f
    public final int p() {
        return 1;
    }

    public b() {
        this.f16028a = Collections.emptyList();
    }
}
