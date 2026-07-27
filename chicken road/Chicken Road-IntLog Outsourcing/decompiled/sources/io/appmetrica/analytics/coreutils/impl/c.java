package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafePackageManager f6208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SafePackageManager safePackageManager, Context context) {
        super(0);
        this.f6208a = safePackageManager;
        this.f6209b = context;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        SafePackageManager safePackageManager = this.f6208a;
        Context context = this.f6209b;
        ApplicationInfo applicationInfo = safePackageManager.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }
}
