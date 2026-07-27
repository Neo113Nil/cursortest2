package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str) {
        super(0);
        this.f5390a = context;
        this.f5391b = str;
    }

    @Override // o2.a
    public final Object invoke() {
        PackageManager packageManager = this.f5390a.getPackageManager();
        return AndroidUtils.isApiAchieved(30) ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f5391b) : packageManager.getInstallerPackageName(this.f5391b);
    }
}
