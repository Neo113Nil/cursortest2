package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.ComponentName f3713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, android.content.ComponentName componentName, int i2) {
        super(0);
        this.f3712a = context;
        this.f3713b = componentName;
        this.f3714c = i2;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        return this.f3712a.getPackageManager().getServiceInfo(this.f3713b, this.f3714c);
    }
}
