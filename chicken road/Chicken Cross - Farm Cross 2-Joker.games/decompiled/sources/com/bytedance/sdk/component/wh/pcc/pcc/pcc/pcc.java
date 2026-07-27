package com.bytedance.sdk.component.wh.pcc.pcc.pcc;

import android.content.Context;
import com.bytedance.sdk.component.wh.pcc.pcc.pcc.sf;

/* loaded from: classes4.dex */
public class pcc extends sf {
    private static volatile pcc pcc;

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.sf
    public /* bridge */ /* synthetic */ sf.C0135sf pcc() {
        return super.pcc();
    }

    public static pcc pcc(Context context) {
        if (pcc == null) {
            synchronized (pcc.class) {
                if (pcc == null) {
                    pcc = new pcc(context);
                }
            }
        }
        return pcc;
    }

    private pcc(Context context) {
        super(context);
    }
}
