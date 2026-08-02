package H30;

import android.webkit.CookieManager;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {
    public static final void a(@NotNull CookieManager cookieManager, @NotNull String cookieName) {
        Intrinsics.checkNotNullParameter(cookieManager, "<this>");
        Intrinsics.checkNotNullParameter("https://.ozonru.me", ImagesContract.URL);
        Intrinsics.checkNotNullParameter(cookieName, "cookieName");
        try {
            cookieManager.setCookie("https://.ozonru.me", cookieName.concat("=undefined; Max-Age=-1; Path=/"));
        } catch (Exception e11) {
            L80.a.a("CookieManagerExt", "can't clear https://.ozonru.me cookie " + cookieName + " " + e11);
        }
    }
}
