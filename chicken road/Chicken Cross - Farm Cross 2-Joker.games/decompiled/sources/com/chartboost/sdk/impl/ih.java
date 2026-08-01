package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ih {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4812a;

    public ih(SharedPreferences defaultSharedPreferences) {
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "defaultSharedPreferences");
        this.f4812a = defaultSharedPreferences;
    }

    public final String a() {
        return this.f4812a.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, null);
    }
}
