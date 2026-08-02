package Li;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {
    public static final boolean a(@NotNull Context context, @NotNull String permission) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            of2 = PackageManager.PackageInfoFlags.of(4096L);
            packageInfo = packageManager.getPackageInfo(packageName, of2);
        } else {
            packageInfo = packageManager.getPackageInfo(packageName, 4096);
        }
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null) {
            return false;
        }
        return C7705l.m(strArr, permission);
    }

    @NotNull
    public static final String[] b() {
        int i11 = Build.VERSION.SDK_INT;
        return (String[]) C7705l.V(C7705l.V(i11 >= 33 ? new String[]{"android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, i11 >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"}), i11 >= 30 ? new String[0] : new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
    }
}
