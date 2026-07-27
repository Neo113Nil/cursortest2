package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭠ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1166 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List f3343;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean f3344;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean f3345;

    public C1166(boolean z, boolean z2, ArrayList arrayList) {
        this.f3345 = z;
        this.f3344 = z2;
        this.f3343 = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1166.class != obj.getClass()) {
            return false;
        }
        C1166 c1166 = (C1166) obj;
        if (this.f3345 == c1166.f3345 && this.f3344 == c1166.f3344) {
            return this.f3343.equals(c1166.f3343);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3343.hashCode() + ((((this.f3345 ? 1 : 0) * 31) + (this.f3344 ? 1 : 0)) * 31);
    }

    public final String toString() {
        return StringFog.decrypt("FR6f28z9CxgkBZnA5soaDjIdhNTh6y0SKAWVy7U=\n", "R3Hwr4iYf30=\n") + this.f3345 + StringFog.decrypt("HzB/Ko6YYuVSZHkr9g==\n", "MxAWWcv1F4k=\n") + this.f3344 + StringFog.decrypt("EEI6oTcFal1PXw==\n", "PGJJyFBrCzE=\n") + this.f3343 + AbstractJsonLexerKt.END_OBJ;
    }
}
