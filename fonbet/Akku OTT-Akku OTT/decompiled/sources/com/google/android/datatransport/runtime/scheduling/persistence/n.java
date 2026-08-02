package com.google.android.datatransport.runtime.scheduling.persistence;

import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public final class n implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final Object a;
    public Object b;

    public n(AudioManager audioManager) {
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        this.a = audioManager;
        this.b = null;
    }

    public void a(double d, boolean z) {
        double coerceIn = RangesKt.coerceIn(d, 0.0d, 1.0d);
        AudioManager audioManager = (AudioManager) this.a;
        int rint = (int) Math.rint(audioManager.getStreamMaxVolume(3) * coerceIn);
        if (coerceIn != 0.0d) {
            this.b = null;
        }
        audioManager.setStreamVolume(3, rint, z ? 1 : 0);
    }

    @Override // javax.inject.a
    public Object get() {
        com.baseflow.permissionhandler.a aVar = new com.baseflow.permissionhandler.a();
        com.google.android.datatransport.runtime.time.b bVar = new com.google.android.datatransport.runtime.time.b();
        a aVar2 = e.a;
        if (aVar2 == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        Object obj = ((javax.inject.a) this.a).get();
        return new m(aVar, bVar, aVar2, (v) obj, (javax.inject.a) this.b);
    }

    public n(javax.inject.a aVar, javax.inject.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }
}
