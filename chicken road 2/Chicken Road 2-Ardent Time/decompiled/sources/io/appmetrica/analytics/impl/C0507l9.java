package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507l9 extends io.appmetrica.analytics.impl.Ff {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0541mh f6350a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0593oh f6351b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0231ah f6352c;

    public C0507l9(io.appmetrica.analytics.impl.X4 x4) {
        this.f6350a = new io.appmetrica.analytics.impl.C0541mh(x4);
        this.f6351b = new io.appmetrica.analytics.impl.C0593oh(x4);
        this.f6352c = new io.appmetrica.analytics.impl.C0231ah(x4);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final io.appmetrica.analytics.impl.W8 a(int i2) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int ordinal = io.appmetrica.analytics.impl.EnumC0251bb.a(i2).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f6350a);
        } else if (ordinal == 3) {
            linkedList.add(this.f6352c);
        } else if (ordinal == 27) {
            linkedList.add(this.f6351b);
            linkedList.add(this.f6350a);
        }
        return new io.appmetrica.analytics.impl.V8(linkedList);
    }
}
