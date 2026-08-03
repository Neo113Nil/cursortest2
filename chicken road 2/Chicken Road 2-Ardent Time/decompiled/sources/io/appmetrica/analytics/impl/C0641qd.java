package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641qd extends kotlin.jvm.internal.j implements s1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0354fb f6684a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0641qd(io.appmetrica.analytics.impl.C0354fb c0354fb) {
        super(1);
        this.f6684a = c0354fb;
    }

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        io.appmetrica.analytics.impl.Yc yc = (io.appmetrica.analytics.impl.Yc) ((java.util.Map.Entry) obj).getValue();
        return yc.f5339b.parse(this.f6684a);
    }
}
