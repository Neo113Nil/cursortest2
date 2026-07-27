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
    public final SafePackageManager f6643a;

    public T5(Context context, String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: a */
    public U5 load(S5 s5) {
        U5 u5 = (U5) super.load((T5) s5);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f6643a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i3 = applicationInfo.flags;
            u5.f6714a = (i3 & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            u5.f6715b = (i3 & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            u5.f6714a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            u5.f6715b = (getContext().getApplicationInfo().flags & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else {
            u5.f6714a = CommonUrlParts.Values.FALSE_INTEGER;
            u5.f6715b = CommonUrlParts.Values.FALSE_INTEGER;
        }
        C0605jm c0605jm = s5.f6552a;
        u5.f6716c = c0605jm;
        u5.setRetryPolicyConfig(c0605jm.f7660t);
        return u5;
    }

    public T5(Context context, String str, SafePackageManager safePackageManager) {
        super(context, str);
        this.f6643a = safePackageManager;
    }
}
