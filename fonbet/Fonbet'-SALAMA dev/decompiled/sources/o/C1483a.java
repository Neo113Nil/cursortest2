package o;

import java.util.HashMap;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1483a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f15515e = new HashMap();

    @Override // o.f
    public final C1485c l(Object obj) {
        return (C1485c) this.f15515e.get(obj);
    }

    @Override // o.f
    public final Object m(Object obj) {
        Object m7 = super.m(obj);
        this.f15515e.remove(obj);
        return m7;
    }
}
