package PZ;

import Hj.C3143a;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final String a(@NotNull Uri uri, boolean z11) {
        String encodedQuery;
        String concat;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String uri2 = uri.buildUpon().clearQuery().build().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        String str = "";
        String g10 = C3143a.g("/$", uri2, "");
        if (!z11 && (encodedQuery = uri.getEncodedQuery()) != null && (concat = "?".concat(encodedQuery)) != null) {
            str = concat;
        }
        return U7.d.e(g10, str);
    }

    @NotNull
    public static final String b(@NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return a(Uri.parse(str), z11);
    }
}
