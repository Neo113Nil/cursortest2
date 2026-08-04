package p054h2;

import java.util.List;
import p032e2.b;
import p061i2.h;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13374e;

    public f(long j, List list) {
        super(0L, list.size() - 1);
        this.f13374e = j;
        this.f13373d = list;
    }

    @Override // p032e2.k
    public final long c() {
        a();
        return this.f13374e + ((h) this.f13373d.get((int) this.f12582c)).f13883e;
    }

    @Override // p032e2.k
    public final long f() {
        a();
        h hVar = (h) this.f13373d.get((int) this.f12582c);
        return this.f13374e + hVar.f13883e + hVar.f13881c;
    }
}
