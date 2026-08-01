package com.inmobi.media;

import android.util.SparseArray;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class B6 {
    public static final C4262z6 b;
    public static final SparseArray c;
    public static final B6 d;
    public static final B6 e;
    public static final B6 f;
    public static final B6 g;
    public static final B6 h;
    public static final B6 i;
    public static final B6 j;
    public static final B6 k;
    public static final B6 l;
    public static final B6 m;
    public static final B6 n;
    public static final B6 o;
    public static final B6 p;
    public static final B6 q;
    public static final B6 r;
    public static final B6 s;
    public static final B6 t;
    public static final /* synthetic */ B6[] u;

    /* renamed from: a, reason: collision with root package name */
    public final int f6470a;

    static {
        B6 b6 = new B6(0, 0, "NETWORK_UNAVAILABLE_ERROR");
        B6 b62 = new B6(1, 199, "UNKNOWN_ERROR");
        d = b62;
        B6 b63 = new B6(2, 198, "NETWORK_IO_ERROR");
        e = b63;
        B6 b64 = new B6(3, 197, "OUT_OF_MEMORY_ERROR");
        B6 b65 = new B6(4, 196, "INVALID_ENCRYPTED_RESPONSE_RECEIVED");
        B6 b66 = new B6(5, 195, "RESPONSE_EXCEEDS_SPECIFIED_SIZE_LIMIT");
        B6 b67 = new B6(6, 194, "GZIP_DECOMPRESSION_FAILED");
        B6 b68 = new B6(7, 193, "BAD_REQUEST");
        f = b68;
        B6 b69 = new B6(8, 192, "GDPR_COMPLIANCE_ENFORCED");
        B6 b610 = new B6(9, 191, "GENERIC_HTTP_2XX");
        g = b610;
        B6 b611 = new B6(10, FacebookRequestErrorClassification.EC_INVALID_TOKEN, "RESPONSE_PARSING_ERROR");
        B6 b612 = new B6(11, 189, "RETRY_ATTEMPTED");
        B6 b613 = new B6(12, 188, "NETWORK_UNAVAILABLE_CONTEXT_LOSS");
        h = b613;
        B6 b614 = new B6(13, 187, "NETWORK_UNAVAILABLE_IDLE_MODE");
        i = b614;
        B6 b615 = new B6(14, 186, "NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE");
        j = b615;
        B6 b616 = new B6(15, 185, "NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M");
        k = b616;
        B6 b617 = new B6(16, 184, "NETWORK_UNAVAILABLE_EXCEPTION");
        l = b617;
        B6 b618 = new B6(17, 183, "NETWORK_PREPARE_FAIL");
        m = b618;
        B6 b619 = new B6(18, 181, "NETWORK_REQUEST_GENERIC_DROPPED_BY_INTERCEPTOR");
        B6 b620 = new B6(19, 180, "NETWORK_REQUEST_CANCELLED");
        n = b620;
        B6 b621 = new B6(20, 179, "NETWORK_REQUEST_EXCEPTION");
        B6 b622 = new B6(21, 182, "NETWORK_UNAVAILABLE_CUSTOM_VALIDATOR");
        o = b622;
        B6 b623 = new B6(22, 178, "NETWORK_REDIRECT_MALFORMED");
        p = b623;
        B6 b624 = new B6(23, 177, "NO_SUCH_ELEMENT_EXCEPTION");
        q = b624;
        B6 b625 = new B6(24, 176, "COROUTINE_TIMEOUT");
        r = b625;
        B6 b626 = new B6(25, 175, "INVALID_URL");
        s = b626;
        B6 b627 = new B6(26, 204, "HTTP_NO_CONTENT");
        B6 b628 = new B6(27, Sdk.SDKError.Reason.AD_EXPIRED_VALUE, "HTTP_NOT_MODIFIED");
        B6 b629 = new B6(28, 303, "HTTP_SEE_OTHER");
        B6 b630 = new B6(29, 404, "HTTP_SERVER_NOT_FOUND");
        B6 b631 = new B6(30, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, "HTTP_MOVED_TEMP");
        B6 b632 = new B6(31, 500, "HTTP_INTERNAL_SERVER_ERROR");
        B6 b633 = new B6(32, 501, "HTTP_NOT_IMPLEMENTED");
        B6 b634 = new B6(33, 502, "HTTP_BAD_GATEWAY");
        B6 b635 = new B6(34, PglCryptUtils.COMPRESS_FAILED, "HTTP_SERVER_NOT_AVAILABLE");
        B6 b636 = new B6(35, PglCryptUtils.BASE64_FAILED, "HTTP_GATEWAY_TIMEOUT");
        t = b636;
        B6[] b6Arr = {b6, b62, b63, b64, b65, b66, b67, b68, b69, b610, b611, b612, b613, b614, b615, b616, b617, b618, b619, b620, b621, b622, b623, b624, b625, b626, b627, b628, b629, b630, b631, b632, b633, b634, b635, b636, new B6(36, 505, "HTTP_VERSION_NOT_SUPPORTED"), new B6(37, 401, "HTTP_UNAUTHORISED"), new B6(38, CommonGatewayClient.CODE_599, "SERVER_ERROR_END_CODE")};
        u = b6Arr;
        EnumEntries<B6> enumEntries = EnumEntriesKt.enumEntries(b6Arr);
        b = new C4262z6();
        c = new SparseArray();
        for (B6 b637 : enumEntries) {
            c.put(b637.f6470a, b637);
        }
    }

    public B6(int i2, int i3, String str) {
        this.f6470a = i3;
    }

    public static B6 valueOf(String str) {
        return (B6) Enum.valueOf(B6.class, str);
    }

    public static B6[] values() {
        return (B6[]) u.clone();
    }
}
