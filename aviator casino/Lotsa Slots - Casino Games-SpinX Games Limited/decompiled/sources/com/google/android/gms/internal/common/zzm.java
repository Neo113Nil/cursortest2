package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes4.dex */
final class zzm extends com.google.android.gms.internal.common.zzl {
    private final char zza;

    zzm(char c) {
        this.zza = c;
    }

    public final java.lang.String toString() {
        char[] cArr = {'\\', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        int i = this.zza;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        java.lang.String copyValueOf = java.lang.String.copyValueOf(cArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.common.zzp
    public final boolean zza(char c) {
        return c == this.zza;
    }
}
