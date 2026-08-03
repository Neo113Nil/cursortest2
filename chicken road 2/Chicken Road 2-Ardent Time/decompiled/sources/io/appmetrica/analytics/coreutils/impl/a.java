package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.ComponentName f3700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, android.content.ComponentName componentName, int i2) {
        super(0);
        this.f3699a = context;
        this.f3700b = componentName;
        this.f3701c = i2;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        return this.f3699a.getPackageManager().getActivityInfo(this.f3700b, this.f3701c);
    }
}
