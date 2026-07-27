package k1;

import I1.o;
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
import r.C1401k;
import z1.AbstractC1575a;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1206b {

    /* renamed from: h, reason: collision with root package name */
    public static int f10671h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f10672i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f10673j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f10675b;

    /* renamed from: c, reason: collision with root package name */
    public final G2.f f10676c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f10677d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f10679f;

    /* renamed from: g, reason: collision with root package name */
    public C1211g f10680g;

    /* renamed from: a, reason: collision with root package name */
    public final C1401k f10674a = new C1401k();

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f10678e = new Messenger(new HandlerC1209e(this, Looper.getMainLooper()));

    public C1206b(Context context) {
        this.f10675b = context;
        this.f10676c = new G2.f(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f10677d = scheduledThreadPoolExecutor;
    }

    public final o a(Bundle bundle) {
        String num;
        synchronized (C1206b.class) {
            int i2 = f10671h;
            f10671h = i2 + 1;
            num = Integer.toString(i2);
        }
        I1.h hVar = new I1.h();
        synchronized (this.f10674a) {
            this.f10674a.put(num, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f10676c.e() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f10675b;
        synchronized (C1206b.class) {
            try {
                if (f10672i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f10672i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC1575a.f12463a);
                }
                intent.putExtra("app", f10672i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f10678e);
        if (this.f10679f != null || this.f10680g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f10679f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f10680g.f10687a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            hVar.f1248a.f(ExecutorC1212h.f10689c, new B4.i(this, num, this.f10677d.schedule(new B.a(14, hVar), 30L, TimeUnit.SECONDS), 20));
            return hVar.f1248a;
        }
        if (this.f10676c.e() == 2) {
            this.f10675b.sendBroadcast(intent);
        } else {
            this.f10675b.startService(intent);
        }
        hVar.f1248a.f(ExecutorC1212h.f10689c, new B4.i(this, num, this.f10677d.schedule(new B.a(14, hVar), 30L, TimeUnit.SECONDS), 20));
        return hVar.f1248a;
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.f10674a) {
            try {
                I1.h hVar = (I1.h) this.f10674a.remove(str);
                if (hVar != null) {
                    hVar.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
