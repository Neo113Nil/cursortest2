package com.bytedance.sdk.openadsdk.core.vy;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes4.dex */
public class pcc {
    private static volatile long gm;
    private static volatile pcc pcc;
    private static volatile boolean sf;
    private Handler vj;
    private final Queue<C0180pcc> oo = new LinkedList();
    private final vh wh = lu.oo();

    private pcc() {
    }

    public static pcc pcc() {
        if (pcc == null) {
            synchronized (pcc.class) {
                if (pcc == null) {
                    pcc = new pcc();
                }
            }
        }
        return pcc;
    }

    private synchronized boolean sf(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int lq = this.wh.lq();
        long ye = this.wh.ye();
        if (this.oo.size() > 0 && this.oo.size() >= lq) {
            long abs = Math.abs(currentTimeMillis - this.oo.peek().pcc);
            if (abs <= ye) {
                sf(ye - abs);
                return true;
            }
            this.oo.poll();
            this.oo.offer(new C0180pcc(currentTimeMillis, str));
        } else {
            this.oo.offer(new C0180pcc(currentTimeMillis, str));
        }
        return false;
    }

    public synchronized boolean pcc(String str) {
        if (sf(str)) {
            pcc(true);
            pcc(gm);
        } else {
            pcc(false);
        }
        return sf;
    }

    private synchronized void pcc(long j) {
        if (this.vj == null) {
            this.vj = new Handler(Looper.getMainLooper());
        }
        this.vj.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vy.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                pcc.this.pcc(false);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pcc(boolean z) {
        sf = z;
    }

    public synchronized boolean sf() {
        return sf;
    }

    private synchronized void sf(long j) {
        gm = j;
    }

    public synchronized String gm() {
        String str;
        HashMap hashMap = new HashMap();
        for (C0180pcc c0180pcc : this.oo) {
            if (hashMap.containsKey(c0180pcc.sf)) {
                hashMap.put(c0180pcc.sf, Integer.valueOf(((Integer) hashMap.get(c0180pcc.sf)).intValue() + 1));
            } else {
                hashMap.put(c0180pcc.sf, 1);
            }
        }
        str = "";
        int i = Integer.MIN_VALUE;
        for (String str2 : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (i < intValue) {
                str = str2;
                i = intValue;
            }
        }
        return str;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.vy.pcc$pcc, reason: collision with other inner class name */
    private static class C0180pcc {
        private final long pcc;
        private final String sf;

        private C0180pcc(long j, String str) {
            this.pcc = j;
            this.sf = str;
        }
    }
}
