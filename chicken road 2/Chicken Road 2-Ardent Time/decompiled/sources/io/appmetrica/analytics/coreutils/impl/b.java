package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, java.lang.String str, int i2) {
        super(0);
        this.f3702a = context;
        this.f3703b = str;
        this.f3704c = i2;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        return this.f3702a.getPackageManager().getApplicationInfo(this.f3703b, this.f3704c);
    }
}
