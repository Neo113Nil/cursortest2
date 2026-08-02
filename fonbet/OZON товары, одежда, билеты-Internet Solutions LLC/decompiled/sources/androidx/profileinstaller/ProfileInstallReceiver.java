package androidx.profileinstaller;

import C2.ExecutorC2715j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.profileinstaller.g;
import java.io.File;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    class a implements g.b {
        a() {
        }

        @Override // androidx.profileinstaller.g.b
        public final void a(int i11, Serializable serializable) {
            String str;
            switch (i11) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i11 == 6 || i11 == 7 || i11 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) serializable);
            } else {
                Log.d("ProfileInstaller", str);
            }
            ProfileInstallReceiver.this.setResultCode(i11);
        }

        @Override // androidx.profileinstaller.g.b
        public final void b() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            g.c(context, new ExecutorC2715j(), new a(), true);
            return;
        }
        final int i11 = 10;
        final PackageManager.NameNotFoundException nameNotFoundException = null;
        if (!"androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
                return;
            } else {
                if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                    return;
                }
                String string = extras.getString("EXTRA_BENCHMARK_OPERATION");
                a aVar = new a();
                if ("DROP_SHADER_CACHE".equals(string)) {
                    androidx.profileinstaller.a.b(context, aVar);
                    return;
                } else if (!"SAVE_PROFILE".equals(string)) {
                    aVar.a(16, null);
                    return;
                } else {
                    Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
                    aVar.a(12, null);
                    return;
                }
            }
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            String string2 = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
            if (!"WRITE_SKIP_FILE".equals(string2)) {
                if ("DELETE_SKIP_FILE".equals(string2)) {
                    final a aVar2 = new a();
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    final int i12 = 11;
                    new Runnable() { // from class: androidx.profileinstaller.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.b bVar = g.b.this;
                            ((ProfileInstallReceiver.a) bVar).a(i12, nameNotFoundException);
                        }
                    }.run();
                    return;
                }
                return;
            }
            final a aVar3 = new a();
            try {
                g.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                new Runnable() { // from class: androidx.profileinstaller.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b bVar = g.b.this;
                        ((ProfileInstallReceiver.a) bVar).a(i11, nameNotFoundException);
                    }
                }.run();
            } catch (PackageManager.NameNotFoundException e11) {
                final int i13 = 7;
                new Runnable() { // from class: androidx.profileinstaller.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b bVar = g.b.this;
                        ((ProfileInstallReceiver.a) bVar).a(i13, e11);
                    }
                }.run();
            }
        }
    }
}
