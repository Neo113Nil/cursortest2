package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ه, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0604 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] f1577;

    public C0604(byte[] bArr) {
        if (bArr.length != 65) {
            throw new IllegalArgumentException(StringFog.decrypt("hngLw1fTsxWzdEnCS8PnXrRoSZkLkPEHomgajxbF/R25YBndW8PgG7ItOup9gbpS9moG2x4=\n", "1g1prz6wk34=\n") + Integer.valueOf(bArr.length));
        }
        if (bArr[0] != 4) {
            throw new IllegalArgumentException(StringFog.decrypt("AlNdbL+Nl8g3Xx9to53DgyFSXnKizsDKJk4fMK7eg4N6U1FjuYPH0TdVTGWyzsfMO0hLKQ==\n", "UiY/ANbut6M=\n"));
        }
        this.f1577 = Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0604)) {
            return false;
        }
        C0604 c0604 = (C0604) obj;
        c0604.getClass();
        return Arrays.equals(this.f1577, c0604.f1577);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1577) + 31;
    }

    public final String toString() {
        return StringFog.decrypt("XoR0Ha6NO6hwmEQq9g==\n", "FeENTsv5QMM=\n") + 1 + StringFog.decrypt("ig7IdW0nqovtS8FCdj+mm5s=\n", "pi64AA9Lw+g=\n") + Arrays.toString(this.f1577) + AbstractJsonLexerKt.END_OBJ;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m5557() {
        byte[] bArr = this.f1577;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0604 m5556(String str) {
        if (str.startsWith(StringFog.decrypt("BUc=\n", "NT8sHqPqbdM=\n")) || str.startsWith(StringFog.decrypt("Big=\n", "NnANIvdIXFw=\n"))) {
            str = str.substring(2);
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(StringFog.decrypt("8T6rxxdopjXXPPOKEW+gfNE6pYJEeaI513u/ggp7oDQ=\n", "uVvT52Qc1Fw=\n"));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return new C0604(bArr);
    }
}
