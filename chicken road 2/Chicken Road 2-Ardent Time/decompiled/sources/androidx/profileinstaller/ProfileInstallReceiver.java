package androidx.profileinstaller;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle extras;
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            N.e.s(context, new N.c(), new C.j(14, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            android.os.Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                java.lang.String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new java.io.File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        android.util.Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                C.j jVar = new C.j(14, this);
                try {
                    N.e.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    jVar.a(10, null);
                    return;
                } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                    jVar.a(7, e2);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            android.os.Process.sendSignal(android.os.Process.myPid(), 10);
            android.util.Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            java.lang.String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            C.j jVar2 = new C.j(14, this);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                jVar2.a(16, null);
            } else if (N.e.c(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                jVar2.a(14, null);
            } else {
                jVar2.a(15, null);
            }
        }
    }
}
