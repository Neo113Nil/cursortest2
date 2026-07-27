package com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc;

import android.content.Context;

/* loaded from: classes4.dex */
public class wh extends qf {
    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.qf
    public byte gm() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.qf
    public byte pcc() {
        return (byte) 1;
    }

    public wh(Context context, com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        super(context, pccVar);
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.qf, com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm
    public String sf() {
        return com.bytedance.sdk.component.wh.pcc.qf.wh().gm().vj();
    }

    public static String pcc(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
