package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ce1 {

    /* JADX INFO: renamed from: a */
    public final Context f1232a;

    /* JADX INFO: renamed from: b */
    public final C0475mm f1233b;

    /* JADX INFO: renamed from: c */
    public final C0902y5 f1234c;

    /* JADX INFO: renamed from: d */
    public final FirebaseMessaging f1235d;

    /* JADX INFO: renamed from: f */
    public final ScheduledThreadPoolExecutor f1237f;

    /* JADX INFO: renamed from: h */
    public final ae1 f1239h;

    /* JADX INFO: renamed from: e */
    public final C0089c8 f1236e = new C0089c8(0);

    /* JADX INFO: renamed from: g */
    public boolean f1238g = false;

    public ce1(FirebaseMessaging firebaseMessaging, C0475mm c0475mm, ae1 ae1Var, C0902y5 c0902y5, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f1235d = firebaseMessaging;
        this.f1233b = c0475mm;
        this.f1239h = ae1Var;
        this.f1234c = c0902y5;
        this.f1232a = context;
        this.f1237f = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public static void m922a(v92 v92Var) throws IOException {
        try {
            hn0.m2311b(v92Var, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m923b(String str) throws IOException {
        String strM1008a = this.f1235d.m1008a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        C0902y5 c0902y5 = this.f1234c;
        m922a(c0902y5.m5732m(c0902y5.m5735r(strM1008a, "/topics/" + str, bundle)));
    }

    /* JADX INFO: renamed from: c */
    public final void m924c(String str) throws IOException {
        String strM1008a = this.f1235d.m1008a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        C0902y5 c0902y5 = this.f1234c;
        m922a(c0902y5.m5732m(c0902y5.m5735r(strM1008a, "/topics/" + str, bundle)));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m925d(boolean z) {
        this.f1238g = z;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0093, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public final boolean m926e() throws IOException {
        zd1 zd1VarM180a;
        while (true) {
            synchronized (this) {
                try {
                    zd1VarM180a = this.f1239h.m180a();
                    if (zd1VarM180a == null) {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = zd1VarM180a.f9747b;
                String str2 = zd1VarM180a.f9746a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        m924c(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + zd1VarM180a + ".");
                    }
                } else if (str.equals("S")) {
                    m923b(str2);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + zd1VarM180a + ".");
                }
                ae1 ae1Var = this.f1239h;
                synchronized (ae1Var) {
                    try {
                        n71 n71Var = ae1Var.f163a;
                        String str3 = zd1VarM180a.f9748c;
                        synchronized (((ArrayDeque) n71Var.f5321d)) {
                            try {
                                if (((ArrayDeque) n71Var.f5321d).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) n71Var.f5322e).execute(new RunnableC0944za(10, n71Var));
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                synchronized (this.f1236e) {
                    try {
                        String str4 = zd1VarM180a.f9748c;
                        if (this.f1236e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.f1236e.get(str4);
                            qc1 qc1Var = (qc1) arrayDeque.poll();
                            if (qc1Var != null) {
                                qc1Var.m4061b(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.f1236e.remove(str4);
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m927f(long j) {
        this.f1237f.schedule(new ee1(this, this.f1232a, this.f1233b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        m925d(true);
    }
}
