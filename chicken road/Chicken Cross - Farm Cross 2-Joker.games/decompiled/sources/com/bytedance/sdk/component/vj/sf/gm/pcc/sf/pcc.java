package com.bytedance.sdk.component.vj.sf.gm.pcc.sf;

import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.component.vj.nac;

/* loaded from: classes4.dex */
public class pcc implements nac {
    private int gm;
    private com.bytedance.sdk.component.vj.sf.gm.pcc.gm<String, Bitmap> oo;
    private long pcc = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
    private int sf;

    public pcc(int i, int i2) {
        this.sf = i2;
        this.gm = i;
        this.oo = new com.bytedance.sdk.component.vj.sf.gm.pcc.gm<>(this.sf);
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public boolean pcc(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int pcc = pcc(bitmap);
                if (pcc <= this.pcc && pcc != 0) {
                    this.oo.pcc(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public Bitmap pcc(String str) {
        try {
            return this.oo.pcc((com.bytedance.sdk.component.vj.sf.gm.pcc.gm<String, Bitmap>) str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public boolean sf(String str) {
        return this.oo.pcc((com.bytedance.sdk.component.vj.sf.gm.pcc.gm<String, Bitmap>) str) != null;
    }

    public static int pcc(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
