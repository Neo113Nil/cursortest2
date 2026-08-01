package com.bytedance.sdk.openadsdk.lu.gm;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.component.utils.fum;

/* loaded from: classes4.dex */
public class pcc {
    private final SharedPreferences pcc;

    public pcc(Context context) {
        if (fum.pcc(context)) {
            this.pcc = context.getSharedPreferences("pag_monitor_record", 0);
        } else {
            this.pcc = context.getSharedPreferences("pag_monitor_record_" + fum.gm(context), 0);
        }
    }

    public long pcc() {
        return this.pcc.getLong("last_upload_time", 0L);
    }

    public void pcc(long j) {
        SharedPreferences.Editor edit = this.pcc.edit();
        edit.putLong("last_upload_time", j);
        edit.apply();
    }
}
