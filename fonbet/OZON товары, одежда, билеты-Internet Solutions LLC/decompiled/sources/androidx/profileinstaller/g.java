package androidx.profileinstaller;

import C2.ExecutorC2715j;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final b f44637a = new a();

    final class a implements b {
        @Override // androidx.profileinstaller.g.b
        public final void a(int i11, Serializable serializable) {
        }

        @Override // androidx.profileinstaller.g.b
        public final void b() {
        }
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a(int i11, Serializable serializable);

        void b();
    }

    static void a(@NonNull PackageInfo packageInfo, @NonNull File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static void b(@NonNull Context context) {
        c(context, new ExecutorC2715j(), f44637a, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void c(@NonNull Context context, @NonNull Executor executor, @NonNull b bVar, boolean z11) {
        boolean g10;
        boolean z12;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z13 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z11) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z12 = readLong == packageInfo.lastUpdateTime;
                            if (z12) {
                                bVar.a(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z12) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        i.d(context, false);
                        return;
                    }
                }
                z12 = false;
                if (z12) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            androidx.profileinstaller.b bVar2 = new androidx.profileinstaller.b(assets, executor, bVar, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (bVar2.b()) {
                androidx.profileinstaller.b d11 = bVar2.d();
                d11.f();
                g10 = d11.g();
                if (g10) {
                    a(packageInfo, filesDir);
                }
            } else {
                g10 = false;
            }
            if (g10 && z11) {
                z13 = true;
            }
            i.d(context, z13);
        } catch (PackageManager.NameNotFoundException e11) {
            bVar.a(7, e11);
            i.d(context, false);
        }
    }
}
