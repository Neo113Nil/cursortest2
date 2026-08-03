package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3708b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, java.lang.String str) {
        super(0);
        this.f3707a = context;
        this.f3708b = str;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        android.content.pm.PackageManager packageManager = this.f3707a.getPackageManager();
        return io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(30) ? io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f3708b) : packageManager.getInstallerPackageName(this.f3708b);
    }
}
