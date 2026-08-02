package Ai;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ai.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2432b {
    @NotNull
    public static ArrayList a(@NotNull Context context, @NotNull List permissions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (androidx.core.content.a.checkSelfPermission(context, (String) obj) != 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List b(Context context, C2431a config) {
        int i11 = Build.VERSION.SDK_INT;
        int i12 = context.getApplicationInfo().targetSdkVersion;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Tc.b builder = C7714v.B();
        builder.add("android.permission.CAMERA");
        config.getClass();
        if (config.c()) {
            if (i11 < 33 || i12 < 33) {
                builder.add("android.permission.READ_EXTERNAL_STORAGE");
            } else {
                builder.add("android.permission.READ_MEDIA_IMAGES");
            }
        }
        if (config.b() && (i11 <= 28 || (i11 == 29 && config.a()))) {
            builder.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return C7714v.C(builder.B());
    }
}
