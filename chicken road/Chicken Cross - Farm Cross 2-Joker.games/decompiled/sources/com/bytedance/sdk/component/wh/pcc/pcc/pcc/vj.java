package com.bytedance.sdk.component.wh.pcc.pcc.pcc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes4.dex */
public class vj implements com.bytedance.sdk.component.wh.pcc.pcc.vj {
    public static final vj pcc = new vj();
    private volatile SQLiteDatabase sf;

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String gm() {
        return null;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String wh() {
        return null;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public SQLiteDatabase pcc(Context context) {
        if (this.sf == null) {
            synchronized (this) {
                if (this.sf == null) {
                    this.sf = new oo(context).getWritableDatabase();
                }
            }
        }
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String pcc() {
        return "loghighpriority";
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String sf() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String oo() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.vj
    public String vj() {
        return "logstatsbatch";
    }
}
