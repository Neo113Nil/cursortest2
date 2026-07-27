package com.bytedance.sdk.openadsdk.lo.pcc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.oo;

/* loaded from: classes4.dex */
public class sf {
    private byte[] gm;
    private Bitmap oo;
    int pcc;
    private Drawable sf;
    private Bitmap vj;

    public sf(Drawable drawable, int i) {
        this.gm = null;
        this.oo = null;
        this.vj = null;
        this.sf = drawable;
        this.pcc = i;
    }

    public sf(byte[] bArr, int i) {
        this.sf = null;
        this.oo = null;
        this.vj = null;
        this.gm = bArr;
        this.pcc = i;
    }

    public sf(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.sf = null;
        this.gm = null;
        this.vj = bitmap2;
        this.oo = bitmap;
        this.pcc = i;
    }

    public Bitmap pcc() {
        return this.oo;
    }

    public Bitmap sf() {
        return this.vj;
    }

    public byte[] gm() {
        try {
            if (this.gm == null) {
                this.gm = oo.pcc(this.oo);
            }
        } catch (OutOfMemoryError e) {
            lo.gm("GifRequestResult", e.getMessage());
        }
        return this.gm;
    }

    public Drawable oo() {
        return this.sf;
    }

    public boolean vj() {
        if (this.oo != null || this.sf != null) {
            return true;
        }
        byte[] bArr = this.gm;
        return bArr != null && bArr.length > 0;
    }
}
