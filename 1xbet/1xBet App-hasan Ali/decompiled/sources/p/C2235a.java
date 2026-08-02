package p;

import java.util.HashMap;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2235a extends C2240f {

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f18673o = new HashMap();

    @Override // p.C2240f
    public final C2237c c(Object obj) {
        return (C2237c) this.f18673o.get(obj);
    }

    @Override // p.C2240f
    public final Object d(Object obj) {
        Object d5 = super.d(obj);
        this.f18673o.remove(obj);
        return d5;
    }
}
