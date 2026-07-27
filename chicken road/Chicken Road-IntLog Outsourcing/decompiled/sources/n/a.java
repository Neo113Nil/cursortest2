package n;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f11262e = new HashMap();

    @Override // n.f
    public final c b(Object obj) {
        return (c) this.f11262e.get(obj);
    }

    @Override // n.f
    public final Object c(Object obj) {
        Object c2 = super.c(obj);
        this.f11262e.remove(obj);
        return c2;
    }
}
