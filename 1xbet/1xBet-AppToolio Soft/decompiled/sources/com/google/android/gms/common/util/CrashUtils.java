package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Debug;
import android.os.DropBoxManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class CrashUtils {
    private static boolean zzzf;
    private static boolean zzzg;
    private static final String[] zzzc = {"android.", "com.android.", "dalvik.", "java.", "javax."};
    private static DropBoxManager zzzd = null;
    private static boolean zzze = false;
    private static int zzzh = -1;

    @GuardedBy("CrashUtils.class")
    private static int zzzi = 0;

    @GuardedBy("CrashUtils.class")
    private static int zzzj = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorDialogData {
        public static final int AVG_CRASH_FREQ = 2;
        public static final int BINDER_CRASH = 268435456;
        public static final int DYNAMITE_CRASH = 536870912;
        public static final int FORCED_SHUSHED_BY_WRAPPER = 4;
        public static final int NONE = 0;
        public static final int POPUP_FREQ = 1;
        public static final int SUPPRESSED = 1073741824;
    }

    public static boolean addDynamiteErrorToDropBox(Context context, Throwable th) {
        return addErrorToDropBoxInternal(context, th, ErrorDialogData.DYNAMITE_CRASH);
    }

    @Deprecated
    public static boolean addErrorToDropBox(Context context, Throwable th) {
        return addDynamiteErrorToDropBox(context, th);
    }

    public static boolean addErrorToDropBoxInternal(Context context, String str, String str2, int i) {
        return zza(context, str, str2, i, null);
    }

    public static boolean addErrorToDropBoxInternal(Context context, Throwable th, int i) {
        boolean z;
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th);
            if (!isPackageSide()) {
                return false;
            }
            if (zzdb() || (th = zza(th)) != null) {
                return zza(context, Log.getStackTraceString(th), ProcessUtils.getMyProcessName(), i, th);
            }
            return false;
        } catch (Exception e) {
            try {
                z = zzdb();
            } catch (Exception e2) {
                Log.e("CrashUtils", "Error determining which process we're running in!", e2);
                z = false;
            }
            if (z) {
                throw e;
            }
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }

    private static boolean isPackageSide() {
        if (zzze) {
            return zzzf;
        }
        return false;
    }

    public static boolean isSystemClassPrefixInternal(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : zzzc) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public static synchronized void setTestVariables(DropBoxManager dropBoxManager, boolean z, boolean z2, int i) {
        synchronized (CrashUtils.class) {
            zzze = true;
            zzzd = dropBoxManager;
            zzzg = z;
            zzzf = z2;
            zzzh = i;
            zzzi = 0;
            zzzj = 0;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @VisibleForTesting
    private static synchronized String zza(Context context, String str, String str2, int i) {
        StringBuilder sb;
        InputStreamReader inputStreamReader;
        synchronized (CrashUtils.class) {
            sb = new StringBuilder(1024);
            sb.append("Process: ");
            sb.append(Strings.nullToEmpty(str2));
            sb.append("\n");
            sb.append("Package: com.google.android.gms");
            int i2 = 12451009;
            String str3 = "12.4.51 (020308-{{cl}})";
            if (zzdb()) {
                try {
                    PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0);
                    i2 = packageInfo.versionCode;
                    if (packageInfo.versionName != null) {
                        str3 = packageInfo.versionName;
                    }
                } catch (Exception e) {
                    Log.w("CrashUtils", "Error while trying to get the package information! Using static version.", e);
                }
            }
            sb.append(" v");
            sb.append(i2);
            if (!TextUtils.isEmpty(str3)) {
                if (str3.contains("(") && !str3.contains(")")) {
                    if (str3.endsWith("-")) {
                        str3 = String.valueOf(str3).concat("111111111");
                    }
                    str3 = String.valueOf(str3).concat(")");
                }
                sb.append(" (");
                sb.append(str3);
                sb.append(")");
            }
            sb.append("\n");
            sb.append("Build: ");
            sb.append(Build.FINGERPRINT);
            sb.append("\n");
            if (Debug.isDebuggerConnected()) {
                sb.append("Debugger: Connected\n");
            }
            if (i != 0) {
                sb.append("DD-EDD: ");
                sb.append(i);
                sb.append("\n");
            }
            sb.append("\n");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            int i3 = zzdb() ? zzzh >= 0 ? zzzh : Settings.Secure.getInt(context.getContentResolver(), "logcat_for_system_app_crash", 0) : 0;
            if (i3 > 0) {
                sb.append("\n");
                InputStreamReader inputStreamReader2 = null;
                try {
                    try {
                        try {
                            Process start = new ProcessBuilder("/system/bin/logcat", "-v", "time", "-b", "events", "-b", "system", "-b", "main", "-b", AppMeasurement.CRASH_ORIGIN, "-t", String.valueOf(i3)).redirectErrorStream(true).start();
                            try {
                                start.getOutputStream().close();
                            } catch (IOException unused) {
                            }
                            try {
                                start.getErrorStream().close();
                            } catch (IOException unused2) {
                            }
                            inputStreamReader = new InputStreamReader(start.getInputStream());
                        } catch (IOException unused3) {
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    char[] cArr = new char[8192];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read <= 0) {
                            break;
                        }
                        sb.append(cArr, 0, read);
                    }
                    inputStreamReader.close();
                } catch (IOException e3) {
                    e = e3;
                    inputStreamReader2 = inputStreamReader;
                    Log.e("CrashUtils", "Error running logcat", e);
                    if (inputStreamReader2 != null) {
                        inputStreamReader2.close();
                    }
                    return sb.toString();
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader2 = inputStreamReader;
                    if (inputStreamReader2 != null) {
                        try {
                            inputStreamReader2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @VisibleForTesting
    private static synchronized Throwable zza(Throwable th) {
        synchronized (CrashUtils.class) {
            LinkedList linkedList = new LinkedList();
            while (th != null) {
                linkedList.push(th);
                th = th.getCause();
            }
            Throwable th2 = null;
            boolean z = false;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z2 = z;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    String fileName = stackTraceElement.getFileName();
                    boolean z3 = !TextUtils.isEmpty(fileName) && fileName.startsWith(":com.google.android.gms");
                    z2 |= z3;
                    if (!z3 && !isSystemClassPrefixInternal(className)) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
                th2 = th2 == null ? new Throwable("<filtered>") : new Throwable("<filtered>", th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                z = z2;
            }
            if (z) {
                return th2;
            }
            return null;
        }
    }

    private static synchronized boolean zza(Context context, String str, String str2, int i, Throwable th) {
        synchronized (CrashUtils.class) {
            Preconditions.checkNotNull(context);
            if (isPackageSide() && !Strings.isEmptyOrWhitespace(str)) {
                int hashCode = str.hashCode();
                int hashCode2 = th == null ? zzzj : th.hashCode();
                if (zzzi == hashCode && zzzj == hashCode2) {
                    return false;
                }
                zzzi = hashCode;
                zzzj = hashCode2;
                DropBoxManager dropBoxManager = zzzd != null ? zzzd : (DropBoxManager) context.getSystemService("dropbox");
                if (dropBoxManager != null && dropBoxManager.isTagEnabled("system_app_crash")) {
                    dropBoxManager.addText("system_app_crash", zza(context, str, str2, i));
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    private static boolean zzdb() {
        if (zzze) {
            return zzzg;
        }
        return false;
    }
}
