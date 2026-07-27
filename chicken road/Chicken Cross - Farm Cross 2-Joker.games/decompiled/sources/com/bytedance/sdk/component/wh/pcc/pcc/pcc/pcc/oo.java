package com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc;

import android.content.Context;

/* loaded from: classes4.dex */
public class oo extends pcc {
    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.pcc
    public byte gm() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.pcc
    public byte oo() {
        return (byte) 0;
    }

    public oo(Context context, com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        super(context, pccVar);
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.pcc, com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm
    public String sf() {
        com.bytedance.sdk.component.wh.pcc.pcc.vj gm = com.bytedance.sdk.component.wh.pcc.qf.wh().gm();
        if (gm != null) {
            return gm.pcc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm
    protected long wh() {
        return com.bytedance.sdk.component.wh.pcc.qf.pcc.sf();
    }

    public static String gm(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
