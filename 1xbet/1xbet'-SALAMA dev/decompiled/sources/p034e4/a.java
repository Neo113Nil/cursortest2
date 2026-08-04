package p034e4;

import android.net.Uri;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzap f12675d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12678c;

    static {
        HashMap map = new HashMap();
        p150v0.a.k(2, map, "recoverEmail", 0, "resetPassword");
        p150v0.a.k(4, map, "signIn", 1, "verifyEmail");
        p150v0.a.k(5, map, "verifyBeforeChangeEmail", 6, "revertSecondFactorAddition");
        f12675d = zzap.zza(map);
    }

    public a(String str) {
        String strA = a(str, "apiKey");
        String strA2 = a(str, "oobCode");
        String strA3 = a(str, "mode");
        if (strA == null || strA2 == null || strA3 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        D.e(strA);
        D.e(strA2);
        this.f12676a = strA2;
        D.e(strA3);
        this.f12677b = strA3;
        a(str, "continueUrl");
        a(str, "languageCode");
        this.f12678c = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("link");
            D.e(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
