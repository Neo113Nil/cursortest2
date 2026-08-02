package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.core.app.f;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {
    public static int a(@NonNull Context context, @NonNull String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String c11 = f.c(str);
            if (c11 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                if (((Process.myUid() == myUid && Objects.equals(context.getPackageName(), packageName)) ? f.a(context, myUid, c11, packageName) : f.b(context, c11, packageName)) != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }
}
