package com.bytedance.sdk.component.adexpress.dynamic.sf;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.oo.qf;

/* loaded from: classes4.dex */
public class pcc {
    public static int pcc(qf qfVar) {
        if (qfVar == null) {
            return 0;
        }
        String rnn = qfVar.rnn();
        String yt = qfVar.yt();
        if (TextUtils.isEmpty(yt) || TextUtils.isEmpty(rnn) || !yt.equals("creative")) {
            return 0;
        }
        if (rnn.equals("shake")) {
            return 2;
        }
        if (rnn.equals("twist")) {
            return 3;
        }
        return rnn.equals("slide") ? 1 : 0;
    }
}
