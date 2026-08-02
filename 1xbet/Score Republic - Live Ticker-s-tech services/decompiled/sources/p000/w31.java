package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class w31 {

    /* JADX INFO: renamed from: h */
    public static int f8356h;

    /* JADX INFO: renamed from: i */
    public static PendingIntent f8357i;

    /* JADX INFO: renamed from: j */
    public static final Pattern f8358j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b */
    public final Context f8360b;

    /* JADX INFO: renamed from: c */
    public final C0392kd f8361c;

    /* JADX INFO: renamed from: d */
    public final ScheduledThreadPoolExecutor f8362d;

    /* JADX INFO: renamed from: f */
    public Messenger f8364f;

    /* JADX INFO: renamed from: g */
    public uv1 f8365g;

    /* JADX INFO: renamed from: a */
    public final w71 f8359a = new w71(0);

    /* JADX INFO: renamed from: e */
    public final Messenger f8363e = new Messenger(new ep1(this, Looper.getMainLooper()));

    public w31(Context context) {
        this.f8360b = context;
        this.f8361c = new C0392kd(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f8362d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX INFO: renamed from: a */
    public final v92 m5231a(Bundle bundle) {
        String string;
        int iM3007b;
        Context context;
        synchronized (w31.class) {
            int i = f8356h;
            f8356h = i + 1;
            string = Integer.toString(i);
        }
        qc1 qc1Var = new qc1();
        synchronized (this.f8359a) {
            this.f8359a.put(string, qc1Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        int i2 = 2;
        if (this.f8361c.m3007b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context2 = this.f8360b;
        synchronized (w31.class) {
            try {
                if (f8357i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f8357i = PendingIntent.getBroadcast(context2, 0, intent2, lm1.f4839a);
                }
                intent.putExtra("app", f8357i);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f8363e);
        if (this.f8364f == null && this.f8365g == null) {
            iM3007b = this.f8361c.m3007b();
            context = this.f8360b;
            if (iM3007b == 2) {
                context.sendBroadcast(intent);
            } else {
                context.startService(intent);
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f8364f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f8365g.f7914j;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                iM3007b = this.f8361c.m3007b();
                context = this.f8360b;
                if (iM3007b == 2) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        qc1Var.f6465a.m5125a(iw1.f3685l, new oq0((Object) this, string, (Object) this.f8362d.schedule(new cm1(i2, qc1Var), 30L, TimeUnit.SECONDS), 8));
        return qc1Var.f6465a;
    }

    /* JADX INFO: renamed from: b */
    public final void m5232b(Bundle bundle, String str) {
        synchronized (this.f8359a) {
            try {
                qc1 qc1Var = (qc1) this.f8359a.remove(str);
                if (qc1Var != null) {
                    qc1Var.m4061b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
