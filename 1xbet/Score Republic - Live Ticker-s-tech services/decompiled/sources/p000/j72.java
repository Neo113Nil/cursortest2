package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j72 {

    /* JADX INFO: renamed from: g */
    public static final Object f3839g = new Object();

    /* JADX INFO: renamed from: h */
    public static j72 f3840h;

    /* JADX INFO: renamed from: i */
    public static HandlerThread f3841i;

    /* JADX INFO: renamed from: a */
    public final HashMap f3842a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f3843b;

    /* JADX INFO: renamed from: c */
    public volatile bm1 f3844c;

    /* JADX INFO: renamed from: d */
    public final b90 f3845d;

    /* JADX INFO: renamed from: e */
    public final long f3846e;

    /* JADX INFO: renamed from: f */
    public final long f3847f;

    public j72(Context context, Looper looper) {
        g80 g80Var = new g80(2, this);
        this.f3843b = context.getApplicationContext();
        bm1 bm1Var = new bm1(looper, g80Var);
        Looper.getMainLooper();
        this.f3844c = bm1Var;
        this.f3845d = b90.m606u();
        this.f3846e = 5000L;
        this.f3847f = 300000L;
    }

    /* JADX INFO: renamed from: a */
    public static j72 m2823a(Context context) {
        synchronized (f3839g) {
            try {
                if (f3840h == null) {
                    f3840h = new j72(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3840h;
    }

    /* JADX INFO: renamed from: b */
    public final C0253gl m2824b(k42 k42Var, fw1 fw1Var, String str, Executor executor) {
        C0253gl c0253glM3629a;
        HashMap map = this.f3842a;
        synchronized (map) {
            try {
                o52 o52Var = (o52) map.get(k42Var);
                if (executor == null) {
                    executor = null;
                }
                if (o52Var == null) {
                    o52Var = new o52(this, k42Var);
                    o52Var.f5630j.put(fw1Var, fw1Var);
                    c0253glM3629a = o52Var.m3629a(str, executor);
                    map.put(k42Var, o52Var);
                } else {
                    this.f3844c.removeMessages(0, k42Var);
                    if (o52Var.f5630j.containsKey(fw1Var)) {
                        String string = k42Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    o52Var.f5630j.put(fw1Var, fw1Var);
                    int i = o52Var.f5631k;
                    if (i == 1) {
                        fw1Var.onServiceConnected(o52Var.f5635o, o52Var.f5633m);
                    } else if (i == 2) {
                        c0253glM3629a = o52Var.m3629a(str, executor);
                    }
                    c0253glM3629a = null;
                }
                if (o52Var.f5632l) {
                    return C0253gl.f2794o;
                }
                if (c0253glM3629a == null) {
                    c0253glM3629a = new C0253gl(-1, null, null);
                }
                return c0253glM3629a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2825c(String str, ServiceConnection serviceConnection, boolean z) {
        k42 k42Var = new k42(str, z);
        p80.m3864i(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f3842a;
        synchronized (map) {
            try {
                o52 o52Var = (o52) map.get(k42Var);
                if (o52Var == null) {
                    String string = k42Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!o52Var.f5630j.containsKey(serviceConnection)) {
                    String string2 = k42Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                o52Var.f5630j.remove(serviceConnection);
                if (o52Var.f5630j.isEmpty()) {
                    this.f3844c.sendMessageDelayed(this.f3844c.obtainMessage(0, k42Var), this.f3846e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
