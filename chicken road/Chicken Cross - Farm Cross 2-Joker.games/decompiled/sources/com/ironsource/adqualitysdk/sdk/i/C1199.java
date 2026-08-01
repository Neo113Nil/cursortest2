package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹰ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1199 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final long f3396;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final byte[] f3397;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3398;

    public C1199(String str, byte[] bArr, long j) {
        this.f3398 = str;
        this.f3397 = bArr;
        this.f3396 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1199) {
            return this.f3398.equals(((C1199) obj).f3398);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3398.hashCode();
    }

    public final String toString() {
        return StringFog.decrypt("EMn9hD5+4W4n3/+YNGPuTyfd+ZQoedxZf4s=\n", "QqyM8VsNlT0=\n") + this.f3398 + '\'' + StringFog.decrypt("uNKA3YyTXB0=\n", "lPLruPXaOCA=\n") + 1 + StringFog.decrypt("hSvFP2AaLiPbZog=\n", "qQu1UwFuSEw=\n") + 2 + StringFog.decrypt("WJP03vNKdN8Q8uPh5RY=\n", "dLOXrJYrALo=\n") + this.f3396 + AbstractJsonLexerKt.END_OBJ;
    }
}
