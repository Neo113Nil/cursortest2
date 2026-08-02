package androidx.profileinstaller;

import A0.J0;
import O1.b;
import Q1.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        Context createDeviceProtectedStorageContext;
        Context createDeviceProtectedStorageContext2;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            e.t(context, new b(0), new J0(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                J0 j02 = new J0(this);
                try {
                    e.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    j02.c(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e3) {
                    j02.c(7, e3);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            J0 j03 = new J0(this);
            if (Build.VERSION.SDK_INT < 24) {
                j03.c(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                j03.c(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        J0 j04 = new J0(this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            j04.c(16, null);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            createDeviceProtectedStorageContext2 = context.createDeviceProtectedStorageContext();
            codeCacheDir = createDeviceProtectedStorageContext2.getCacheDir();
        } else if (i >= 24) {
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
        } else {
            codeCacheDir = i == 23 ? context.getCodeCacheDir() : context.getCacheDir();
        }
        if (e.c(codeCacheDir)) {
            j04.c(14, null);
        } else {
            j04.c(15, null);
        }
    }
}
