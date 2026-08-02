package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n71 {

    /* JADX INFO: renamed from: a */
    public final Object f5318a;

    /* JADX INFO: renamed from: b */
    public final Object f5319b;

    /* JADX INFO: renamed from: c */
    public final Object f5320c;

    /* JADX INFO: renamed from: d */
    public final Object f5321d;

    /* JADX INFO: renamed from: e */
    public final Object f5322e;

    public n71(mq0 mq0Var, g82 g82Var, HashMap map) {
        this.f5319b = new ConcurrentHashMap();
        mq0Var.getClass();
        this.f5318a = mq0Var;
        g82Var.getClass();
        this.f5320c = g82Var;
        this.f5322e = map;
        a90.m123g(!map.isEmpty());
        this.f5321d = z32.f9598c;
    }

    /* JADX INFO: renamed from: a */
    public static n71 m3489a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        n71 n71Var = new n71(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) n71Var.f5321d)) {
            try {
                ((ArrayDeque) n71Var.f5321d).clear();
                String string = ((SharedPreferences) n71Var.f5319b).getString((String) n71Var.f5318a, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) n71Var.f5320c)) {
                    String[] strArrSplit = string.split((String) n71Var.f5320c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) n71Var.f5321d).add(str);
                        }
                    }
                    return n71Var;
                }
                return n71Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3490b(C0832w9 c0832w9) {
        dd0 dd0Var = new dd0(28);
        se1 se1Var = (se1) this.f5322e;
        C0648ra c0648ra = (C0648ra) this.f5319b;
        String str = (String) this.f5318a;
        dd0 dd0Var2 = (dd0) this.f5321d;
        C0818vw c0818vw = (C0818vw) this.f5320c;
        C0035ar c0035ar = se1Var.f7107c;
        qd0 qd0VarM4283a = C0648ra.m4283a();
        qd0VarM4283a.m4087y(c0648ra.f6760a);
        qd0VarM4283a.f6473m = dx0.f1868j;
        qd0VarM4283a.f6472l = c0648ra.f6761b;
        C0648ra c0648raM4073e = qd0VarM4283a.m4073e();
        C0902y5 c0902y5 = new C0902y5();
        c0902y5.f9159f = new HashMap();
        c0902y5.f9157d = Long.valueOf(se1Var.f7105a.mo159g());
        c0902y5.f9158e = Long.valueOf(se1Var.f7106b.mo159g());
        c0902y5.f9154a = str;
        c0902y5.f9156c = new C0596pw(c0818vw, (byte[]) dd0Var2.apply(c0832w9.f8461a));
        c0902y5.f9155b = null;
        c0035ar.f609b.execute(new RunnableC0886xq(c0035ar, c0648raM4073e, dd0Var, c0902y5.m5731k()));
    }

    public n71(C0648ra c0648ra, String str, C0818vw c0818vw, dd0 dd0Var, se1 se1Var) {
        this.f5319b = c0648ra;
        this.f5318a = str;
        this.f5320c = c0818vw;
        this.f5321d = dd0Var;
        this.f5322e = se1Var;
    }

    public n71(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f5321d = new ArrayDeque();
        this.f5319b = sharedPreferences;
        this.f5318a = "topic_operation_queue";
        this.f5320c = ",";
        this.f5322e = scheduledThreadPoolExecutor;
    }
}
