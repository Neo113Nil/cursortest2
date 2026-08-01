package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٵ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0610 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final byte[] f1583;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] f1584;

    public C0610(byte[] bArr, byte[] bArr2) {
        this.f1584 = bArr;
        this.f1583 = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0610)) {
            return false;
        }
        C0610 c0610 = (C0610) obj;
        return Arrays.equals(this.f1584, c0610.f1584) && Arrays.equals(this.f1583, c0610.f1583);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1583) + (Arrays.hashCode(this.f1584) * 31);
    }

    public final String toString() {
        return StringFog.decrypt("ZGLKp883xr1NWce78jPdrlpi0KvUM8C5anfbgNsm0a8c\n", "IRKiwqJStNw=\n") + Arrays.toString(this.f1584) + StringFog.decrypt("ADHz4czhiQdndPrW1/mFFxE=\n", "LBGDlK6N4GQ=\n") + Arrays.toString(this.f1583) + AbstractJsonLexerKt.END_OBJ;
    }
}
