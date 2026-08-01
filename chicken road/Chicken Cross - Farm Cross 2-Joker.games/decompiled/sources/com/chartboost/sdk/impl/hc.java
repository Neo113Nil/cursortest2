package com.chartboost.sdk.impl;

import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hc implements tc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4792a;

    public hc(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4792a = context;
    }

    @Override // com.chartboost.sdk.impl.tc
    public qc a() {
        int i = this.f4792a.getResources().getConfiguration().orientation;
        if (i == 1) {
            return qc.d;
        }
        if (i != 2) {
            return null;
        }
        return qc.c;
    }

    @Override // com.chartboost.sdk.impl.tc
    public boolean isLocked() {
        return Settings.System.getInt(this.f4792a.getContentResolver(), "accelerometer_rotation", 0) != 0;
    }
}
