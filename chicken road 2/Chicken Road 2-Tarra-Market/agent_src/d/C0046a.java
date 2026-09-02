package d;

import java.util.HashMap;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046a extends C0051f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f873e = new HashMap();

    @Override // d.C0051f
    public final C0048c a(Object obj) {
        return (C0048c) this.f873e.get(obj);
    }

    @Override // d.C0051f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.f873e.remove(obj);
        return b2;
    }
}
