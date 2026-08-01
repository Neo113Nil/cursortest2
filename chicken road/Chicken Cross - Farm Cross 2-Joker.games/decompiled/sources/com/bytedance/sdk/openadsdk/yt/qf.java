package com.bytedance.sdk.openadsdk.yt;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class qf implements wh {
    Handler pcc = null;
    private wh sf;

    qf(wh whVar) {
        this.sf = whVar;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public ExecutorService pcc() {
        wh whVar = this.sf;
        if (whVar == null || whVar.pcc() == null) {
            return Executors.newCachedThreadPool();
        }
        return this.sf.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public Context sf() {
        wh whVar = this.sf;
        if (whVar == null || whVar.sf() == null) {
            return vy();
        }
        return this.sf.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public String gm() {
        wh whVar = this.sf;
        if (whVar == null || TextUtils.isEmpty(whVar.gm())) {
            return "null";
        }
        return this.sf.gm();
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public Handler oo() {
        wh whVar = this.sf;
        if (whVar == null || whVar.qf() == null) {
            Handler handler = new Handler(pcc("pag_strategy", -1).getLooper());
            this.pcc = handler;
            return handler;
        }
        return this.sf.oo();
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public String vj() {
        wh whVar = this.sf;
        if (whVar != null) {
            return whVar.vj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public JSONObject wh() {
        wh whVar = this.sf;
        if (whVar != null) {
            return whVar.wh();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public Map<String, String> qf() {
        wh whVar = this.sf;
        if (whVar == null || whVar.qf() == null) {
            return new HashMap();
        }
        return this.sf.qf();
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public JSONObject pcc(JSONObject jSONObject) {
        wh whVar = this.sf;
        return whVar != null ? whVar.pcc(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public HandlerThread pcc(String str, int i) {
        HandlerThread pcc;
        wh whVar = this.sf;
        if (whVar != null && (pcc = whVar.pcc(str, i)) != null) {
            return pcc;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public boolean kj() {
        wh whVar = this.sf;
        if (whVar != null) {
            return whVar.kj();
        }
        return true;
    }

    private Context vy() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            return (Application) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }
}
