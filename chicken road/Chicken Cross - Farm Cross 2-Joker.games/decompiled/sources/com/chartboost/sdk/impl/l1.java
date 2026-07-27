package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static l1 f4851a = new l1();

    public static l1 b() {
        return f4851a;
    }

    public String a() {
        return Build.VERSION.RELEASE;
    }

    public Task a(Context context) {
        try {
            return AppSet.getClient(context).getAppSetIdInfo();
        } catch (Exception e) {
            mb.b("Cannot retrieve appSetId client", e);
            return null;
        }
    }

    public boolean a(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence);
    }
}
