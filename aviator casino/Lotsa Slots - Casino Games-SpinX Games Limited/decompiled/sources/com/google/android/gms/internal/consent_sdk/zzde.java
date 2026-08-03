package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzde extends com.google.android.gms.internal.consent_sdk.zzdd {
    zzde(char c) {
    }

    public final java.lang.String toString() {
        char[] cArr = {'\\', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        int i = 44;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return "CharMatcher.is('" + java.lang.String.copyValueOf(cArr) + "')";
    }
}
