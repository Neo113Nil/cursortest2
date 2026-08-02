package com.amplitude.android;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends com.amplitude.android.plugins.c {
    public final /* synthetic */ a e;

    public c(a aVar) {
        this.e = aVar;
    }

    @Override // com.amplitude.android.plugins.c
    public final void j(String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.e.l(deviceId);
    }
}
