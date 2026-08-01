package sg.bigo.ads.K0;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.material.TextFieldImplKt;

/* renamed from: sg.bigo.ads.K0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4956m {
    public static boolean a(String str, Context context) {
        try {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(TextFieldImplKt.LabelId, str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static long b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    public static long c(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    public static String d(String str, Context context) {
        String str2;
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            str2 = Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(str).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception unused) {
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }

    public static Activity a(View view) {
        for (int i = 0; i < 10000 && view != null; i++) {
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean b(Context context) {
        return context.checkPermission("android.permission.READ_PHONE_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    public static synchronized String a(Context context) {
        synchronized (AbstractC4956m.class) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (TextUtils.isEmpty(packageInfo.versionName)) {
                    return "";
                }
                return packageInfo.versionName;
            } catch (Exception unused) {
                return "";
            }
        }
    }
}
