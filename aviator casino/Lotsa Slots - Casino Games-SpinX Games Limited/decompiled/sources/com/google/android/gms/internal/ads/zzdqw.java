package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdqw implements android.view.GestureDetector.OnGestureListener {
    private final com.google.android.gms.internal.ads.zzdpo zza;
    private final com.google.android.gms.internal.ads.zzdqo zzb;

    zzdqw(com.google.android.gms.internal.ads.zzdpo zzdpoVar, com.google.android.gms.internal.ads.zzdqo zzdqoVar) {
        this.zza = zzdpoVar;
        this.zzb = zzdqoVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0008, B:13:0x001c, B:14:0x0066, B:16:0x006c, B:22:0x002f, B:26:0x0042, B:29:0x0056), top: B:2:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        int y;
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zza;
        if (zzdpoVar != null) {
            int i = -1;
            if (java.lang.Math.abs(f) > java.lang.Math.abs(f2)) {
                if (f > 0.0f) {
                    y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                    i = 1;
                } else {
                    if (f < 0.0f) {
                        y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                        i = 2;
                    }
                    y = 0;
                }
                if (i == zzdpoVar.zzG()) {
                    zzdpoVar.zzE(this.zzb.zzq(), y);
                    return false;
                }
            } else {
                if (f2 > 0.0f) {
                    y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                    i = 8;
                } else {
                    if (f2 < 0.0f) {
                        y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                        i = 4;
                    }
                    y = 0;
                }
                if (i == zzdpoVar.zzG()) {
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return false;
    }
}
