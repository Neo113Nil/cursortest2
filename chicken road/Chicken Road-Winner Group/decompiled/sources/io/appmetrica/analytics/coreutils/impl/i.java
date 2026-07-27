package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str) {
        super(0);
        this.f5403a = context;
        this.f5404b = str;
    }

    @Override // o2.a
    public final Object invoke() {
        PackageManager packageManager = this.f5403a.getPackageManager();
        return AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f5404b) : packageManager.resolveContentProvider(this.f5404b, 128);
    }
}
