package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzs extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzu zza;

    zzs(com.google.android.gms.ads.internal.overlay.zzu zzuVar) {
        java.util.Objects.requireNonNull(zzuVar);
        this.zza = zzuVar;
    }

    private final void zza(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.zza;
        zzuVar.setEnabled(z);
        zzuVar.zzb().setEnabled(z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        zza(false);
    }
}
