package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class zzdig implements GestureDetector.OnGestureListener {
    private final zzdgx zza;
    private final zzdhy zzb;

    public zzdig(zzdgx zzdgxVar, zzdhy zzdhyVar) {
        this.zza = zzdgxVar;
        this.zzb = zzdhyVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
        int y4;
        try {
            if (this.zza != null) {
                int i7 = -1;
                if (Math.abs(f7) > Math.abs(f8)) {
                    if (f7 > 0.0f) {
                        y4 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f7) * 1000.0f);
                        i7 = 1;
                    } else if (f7 < 0.0f) {
                        y4 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f7) * 1000.0f);
                        i7 = 2;
                    } else {
                        y4 = 0;
                    }
                } else if (f8 > 0.0f) {
                    y4 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f8) * 1000.0f);
                    i7 = 8;
                } else if (f8 < 0.0f) {
                    y4 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f8) * 1000.0f);
                    i7 = 4;
                } else {
                    y4 = 0;
                }
                if (i7 == this.zza.zza()) {
                    this.zza.zzE(this.zzb.zzr(), y4);
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
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
