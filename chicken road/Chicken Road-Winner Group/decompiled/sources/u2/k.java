package u2;

import java.util.Iterator;
import o2.l;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f10393a;

    /* renamed from: b, reason: collision with root package name */
    public final l f10394b;

    public k(e eVar, l lVar) {
        this.f10393a = eVar;
        this.f10394b = lVar;
    }

    @Override // u2.e
    public final Iterator iterator() {
        return new j(this);
    }
}
