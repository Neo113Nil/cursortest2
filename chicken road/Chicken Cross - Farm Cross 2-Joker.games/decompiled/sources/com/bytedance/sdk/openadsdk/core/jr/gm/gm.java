package com.bytedance.sdk.openadsdk.core.jr.gm;

import com.bytedance.sdk.component.utils.qf;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public class gm extends com.bytedance.sdk.openadsdk.sf.sf {
    public gm(int i, int i2) {
        super(i, i2);
    }

    public gm(int i, int i2, boolean z) {
        super(i, i2);
        this.pcc = z;
    }

    @Override // com.bytedance.sdk.openadsdk.sf.sf, com.bytedance.sdk.openadsdk.sf.pcc
    protected void pcc(List<File> list) {
        int size = list.size();
        if (pcc(0L, size)) {
            return;
        }
        for (File file : list) {
            qf.gm(file);
            size--;
            if (pcc(file, 0L, size)) {
                return;
            }
        }
    }
}
