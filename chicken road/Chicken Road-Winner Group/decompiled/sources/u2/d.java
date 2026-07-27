package u2;

import java.util.Iterator;
import o2.l;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f10386a;

    /* renamed from: b, reason: collision with root package name */
    public final l f10387b;

    /* renamed from: c, reason: collision with root package name */
    public final l f10388c;

    public d(e eVar, l lVar, l lVar2) {
        this.f10386a = eVar;
        this.f10387b = lVar;
        this.f10388c = lVar2;
    }

    @Override // u2.e
    public final Iterator iterator() {
        return new b(this);
    }
}
