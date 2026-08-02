package e1;

import android.content.Context;
import d1.n;
import java.io.File;
import java.util.HashMap;

/* renamed from: e1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1003j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12536a = n.g("WrkDbPathHelper");

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f12537b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            String str = f12536a;
            n.d().b(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            hashMap.put(databasePath, file);
            for (String str2 : f12537b) {
                hashMap.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        n.d().i(str, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    n.d().b(str, file2.renameTo(file3) ? String.format("Migrated %s to %s", file2, file3) : String.format("Renaming %s to %s failed", file2, file3), new Throwable[0]);
                }
            }
        }
    }
}
