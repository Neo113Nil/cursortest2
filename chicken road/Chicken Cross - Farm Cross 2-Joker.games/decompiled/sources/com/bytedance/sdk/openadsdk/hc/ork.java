package com.bytedance.sdk.openadsdk.hc;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes4.dex */
public class ork {
    private final AudioManager pcc;
    private int sf = -1;
    private boolean gm = false;

    public ork(Context context) {
        this.pcc = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int pcc() {
        return this.sf;
    }

    public void pcc(boolean z) {
        pcc(z, false);
    }

    public void pcc(boolean z, boolean z2) {
        if (this.pcc == null) {
            return;
        }
        int i = 0;
        if (z) {
            int qf = DeviceUtils.qf();
            if (qf != 0) {
                this.sf = qf;
            } else if (!z2) {
                return;
            }
            pcc(3, 0, 0);
            this.gm = true;
            return;
        }
        int i2 = this.sf;
        if (i2 == 0) {
            i2 = DeviceUtils.vy() / 15;
        } else {
            if (i2 == -1) {
                if (!z2) {
                    return;
                } else {
                    i2 = DeviceUtils.vy() / 15;
                }
            }
            this.sf = -1;
            pcc(3, i2, i);
            this.gm = true;
        }
        i = 1;
        this.sf = -1;
        pcc(3, i2, i);
        this.gm = true;
    }

    private void pcc(int i, int i2, int i3) {
        try {
            this.pcc.setStreamVolume(i, i2, i3);
        } catch (Throwable unused) {
        }
    }
}
