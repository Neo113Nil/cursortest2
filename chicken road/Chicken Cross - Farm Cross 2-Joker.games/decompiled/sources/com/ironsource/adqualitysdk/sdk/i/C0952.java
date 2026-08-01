package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴾ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0952 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ArrayList f2657;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f2658;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Class f2659;

    public C0952(Object obj, String str, ArrayList arrayList) {
        if (obj instanceof Class) {
            this.f2659 = (Class) obj;
        } else {
            this.f2659 = obj.getClass();
        }
        this.f2658 = str;
        this.f2657 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0952.class != obj.getClass()) {
            return false;
        }
        C0952 c0952 = (C0952) obj;
        if (this.f2659.equals(c0952.f2659) && this.f2658.equals(c0952.f2658)) {
            return this.f2657.equals(c0952.f2657);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2657.hashCode() + ((this.f2658.hashCode() + (this.f2659.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(StringFog.decrypt("eWHsURbp7txSbfZQDeTF108=\n", "NASYOXmNqrk=\n"));
        sb.append(StringFog.decrypt("654NELB0DgzqsBwJ6A==\n", "htFvetUXek8=\n")).append(this.f2659);
        sb.append(StringFog.decrypt("urirlkhXjO3y1qe2SB7D\n", "lpjG2y0j5II=\n")).append(this.f2658).append('\'');
        sb.append(StringFog.decrypt("U7EG0vTh06Qe4hj29bs=\n", "f5Frk4aGkMg=\n")).append(this.f2657);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
