package com.bytedance.pcc;

import com.bytedance.pcc.gm;
import com.bytedance.pcc.pcc;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class sf<T extends pcc<?>> {
    public abstract int kj();

    public abstract String oo();

    public abstract long ork();

    public abstract long pcc();

    public abstract T pcc(String str, byte[] bArr, int i, int i2);

    public abstract void pcc(ArrayList<T> arrayList, gm.sf<T> sfVar);

    public abstract gm.InterfaceC0115gm qf();

    public abstract int sf();

    public abstract long vj();

    public abstract int vy();

    public abstract boolean wh();

    public final String gm() {
        return "CREATE TABLE IF NOT EXISTS " + oo() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data_id TEXT UNIQUE, data BLOB, priority INTEGER DEFAULT 0, upload_retry_count INTEGER DEFAULT 0, create_time INTEGER);";
    }
}
