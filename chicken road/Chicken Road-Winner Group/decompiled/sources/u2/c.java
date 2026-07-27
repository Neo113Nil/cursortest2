package u2;

import java.util.Iterator;
import o2.l;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f10383a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10384b;

    /* renamed from: c, reason: collision with root package name */
    public final l f10385c;

    public c(e eVar, boolean z3, l lVar) {
        this.f10383a = eVar;
        this.f10384b = z3;
        this.f10385c = lVar;
    }

    @Override // u2.e
    public final Iterator iterator() {
        return new b(this);
    }
}
