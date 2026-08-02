package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.C0874p;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0828b<O extends a.d> {
    public final int a;
    public final com.google.android.gms.common.api.a b;

    @Nullable
    public final a.d c;

    @Nullable
    public final String d;

    public C0828b(com.google.android.gms.common.api.a aVar, @Nullable a.d dVar, @Nullable String str) {
        this.b = aVar;
        this.c = dVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{aVar, dVar, str});
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0828b)) {
            return false;
        }
        C0828b c0828b = (C0828b) obj;
        return C0874p.a(this.b, c0828b.b) && C0874p.a(this.c, c0828b.c) && C0874p.a(this.d, c0828b.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
