package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class sf {
    private final List<fum> pcc = new ArrayList();

    void pcc(fum fumVar) {
        this.pcc.add(fumVar);
    }

    public void pcc(Path path) {
        for (int size = this.pcc.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.sf.wh.wh.pcc(path, this.pcc.get(size));
        }
    }
}
