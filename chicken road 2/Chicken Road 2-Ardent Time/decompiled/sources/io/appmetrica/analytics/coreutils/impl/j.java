package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f3723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, android.content.Intent intent, int i2) {
        super(0);
        this.f3722a = context;
        this.f3723b = intent;
        this.f3724c = i2;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        return this.f3722a.getPackageManager().resolveService(this.f3723b, this.f3724c);
    }
}
