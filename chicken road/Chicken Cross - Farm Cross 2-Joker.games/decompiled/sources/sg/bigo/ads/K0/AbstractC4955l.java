package sg.bigo.ads.K0;

import android.text.TextUtils;
import android.util.Patterns;
import io.ktor.sse.ServerSentEventKt;
import java.net.URL;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.K0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4955l {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int indexOf = str.indexOf(ServerSentEventKt.COLON);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        return Patterns.DOMAIN_NAME.matcher(str).matches();
    }

    public static String a(String str, String str2) {
        try {
            URL url = new URL(str);
            StringBuilder sb = new StringBuilder(str);
            String authority = url.getAuthority();
            int lastIndexOf = str.lastIndexOf(authority);
            if (lastIndexOf >= 0) {
                sb.replace(lastIndexOf, authority.length() + lastIndexOf, str2);
            }
            return sb.toString();
        } catch (Exception e) {
            AbstractC5496a.a("AntiBanUtils", "replaceHost error： " + e.getMessage());
            return str;
        }
    }
}
