package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.U f4988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.Gi f4989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(io.appmetrica.analytics.impl.U u2, io.appmetrica.analytics.impl.Gi gi) {
        super(0);
        this.f4988a = u2;
        this.f4989b = gi;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        io.appmetrica.analytics.impl.U u2 = this.f4988a;
        io.appmetrica.analytics.impl.N n2 = u2.f5047h;
        android.content.Context context = u2.f5040a;
        io.appmetrica.analytics.impl.Gi gi = this.f4989b;
        n2.getClass();
        return io.appmetrica.analytics.impl.N.a(new io.appmetrica.analytics.impl.M(n2, context, gi));
    }
}
