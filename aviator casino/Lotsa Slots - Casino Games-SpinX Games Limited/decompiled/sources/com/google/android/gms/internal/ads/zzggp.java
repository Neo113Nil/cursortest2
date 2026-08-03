package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzggp {
    private android.view.MotionEvent zzb;
    private final java.util.ArrayDeque zza = new java.util.ArrayDeque();
    private com.google.android.gms.internal.ads.zzggn zzc = new com.google.android.gms.internal.ads.zzggn();

    zzggp() {
    }

    public final synchronized void zza(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.zzb = android.view.MotionEvent.obtain(motionEvent);
        }
        this.zzc.zza(motionEvent);
        java.util.ArrayDeque arrayDeque = this.zza;
        if (arrayDeque.size() >= 6) {
            arrayDeque.remove();
        }
        arrayDeque.add(new com.google.android.gms.internal.ads.zzggo(motionEvent));
    }

    public final synchronized void zzb(java.util.Map map) {
        android.view.MotionEvent motionEvent = this.zzb;
        if (motionEvent != null) {
            map.put("nv", motionEvent);
        }
        map.put("oe", this.zzc);
        java.util.ArrayDeque arrayDeque = this.zza;
        map.put("ro", arrayDeque.toArray(new com.google.android.gms.internal.ads.zzggo[arrayDeque.size()]));
        this.zzc = new com.google.android.gms.internal.ads.zzggn();
        arrayDeque.clear();
        android.view.MotionEvent motionEvent2 = this.zzb;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.zzb = null;
        }
    }
}
