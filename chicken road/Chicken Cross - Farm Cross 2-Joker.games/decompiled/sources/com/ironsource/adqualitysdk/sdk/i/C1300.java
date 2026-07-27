package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾅ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1300 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final List f3689;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f3690;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean f3691;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean f3692;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean f3693;

    public C1300(boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList) {
        this.f3693 = z;
        this.f3692 = z2;
        this.f3691 = z3;
        this.f3690 = z4;
        this.f3689 = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1300.class != obj.getClass()) {
            return false;
        }
        C1300 c1300 = (C1300) obj;
        if (this.f3693 == c1300.f3693 && this.f3692 == c1300.f3692 && this.f3691 == c1300.f3691 && this.f3690 == c1300.f3690) {
            return this.f3689.equals(c1300.f3689);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3689.hashCode() + ((((((((this.f3693 ? 1 : 0) * 31) + (this.f3692 ? 1 : 0)) * 31) + (this.f3691 ? 1 : 0)) * 31) + (this.f3690 ? 1 : 0)) * 31);
    }

    public final String toString() {
        return StringFog.decrypt("ntyJzY3/U0q5xpvNluVQfbLBj9WL8VdckcCT3Z7OW1uy0Y7cm7c=\n", "17L6uf+KPi8=\n") + this.f3693 + StringFog.decrypt("NlcTDk/HAl9/Ez4YY9IOWH8TRw==\n", "Gnd6fRe3bSw=\n") + this.f3692 + StringFog.decrypt("Pyip6HiGrst0b6XpfZe433Bgpf8B\n", "EwjAmzzjzL4=\n") + this.f3691 + StringFog.decrypt("LYj6di0JWfVyw9dgFA1d6GTMrg==\n", "AaiTBWBoPpw=\n") + this.f3690 + StringFog.decrypt("kJts7UHvsOHPhg==\n", "vLsfhCaB0Y0=\n") + this.f3689 + AbstractJsonLexerKt.END_OBJ;
    }
}
