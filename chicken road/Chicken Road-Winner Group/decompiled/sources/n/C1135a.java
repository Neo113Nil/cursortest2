package n;

import java.util.HashMap;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135a extends C1140f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f10113e = new HashMap();

    @Override // n.C1140f
    public final C1137c b(Object obj) {
        return (C1137c) this.f10113e.get(obj);
    }

    @Override // n.C1140f
    public final Object c(Object obj) {
        Object c3 = super.c(obj);
        this.f10113e.remove(obj);
        return c3;
    }
}
