package com.bytedance.sdk.component.vj.sf.gm.pcc.sf;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.component.vj.lu;

/* loaded from: classes4.dex */
public class sf implements lu {
    private int gm;
    private com.bytedance.sdk.component.vj.sf.gm.pcc.gm<String, byte[]> oo;
    private long pcc = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    private int sf;

    public sf(int i, int i2) {
        this.gm = i;
        this.sf = i2;
        this.oo = new com.bytedance.sdk.component.vj.sf.gm.pcc.gm<>(this.sf);
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public boolean pcc(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.pcc) {
                    return false;
                }
                this.oo.pcc(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public byte[] pcc(String str) {
        try {
            return this.oo.pcc((com.bytedance.sdk.component.vj.sf.gm.pcc.gm<String, byte[]>) str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public boolean sf(String str) {
        return this.oo.pcc((com.bytedance.sdk.component.vj.sf.gm.pcc.gm<String, byte[]>) str) != null;
    }
}
