package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f3718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, android.content.Intent intent, int i2) {
        super(0);
        this.f3717a = context;
        this.f3718b = intent;
        this.f3719c = i2;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        return this.f3717a.getPackageManager().resolveActivity(this.f3718b, this.f3719c);
    }
}
