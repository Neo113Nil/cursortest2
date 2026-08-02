package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
public final class k {
    public static k c;
    public final Context a;
    public volatile String b;

    public k(@NonNull Context context) {
        this.a = context.getApplicationContext();
    }

    @NonNull
    public static k a(@NonNull Context context) {
        C0875q.g(context);
        synchronized (k.class) {
            if (c == null) {
                t tVar = z.a;
                synchronized (z.class) {
                    try {
                        if (z.e == null) {
                            z.e = context.getApplicationContext();
                        }
                    } finally {
                    }
                }
                c = new k(context);
            }
        }
        return c;
    }

    public static final v c(PackageInfo packageInfo, v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        w wVar = new w(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < vVarArr.length; i++) {
            if (vVarArr[i].equals(wVar)) {
                return vVarArr[i];
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(@NonNull PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (z) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z ? c(packageInfo2, y.a) : c(packageInfo2, y.a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if ((!z ? c(packageInfo2, y.a) : c(packageInfo2, y.a[0])) == null) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0165 A[LOOP:0: B:6:0x0015->B:12:0x0165, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0174 A[EDGE_INSN: B:13:0x0174->B:14:0x0174 BREAK  A[LOOP:0: B:6:0x0015->B:12:0x0165], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i) {
        H h;
        int length;
        boolean z;
        ApplicationInfo applicationInfo;
        H h2;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            h = new H("no pkgs", false, null);
        } else {
            h = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    C0875q.g(h);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    h = new H("null pkg", false, null);
                } else if (str.equals(this.b)) {
                    h = H.c;
                } else {
                    t tVar = z.a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        z.b();
                        z = z.c.zzi();
                    } catch (RemoteException | DynamiteModule.a unused) {
                        z = false;
                    } catch (Throwable th) {
                        throw th;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    if (z) {
                        boolean a = j.a(this.a);
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            C0875q.g(z.e);
                            try {
                                z.b();
                            } catch (DynamiteModule.a e) {
                                h2 = new H("module init: ".concat(String.valueOf(e.getMessage())), false, e);
                            }
                            try {
                                C t = z.c.t(new A(str, a, false, new com.google.android.gms.dynamic.b(z.e), false, true));
                                if (t.a) {
                                    p.b(t.d);
                                    h = new H(null, true, null);
                                } else {
                                    String str2 = t.b;
                                    PackageManager.NameNotFoundException nameNotFoundException = com.baseflow.permissionhandler.a.c(t.c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                    if (str2 == null) {
                                        str2 = "error checking package certificate";
                                    }
                                    p.b(t.d);
                                    com.baseflow.permissionhandler.a.c(t.c);
                                    h = new H(str2, false, nameNotFoundException);
                                }
                            } catch (RemoteException e2) {
                                h2 = new H("module call", false, e2);
                                h = h2;
                                if (h.a) {
                                }
                                if (!h.a) {
                                }
                            }
                        } finally {
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                            boolean a2 = j.a(this.a);
                            if (packageInfo == null) {
                                h = new H("null pkg", false, null);
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    h = new H("single cert required", false, null);
                                } else {
                                    w wVar = new w(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        H a3 = z.a(str3, wVar, a2, false);
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        if (a3.a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                            try {
                                                H a4 = z.a(str3, wVar, false, true);
                                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                if (a4.a) {
                                                    h = new H("debuggable release cert app rejected", false, null);
                                                }
                                            } finally {
                                            }
                                        }
                                        h = a3;
                                    } finally {
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            h = new H("no pkg ".concat(str), false, e3);
                        }
                    }
                    if (h.a) {
                        this.b = str;
                    }
                }
                if (!h.a) {
                    break;
                }
                i2++;
            }
        }
        if (!h.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (h.b != null) {
                h.a();
            } else {
                h.a();
            }
        }
        return h.a;
    }
}
