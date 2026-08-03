package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcgg extends com.google.android.gms.internal.ads.zzcgh implements android.view.ViewTreeObserver.OnScrollChangedListener {
    private final java.lang.ref.WeakReference zza;

    public zzcgg(android.view.View view, android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.zza = new java.lang.ref.WeakReference(onScrollChangedListener);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (android.view.ViewTreeObserver.OnScrollChangedListener) this.zza.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    protected final void zza(android.view.ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    protected final void zzb(android.view.ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }
}
