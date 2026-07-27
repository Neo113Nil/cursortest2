package com.bytedance.sdk.openadsdk.core.tmg.pcc;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.openadsdk.core.lu;
import com.ironsource.U3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf {
    private static volatile sf pcc;
    private final ArrayList<String> sf = new ArrayList<>();
    private final AtomicBoolean gm = new AtomicBoolean(false);
    private long oo = System.currentTimeMillis();
    private long vj = 0;
    private long wh = 0;
    private String qf = "";
    private String kj = "";
    private String vy = "";
    private boolean ork = false;
    private boolean vh = false;

    public static sf pcc(Application application) {
        if (pcc == null) {
            synchronized (sf.class) {
                if (pcc == null) {
                    sf sfVar = new sf();
                    pcc = sfVar;
                    sfVar.ork = pcc((Context) application);
                    pcc.vh = pcc(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                    pcc.pcc();
                }
            }
        }
        return pcc;
    }

    private static int pcc(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean pcc(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void pcc(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.sf.size() == 0) {
            this.qf = localClassName;
            this.vj = System.currentTimeMillis();
            this.wh = System.currentTimeMillis() - this.oo;
            this.gm.set(false);
        }
        if (!this.sf.contains(localClassName)) {
            this.sf.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.vy = localClassName;
    }

    public void sf(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.sf.contains(localClassName)) {
            this.sf.remove(localClassName);
        }
        if (this.sf.size() == 0) {
            this.oo = System.currentTimeMillis();
            this.gm.set(true);
            this.kj = localClassName;
        }
    }

    private void pcc() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField(U3.i.h0);
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i = 0; i < size; i++) {
                    Object valueAt = arrayMap.valueAt(i);
                    if (!((Boolean) declaredField2.get(valueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(valueAt)).getLocalClassName();
                        if (!this.sf.contains(localClassName)) {
                            this.sf.add(localClassName);
                        }
                    }
                }
                this.gm.set(this.sf.size() <= 0);
            }
        } catch (Throwable unused) {
        }
    }

    public String pcc(String str, long j, int i) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.vj;
        long j3 = currentTimeMillis - j;
        int i2 = j3 < 500 ? 1 : 0;
        if (this.gm.get() && this.vh) {
            i2 |= 2;
        }
        if (!this.gm.get() && this.wh >= 5000 && j2 < 1000) {
            i2 = this.kj.equals(this.vy) ? i2 | 4 : i2 | 8;
        }
        try {
            str2 = new JSONObject().put("rst", i2).put("adtag", str).put("bakdur", this.wh).put("rit", i).put("poptime", j2).put("unlocktime", j3).put("bakground", this.gm).put("alert", this.vh).put(NotificationCompat.CATEGORY_SYSTEM, this.ork).put("actsize", this.sf.size()).put("mutiproc", true ^ fum.pcc(lu.pcc())).toString();
        } catch (JSONException unused) {
            str2 = "";
        }
        this.qf = "";
        this.wh = 0L;
        this.vj = 0L;
        this.oo = System.currentTimeMillis();
        return str2;
    }
}
