package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes.dex */
public abstract class T5 extends BaseRequestConfig.ComponentLoader {

    /* renamed from: a, reason: collision with root package name */
    public final SafePackageManager f7514a;

    public T5(Context context, String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: a */
    public U5 load(S5 s5) {
        U5 u5 = (U5) super.load((T5) s5);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f7514a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i2 = applicationInfo.flags;
            u5.f7587a = (i2 & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            u5.f7588b = (i2 & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            u5.f7587a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            u5.f7588b = (getContext().getApplicationInfo().flags & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else {
            u5.f7587a = CommonUrlParts.Values.FALSE_INTEGER;
            u5.f7588b = CommonUrlParts.Values.FALSE_INTEGER;
        }
        C0754jm c0754jm = s5.f7418a;
        u5.f7589c = c0754jm;
        u5.setRetryPolicyConfig(c0754jm.f8578t);
        return u5;
    }

    public T5(Context context, String str, SafePackageManager safePackageManager) {
        super(context, str);
        this.f7514a = safePackageManager;
    }
}
