package com.chartboost.sdk.impl;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jc implements uc {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f4826a;

    public jc(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("audio");
        this.f4826a = systemService instanceof AudioManager ? (AudioManager) systemService : null;
    }

    @Override // com.chartboost.sdk.impl.uc
    public Float a() {
        if (this.f4826a == null) {
            return null;
        }
        return Float.valueOf((r0.getStreamVolume(3) / r0.getStreamMaxVolume(3)) * 100);
    }
}
