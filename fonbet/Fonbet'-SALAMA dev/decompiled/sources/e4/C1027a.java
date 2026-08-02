package e4;

import android.net.Uri;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import java.util.HashMap;
import java.util.Set;
import v0.AbstractC1663a;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1027a {

    /* renamed from: d, reason: collision with root package name */
    public static final zzap f12669d;

    /* renamed from: a, reason: collision with root package name */
    public final String f12670a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12671b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12672c;

    static {
        HashMap hashMap = new HashMap();
        AbstractC1663a.k(2, hashMap, "recoverEmail", 0, "resetPassword");
        AbstractC1663a.k(4, hashMap, "signIn", 1, "verifyEmail");
        AbstractC1663a.k(5, hashMap, "verifyBeforeChangeEmail", 6, "revertSecondFactorAddition");
        f12669d = zzap.zza(hashMap);
    }

    public C1027a(String str) {
        String a2 = a(str, "apiKey");
        String a4 = a(str, "oobCode");
        String a7 = a(str, "mode");
        if (a2 == null || a4 == null || a7 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        D.e(a2);
        D.e(a4);
        this.f12670a = a4;
        D.e(a7);
        this.f12671b = a7;
        a(str, "continueUrl");
        a(str, "languageCode");
        this.f12672c = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("link");
            D.e(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
