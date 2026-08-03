package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f3705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager, android.content.Context context) {
        super(0);
        this.f3705a = safePackageManager;
        this.f3706b = context;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager = this.f3705a;
        android.content.Context context = this.f3706b;
        android.content.pm.ApplicationInfo applicationInfo = safePackageManager.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }
}
