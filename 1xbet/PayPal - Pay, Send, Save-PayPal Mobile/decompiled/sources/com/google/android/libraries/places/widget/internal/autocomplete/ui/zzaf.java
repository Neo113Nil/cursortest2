package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
public final class zzaf extends androidx.recyclerview.widget.DefaultItemAnimator {
    private final java.util.List zza = new java.util.ArrayList();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.List zzc = new java.util.ArrayList();
    private final int zzd;

    public zzaf(android.content.res.Resources resources) {
        this.zzd = resources.getDimensionPixelSize(com.google.android.libraries.places.R.dimen.places_autocomplete_vertical_dropdown);
    }

    private final void zzd(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        java.util.List list = this.zzc;
        android.view.View view = viewHolder.itemView;
        list.add(viewHolder);
        long moveDuration = getMoveDuration();
        long layoutPosition = viewHolder.getLayoutPosition();
        view.setTranslationY(-this.zzd);
        view.setAlpha(0.0f);
        android.view.ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new androidx.interpolator.view.animation.FastOutSlowInInterpolator()).setStartDelay(moveDuration + (layoutPosition * 67));
        animate.setListener(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzae(this, view, viewHolder, animate)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zza() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(android.view.View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateAdd(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        try {
            endAnimation(viewHolder);
            viewHolder.itemView.setAlpha(0.0f);
            if (viewHolder instanceof com.google.android.libraries.places.widget.internal.autocomplete.ui.zzak) {
                if (((com.google.android.libraries.places.widget.internal.autocomplete.ui.zzak) viewHolder).zzb()) {
                    this.zza.add(viewHolder);
                    return true;
                }
                this.zzb.add(viewHolder);
                return true;
            }
            if (((com.google.android.libraries.places.widget.internal.autocomplete.ui.zzq) viewHolder).zzb()) {
                this.zza.add(viewHolder);
                return true;
            }
            this.zzb.add(viewHolder);
            return true;
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void endAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        try {
            super.endAnimation(viewHolder);
            if (this.zza.remove(viewHolder)) {
                zzf(viewHolder.itemView);
                dispatchAddFinished(viewHolder);
            }
            zza();
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void endAnimations() {
        try {
            java.util.List list = this.zza;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = (androidx.recyclerview.widget.RecyclerView.ViewHolder) list.get(size);
                zzf(viewHolder.itemView);
                dispatchAddFinished(viewHolder);
                list.remove(size);
            }
            java.util.List list2 = this.zzc;
            int size2 = list2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    super.endAnimations();
                    return;
                }
                ((androidx.recyclerview.widget.RecyclerView.ViewHolder) list2.get(size2)).itemView.animate().cancel();
            }
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean isRunning() {
        try {
            if (!super.isRunning() && this.zzb.isEmpty() && this.zza.isEmpty()) {
                return !this.zzc.isEmpty();
            }
            return true;
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void runPendingAnimations() {
        try {
            java.util.List list = this.zzb;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                super.animateAdd((androidx.recyclerview.widget.RecyclerView.ViewHolder) it.next());
            }
            list.clear();
            super.runPendingAnimations();
            java.util.List list2 = this.zza;
            if (list2.isEmpty()) {
                return;
            }
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList = new java.util.ArrayList(list2);
            list2.clear();
            for (androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder : arrayList) {
                android.view.View view = viewHolder.itemView;
                this.zzc.add(viewHolder);
                long moveDuration = getMoveDuration();
                long layoutPosition = viewHolder.getLayoutPosition();
                view.setTranslationY(-this.zzd);
                view.setAlpha(0.0f);
                android.view.ViewPropertyAnimator animate = view.animate();
                animate.cancel();
                animate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new androidx.interpolator.view.animation.FastOutSlowInInterpolator()).setStartDelay(moveDuration + (layoutPosition * 67));
                animate.setListener(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzae(this, view, viewHolder, animate)).start();
            }
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    final /* synthetic */ java.util.List zzc() {
        return this.zzc;
    }
}
