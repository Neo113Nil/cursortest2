package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: iz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0340iz implements Callable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3747j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f3748k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f3749l;

    public /* synthetic */ CallableC0340iz(int i, Object obj, Object obj2) {
        this.f3747j = i;
        this.f3748k = obj;
        this.f3749l = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName componentNameStartService;
        AbstractC0860x0 c0099ci;
        s70 s70VarM4040a;
        String str2 = null;
        switch (this.f3747j) {
            case 0:
                Context context = (Context) this.f3748k;
                Intent intent = (Intent) this.f3749l;
                f71 f71VarM1647o = f71.m1647o();
                f71VarM1647o.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) f71VarM1647o.f2337n).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (f71VarM1647o) {
                    try {
                        String str3 = (String) f71VarM1647o.f2334k;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str.startsWith(".")) {
                                    f71VarM1647o.f2334k = context.getPackageName() + serviceInfo.name;
                                } else {
                                    f71VarM1647o.f2334k = serviceInfo.name;
                                }
                                str2 = (String) f71VarM1647o.f2334k;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (f71VarM1647o.m1670q(context)) {
                        componentNameStartService = j22.m2783B(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            case 1:
                by0 by0Var = (by0) this.f3748k;
                lv0 lv0Var = (lv0) this.f3749l;
                synchronized (by0Var) {
                    try {
                        FileInputStream fileInputStreamOpenFileInput = by0Var.f1047a.openFileInput(by0Var.f1048b);
                        try {
                            q70 q70Var = (q70) lv0Var;
                            q70Var.getClass();
                            C0709sy c0709sy = q70.f6395b;
                            if (fileInputStreamOpenFileInput == null) {
                                byte[] bArr = fe0.f2382b;
                                c0099ci = AbstractC0860x0.m5489d(bArr, 0, bArr.length, false);
                            } else {
                                c0099ci = new C0099ci(fileInputStreamOpenFileInput);
                            }
                            s70VarM4040a = q70Var.m4040a(c0099ci, c0709sy);
                            c0099ci.mo216a(0);
                            if (!s70.m4492h(s70VarM4040a, true)) {
                                throw new hf0(new if1().getMessage());
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                        } catch (Throwable th2) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                break;
                            }
                            throw th2;
                        }
                    } catch (hf0 | FileNotFoundException e3) {
                        n80.m3497f("Recoverable exception while reading cache: " + e3.getMessage());
                        return null;
                    }
                }
                return s70VarM4040a;
            default:
                by0 by0Var2 = (by0) this.f3748k;
                AbstractC0342j0 abstractC0342j0 = (AbstractC0342j0) this.f3749l;
                synchronized (by0Var2) {
                    FileOutputStream fileOutputStreamOpenFileOutput = by0Var2.f1047a.openFileOutput(by0Var2.f1048b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(abstractC0342j0.m2755b());
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th4) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            break;
                        }
                        throw th4;
                    }
                }
                return abstractC0342j0;
        }
    }
}
