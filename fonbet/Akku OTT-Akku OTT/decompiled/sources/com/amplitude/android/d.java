package com.amplitude.android;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends Thread {
    public final /* synthetic */ a a;

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        com.amplitude.core.platform.m mVar = this.a.g;
        Intrinsics.checkNotNull(mVar, "null cannot be cast to non-null type com.amplitude.android.Timeline");
        ((x) mVar).d.cancel(null);
    }
}
