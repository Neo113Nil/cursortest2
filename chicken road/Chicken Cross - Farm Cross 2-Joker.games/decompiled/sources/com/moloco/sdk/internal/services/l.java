package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class l implements InterfaceC4810k {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10827a;
    public C4809j b;

    public l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10827a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC4810k
    public C4809j invoke() {
        Object m8079constructorimpl;
        C4809j c4809j = this.b;
        if (c4809j != null) {
            return c4809j;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = this.f10827a;
            String obj = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            PackageInfo a2 = m.a(this.f10827a);
            String packageName = a2.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            String versionName = a2.versionName;
            Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
            C4809j c4809j2 = new C4809j(obj, packageName, versionName);
            this.b = c4809j2;
            m8079constructorimpl = Result.m8079constructorimpl(c4809j2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = null;
        }
        C4809j c4809j3 = (C4809j) m8079constructorimpl;
        return c4809j3 == null ? new C4809j("", "", "") : c4809j3;
    }
}
