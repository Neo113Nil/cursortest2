package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3716b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, java.lang.String str) {
        super(0);
        this.f3715a = context;
        this.f3716b = str;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f3715a.getPackageManager().hasSystemFeature(this.f3716b));
    }
}
