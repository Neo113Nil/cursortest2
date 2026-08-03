package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.ComponentName f3726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3727c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, android.content.ComponentName componentName, int i2, int i3) {
        super(0);
        this.f3725a = context;
        this.f3726b = componentName;
        this.f3727c = i2;
        this.f3728d = i3;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        this.f3725a.getPackageManager().setComponentEnabledSetting(this.f3726b, this.f3727c, this.f3728d);
        return h1.C0177i.f3302a;
    }
}
