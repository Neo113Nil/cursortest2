package com.bytedance.pcc.pcc.pcc;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.bytedance.pcc.gm;
import com.bytedance.pcc.pcc.qf;
import com.bytedance.pcc.pcc.sf;
import com.bytedance.pcc.pcc.wh;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc implements Handler.Callback {
    private final String gm;
    private final gm.InterfaceC0115gm oo;
    private final String pcc;
    private final sf sf;
    private final SparseIntArray vj = new SparseIntArray();
    private Handler wh;

    public pcc(sf sfVar, String str, gm.InterfaceC0115gm interfaceC0115gm) {
        this.pcc = sfVar.gm().gm();
        this.sf = sfVar;
        this.gm = str;
        this.oo = interfaceC0115gm;
    }

    public void pcc(int i) {
        pcc(i, 1);
    }

    public void pcc(int i, int i2) {
        synchronized (this.vj) {
            Integer valueOf = Integer.valueOf(this.vj.get(i));
            SparseIntArray sparseIntArray = this.vj;
            if (valueOf != null) {
                i2 += valueOf.intValue();
            }
            sparseIntArray.put(i, i2);
        }
    }

    public void pcc() {
        Handler handler = this.wh;
        if (handler == null || handler.hasMessages(10000)) {
            return;
        }
        this.wh.sendEmptyMessageDelayed(10000, 60000L);
    }

    public void pcc(Looper looper, qf<? extends com.bytedance.pcc.pcc> qfVar) {
        long j = gm().getLong("last_upload_time", 0L);
        long pcc = this.oo.pcc();
        if (j > 0 && System.currentTimeMillis() - j > pcc) {
            pcc(qfVar);
        } else {
            SharedPreferences gm = gm();
            String string = gm.getString("event_counts", null);
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> keys = jSONObject.keys();
                    synchronized (this.vj) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            this.vj.put(Integer.parseInt(next), jSONObject.getInt(next));
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (j == 0) {
                gm.edit().putLong("last_upload_time", System.currentTimeMillis()).apply();
            }
            new StringBuilder("onLogInstanceAvailable: specialEventCount = [").append(this.vj);
        }
        this.wh = new Handler(looper, this);
    }

    private void pcc(qf<? extends com.bytedance.pcc.pcc> qfVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("instance_id", this.pcc);
            jSONObject.putOpt("event_type", this.gm);
            jSONObject.putOpt("db_data_count", Integer.valueOf(qfVar.gm(this.sf.pcc())));
            SharedPreferences gm = gm();
            Map<String, ?> all = gm.getAll();
            for (String str : all.keySet()) {
                if (!"last_upload_time".equals(str)) {
                    jSONObject.put(str, all.get(str));
                }
            }
            this.oo.pcc(jSONObject.toString());
            gm.edit().clear().putLong("last_upload_time", System.currentTimeMillis()).apply();
        } catch (Throwable unused) {
        }
    }

    private void sf() {
        new StringBuilder("saveToSP: specialEventCount = [").append(this.vj);
        JSONObject jSONObject = new JSONObject();
        synchronized (this.vj) {
            for (int i = 0; i < this.vj.size(); i++) {
                try {
                    jSONObject.putOpt(String.valueOf(this.vj.keyAt(i)), Integer.valueOf(this.vj.valueAt(i)));
                } catch (Exception unused) {
                }
            }
        }
        if (jSONObject.length() > 0) {
            SharedPreferences.Editor edit = gm().edit();
            edit.putString("event_counts", jSONObject.toString());
            edit.apply();
        }
    }

    private SharedPreferences gm() {
        return wh.pcc().getSharedPreferences("event_monitor_" + this.pcc + "_" + this.gm + "_" + com.bytedance.pcc.pcc.sf.gm.pcc(), 0);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 10000) {
            return true;
        }
        sf();
        return true;
    }
}
