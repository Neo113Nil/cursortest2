package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class zzr {
    private static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference(null);

    static com.google.android.play.core.splitinstall.zzq zza() {
        return (com.google.android.play.core.splitinstall.zzq) zza.get();
    }

    public static void zzb(com.google.android.play.core.splitinstall.zzq zzqVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = zza;
        while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, zzqVar) && atomicReference.get() == null) {
        }
    }
}
