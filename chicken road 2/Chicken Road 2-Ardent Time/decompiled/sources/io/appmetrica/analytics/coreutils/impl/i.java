package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3721b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, java.lang.String str) {
        super(0);
        this.f3720a = context;
        this.f3721b = str;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        android.content.pm.PackageManager packageManager = this.f3720a.getPackageManager();
        return io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(33) ? io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f3721b) : packageManager.resolveContentProvider(this.f3721b, 128);
    }
}
