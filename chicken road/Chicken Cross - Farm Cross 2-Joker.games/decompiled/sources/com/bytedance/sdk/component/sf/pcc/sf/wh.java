package com.bytedance.sdk.component.sf.pcc.sf;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes4.dex */
final class wh {
    static vj pcc;
    static long sf;

    private wh() {
    }

    static vj pcc() {
        synchronized (wh.class) {
            vj vjVar = pcc;
            if (vjVar != null) {
                pcc = vjVar.wh;
                vjVar.wh = null;
                sf -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return vjVar;
            }
            return new vj();
        }
    }

    static void pcc(vj vjVar) {
        if (vjVar.wh != null || vjVar.qf != null) {
            throw new IllegalArgumentException();
        }
        if (vjVar.oo) {
            return;
        }
        synchronized (wh.class) {
            long j = sf;
            if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                return;
            }
            sf = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            vjVar.wh = pcc;
            vjVar.gm = 0;
            vjVar.sf = 0;
            pcc = vjVar;
        }
    }
}
