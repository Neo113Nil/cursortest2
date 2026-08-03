package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, java.lang.String str, int i2) {
        super(0);
        this.f3709a = context;
        this.f3710b = str;
        this.f3711c = i2;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        return this.f3709a.getPackageManager().getPackageInfo(this.f3710b, this.f3711c);
    }
}
