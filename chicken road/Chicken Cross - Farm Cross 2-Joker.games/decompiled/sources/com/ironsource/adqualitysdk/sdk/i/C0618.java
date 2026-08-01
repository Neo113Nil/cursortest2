package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڋ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0618 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] f1598;

    public C0618(byte[] bArr) {
        this.f1598 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0618) {
            return Arrays.equals(this.f1598, ((C0618) obj).f1598);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1598);
    }

    public final String toString() {
        return StringFog.decrypt("/GFEoUbnEL7RcF6mffILrs9wQL1g1Qq/1VBEoik=\n", "vQQlxRSCY8s=\n") + Arrays.toString(this.f1598) + AbstractJsonLexerKt.END_OBJ;
    }
}
