package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdru implements GestureDetector.OnGestureListener {
    private final zzdqm zza;
    private final zzdrm zzb;

    zzdru(zzdqm zzdqmVar, zzdrm zzdrmVar) {
        this.zza = zzdqmVar;
        this.zzb = zzdrmVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0007, B:13:0x001b, B:14:0x0061, B:16:0x0067, B:22:0x002d, B:26:0x003f, B:29:0x0052), top: B:2:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int y;
        zzdqm zzdqmVar = this.zza;
        if (zzdqmVar != null) {
            int i = -1;
            if (Math.abs(f) > Math.abs(f2)) {
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
                if (i == zzdqmVar.zzG()) {
                    zzdqmVar.zzE(this.zzb.zzp(), y);
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
                if (i == zzdqmVar.zzG()) {
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
