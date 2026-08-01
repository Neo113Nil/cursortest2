package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n8 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4890a;

    public n8(SharedPreferences defaultSharedPreferences) {
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "defaultSharedPreferences");
        this.f4890a = defaultSharedPreferences;
    }

    public final String a() {
        return this.f4890a.getString("IABGPP_GppSID", null);
    }

    public final String b() {
        return this.f4890a.getString("IABGPP_HDR_GppString", null);
    }
}
