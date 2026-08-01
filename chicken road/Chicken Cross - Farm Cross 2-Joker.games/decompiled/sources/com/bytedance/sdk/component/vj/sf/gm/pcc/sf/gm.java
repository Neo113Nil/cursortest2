package com.bytedance.sdk.component.vj.sf.gm.pcc.sf;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.vj.nac;

/* loaded from: classes4.dex */
public class gm implements nac {
    private final nac pcc;
    private final com.bytedance.sdk.component.vj.sf.gm.pcc.pcc sf;

    public gm(nac nacVar) {
        this(nacVar, null);
    }

    public gm(nac nacVar, com.bytedance.sdk.component.vj.sf.gm.pcc.pcc pccVar) {
        this.pcc = nacVar;
        this.sf = pccVar;
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public boolean pcc(String str, Bitmap bitmap) {
        boolean pcc = this.pcc.pcc(str, bitmap);
        if (this.sf != null) {
            Boolean.valueOf(pcc);
        }
        return pcc;
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public Bitmap pcc(String str) {
        return this.pcc.pcc(str);
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public boolean sf(String str) {
        return this.pcc.sf(str);
    }
}
