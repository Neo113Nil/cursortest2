package com.bytedance.adsdk.ugeno.core.sf;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class pcc {
    public String pcc = "GesThrough_";
    private List<MotionEvent> sf = new ArrayList();
    private Set<String> gm = Collections.synchronizedSet(new HashSet());

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent) {
        if (gmVar == null || motionEvent == null || this.sf == null) {
            return;
        }
        pcc(gmVar.vh(), gmVar.pq(), motionEvent);
    }

    public void pcc(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.sf == null) {
            return;
        }
        this.pcc = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (motionEvent.getAction() == 0) {
            pcc();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(i, i2);
        this.sf.add(obtain);
    }

    public boolean pcc(MotionEvent motionEvent) {
        if (motionEvent == null || this.gm == null) {
            return false;
        }
        return this.gm.contains(motionEvent.getDownTime() + "_" + motionEvent.getPointerId(motionEvent.getActionIndex()));
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        if (this.sf.isEmpty() || this.gm == null) {
            Log.d(this.pcc, "motionEvents is empty or mockUniqueId is null");
        } else {
            if (gmVar == null || gmVar.vh() == null || gmVar.vh().getRootView() == null) {
                return;
            }
            pcc(gmVar.vh());
        }
    }

    public void pcc(View view) {
        if (this.sf.isEmpty() || this.gm == null) {
            Log.d(this.pcc, "motionEvents is empty or mockUniqueId is null");
        } else {
            if (view == null || view.getRootView() == null) {
                return;
            }
            final View rootView = view.getRootView();
            Log.d(this.pcc, "Re-dispatch motionEvents.size(): " + this.sf.size());
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.sf.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    for (MotionEvent motionEvent : pcc.this.sf) {
                        if (motionEvent != null) {
                            pcc.this.gm.add(motionEvent.getDownTime() + "_" + motionEvent.getPointerId(motionEvent.getActionIndex()));
                            rootView.dispatchTouchEvent(motionEvent);
                            motionEvent.recycle();
                        }
                    }
                    pcc.this.pcc();
                }
            }, 300L);
        }
    }

    public void pcc() {
        Log.d(this.pcc, "clear all recorded motionEvents");
        List<MotionEvent> list = this.sf;
        if (list != null) {
            list.clear();
        }
    }
}
