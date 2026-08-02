package L7;

import T7.Z;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f16589a;

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f16590b;

    static {
        HashMap hashMap = new HashMap();
        f16589a = hashMap;
        HashMap hashMap2 = new HashMap();
        f16590b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }

    public static String a() {
        HashMap hashMap = f16589a;
        return !hashMap.containsKey(-1) ? "" : Z.a((String) hashMap.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) f16590b.get(-1), ")");
    }
}
