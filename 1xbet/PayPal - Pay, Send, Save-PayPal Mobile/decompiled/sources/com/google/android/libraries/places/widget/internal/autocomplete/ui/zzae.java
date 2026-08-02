package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
final class zzae extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View zza;
    final /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder zzb;
    final /* synthetic */ android.view.ViewPropertyAnimator zzc;
    final /* synthetic */ com.google.android.libraries.places.widget.internal.autocomplete.ui.zzaf zzd;

    zzae(com.google.android.libraries.places.widget.internal.autocomplete.ui.zzaf zzafVar, android.view.View view, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.zza = view;
        this.zzb = viewHolder;
        this.zzc = viewPropertyAnimator;
        java.util.Objects.requireNonNull(zzafVar);
        this.zzd = zzafVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        try {
            android.view.ViewPropertyAnimator viewPropertyAnimator = this.zzc;
            viewPropertyAnimator.setListener(null);
            com.google.android.libraries.places.widget.internal.autocomplete.ui.zzaf zzafVar = this.zzd;
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.zzb;
            zzafVar.dispatchAddFinished(viewHolder);
            zzafVar.zzc().remove(viewHolder);
            zzafVar.zza();
            viewPropertyAnimator.setStartDelay(0L);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        try {
            com.google.android.libraries.places.widget.internal.autocomplete.ui.zzaf.zzf(this.zza);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        try {
            this.zza.setAlpha(0.0f);
            this.zzd.dispatchAddStarting(this.zzb);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }
}
