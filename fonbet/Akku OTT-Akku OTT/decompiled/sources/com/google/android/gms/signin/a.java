package com.google.android.gms.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C0874p;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class a implements a.d {

    @NonNull
    public static final a a = new a();

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return C0874p.a(null, null) && C0874p.a(null, null) && C0874p.a(null, null) && C0874p.a(null, null) && C0874p.a(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool, null, bool, bool, null, null, null, null});
    }
}
