package H30;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class x {
    public static final String a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (uri.isHierarchical()) {
            return uri.getHost();
        }
        return null;
    }

    public static final String b(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (uri.isHierarchical()) {
            return uri.getPath();
        }
        return null;
    }

    public static final String c(@NotNull Uri uri, @NotNull String param) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(param, "param");
        if (uri.isHierarchical()) {
            return uri.getQueryParameter(param);
        }
        return null;
    }

    public static final String d(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (uri.isHierarchical()) {
            return uri.getScheme();
        }
        return null;
    }

    public static final Uri e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
