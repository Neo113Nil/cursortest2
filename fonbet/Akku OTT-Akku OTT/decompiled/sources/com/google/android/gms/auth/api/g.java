package com.google.android.gms.auth.api;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C0874p;
import java.util.Arrays;

@Deprecated
/* loaded from: classes4.dex */
public final class g implements a.d {
    public static final g c;
    public final boolean a;

    @Nullable
    public final String b;

    static {
        f fVar = new f();
        fVar.a = Boolean.FALSE;
        c = new g(fVar);
    }

    public g(f fVar) {
        this.a = fVar.a.booleanValue();
        this.b = fVar.b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.getClass();
        return C0874p.a(null, null) && this.a == gVar.a && C0874p.a(this.b, gVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
