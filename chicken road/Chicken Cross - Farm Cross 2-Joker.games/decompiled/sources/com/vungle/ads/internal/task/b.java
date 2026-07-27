package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.s1;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12133a;
    public final PathProvider b;

    static {
        new a();
    }

    public b(Context context, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.f12133a = context;
        this.b = pathProvider;
    }

    @Override // com.vungle.ads.internal.task.c
    public final int a(Bundle bundle, g jobRunner) {
        File file;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        File vmDir = this.b.getVmDir();
        String string = bundle.getString("AD_ID_KEY");
        if (string == null || (file = this.b.b(string)) == null) {
            file = vmDir;
        }
        boolean z = u.f12190a;
        t.a("CleanupJob", "CleanupJob: Current directory snapshot");
        try {
            if (Intrinsics.areEqual(file, vmDir)) {
                ServiceLocator a2 = s1.a();
                if (a2 == null) {
                    return 0;
                }
                a(a2);
                if (s1.a() == null) {
                    return 0;
                }
                if (bundle.containsKey("STALE_DIRS_KEY")) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("STALE_DIRS_KEY");
                    if (stringArrayList != null) {
                        Iterator<T> it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            com.vungle.ads.internal.util.n.a(new File(vmDir, (String) it.next()), (Set) null);
                        }
                    }
                } else {
                    File[] listFiles = vmDir.listFiles();
                    if (listFiles == null) {
                        return 0;
                    }
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            com.vungle.ads.internal.util.n.a(file2, (Set) null);
                        }
                    }
                }
            } else {
                com.vungle.ads.internal.util.n.a(file, (Set) null);
            }
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }

    public final void a(ServiceLocator serviceLocator) {
        FilePreferences filePreferences = (FilePreferences) serviceLocator.getService(FilePreferences.class);
        int a2 = filePreferences.a("VERSION_CODE", -1);
        if (a2 < 70706) {
            if (a2 < 70000) {
                boolean z = u.f12190a;
                t.a("CleanupJob", "CleanupJob: drop old files data");
                File file = new File(this.f12133a.getNoBackupFilesDir(), "vungle_db");
                if (file.exists()) {
                    com.vungle.ads.internal.util.n.a(file, (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(file.getPath() + "-journal"), (Set) null);
                } else {
                    this.f12133a.deleteDatabase("vungle_db");
                }
                String string = this.f12133a.getSharedPreferences("com.vungle.sdk", 0).getString("cache_path", null);
                this.f12133a.deleteSharedPreferences("com.vungle.sdk");
                File noBackupFilesDir = this.f12133a.getNoBackupFilesDir();
                Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
                com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir, "vungle_settings"), (Set) null);
                if (string != null) {
                    com.vungle.ads.internal.util.n.a(new File(string), (Set) null);
                }
            }
            if (a2 < 70100) {
                com.vungle.ads.internal.util.n.a(new File(this.f12133a.getApplicationInfo().dataDir, "vungle"), (Set) null);
            }
            if (a2 < 70301) {
                try {
                    com.vungle.ads.internal.util.n.a(new File(this.b.a(), "vungleSettings"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(this.b.a(), "failedTpatSet"), (Set) null);
                } catch (Exception e) {
                    boolean z2 = u.f12190a;
                    t.a("CleanupJob", "Failed to delete temp data", e);
                }
            }
            if (a2 < 70500) {
                File noBackupFilesDir2 = this.f12133a.getNoBackupFilesDir();
                try {
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir2, "failedTpats"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir2, "failedGenericTpats"), (Set) null);
                } catch (Exception e2) {
                    boolean z3 = u.f12190a;
                    t.a("CleanupJob", "Failed to delete 742 tpat data", e2);
                }
            }
            if (a2 < 70600) {
                File noBackupFilesDir3 = this.f12133a.getNoBackupFilesDir();
                try {
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir3, "vungle_cache/downloads"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir3, "vungle_cache/js"), (Set) null);
                } catch (Exception e3) {
                    boolean z4 = u.f12190a;
                    t.a("CleanupJob", "Failed to delete 750 data", e3);
                }
            }
            filePreferences.b("VERSION_CODE", BuildConfig.VERSION_CODE).b();
        }
    }
}
