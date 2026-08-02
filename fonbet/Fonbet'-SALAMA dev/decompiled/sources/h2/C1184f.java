package h2;

import e2.AbstractC1005b;
import i2.AbstractC1252h;
import java.util.List;

/* renamed from: h2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184f extends AbstractC1005b {

    /* renamed from: d, reason: collision with root package name */
    public final List f13367d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13368e;

    public C1184f(long j, List list) {
        super(0L, list.size() - 1);
        this.f13368e = j;
        this.f13367d = list;
    }

    @Override // e2.InterfaceC1014k
    public final long c() {
        a();
        return this.f13368e + ((AbstractC1252h) this.f13367d.get((int) this.f12576c)).f13877e;
    }

    @Override // e2.InterfaceC1014k
    public final long f() {
        a();
        AbstractC1252h abstractC1252h = (AbstractC1252h) this.f13367d.get((int) this.f12576c);
        return this.f13368e + abstractC1252h.f13877e + abstractC1252h.f13875c;
    }
}
